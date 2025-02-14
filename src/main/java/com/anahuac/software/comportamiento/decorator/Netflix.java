package com.anahuac.software.comportamiento.decorator;

public class Netflix extends ServicioDecorator {

    public Netflix(Servicio servicio) {
        super(servicio);
    }

    @Override
    public String getDescription() {
        return servicio.getDescription() + " + Netflix";
    }

    @Override
    public double cost() {
        return servicio.cost() + 50;
    }
}
