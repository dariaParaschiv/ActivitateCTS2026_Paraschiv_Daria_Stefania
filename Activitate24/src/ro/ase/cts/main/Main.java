package ro.ase.cts.main;

import ro.ase.cts.clase.Jucarie;
import ro.ase.cts.clase.JucarieFactory;
import ro.ase.cts.clase.JucarieType;

public class Main {
    public static void main(String[] args) {
        JucarieFactory factory = new JucarieFactory();
        Jucarie papusa = factory.getJucarie("Metro ", 5, JucarieType.Papusa);
        Jucarie urs = factory.getJucarie("Auchan ", 10, JucarieType.Urs);
        papusa.afisareDescriere();
        urs.afisareDescriere();
    }
}
