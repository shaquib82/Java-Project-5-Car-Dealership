package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String []parts = {"tires","keys"};

        car[] cars = new car[]{
                new car("Nissan",5000,2020,"red",parts),
                new car("Dodge",7000,2015,"blue",parts),
                new car("Nissan",5000,2020,"Yellow",parts),
                new car("Honda",7000,2019,"Orange",parts),
                new car("Mercedes",12000,2015,"Jet Black",
                        new String[]{"tires","filters","transmission"})
        };

     Dealership dealership=new Dealership(cars);
     Scanner sc = new Scanner(System.in);

        System.out.println("\n ****** JAVA DEALERSHIP! ****** \n");
        System.out.print("Welcome! Enter the type of car you're looking for: ");
        String type = sc.next();

        System.out.print("Enter your budget: ");

        int budget =sc.nextInt();
int position =dealership.search(type,budget);
if(position==404){
    System.out.println(" Feel free to browse through our collection of cars.\n");
    System.out.println(dealership);
}
else{
    cars[position].drive();
}





//        System.out.println(dealership);

    }



}
