package com.anahuac.software.comportamiento.observer;

public interface Subject {
	
public void agregarObserver(Observer o);
public void removeObserver(Observer o);
public void notifyObserver();

}
