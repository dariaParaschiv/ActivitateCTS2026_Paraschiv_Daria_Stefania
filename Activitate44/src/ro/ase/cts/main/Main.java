package ro.ase.cts.main;

import ro.ase.cts.clase.IEntitate;
import ro.ase.cts.clase.Proxy;
import ro.ase.cts.clase.Spital;

public class Main {
    public static void main(String[] args) {
        IEntitate spital = new Spital();

        IEntitate filtruReceptie = new Proxy(spital);

        filtruReceptie.verificare("Ionescu ", true);
        filtruReceptie.verificare("Popescu ", false);
    }
}
