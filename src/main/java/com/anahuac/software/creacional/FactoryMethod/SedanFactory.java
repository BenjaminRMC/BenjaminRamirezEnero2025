package com.anahuac.software.creacional.FactoryMethod;

public class SedanFactory extends CarFactory {

    @Override
    public Car createCar(String type) {
        Car car = null;
        switch (type) {
            case "basic": car = new SedanCarBasic(); break;
            case "medium": car = new SedanCarMedium(); break;
            case "high": car = new SedanCarHigh(); break;
        }
        return car;
    }
}
