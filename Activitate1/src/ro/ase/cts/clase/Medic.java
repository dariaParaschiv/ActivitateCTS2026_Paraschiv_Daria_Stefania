package ro.ase.cts.clase;

public class Medic extends PersonalSpital{
    public Medic(String nume, int varsta){super(nume,varsta);}

    @Override
    public void afisareDescriere() {
        System.out.println("Medic" + super.toString());
    }
}
