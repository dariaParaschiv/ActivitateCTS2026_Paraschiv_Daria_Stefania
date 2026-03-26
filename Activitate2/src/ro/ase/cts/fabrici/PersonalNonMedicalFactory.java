package ro.ase.cts.fabrici;

import ro.ase.cts.clase.PersonalSpital;
import ro.ase.cts.clase.Registrator;
import ro.ase.cts.clase.Secretar;
import ro.ase.cts.enums.PersonalNonMedicalType;
import ro.ase.cts.enums.PersonalSpitalTip;

public class PersonalNonMedicalFactory implements FabricaPersonalSpital{
    @Override
    public PersonalSpital crearePersonalSpital(PersonalSpitalTip tip, String nume, int nrPacienti) {
        return crearePersonalSpital(tip, nume, nrPacienti, 500);
    }

    @Override
    public PersonalSpital crearePersonalSpital(PersonalSpitalTip tip, String nume, int nrPacienti, int nrAngajati) {
        return switch(tip){
            case PersonalNonMedicalType.Registror -> new Registrator(nume, nrPacienti, nrAngajati);
            case PersonalNonMedicalType.Secretar -> new Secretar(nume, nrPacienti, nrAngajati);
            default -> null;
        };
    }
}
