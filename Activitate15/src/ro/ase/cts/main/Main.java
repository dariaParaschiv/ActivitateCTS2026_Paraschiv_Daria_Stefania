package ro.ase.cts.main;

import ro.ase.cts.clase.FarmacieFactory;
import ro.ase.cts.clase.IPrototypeMedicament;

public class Main {
    public static void main(String[] args) {
        FarmacieFactory fabrica = new FarmacieFactory();
        IPrototypeMedicament medicament1 = fabrica.returneazaMedicament("Raceala ");
        IPrototypeMedicament medicament2 = medicament1.copiaza();

        IPrototypeMedicament medicament3 = fabrica.returneazaMedicament("Durere de cap ");

        System.out.println(medicament1.toString());
        System.out.println(medicament2.toString());
        System.out.println(medicament3.toString());
    }
}
