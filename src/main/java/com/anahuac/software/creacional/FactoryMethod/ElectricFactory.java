package com.anahuac.software.creacional.FactoryMethod;

public class ElectricFactory extends CarFactory {

	@Override
	public Car createCar(String type) {
		Car carro = null;
		switch(type) {
		case "basic": carro = new ElectricCarBasic(); break;
		case "medium": carro = new ElectricCarMedium(); break;
		case "high": carro = new ElectricCarHigh(); break;
		}
		return carro;
	}

}
