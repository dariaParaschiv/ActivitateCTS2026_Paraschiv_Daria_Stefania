package ro.ase.cts.clase;

public class JucarieBuilder implements IBuilder{
    private String denumire;
    private int numarPiese;

    public JucarieBuilder() {
        this.denumire = "Standard ";
        this.numarPiese = 10;
    }

    @Override
    public Jucarie build() {
        return new Jucarie(denumire, numarPiese);
    }

    @Override
    public JucarieBuilder setDenumire(String denumire) {
        this.denumire = denumire;
        return this;
    }

    @Override
    public JucarieBuilder setNumarPiese(int numarPiese) {
        this.numarPiese = numarPiese;
        return this;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("JucarieBuilder{");
        sb.append("denumire='").append(denumire).append('\'');
        sb.append(", numarPiese=").append(numarPiese);
        sb.append('}');
        return sb.toString();
    }
}
