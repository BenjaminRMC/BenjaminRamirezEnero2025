package com.anahuac.software.creacional.FactoryMethod;

public abstract class PickupCar extends Car {

    @Override
    public void addBody() {
        System.out.println("Agregar carrocería de pickup");
    }
}
