/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author Admin
 */
public class Television extends Device {
    private int channel;
    private int volume;

    public Television() {
        this.channel = 1;
        this.volume = 10;
    }

    public int getChannel() { return channel; }
    public int getVolume() { return volume; }

    public void setChannel(int channel) {
        this.channel = channel;
        showStatus();
    }

    public void setVolume(int volume) {
        this.volume = volume;
        showStatus();
    }

    @Override
    public void showStatus() {
        if (isOn()) {
            System.out.println("Television ON | Channel: " + channel + " | Volume: " + volume + "%");
        } else {
            System.out.println("Television is OFF.");
        }
    }
}