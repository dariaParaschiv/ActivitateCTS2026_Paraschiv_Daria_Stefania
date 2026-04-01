package ro.ase.cts.main;

import ro.ase.cts.clase.ISalata;
import ro.ase.cts.clase.Salata;
import ro.ase.cts.clase.SalataBuilder;

public class Main {
    public static void main(String[] args) {
        ISalata builder = new SalataBuilder();
        Salata salata1 = builder.setAreRosii(true).build();
        Salata salata2 = builder.setAreCastraveti(true).setAreCastraveti(true).build();

        System.out.println(salata1.toString());
        System.out.println(salata2.toString());
    }
}
