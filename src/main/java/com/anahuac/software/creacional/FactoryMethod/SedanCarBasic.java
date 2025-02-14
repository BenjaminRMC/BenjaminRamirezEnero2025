package com.anahuac.software.creacional.FactoryMethod;

public class SedanCarBasic extends SedanCar {

    @Override
    public void addDoors() {
        System.out.println("Agregar 4 puertas básicas");
    }

    @Override
    public void paint() {
        System.out.println("Agregar 1 capa de pintura básica");
    }
}
