package ro.ase.cts.main;

import ro.ase.cts.clase.Autobuz;
import ro.ase.cts.clase.AutobuzCursaSpeciala;
import ro.ase.cts.clase.AutobuzDeNoapte;
import ro.ase.cts.clase.MijlocTransport;

public class Main {
    public static void main(String[] args) {
        MijlocTransport mijlocTransport = new Autobuz("182 ", 40);
        mijlocTransport.opresteInStatie();
        mijlocTransport.opresteInStatie();

        MijlocTransport autobuzDeNoapte = new AutobuzDeNoapte(mijlocTransport);
        autobuzDeNoapte.opresteInStatie();

        MijlocTransport autobuz = new Autobuz("62 ", 0);
        autobuz.opresteInStatie();
        MijlocTransport autobuzNoapte = new AutobuzDeNoapte(autobuz);
        autobuzNoapte.opresteInStatie();

        MijlocTransport autobuz2 = new Autobuz("100 speciala ", 0);
        MijlocTransport autobuzSpecial = new AutobuzCursaSpeciala(autobuz2);
        autobuzSpecial.opresteInStatie();
    }
}
