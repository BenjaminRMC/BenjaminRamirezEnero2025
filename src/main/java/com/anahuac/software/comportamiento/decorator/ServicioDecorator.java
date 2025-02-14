package com.anahuac.software.comportamiento.decorator;

public abstract class ServicioDecorator extends Servicio {
    protected Servicio servicio;

    public ServicioDecorator(Servicio servicio) {
        this.servicio = servicio;
    }
}
