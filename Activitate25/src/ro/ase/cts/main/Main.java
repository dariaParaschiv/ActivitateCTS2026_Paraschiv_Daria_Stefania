package ro.ase.cts.main;

import ro.ase.cts.clase.OalaAdaptor;
import ro.ase.cts.clase.OalaNormala;
import ro.ase.cts.clase.OalaSpeciala;

public class Main {
    public static void main(String[] args) {
        OalaNormala oalaNormala = new OalaNormala("Metal ");
        oalaNormala.incalzestePeInductie();
        OalaSpeciala oalaSpeciala = new OalaSpeciala("Lingura ", 10);
        oalaSpeciala.incalzesteLaFocDeschis();
        OalaNormala oalaAdaptata = new OalaAdaptor(oalaSpeciala);
        oalaAdaptata.incalzestePeInductie();
    }
}
