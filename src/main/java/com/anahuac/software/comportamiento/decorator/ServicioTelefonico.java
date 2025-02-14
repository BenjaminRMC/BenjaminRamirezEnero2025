package com.anahuac.software.comportamiento.decorator;

public class ServicioTelefonico extends Servicio {

    @Override
    public String getDescription() {
        return "El plan incluye telefono\n";
    }

    @Override
    public double cost() {
        return 200;
    }
}
