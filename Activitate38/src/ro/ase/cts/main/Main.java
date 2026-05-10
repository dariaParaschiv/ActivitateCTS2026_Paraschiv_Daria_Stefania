package ro.ase.cts.main;

import ro.ase.cts.clase.Angajat;
import ro.ase.cts.clase.Director;
import ro.ase.cts.clase.Manager;

public class Main {
    public static void main(String[] args) {
        Angajat manager = new Manager();
        Angajat director = new Director();

        manager.setSuccesor(director);

        manager.aprobaCheltuiala(400, "Papetarie");
        manager.aprobaCheltuiala(1500, "Laptop nou");
        manager.aprobaCheltuiala(5000, "Masina firma");
    }
}
