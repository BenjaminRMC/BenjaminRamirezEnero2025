package com.anahuac.software.creacional.FactoryMethod;

public class Driver {

    public static void main(String[] args) {
        // Ensamblar coches eléctricos
        CarFactory fabricaElectrica = new ElectricFactory();
        System.out.println("Ensamblando coches eléctricos:");
        fabricaElectrica.ensamblar("basic");
        System.out.println("------------------");
        fabricaElectrica.ensamblar("medium");
        System.out.println("------------------");
        fabricaElectrica.ensamblar("high");
        System.out.println("------------------");

        // Ensamblar coches Pickup
        CarFactory fabricaPickup = new PickupFactory();
        System.out.println("Ensamblando coches Pickup:");
        fabricaPickup.ensamblar("basic");
        System.out.println("------------------");
        fabricaPickup.ensamblar("medium");
        System.out.println("------------------");
        fabricaPickup.ensamblar("high");
        System.out.println("------------------");

        // Ensamblar coches Sedán
        CarFactory fabricaSedan = new SedanFactory();
        System.out.println("Ensamblando coches Sedán:");
        fabricaSedan.ensamblar("basic");
        System.out.println("------------------");
        fabricaSedan.ensamblar("medium");
        System.out.println("------------------");
        fabricaSedan.ensamblar("high");
        System.out.println("------------------");
    }
}
