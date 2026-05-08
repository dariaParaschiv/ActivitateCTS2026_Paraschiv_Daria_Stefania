package ro.ase.cts.main;

import ro.ase.cts.clase.CutieCadou;
import ro.ase.cts.clase.ElementCadou;
import ro.ase.cts.clase.ObiectIndividual;

public class Main {
    public static void main(String[] args) {
        ElementCadou cana = new ObiectIndividual("Cana ", 0.5f);
        ElementCadou esarfa = new ObiectIndividual("Esarfa ", 0.2f);
        ElementCadou ceas = new ObiectIndividual("Ceas ", 0.3f);

        ElementCadou cutieAccesorii = new CutieCadou("Cutie accesorii ");
        cutieAccesorii.adauga(ceas);

        ElementCadou cutieMare = new CutieCadou("Pachet cadou craciun ");
        cutieMare.adauga(cana);
        cutieMare.adauga(esarfa);
        cutieMare.adauga(cutieAccesorii);

        System.out.println("Greutatea totala a cadoului: " + cutieMare.calculeazaGreutate());

    }
}
