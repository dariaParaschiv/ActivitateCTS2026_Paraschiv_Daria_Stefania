package ro.ase.cts.main;

import ro.ase.cts.clase.GestiuneInventar;

public class Main {
    public static void main(String[] args) {
        GestiuneInventar gestiune1 = GestiuneInventar.getInstance(100, "Bucuresti", "Alina");
        GestiuneInventar gestiune2 = GestiuneInventar.getInstance(150, "Iasi", "George");

        gestiune1.elibereazaMedicament(20);

        gestiune1.afisareDescriere();
        gestiune2.afisareDescriere();
    }
}
