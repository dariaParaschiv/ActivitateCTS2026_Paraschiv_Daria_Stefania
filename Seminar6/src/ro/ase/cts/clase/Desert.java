package ro.ase.cts.clase;

public abstract class Desert  implements FelDeMancare {
    int calorii;
    double pret;
    double gramaj;

    public Desert(int calorii, double pret, double gramaj) {
        this.calorii = calorii;
        this.pret = pret;
        this.gramaj = gramaj;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Desert{");
        sb.append("calorii=").append(calorii);
        sb.append(", pret=").append(pret);
        sb.append(", gramaj=").append(gramaj);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void afisareDescriere() {

    }
}
