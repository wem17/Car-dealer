
package com.company;
import java.util.ArrayList;
import java.util.Scanner;
    /*
    Project: Car Dealership
    Purpose Details: Create a functioning Car Dealership
    Course: IST 242
    Author: Samantha Scheer
    Date Developed: 3/14/19
    Last Date Changed: 3/27/19
    Rev: 2
     */
    public class Vehicle {

        /**
         * Hold all the vehicle information
         *
         * @param vehicleID     variable
         * @param VehicleName  variable
         * @param VehicleType  variable
         * @param VehicleYear   variable
         * @param VehiclePrice   variable
         * @author              Samantha Scheer
         * @version             1.0
         * @since               2019-04-30
         */
//Class Level Variables - Protect the data
        private int vehicleId;
        private String vehicleName;
        private String vehicleType;
        private int vehicleYear;
        private Double vehiclePrice;
        //Constructor Method
        public Vehicle(int _vehicleId, String _vehicleName,  String _vehicleType, int _vehicleYear, Double _vehiclePrice){
            this.vehicleId = _vehicleId;
            this.vehicleName = _vehicleName;
            this.vehicleType = _vehicleType;
            this.vehicleYear = _vehicleYear;
            this.vehiclePrice = _vehiclePrice;
        }

        //Setters and Getters
        public int getvehicleId() { return vehicleId; }
        public void setvehicleId(int _vehicleId) {this.vehicleId = _vehicleId;}

        public String getvehicleName() { return vehicleName; }
        public void setvehicleName(String _vehicleName) {this.vehicleName = _vehicleName;}

        public String getvehicleType() { return vehicleType; }
        public void setvehicleType(String _vehicleType) {this.vehicleType = _vehicleType;}

        public int getvehicleYear() { return vehicleYear; }
        public void setvehicleYear(int _vehicleYear) {this.vehicleYear = _vehicleYear;}

        public Double getvehiclePrice() {return vehiclePrice; }
        public void setvehiclePrice(Double _vehiclePrice) {this.vehiclePrice = _vehiclePrice;}

        public static void listVehicle(ArrayList<Vehicle> vList) {
            for (Vehicle vehicle: vList) {
                System.out.println("Vehicle ID " + vehicle.getvehicleId());
                System.out.println("Car Name: " + vehicle.getvehicleName());
                System.out.println("Car Type: " + vehicle.getvehicleType());
                System.out.println("Car Year: " + vehicle.getvehicleYear());
                System.out.println("Price: " + vehicle.getvehiclePrice());
            }
        }

    }





