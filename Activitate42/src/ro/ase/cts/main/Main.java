package ro.ase.cts.main;

import ro.ase.cts.clase.Adapter;
import ro.ase.cts.clase.IAplicatieNoua;
import ro.ase.cts.clase.SoftVechiBazaDate;

public class Main {
    public static void main(String[] args) {
        SoftVechiBazaDate sistemVechi = new SoftVechiBazaDate();

        IAplicatieNoua aplicatie = new Adapter(sistemVechi);

        aplicatie.afiseazaIstoric();
    }
}
