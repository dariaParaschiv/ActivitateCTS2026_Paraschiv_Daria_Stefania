package ro.ase.cts.clase;

public class Brancardier extends PersonalMedical{
    public Brancardier(String nume, int nrPacienti) {
        super(nume, nrPacienti);
    }

    @Override
    public void afisareDescriere() {
        System.out.println("Brancardier: " + super.toString());
    }
}
