package ro.ase.cts.main;

import ro.ase.cts.clase.PersonalSpital;
import ro.ase.cts.enums.PersonalMedicalType;
import ro.ase.cts.enums.PersonalNonMedicalType;
import ro.ase.cts.fabrici.FabricaPersonalSpital;
import ro.ase.cts.fabrici.PersonalMedicalFactory;
import ro.ase.cts.fabrici.PersonalNonMedicalFactory;

public class Main {
    public static void main(String[] args) {
        FabricaPersonalSpital fabricaPersonalSpital = new PersonalMedicalFactory();
        PersonalSpital asistent = fabricaPersonalSpital.crearePersonalSpital(PersonalMedicalType.Asistent, "Maria", 100);
        PersonalSpital medic = fabricaPersonalSpital.crearePersonalSpital(PersonalMedicalType.Medic, "Ioana", 100);
        PersonalSpital brancardier = fabricaPersonalSpital.crearePersonalSpital(PersonalMedicalType.Brancardier, "George", 100);

        FabricaPersonalSpital fabricaPersonalSpital1 = new PersonalNonMedicalFactory();
        PersonalSpital secretar = fabricaPersonalSpital1.crearePersonalSpital(PersonalNonMedicalType.Secretar, "John", 100, 500);
        PersonalSpital registrator = fabricaPersonalSpital1.crearePersonalSpital(PersonalNonMedicalType.Registror, "Marian", 100, 500);

        asistent.afisareDescriere();
        medic.afisareDescriere();
        brancardier.afisareDescriere();
        secretar.afisareDescriere();
        registrator.afisareDescriere();

    }
}
