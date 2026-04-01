package ro.ase.cts.main;

import ro.ase.cts.clase.Masina;

public class Main {
    public static void main(String[] args) {
        Masina masina1 = Masina.getInstance("Alina ", "BMW ", 1, 0);
        Masina masina2 = Masina.getInstance("Andrei ", "Audi ", 5, 5);

        masina1.afisareAsigurare();
        masina2.afisareAsigurare();
    }
}
