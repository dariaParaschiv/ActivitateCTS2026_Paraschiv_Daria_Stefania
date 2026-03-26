package ro.ase.cts.fabrici;

import ro.ase.cts.clase.Asistent;
import ro.ase.cts.clase.Brancardier;
import ro.ase.cts.clase.Medic;
import ro.ase.cts.clase.PersonalSpital;
import ro.ase.cts.enums.PersonalMedicalType;
import ro.ase.cts.enums.PersonalSpitalTip;

public class PersonalMedicalFactory implements FabricaPersonalSpital{
    @Override
    public PersonalSpital crearePersonalSpital(PersonalSpitalTip tip, String nume, int nrPacienti, int nrAngajati) {
        return switch (tip){
            case PersonalMedicalType.Asistent -> new Asistent(nume, nrPacienti);
            case PersonalMedicalType.Medic -> new Medic(nume, nrPacienti);
            case PersonalMedicalType.Brancardier -> new Brancardier(nume, nrPacienti);
            default -> null;
        };
    }

    @Override
    public PersonalSpital crearePersonalSpital(PersonalSpitalTip tip, String nume, int nrPacienti) {
        return crearePersonalSpital(tip, nume, nrPacienti, 500);
    }
}
