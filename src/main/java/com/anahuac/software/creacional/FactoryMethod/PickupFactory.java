package com.anahuac.software.creacional.FactoryMethod;

public class PickupFactory extends CarFactory {

    @Override
    public Car createCar(String type) {
        Car car = null;
        switch (type) {
            case "basic": car = new PickupCarBasic(); break;
            case "medium": car = new PickupCarMedium(); break;
            case "high": car = new PickupCarHigh(); break;
        }
        return car;
    }
}
