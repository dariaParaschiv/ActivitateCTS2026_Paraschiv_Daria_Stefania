package ro.ase.cts.main;

import ro.ase.cts.clase.Floare;
import ro.ase.cts.clase.IPrototype;

public class Main {
    public static void main(String[] args) {
        IPrototype floare = new Floare("Lalea ", true);
        IPrototype floare2 = floare.copiaza();
        IPrototype floare3 = floare2.copiaza();
        ((Floare) floare2).setAreMiros(false);
        System.out.println(floare2.toString());
        System.out.println(floare.toString());
        System.out.println(floare3.toString());
    }
}
