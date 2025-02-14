package com.anahuac.software.comportamiento.observer;

import java.util.ArrayList;

public class Articulo implements Subject {

	private ArrayList <Observer>observers;
	private double price;
	private double targetPrice;
	public Articulo(double targetprice, double price) {
		this.price = price;
		this.targetPrice = targetprice;
		observers = new ArrayList<Observer>();
	}
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
		if(price <= targetPrice) {
			notifyObserver();
		}
	}

	public double getTargetPrice() {
		return targetPrice;
	}

	public void setTargetPrice(double targetPrice) {
		this.targetPrice = targetPrice;
	}

	@Override
	public void agregarObserver(Observer o) {
		observers.add(o);

	}

	@Override
	public void removeObserver(Observer o) {
		observers.remove(o);

	}

	public void notifyObserver() {
		for(int i=0;i < observers.size(); i++) {
			observers.get(i).update(price);
		}

	}

}
