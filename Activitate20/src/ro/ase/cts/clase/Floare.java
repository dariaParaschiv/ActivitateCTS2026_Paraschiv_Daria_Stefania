package ro.ase.cts.clase;

public class Floare implements IPrototype{
    private String nume;
    private boolean areMiros;

    public Floare(String nume, boolean areMiros) {
        this.nume = nume;
        this.areMiros = areMiros;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setAreMiros(boolean areMiros) {
        this.areMiros = areMiros;
    }

    @Override
    public Floare copiaza() {
        Floare floare = new Floare(nume, areMiros);
        floare.areMiros = areMiros;
        floare.nume = nume;
        return floare;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Floare{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", areMiros=").append(areMiros);
        sb.append('}');
        return sb.toString();
    }
}
