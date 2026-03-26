package ro.ase.cts.clase;

public class Brancardier extends PersonalSpital {
    public Brancardier(String nume, int varsta){super(nume,varsta);}

    @Override
    public void afisareDescriere() {
        System.out.println("Brancardier" + super.toString());
    }
}
