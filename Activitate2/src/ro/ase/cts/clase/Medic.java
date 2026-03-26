package ro.ase.cts.clase;

public class Medic extends PersonalMedical {
    public Medic(String nume, int nrPacienti) {
        super(nume, nrPacienti);
    }

    @Override
    public void afisareDescriere() {
        System.out.println("Medic: " + super.toString());
    }
}
