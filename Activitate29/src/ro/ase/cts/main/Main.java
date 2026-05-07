package ro.ase.cts.main;

import ro.ase.cts.clase.ProdusPachet;
import ro.ase.cts.clase.ServiciuAdaptor;
import ro.ase.cts.clase.ServiciuMentenanta;

public class Main {
    public static void proceseazaLaCasa(ProdusPachet produs){
        produs.scaneazaCodBare();
    }

    public static void main(String[] args) {
        ProdusPachet produsPachet = new ProdusPachet("Ciocolata ");
        ServiciuMentenanta serviciuMentenanta = new ServiciuMentenanta("Serviciu ", 5);
        ServiciuAdaptor serviciuAdaptor = new ServiciuAdaptor(serviciuMentenanta);

        proceseazaLaCasa(produsPachet);
        proceseazaLaCasa(serviciuAdaptor);
    }
}
