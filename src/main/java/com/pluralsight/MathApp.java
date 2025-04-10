package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {

    // Question 1:
    // declare variables here
        int bobSalary = 20000;
        int garySalary = 25000;
        int highestSalary;
    // then code solution
        highestSalary = Math.max(bobSalary, garySalary);
        // then use System.out.println() to display results
        System.out.println("The highest salary is " + highestSalary + "!");

    // Question 2:
    // declare variables here
        int carPrice = 22000;
        int truckPrice = 76775;
        /*if (carPrice < truckPrice) {
            smallest = carPrice;
        } else {
            smallest = truckPrice;
        }
        int smallest = (carPrice < truckPrice) ? carPrice : truckPrice;
        */
        int smallest = Math.min(carPrice, truckPrice);
        System.out.println("The cheaper vehicle is " + smallest);

    // Question 7:
    // declare variables here
        double randomNumber = Math.random();
        System.out.println("Random number: " + randomNumber + "!");


    }
}