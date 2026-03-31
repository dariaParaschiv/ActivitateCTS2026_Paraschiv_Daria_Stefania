package ro.ase.cts.clase;

public class Petitie implements PrototypePetitie {

    private String nume;
    private int varsta;
    private String motiv;

    public Petitie(String nume, int varsta, String motiv) {
        this.nume = nume;
        this.varsta = varsta;
        this.motiv = motiv;
    }

    private Petitie() {
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public void setMotiv(String motiv) {
        this.motiv = motiv;
    }


    @Override
    public PrototypePetitie copiaza() {
        Petitie petitieNoua = new Petitie();
        petitieNoua.nume=this.nume;
        petitieNoua.varsta=this.varsta;
        petitieNoua.motiv=this.motiv;
        return petitieNoua;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Petitie ");
        sb.append("nume ").append(nume);
        sb.append(", varsta ").append(varsta);
        sb.append(", motiv ").append(motiv);
        return sb.toString();
    }
}
