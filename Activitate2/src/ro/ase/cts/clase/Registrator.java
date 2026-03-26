package ro.ase.cts.clase;

public class Registrator extends PersonalNonMedical {
    public Registrator(String nume, int nrPacienti, int nrAngajati) {
        super(nume, nrPacienti, nrAngajati);
    }

    @Override
    public void afisareDescriere() {
        System.out.println("Registrator: " + super.toString());
    }
}
