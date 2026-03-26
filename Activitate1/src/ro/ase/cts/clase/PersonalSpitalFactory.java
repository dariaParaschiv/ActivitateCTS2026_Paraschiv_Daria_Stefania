package ro.ase.cts.clase;

public class PersonalSpitalFactory {

    public PersonalSpital getPersonalSpital(String nume, int varsta, PersonalSpitalType tip){
        if(tip == PersonalSpitalType.Medic)
            return new Medic(nume, varsta);
        if (tip == PersonalSpitalType.Brancardier)
            return new Brancardier(nume, varsta);
        if( tip == PersonalSpitalType.Asistent)
            return new Asistent(nume, varsta);
        return null;
    }
}
