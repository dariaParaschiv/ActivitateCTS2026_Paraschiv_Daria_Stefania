package ro.ase.cts.main;

import ro.ase.cts.clase.Rezervare;
import ro.ase.cts.clase.RezervareBuilder;

public class Main {
    public static void main(String[] args) {
        Rezervare rezervare1 = new RezervareBuilder().setLocLaFereastra(true).setScauneErgonomice(true).setDecoratiuni("Colorate").setMuzica("Clasica").build();
        Rezervare rezervare2 = new RezervareBuilder().setScauneErgonomice(true).setDecoratiuni("Auriu").build();

        System.out.println("Rezervarea 1: " + rezervare1);
        System.out.println("Rezervarea 2: " + rezervare2);
    }
}
