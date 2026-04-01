package ro.ase.cts.main;

import ro.ase.cts.clase.Cadou;
import ro.ase.cts.clase.CadouBuilder;
import ro.ase.cts.clase.ICadou;

public class Main {
    public static void main(String[] args) {
        ICadou builder = new CadouBuilder();
        builder.setAreFelicitare(true).setAreFunda(true).build();
        Cadou cadou1 = builder.build();
        System.out.println(cadou1.toString());
        Cadou cadou2 = builder.setAreFelicitare(false).setAreFunda(true).build();
        System.out.println(cadou2.toString());

    }
}
