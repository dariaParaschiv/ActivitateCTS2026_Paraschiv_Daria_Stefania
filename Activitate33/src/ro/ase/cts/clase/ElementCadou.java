package ro.ase.cts.clase;

public abstract class ElementCadou {
    protected String nume;

    public ElementCadou(String nume) {
        this.nume = nume;
    }

    public abstract float calculeazaGreutate();

    public void adauga(ElementCadou element) {
        throw new UnsupportedOperationException();
    }
}
