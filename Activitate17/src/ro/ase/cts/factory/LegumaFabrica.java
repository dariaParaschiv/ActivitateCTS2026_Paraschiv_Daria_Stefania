package ro.ase.cts.factory;

import ro.ase.cts.clase.Cartof;
import ro.ase.cts.clase.Morcov;
import ro.ase.cts.clase.Piata;
import ro.ase.cts.enums.LegumaType;
import ro.ase.cts.enums.PiataType;

public class LegumaFabrica implements PiataFabrica{
    @Override
    public Piata creareObiectPiata(PiataType tip, int gramaj, boolean esteProaspat) {
        return switch(tip){
            case LegumaType.Cartof -> new Cartof(gramaj, esteProaspat);
            case LegumaType.Morcov -> new Morcov(gramaj, esteProaspat);
            default -> null;
        };
    }

    @Override
    public Piata creareObiectPiata(PiataType tip, int gramaj) {
        return creareObiectPiata(tip, gramaj, true);
    }
}
