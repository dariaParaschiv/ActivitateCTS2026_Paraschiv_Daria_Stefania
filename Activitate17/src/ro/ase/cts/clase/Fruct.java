package ro.ase.cts.clase;

public abstract class Fruct implements Piata{
    private int gramaj;
    private boolean esteProaspat;

    public Fruct(int gramaj, boolean esteProaspat) {
        this.gramaj = gramaj;
        this.esteProaspat = esteProaspat;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Fruct{");
        sb.append("gramaj=").append(gramaj);
        sb.append(", esteProaspat=").append(esteProaspat);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void afisareDescriere() {

    }
}
