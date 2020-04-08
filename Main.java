
package com.company;
/*
Project: Car Dealership
Purpose Details: Create a functioning Car Dealership
Course: IST 242
Author: Chris Lemmo
Date Developed: 3/14/19
Last Date Changed: 3/26/19
Rev: 2
 */
import java.util.ArrayList;
import java.util.Scanner;

        public class Main {
            private int cCount = 1;

            public static void main(String[] args) {

                Main main = new Main();
                final char EXIT_CODE = 'E';
                final char CUST_CODE = 'C';
                final char ORDECAR_CODE = 'Q';
                final char ORDERPAR_CODE = 'A';
                final char ORDE_PRNT = 'K';
                final char TRAN_CODE = 'T';
                final char SALE_CODE = 'S';
                final char SALE_PRNT = 'J';
                final char PART_CODE = 'I';
                final char CUST_PRNT = 'P';
                final char VEHI_CODE = 'V';
                final char HELP_CODE = '?';
                char userAction;
                System.out.println("Welcome to Bustlin' Bills AutoLand!!!!\n" +
                        "                    ___..................____\n" +
                        "           _..--''~_______   _____...----~~~\\\\\n" +
                        "       __.'    .-'~       \\\\~      [_`.7     \\\\\n" +
                        " .---~~      .'            \\\\           __..--\\\\_\n" +
                        "/             `-._          \\\\   _...~~~_..---~  ~~~~~~~~~~~~--.._\n" +
                        "\\              /  ~~~~~~----_\\`-~_-~~__          ~~~~~~~---.._    ~--.__\n" +
                        " \\     _       |==            |   ~--___--------...__          `-   _.--\"\"\"|\n" +
                        "  \\ __/.-._\\   |              |            ~~~~--.  `-._ ___...--~~~_.'|_Y |\n" +
                        "   `--'|/~_\\\\  |              |     _____           _.~~~__..--~~_.-~~~.-~/\n" +
                        "     | ||| |\\\\_|__            |.../.----.._.        | Y |__...--~~_.-~  _/\n" +
                        "      ~\\\\\\ || ~|..__---____   |||||  .'~-. \\\\       |_..-----~~~~   _.~~\n" +
                        "        \\`-'/ /     ~~~----...|'''|  |/\"_\"\\ \\\\   |~~'           __.~\n" +
                        "         `~~~'                 ~~-:  ||| ~| |\\\\  |        __..~~\n" +
                        "                                   ~~|||  | | \\\\/  _.---~~\n" +
                        "                                     \\\\\\  //  | ~~~\n" +
                        "                                      \\`-'/  / \n" +
                        "                                       `~~~~ Test Drive One of Bills' Brand New Cars today'");



                final String PROMPT_ACTION = "Add Customer (C), Print Customer (P), Order Car (Q), Order Part (A), List Transaction (T) , List Vehicle (V), List Parts (I), Add SalesPerson (S), Print SalesPerson(s) (J), or Exit (E)";
                ArrayList<Customer> cList = new ArrayList<>();
                ArrayList<Order> oList = new ArrayList<>();
                ArrayList<Vehicle> vList = new ArrayList<>();
                ArrayList<Transaction> tList = new ArrayList<>();
                ArrayList<Parts> pList = new ArrayList<>();
                ArrayList<SalesPerson> sList = new ArrayList<>();

                Order order1 = new Order(1);

                Transaction trans1 = new Transaction(1, order1, PaymentType.cash);

                oList.add(order1);

                Vehicle vehicle1 = new Vehicle(1, "Honda CRV", "Car", 1998, 8000.55);
                Vehicle vehicle2 = new Vehicle(2, "Ford Explorer", "SUV", 2004, 10000.55);
                Vehicle vehicle3 = new Vehicle(3, "GMC", "Truck", 2015, 12000.55);
                Vehicle vehicle4 = new Vehicle(4, "Lincoln", "SUV", 2017, 9000.55);
                vList.add(vehicle1);
                vList.add(vehicle2);
                vList.add(vehicle3);
                vList.add(vehicle4);

                Parts part1 = new Parts(1, "Breaks", 300.55);
                Parts part2 = new Parts(2, "Engine", 700.55);
                pList.add(part1);
                pList.add(part2);
                tList.add(trans1);


                userAction = getAction(PROMPT_ACTION);
                while (userAction != EXIT_CODE) {
                    switch (userAction) {
                        case CUST_CODE:
                            cList.add(main.addCustomer());
                            break;
                        case CUST_PRNT:
                            Customer.printCustomer(cList);
                            break;
                        case ORDECAR_CODE:
                            System.out.println("Is the customer purchasing a car");
                            Scanner scnr1 = new Scanner(System.in);
                            String q1 = scnr1.nextLine();
                            q1 = q1.toLowerCase();
                            if (q1.contains("yes")) {
                                Scanner orderTime = new Scanner(System.in);
                                System.out.println("What car is customer purchasing? Please enter the ID associated with the car: ");
                                int c1 = orderTime.nextInt();
                                double price = vList.get(c1).getvehiclePrice();
                                System.out.println("Total: " + price);
                                oList.add(order1);
                            } else {
                                break;
                            }
                        case ORDERPAR_CODE:
                            System.out.println("Is the customer purchasing a part? ");
                            Scanner scnr12 = new Scanner(System.in);
                            String q2 = scnr12.nextLine();
                            q2 = q2.toLowerCase();
                            if (q2.contains("yes")) {
                                System.out.println("What PART is customer purchasing? Please enter the ID associated with the part: ");
                                Scanner orderTime = new Scanner(System.in);
                                double orderCust12 = orderTime.nextDouble();
                                int c1 = orderTime.nextInt();
                                double price = pList.get(c1).getpartPrice();
                                System.out.println("Total: " + price);
                                oList.add(order1);
                            } else {
                                break;
                            }


                        case SALE_CODE:
                            sList.add(main.addSalesPerson());
                            break;
                        case SALE_PRNT:
                            SalesPerson.printSalesPerson(sList);
                            break;
                        // case ORDE_PRNT:
                        // Order.printOrder(oList);
                        // break;
                        case PART_CODE:
                            Parts.listParts(pList);
                            break;
                        case VEHI_CODE:
                            Vehicle.listVehicle(vList);
                            break;
                        case TRAN_CODE:
                            Transaction.listTransactions(tList);
                            break;
                    }

                    userAction = getAction(PROMPT_ACTION);
                }
            }

            public static char getAction(String prompt) {
                Scanner scnr = new Scanner(System.in);
                String answer = "";
                System.out.println(prompt);
                answer = scnr.nextLine().toUpperCase() + " ";
                char firstChar = answer.charAt(0);
                return firstChar;
            }
            public Customer addCustomer() {
            Customer cust = new Customer(cCount++);
            Scanner scnr = new Scanner(System.in);
            System.out.println("Please Enter your Name: ");
            cust.setCustomerName(scnr.nextLine());
            System.out.println("Please Enter your Phone: ");
            cust.setCustomerPhoneNumber(scnr.nextLine());
            System.out.println("Please Enter your Email: ");
            cust.setCustomerEmail(scnr.nextLine());
            return cust;
        }


            public SalesPerson addSalesPerson() {
                SalesPerson sale = new SalesPerson(cCount++);
                Scanner scnr = new Scanner(System.in);
                System.out.println("Please Enter your Name: ");
                sale.setSalesPersonName(scnr.nextLine());
                System.out.println("Please Enter your Phone: ");
                sale.setSalesPersonNumber(scnr.nextLine());
                System.out.println("Please Enter your Email: ");
                sale.setSalesPersonEmail(scnr.nextLine());
                return sale;
            }


        }