package com.anahuac.software.creacional.FactoryMethod;

public class SedanCarHigh extends SedanCar {

    @Override
    public void addDoors() {
        System.out.println("Agregar 4 puertas de lujo");
    }

    @Override
    public void paint() {
        System.out.println("Agregar 3 capas de pintura premium");
    }
}
