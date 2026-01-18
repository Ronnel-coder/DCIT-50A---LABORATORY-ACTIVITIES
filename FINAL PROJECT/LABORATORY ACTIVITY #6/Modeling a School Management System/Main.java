/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.main;

/**
 *
 * @author Admin
 */
import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void main(String[] args) {




        AirConditioner ac = new AirConditioner();

        LampShade lamp1 = new LampShade(100, "Yellow");
        LampShade lamp2 = new LampShade(lamp1); 

        Television tv = new Television();

        Microwave microwave = new Microwave();


        List<Device> devices = new ArrayList<>();
        devices.add(ac);
        devices.add(lamp1);
        devices.add(lamp2);
        devices.add(tv);
        devices.add(microwave);

        System.out.println("\nTurning ALL devices ON...");
        Device.toggleDevices(devices, true);

        System.out.println("\n--- DEVICE STATUSES ---");
        for (Device d : devices) {
            d.showStatus();   
        }

        System.out.println("\nDevices currently ON: " + Device.countPoweredOn(devices));

        System.out.println("\nTurning ALL devices OFF...");
        Device.toggleDevices(devices, false);

        System.out.println("\nDevices currently ON: " + Device.countPoweredOn(devices));
    }
}
    
