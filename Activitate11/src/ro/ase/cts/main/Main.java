package ro.ase.cts.main;

import ro.ase.cts.clase.Bautura;
import ro.ase.cts.clase.BauturaFactory;
import ro.ase.cts.clase.BauturaType;

public class Main {
    public static void main(String[] args) {
        BauturaFactory fabrica = new BauturaFactory();
        Bautura cafea = fabrica.getBautura("Cafea cu lapte ", 100.25, "Standard ", BauturaType.Cafea);
        Bautura ceai = fabrica.getBautura("Ceai de fructe ", 125.3, "Standard ", BauturaType.Ceai);
        Bautura ciocolataCalda = fabrica.getBautura("Ciocolata calda ", 122.34, "Standard ", BauturaType.CiocolataCalda);

        cafea.afisareDescriere();
        cafea.preparareBautura();

        ceai.afisareDescriere();
        ceai.preparareBautura();

        ciocolataCalda.afisareDescriere();
        ciocolataCalda.preparareBautura();
    }
}
