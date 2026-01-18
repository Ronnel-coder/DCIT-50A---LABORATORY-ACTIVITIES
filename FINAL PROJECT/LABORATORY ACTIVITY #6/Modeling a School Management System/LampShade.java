/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author Admin
 */
public class LampShade extends Device {
    private int brightness;
    private String color;

    public LampShade(int brightness, String color) {
        this.brightness = brightness;
        this.color = color;
    }

    // Copy constructor
    public LampShade(LampShade other) {
        this.brightness = other.brightness;
        this.color = other.color;
    }

    public int getBrightness() { return brightness; }
    public String getColor() { return color; }

    public void setBrightness(int brightness) {
        this.brightness = brightness;
        showStatus();
    }

    public void setColor(String color) {
        this.color = color;
        showStatus();
    }

    @Override
    public void showStatus() {
        if (isOn()) {
            System.out.println("LampShade ON | Brightness: " + brightness + "% | Color: " + color);
        } else {
            System.out.println("LampShade is OFF.");
        }
    }
}
