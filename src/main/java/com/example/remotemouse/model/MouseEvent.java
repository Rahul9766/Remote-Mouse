package com.example.remotemouse.model;

public class MouseEvent {
    private String type;
    private int x;
    private int y;

    public MouseEvent() {}

    public MouseEvent(String type, int x, int y) {
        this.type = type;
        this.x = x;
        this.y = y;
    }

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    public int getX() { return x; }
    public void setX(int x) { this.x = x; }

    public int getY() { return y; }
    public void setY(int y) { this.y = y; }
}
