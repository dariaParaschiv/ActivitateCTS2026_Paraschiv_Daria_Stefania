package ro.ase.cts.program;

import ro.ase.cts.factory.MijlocTransportFactory;
import ro.ase.cts.factory.MijlocTransportType;
import ro.ase.cts.vehicule.MijlocTransport;

public class Main {
    public static void afisareMijlocTransport(MijlocTransport mijlocTransport) {
        mijlocTransport.afisareDescriere();
    }

    public static void main(String[] args) {
        MijlocTransportFactory factory = new MijlocTransportFactory();

        MijlocTransport autobuz = factory.getMijlocTransport("Mercedes", 432, MijlocTransportType.AUTOBUZ);
        MijlocTransport tramvai = factory.getMijlocTransport("Astra", 1, MijlocTransportType.TRAMVAI);
        MijlocTransport troleibuz = factory.getMijlocTransport("Mercedes", 97, MijlocTransportType.TROLEIBUZ);

        afisareMijlocTransport(autobuz);
        afisareMijlocTransport(tramvai);
        afisareMijlocTransport(troleibuz);
    }
}
