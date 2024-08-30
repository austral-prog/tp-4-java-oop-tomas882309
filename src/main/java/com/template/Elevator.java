package com.template;

public class Elevator {
    int floor;
    int passangers;
    int minfloor;
    int maxfloor;
    int cantidadmaxima;

    public Elevator(int minfloor, int maxfloor, int cantidadmaxima){
        this.minfloor = minfloor;
        this.maxfloor = maxfloor;
        this.cantidadmaxima = cantidadmaxima;
        passangers = 0;
        floor = 0;
    }
    public int moveToFloor(int newfloor){
        if (newfloor >= minfloor && newfloor <= maxfloor){
            this.floor = newfloor;
            return newfloor;
        }
        else{
            return floor;
        }
    }
    public int getCurrentFloor(){
        return floor;
    }
    public int addPassenger(){
        if (passangers < cantidadmaxima) {
            this.passangers = passangers + 1;
            return passangers;
        }
        else{
            return passangers;
        }
    }
    public int getPassengerCount(){
        return passangers;
    }
    public int removePassenger(){
        this.passangers = passangers - 1;
        return passangers;
    }



    // Implement this class by observing the tests in this repo. From those you will be able
    // to pick what the constructors params are, what the methods are and what they should do.


}
