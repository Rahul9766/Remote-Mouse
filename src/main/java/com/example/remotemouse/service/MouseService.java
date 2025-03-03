package com.example.remotemouse.service;

import org.springframework.stereotype.Service;
import java.awt.*;
import java.awt.event.InputEvent;

@Service
public class MouseService {
    private final Robot robot;
    private static final int SCROLL_SENSITIVITY = 3;
    private static final int ZOOM_SENSITIVITY = 2;

    public MouseService() {
        try {
            this.robot = new Robot();
        } catch (AWTException e) {
            throw new RuntimeException("Failed to initialize Robot", e);
        }
    }

    public void moveMouseDelta(String message) {
        if (GraphicsEnvironment.isHeadless()) {
            throw new UnsupportedOperationException("Cannot move mouse in headless environment");
        }

        String[] deltas = message.split(",");
        double deltaX = Double.parseDouble(deltas[0]);
        double deltaY = Double.parseDouble(deltas[1]);

        Point currentLocation = MouseInfo.getPointerInfo().getLocation();
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        
        int newX = Math.max(0, Math.min((int)(currentLocation.x + deltaX), screen.width));
        int newY = Math.max(0, Math.min((int)(currentLocation.y + deltaY), screen.height));

        robot.mouseMove(newX, newY);
    }

    public void performClick(String message) {
        if (GraphicsEnvironment.isHeadless()) {
            throw new UnsupportedOperationException("Cannot perform click in headless environment");
        }

        int button = "right".equals(message) ? InputEvent.BUTTON3_DOWN_MASK : InputEvent.BUTTON1_DOWN_MASK;
        robot.mousePress(button);
        robot.delay(50);
        robot.mouseRelease(button);
    }

    public void performZoom(String message) {
        if (GraphicsEnvironment.isHeadless()) {
            throw new UnsupportedOperationException("Cannot perform zoom in headless environment");
        }

        robot.keyPress(InputEvent.CTRL_DOWN_MASK);
        robot.delay(50);

        int direction = "in".equals(message) ? -1 : 1;
        for (int i = 0; i < ZOOM_SENSITIVITY; i++) {
            robot.mouseWheel(direction);
            robot.delay(50);
        }

        robot.delay(50);
        robot.keyRelease(InputEvent.CTRL_DOWN_MASK);
    }

    public void performScroll(String message) {
        if (GraphicsEnvironment.isHeadless()) {
            throw new UnsupportedOperationException("Cannot perform scroll in headless environment");
        }

        robot.mouseWheel(Integer.parseInt(message) / SCROLL_SENSITIVITY);
    }
}