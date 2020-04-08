package com.company;


import java.util.ArrayList;
import java.util.Scanner;

/*
Project: Car Dealership
Purpose Details: Create a functioning Car Dealership
Course: IST 242
Author:
Date Developed: 3/14/19
Last Date Changed: 3/26/19
Rev: 2
 */

    public class Parts {

        //Class Level Variables - Protect the data
        private int partId;
        private String partType;
        private Double partPrice;

        //Constructor Method
        public Parts(int _partId,  String _partType, Double _partPrice){
            this.partId = _partId;
            this.partType = _partType;
            this.partPrice = _partPrice;
        }

        //Setters and Getters
        public int getpartId() { return partId; }
        public void setpartId(int _partId) {this.partId = _partId;}

        public String getpartType() { return partType; }
        public void setpartType(String _partType) {this.partType = _partType;}

        public Double getpartPrice() {return partPrice; }
        public void setpartPrice(Double _partPrice) {this.partPrice = _partPrice;}

        public static void listParts(ArrayList<Parts> pList) {
            for (Parts part: pList) {
                System.out.println("Part ID " + part.getpartId());
                System.out.println("Car Type: " + part.getpartType());
                System.out.println("Price: " + part.getpartPrice());
            }
        }
}
