package com.anahuac.software.comportamiento.decorator;

public class Disney extends ServicioDecorator {

    public Disney(Servicio servicio) {
        super(servicio);
    }

    @Override
    public String getDescription() {
        return servicio.getDescription() + " + Disney";
    }

    @Override
    public double cost() {
        return servicio.cost() + 50;
    }
}
