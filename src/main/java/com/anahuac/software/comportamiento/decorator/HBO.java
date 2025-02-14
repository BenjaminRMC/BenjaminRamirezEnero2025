package com.anahuac.software.comportamiento.decorator;

public class HBO extends ServicioDecorator {

    public HBO(Servicio servicio) {
        super(servicio);
    }

    @Override
    public String getDescription() {
        return servicio.getDescription() + " + HBO";
    }

    @Override
    public double cost() {
        return servicio.cost() + 100;
    }
}
