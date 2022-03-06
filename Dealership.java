package com.company;

import java.util.Scanner;

public class Dealership {
    Scanner sc = new Scanner(System.in);
    private car []cars;

    public Dealership(car[] CAR){
        this.cars = new car[CAR.length];
        for (int i = 0; i < CAR.length ; i++) {
            this.cars[i]=new car(CAR[i]);

        }


    }

    public void setCars(car car, int index){
        this.cars[index]= new car(car);

    }
    public car getCar(int index){
return new car(this.cars[index]);

    }

    public void sell(int index){
        this.cars[index].drive();
        this.cars[index]=null;
    }
    /** Task 2 - Re-write the search action.
     * Function name: search
     *
     * @param make (String)
     * @param budget (int)
     * @return (int)
     *
     * Inside the function:
     *   1. Loops through every element in the cars field.
     *   2. Skips the run if the element is null.
     *   3. If it finds a car the user can afford:
     *     • println: \nWe found a car in spot <i> \n\n <toString>
     *     • print: If you're interested, type 'yes':
     *     • returns the index
     *   4. If the loop runs and it didn't find a car
     *     • println: \nYour search didn't match any results.\n
     *     • returns 404
     */

    public int search(String make, int budget){
        for (int i = 0; i < cars.length ; i++) {

            if (this.cars[i]==null){
                continue;
            }
           else if(this.cars[i].getMake().equals(make) && this.cars[i].getPrice()<=budget){

                System.out.println("\nWe found one in spot " + i + "\n" + this.cars[i].toString() + "\nAre you interested ?"+"" +
                        "\nType 'yes' if you are.");
                String response = sc.next();
                if (response.equals("yes")){

                    return i;
                }
            }
        }
        System.out.println("\nYour search didn't match any results.\n");
        return 404;

    }

    public String toString(){
        String ParkingS="";
        for (int i = 0; i <cars.length ; i++) {
            String Ps="";
            if(this.cars[i]==null){
                 Ps = "\nParking spot: "+i +"\nEmpty"+"\n";
            }
            else{
                 Ps = "\nParking spot: "+i +"\n"+cars[i].toString()+"\n";

            }
            ParkingS+=Ps;

        }
        return ParkingS;
    }

}
