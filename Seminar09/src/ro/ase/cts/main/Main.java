package ro.ase.cts.main;

import ro.ase.cts.clase.Medic;
import ro.ase.cts.clase.Pacient;
import ro.ase.cts.clase.Salon;
import ro.ase.cts.clase.Spital;

public class Main {
    public static void main(String[] args) {
        Pacient pacient = new Pacient("Ionescu ", 7);
        Medic medic = new Medic();
        Salon salon = new Salon();

        Pacient pacient1 = new Pacient("Popescu ", 3);
        Pacient pacient2 = new Pacient("Barbu ", 5);
        Pacient pacient3 = new Pacient("Georgescu ", 10);

        Spital spital = new Spital(medic, salon);
        spital.internarePacient(pacient1);
        spital.internarePacient(pacient2);
        spital.internarePacient(pacient3);
    }
}
