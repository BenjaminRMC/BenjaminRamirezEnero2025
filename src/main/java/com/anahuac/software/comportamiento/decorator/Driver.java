package com.anahuac.software.comportamiento.decorator;

public class Driver {

    public static void main(String[] args) {
        Servicio service = new ServicioTelefonico();
        System.out.println(service.getDescription());
        System.out.println(service.cost());
        System.out.println("____________________\n");

        Servicio servicioPremium = new ServicioTelefonico();
        servicioPremium = new Internet(servicioPremium);
        servicioPremium = new HBO(servicioPremium);
        servicioPremium = new Netflix(servicioPremium);
        System.out.println(servicioPremium.getDescription());
        System.out.println(servicioPremium.cost());
    }
}
