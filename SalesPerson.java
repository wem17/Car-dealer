package com.company;

import java.util.ArrayList;

/*
Project: Car Dealership
Purpose Details: Create a functioning Car Dealership
Course: IST 242
Author: Christian Lemmo
Date Developed: 3/14/19
Last Date Changed: 3/27/19
Rev: 2
 */

    public class SalesPerson {

        /**
         * Hold all the customer information
         *
         * @param SalesPersonID    variable
         * @param SalesPersonName  variable
         * @param SalespersonNumber  variable
         * @param SalesPersonEmail   variable
         * @author              Christian Lemmo
         * @version             1.0
         * @since               2019-04-30
         */

        private int SalesPersonId;
        private String SalesPersonName;
        private String SalesPersonNumber;
        private String SalesPersonEmail;

        //Constructor Method
        public SalesPerson(int _SalesPersonId) {
            this.SalesPersonId = _SalesPersonId;  //Increments the ID count
        }

        //Setters and Getters
        public int getSalesPersonId() { return SalesPersonId; }
        public void setSalesPersonId(int _SalesPersonId) {this.SalesPersonId = _SalesPersonId;}

        public String getSalesPersonName() { return SalesPersonName; }
        public void setSalesPersonName(String _SalesPersonName) {this.SalesPersonName = _SalesPersonName;}

        public String getSalesPersonNumber() { return SalesPersonNumber; }
        public void setSalesPersonNumber(String _SalesPersonNumber) {this.SalesPersonNumber = _SalesPersonNumber;}

        public String getSalesPersonEmail() { return SalesPersonEmail; }
        public void setSalesPersonEmail(String _SalesPersonEmail) {this.SalesPersonEmail = _SalesPersonEmail;}

        public static void printSalesPerson(ArrayList<SalesPerson> sList){
            for (SalesPerson sale: sList){
                System.out.println("Sales Person Id:" + sale.getSalesPersonId());
                System.out.println("Sales Person Name:" + sale.getSalesPersonName());
                System.out.println("Sales Person Phone:" + sale.getSalesPersonNumber());
                System.out.println("Sales Person Email:" + sale.getSalesPersonEmail());
            }
        }
    }

