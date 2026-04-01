package ro.ase.cts.factory;

import ro.ase.cts.clase.Piata;
import ro.ase.cts.enums.PiataType;

public interface PiataFabrica {
    Piata creareObiectPiata(PiataType tip, int gramaj, boolean esteProaspat);
    Piata creareObiectPiata(PiataType tip, int gramaj);
}
