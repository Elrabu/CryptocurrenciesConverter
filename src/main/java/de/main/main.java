package de.main;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        String start = "3";
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Welcome to the Cryptocurrency Converter 1.0!");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
        while(true){
            if(start.equals("3")){
                Scanner myObj = new Scanner(System.in);
                System.out.println("");
                System.out.println("[0] Check Stock Prices");
                System.out.println("[1] Convert Cryptocurrencies");
                System.out.print("Enter your choice: ");
                String input = myObj.nextLine();
                if(input.equals("0")){
                    Scanner myObj1 = new Scanner(System.in);
                    System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
                    System.out.println("Available Cryptocurrencies:");
                    System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
                    System.out.println("[0] Bitcoin");
                    System.out.println("[1] Ethereum");
                    System.out.println("");
                    System.out.println("[3] Back");
                    System.out.print("Enter your choice: ");
                    String input1 = myObj1.nextLine();
                    start = input1;

                } else if(input.equals("1")){
                    Scanner myObj1 = new Scanner(System.in);
                    System.out.println("");
                    System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
                    System.out.println("Feature coming soon");
                    System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
                    System.out.println("");
                    System.out.println("[3] Back");
                    String input1 = myObj1.nextLine();
                    start = input1;
                }
            }
        }
    }
}
