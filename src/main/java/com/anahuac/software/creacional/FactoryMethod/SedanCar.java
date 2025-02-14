package com.anahuac.software.creacional.FactoryMethod;

public abstract class SedanCar extends Car {

    @Override
    public void addBody() {
        System.out.println("Agregar carrocería de sedán");
    }
}
