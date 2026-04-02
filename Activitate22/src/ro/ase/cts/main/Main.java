package ro.ase.cts.main;

import ro.ase.cts.clase.FelMancare;
import ro.ase.cts.clase.FelMancarePrototype;

public class Main {
    public static void main(String[] args) {
        FelMancarePrototype felMancare1 = new FelMancare("Ciorba", 7);
        FelMancarePrototype felMancare2 = felMancare1.copiaza();
        ((FelMancare) felMancare2).setIngrediente(9);

        System.out.println(felMancare1.toString());
        System.out.println(felMancare2.toString());
    }
}
