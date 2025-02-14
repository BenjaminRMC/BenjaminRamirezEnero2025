package com.anahuac.software.comportamiento.decorator;

public class Prime extends ServicioDecorator {

    public Prime(Servicio servicio) {
        super(servicio);
    }

    @Override
    public String getDescription() {
        return servicio.getDescription() + " + Prime";
    }

    @Override
    public double cost() {
        return servicio.cost() + 50;
    }
}
