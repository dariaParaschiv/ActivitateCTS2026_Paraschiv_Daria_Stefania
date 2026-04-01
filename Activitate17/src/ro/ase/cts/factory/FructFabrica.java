package ro.ase.cts.factory;

import ro.ase.cts.clase.Fruct;
import ro.ase.cts.clase.Mar;
import ro.ase.cts.clase.Piata;
import ro.ase.cts.clase.Portocala;
import ro.ase.cts.enums.FructType;
import ro.ase.cts.enums.PiataType;

public class FructFabrica implements PiataFabrica{
    @Override
    public Piata creareObiectPiata(PiataType tip, int gramaj, boolean esteProaspat) {
        return switch(tip){
            case FructType.Mar -> new Mar(gramaj, esteProaspat);
            case FructType.Portocala -> new Portocala(gramaj, esteProaspat);
            default -> null;
        };
    }

    @Override
    public Piata creareObiectPiata(PiataType tip, int gramaj) {
        return creareObiectPiata(tip, gramaj, true);
    }
}
