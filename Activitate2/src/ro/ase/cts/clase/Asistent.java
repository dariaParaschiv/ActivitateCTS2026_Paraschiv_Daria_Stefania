package ro.ase.cts.clase;

public class Asistent extends PersonalMedical {
    public Asistent(String nume, int nrPacienti) {
        super(nume, nrPacienti);
    }

    @Override
    public void afisareDescriere() {
        System.out.println("Asistent: " + super.toString());
    }
}
