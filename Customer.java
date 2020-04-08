
package com.company;

import java.util.ArrayList;
import java.util.Scanner;

/*
Project: Car Dealership
Purpose Details: Create a functioning Car Dealership
Course: IST 242
Author: Wilmer Monsalve
Date Developed: 3/14/19
Last Date Changed: 3/27/19
Rev: 2
 */

    public class Customer {

        /**
         * Hold all the customer information
         *
         * @param customerID    variable
         * @param customerName  variable
         * @param customerPhoneNumber  variable
         * @param customerEmail   variable
         * @author              Samantha Scheer
         * @version             1.0
         * @since               2019-04-30
         */

        //Class Level Variables - Protect the data
        private int customerId;
        private String customerName;
        private String customerPhoneNumber;
        private String customerEmail;

        //Constructor Method
        public Customer(int customerId ) {
            this. customerId = customerId;  //Increments the ID count

        }

        //Setters and Getters
        public int getCustomerId() { return customerId; }
        public void setCustomerId(int _customerId) {this.customerId = _customerId;}

        public String getCustomerName() { return customerName; }
        public void setCustomerName(String _customerName) {this.customerName = _customerName;}

        public String getCustomerPhoneNumber() { return customerPhoneNumber; }
        public void setCustomerPhoneNumber(String _customerPhoneNumber) {this.customerPhoneNumber = _customerPhoneNumber;}

        public String getCustomerEmail() { return customerEmail; }
        public void setCustomerEmail(String _customerEmail) {this.customerEmail = _customerEmail;}

        public static void printCustomer(ArrayList<Customer> cList){
            for (Customer cust: cList){
               System.out.println("Customer Name:"+ cust.getCustomerName());
                System.out.println("Customer Id:" + cust.getCustomerId());
                System.out.println("Customer Email:" + cust.getCustomerEmail());
                System.out.println("Customer Phone: "+ cust.getCustomerPhoneNumber());
            }
        }

    }
