/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author Admin
 */
public class Microwave extends Device {
    private int timer;
    private int temperature;

    public Microwave() {
        this.timer = 0;
        this.temperature = 100;
    }

    public int getTimer() { return timer; }
    public int getTemperature() { return temperature; }

    public void setTimer(int timer) {
        this.timer = timer;
        showStatus();
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        showStatus();
    }

    @Override
    public void showStatus() {
        if (isOn()) {
            System.out.println("Microwave ON | Timer: " + timer + " sec | Temp: " + temperature + "°C");
        } else {
            System.out.println("Microwave is OFF.");
        }
    }
}