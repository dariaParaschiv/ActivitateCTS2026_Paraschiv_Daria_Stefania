package ro.ase.cts.main;

import ro.ase.cts.clase.Petitie;
import ro.ase.cts.clase.PrototypePetitie;

public class Main {
    public static void main(String[] args) {
        PrototypePetitie petitie1 = new Petitie("Ionut",34,"Am fost jefuit!");
        PrototypePetitie petitie2 = petitie1.copiaza();
        System.out.println(petitie1);
        System.out.println("====================");
        System.out.println(petitie2);
        ((Petitie) petitie2).setNume("Cornelus");
        ((Petitie) petitie2).setMotiv("Am fost batut!");
        ((Petitie) petitie2).setVarsta(38);
        System.out.println(petitie2);

    }
}
