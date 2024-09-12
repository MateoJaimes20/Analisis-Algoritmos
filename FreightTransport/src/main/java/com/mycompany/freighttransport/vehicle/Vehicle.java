package com.mycompany.freighttransport.vehicle;

import com.mycompany.freighttransport.packages.CantPackages;
import java.util.ArrayList;


public class Vehicle {                                                                      //1
    private String vehicleType;                                                             //1  
    private int kmTours;                                                                    //1
    private String plate;                                                                   //1
    private Driver drive;                                                                   //1
    private ArrayList<Vehicle> listVehicles;                                                //1
    
    public Vehicle(String vehicleType, int kmTours,String plate, Driver drive) {            //1
        this.vehicleType = vehicleType;                                                     //1
        this.kmTours = kmTours;                                                             //1
        this.plate=plate;                                                                   //1
        this.drive=drive;                                                                   //1
        this.listVehicles=new ArrayList();                                                  //1
    }                                                                                       //1

    public String getVehicleType() {                                                        //1
        return vehicleType;                                                                 //1
    }                                                                                       //1

    public void setVehicleType(String vehicleType) {                                        //1
        this.vehicleType = vehicleType;                                                     //1
    }                                                                                       //1

    public int getKmTours() {                                                               //1
        return kmTours;                                                                     //1
    }                                                                                       //1

    public void setKmTours(int kmTours) {                                                   //1
        this.kmTours = kmTours;                                                             //1
    }

    public String getPlate() {                                                              //1
        return plate;                                                                       //1
    }                                                                                       //1

    public void setPlate(String plate) {                                                    //1
        this.plate = plate;                                                                 //1
    }                                                                                       //1

    public Driver getDrive() {                                                              //1
        return drive;                                                                       //1
    }                                                                                       //1

    public void setDrive(Driver drive) {                                                    //1
        this.drive = drive;                                                                 //1
    }                                                                                       //1

    public ArrayList<Vehicle> getListVehicles() {                                           //1
        return listVehicles;                                                                //1
    }                                                                                       //1 

    public void setListVehicles(ArrayList<Vehicle> listVehicles) {                          //1
        this.listVehicles = listVehicles;                                                   //1
    }                                                                                       //1

    
    public void registerVehicle(Vehicle vehicle){                                           //1
        for(Vehicle car: listVehicles){                                                     //1
            car.registerVehicle(vehicle);                                                   //1
        }                                                                                   //1
    }                                                                                       //1

    @Override
    public String toString() {                                                              //1
        return "Vehicle{" + "vehicleType=" + vehicleType + ", kmTours=" + kmTours + ", plate=" + plate + ", drive=" + drive + ", listVehicles=" + listVehicles + '}';
    }                                                                                       //1
}                                                                                           //1
