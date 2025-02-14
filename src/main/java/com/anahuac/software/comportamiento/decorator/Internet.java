package com.anahuac.software.comportamiento.decorator;

public class Internet extends ServicioDecorator {

    public Internet(Servicio servicio) {
        super(servicio);
    }

    @Override
    public String getDescription() {
        return servicio.getDescription() + " + Internet";
    }

    @Override
    public double cost() {
        return servicio.cost() + 250;
    }
}
