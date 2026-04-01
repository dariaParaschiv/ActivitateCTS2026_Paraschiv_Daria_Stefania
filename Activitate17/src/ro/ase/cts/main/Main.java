package ro.ase.cts.main;

import ro.ase.cts.clase.Fruct;
import ro.ase.cts.clase.Piata;
import ro.ase.cts.enums.FructType;
import ro.ase.cts.enums.LegumaType;
import ro.ase.cts.factory.FructFabrica;
import ro.ase.cts.factory.LegumaFabrica;
import ro.ase.cts.factory.PiataFabrica;

public class Main {
    public static void main(String[] args) {
        PiataFabrica piata1 = new FructFabrica();
        Piata portocala = piata1.creareObiectPiata(FructType.Portocala, 250, true);
        Piata mar = piata1.creareObiectPiata(FructType.Mar, 150, true);

        PiataFabrica piata2 = new LegumaFabrica();
        Piata cartof = piata2.creareObiectPiata(LegumaType.Cartof, 500, true);
        Piata morcov = piata2.creareObiectPiata(LegumaType.Morcov, 300, true);


        portocala.afisareDescriere();
        mar.afisareDescriere();
        cartof.afisareDescriere();
        morcov.afisareDescriere();
    }
}
