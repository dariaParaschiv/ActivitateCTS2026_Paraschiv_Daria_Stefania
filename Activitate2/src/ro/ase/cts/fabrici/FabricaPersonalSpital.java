package ro.ase.cts.fabrici;

import ro.ase.cts.clase.PersonalSpital;
import ro.ase.cts.enums.PersonalSpitalTip;

public interface FabricaPersonalSpital {
    PersonalSpital crearePersonalSpital(PersonalSpitalTip tip, String nume, int nrPacienti, int nrAngajati);
    PersonalSpital crearePersonalSpital(PersonalSpitalTip tip, String nume, int nrPacienti);
}
