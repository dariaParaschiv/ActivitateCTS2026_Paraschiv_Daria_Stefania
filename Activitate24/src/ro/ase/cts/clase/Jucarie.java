package ro.ase.cts.clase;

public abstract class Jucarie {
    private String magazin;
    private int numarPiese;

    public Jucarie(String magazin, int numarPiese) {
        this.magazin = magazin;
        this.numarPiese = numarPiese;
    }

    public abstract void afisareDescriere();

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Jucarie{");
        sb.append("magazin='").append(magazin).append('\'');
        sb.append(", numarPiese=").append(numarPiese);
        sb.append('}');
        return sb.toString();
    }
}
