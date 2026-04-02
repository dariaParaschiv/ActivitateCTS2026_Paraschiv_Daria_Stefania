package ro.ase.cts.clase;

public class Jucarie {
    private String denumire;
    private int numarPiese;

    public Jucarie(String denumire, int numarPiese) {
        this.denumire = denumire;
        this.numarPiese = numarPiese;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public void setNumarPiese(int numarPiese) {
        this.numarPiese = numarPiese;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Jucarie{");
        sb.append("denumire='").append(denumire).append('\'');
        sb.append(", numarPiese=").append(numarPiese);
        sb.append('}');
        return sb.toString();
    }
}
