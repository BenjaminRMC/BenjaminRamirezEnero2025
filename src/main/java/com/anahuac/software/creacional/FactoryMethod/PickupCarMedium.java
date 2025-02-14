package com.anahuac.software.creacional.FactoryMethod;

public class PickupCarMedium extends PickupCar {

    @Override
    public void addDoors() {
        System.out.println("Agregar 4 puertas estándar");
    }

    @Override
    public void paint() {
        System.out.println("Agregar 2 capas de pintura estándar");
    }
}
