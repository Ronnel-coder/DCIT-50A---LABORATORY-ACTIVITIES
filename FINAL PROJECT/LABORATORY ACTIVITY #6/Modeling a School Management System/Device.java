/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author Admin
 */
import java.util.List;

public class Device {
    private boolean isOn;

    public void turnOn() {
        isOn = true;
        System.out.println(getClass().getSimpleName() + " is now ON.");
    }

    public void turnOff() {
        isOn = false;
        System.out.println(getClass().getSimpleName() + " is now OFF.");
    }

    public boolean isOn() {
        return isOn;
    }

    // Overridden by subclasses
    public void showStatus() {
        if (isOn) {
            System.out.println(getClass().getSimpleName() + " is running.");
        } else {
            System.out.println(getClass().getSimpleName() + " is turned off.");
        }
    }

    

    // ... previous content

    public static void toggleDevices(List<Device> devices, boolean turnOn) {
        for (Device d : devices) {
            if (turnOn) d.turnOn();
            else d.turnOff();
        }
    }

    public static int countPoweredOn(List<Device> devices) {
        int count = 0;
        for (Device d : devices) {
            if (d.isOn()) count++;
        }
        return count;
    }
}

