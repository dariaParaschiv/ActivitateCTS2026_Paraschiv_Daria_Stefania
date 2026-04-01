package ro.ase.cts.clase;

public abstract class Leguma implements Piata {
    private int gramaj;
    private boolean esteProaspat;

    public Leguma(int gramaj, boolean esteProaspat) {
        this.gramaj = gramaj;
        this.esteProaspat = esteProaspat;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Leguma{");
        sb.append("gramaj=").append(gramaj);
        sb.append(", esteProaspat=").append(esteProaspat);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void afisareDescriere() {

    }
}
