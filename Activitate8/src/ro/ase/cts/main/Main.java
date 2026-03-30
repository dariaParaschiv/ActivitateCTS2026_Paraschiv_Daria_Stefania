package ro.ase.cts.main;

import ro.ase.cts.clase.Panou;
import ro.ase.cts.clase.PrototypePanou;

public class Main {
    public static void main(String[] args) {
        PrototypePanou panou1 = new Panou("New", 100, 100, "Bucuresti");
        PrototypePanou panou2 = panou1.copiaza();
        ((Panou) panou1).setInaltime(200);

        System.out.println(panou1.toString());
        System.out.println(panou2.toString());
    }
}
