package ro.ase.cts.main;

import ro.ase.cts.clase.IPrototypePrajitura;
import ro.ase.cts.clase.Prajitura;

public class Main {
    public static void main(String[] args) {
        IPrototypePrajitura prajitura1 = new Prajitura("Ecler", true, 50);
        IPrototypePrajitura prajitura2 = prajitura1.copiaza();

        ((Prajitura) prajitura2).setGramaj(150);

        System.out.println(prajitura2.toString());
        System.out.println(prajitura1.toString());
    }
}
