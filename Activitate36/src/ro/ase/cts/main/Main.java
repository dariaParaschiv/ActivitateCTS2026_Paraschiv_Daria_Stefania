package ro.ase.cts.main;

import ro.ase.cts.clase.AplicatieMaps;
import ro.ase.cts.clase.StrategieMasina;
import ro.ase.cts.clase.StrategiePeJos;

public class Main {
    public static void main(String[] args) {
        AplicatieMaps googleMaps = new AplicatieMaps();
        int distantaDeParcurs = 120;

        googleMaps.setModTransport(new StrategieMasina());
        googleMaps.afiseazaDrum(distantaDeParcurs);

        googleMaps.setModTransport(new StrategiePeJos());
        googleMaps.afiseazaDrum(distantaDeParcurs);
    }
}
