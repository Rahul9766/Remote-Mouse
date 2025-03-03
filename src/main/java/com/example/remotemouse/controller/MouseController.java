package com.example.remotemouse.controller;

import com.example.remotemouse.service.MouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Controller;

@Controller
public class MouseController {

    @Autowired
    private MouseService mouseService;

    @MessageMapping("/moveDelta")
    public void handleMouseDelta(@Payload String message) {
        mouseService.moveMouseDelta(message);
    }

    @MessageMapping("/click")
    public void handleMouseClick(@Payload String message) {
        mouseService.performClick(message);
    }

    @MessageMapping("/zoom")
    public void handleZoom(@Payload String message) {
        mouseService.performZoom(message);
    }

    @MessageMapping("/scroll")
    public void handleScroll(@Payload String message) {
        mouseService.performScroll(message);
    }
}