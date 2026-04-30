package ro.ase.cts.main;

import ro.ase.cts.clase.Autobuz;
import ro.ase.cts.clase.LinieFactory;

public class Main {
    public static void main(String[] args) {
        Autobuz autobuz1 = new Autobuz("electric ", 2000, 40);
        Autobuz autobuz2 = new Autobuz("electric ", 2005, 50);
        Autobuz autobuz3 = new Autobuz("electric ", 2010, 50);

        LinieFactory linieFactory = new LinieFactory();
        linieFactory.getLinieTransport(102, "CFR ", "Pantelimon ").afiseazaAutobuzLinie(autobuz1);
        linieFactory.getLinieTransport(103, "Romana ", "Universitate ").afiseazaAutobuzLinie(autobuz2);
        linieFactory.getLinieTransport(102, "Gara de nord ", "Romana ").afiseazaAutobuzLinie(autobuz3);
    }
}
