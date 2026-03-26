package ro.ase.cts.clase;

public class Asistent extends PersonalSpital{
    public Asistent(String nume, int varsta){super(nume,varsta);}

    @Override
    public void afisareDescriere() {
        System.out.println("Asistent" + super.toString());
    }
}
