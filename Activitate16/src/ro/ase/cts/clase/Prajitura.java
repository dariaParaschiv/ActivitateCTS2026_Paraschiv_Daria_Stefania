package ro.ase.cts.clase;

public class Prajitura implements IPrototypePrajitura{

    private String nume;
    private boolean areZahar;
    private int gramaj;

    public Prajitura(String nume, boolean areZahar, int gramaj) {
        this.nume = nume;
        this.areZahar = areZahar;
        this.gramaj = gramaj;
    }

    private Prajitura() {}

    public void setGramaj(int gramaj) {
        this.gramaj = gramaj;
    }

    @Override
    public IPrototypePrajitura copiaza() {
        Prajitura prajitura = new Prajitura();
        prajitura.nume = nume;
        prajitura.areZahar = areZahar;
        prajitura.gramaj = gramaj;
        return prajitura;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Prajitura{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", areZahar=").append(areZahar);
        sb.append(", gramaj=").append(gramaj);
        sb.append('}');
        return sb.toString();
    }
}
