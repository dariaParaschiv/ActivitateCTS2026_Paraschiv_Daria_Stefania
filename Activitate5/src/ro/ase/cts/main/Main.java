package ro.ase.cts.main;

import ro.ase.cts.clase.Burger;
import ro.ase.cts.clase.BurgerBuilder;
import ro.ase.cts.clase.BurgerBuilderAlternativ;

public class Main {
    public static void main(String[] args) {
        Burger burger1 = new Burger("Chifla simpla ", "Carne de pui ", "Sos ketchup ", true, false);
        Burger burger2 = new Burger("Chifla cu seminte ", "Carne de vita ", "Sos maioneza ", false, true);
        BurgerBuilder builder = new BurgerBuilder("Chifla neagra ", "Carne de porc ");
        Burger burger3 = builder.build();
        Burger burger4 = builder.setChifla("Chifla simpla").setCarne("Carne de pui").setSos("Mustar").setAreSalata(true).setAreBacon(false).build();
        System.out.println(burger1.toString());
        System.out.println(burger2.toString());
        System.out.println(burger3.toString());
        System.out.println(burger4.toString());

        BurgerBuilderAlternativ builderAlternativ = new BurgerBuilderAlternativ();
        builderAlternativ.setAreSalata(true);
        Burger burger100 = builderAlternativ.build("Chifla simpla", "Carne de pui");
        Burger burger101 = builderAlternativ.setChifla("Chifla neagra").setCarne("Carne de vita").build("Chifla cu seminte", "Carne de porc");
        System.out.println(burger100.toString());
        System.out.println(burger101.toString());


    }
}
