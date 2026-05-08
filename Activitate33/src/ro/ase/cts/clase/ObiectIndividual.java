package ro.ase.cts.clase;

public class ObiectIndividual extends ElementCadou {
    private float greutate;

    public ObiectIndividual(String nume, float greutate) {
        super(nume);
        this.greutate = greutate;
    }

    @Override
    public float calculeazaGreutate() {
        return this.greutate;
    }
}
