package ro.ase.cts.main;

import ro.ase.cts.clase.PersonalSpital;
import ro.ase.cts.clase.PersonalSpitalFactory;
import ro.ase.cts.clase.PersonalSpitalType;

public class Main {
    public static void afisarePersonalSpital(PersonalSpital personalSpital) {
        personalSpital.afisareDescriere();
    }
    public static void main(String[] args) {
        PersonalSpitalFactory factory = new PersonalSpitalFactory();

        PersonalSpital asistent = factory.getPersonalSpital("Monica", 50, PersonalSpitalType.Asistent);
        PersonalSpital medic = factory.getPersonalSpital("Maria", 45, PersonalSpitalType.Medic);
        PersonalSpital brancardier = factory.getPersonalSpital("Alin", 50, PersonalSpitalType.Brancardier);

        afisarePersonalSpital(asistent);
        afisarePersonalSpital(medic);
        afisarePersonalSpital(brancardier);
    }
}
