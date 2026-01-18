/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author Admin
 */
public class AirConditioner extends Device {
    private int fanSpeed;
    private int temperature;

    public AirConditioner() {
        this.fanSpeed = 3;
        this.temperature = 24;
    }

    public int getFanSpeed() { return fanSpeed; }
    public int getTemperature() { return temperature; }

    public void setFanSpeed(int fanSpeed) {
        this.fanSpeed = fanSpeed;
        showStatus();
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        showStatus();
    }

    @Override
    public void showStatus() {
        if (isOn()) {
            System.out.println("AirConditioner ON | Fan Speed: " + fanSpeed + " | Temp: " + temperature + "°C");
        } else {
            System.out.println("AirConditioner is OFF.");
        }
    }
}