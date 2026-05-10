package ro.ase.cts.main;

import ro.ase.cts.clase.AplicatieFan;
import ro.ase.cts.clase.Fan;
import ro.ase.cts.clase.MeciFotbal;

public class Main {
    public static void main(String[] args) {
        MeciFotbal derby = new MeciFotbal("Steaua ", "Dinamo ");

        Fan fan1 = new AplicatieFan("George ");
        Fan fan2 = new AplicatieFan("Ion ");

        derby.abonareFan(fan1);
        derby.abonareFan(fan2);

        derby.inscrieGol("Steaua ");

        System.out.println("Dupa pauza: ");

        derby.dezabonareFan(fan2);

        derby.inscrieGol("Steaua ");
    }
}
