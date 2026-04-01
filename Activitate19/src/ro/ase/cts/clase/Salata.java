package ro.ase.cts.clase;

public class Salata {
    private boolean areRosii;
    private boolean areCastraveti;

    public Salata(boolean areRosii, boolean areCastraveti) {
        this.areRosii = areRosii;
        this.areCastraveti = areCastraveti;
    }

    public void setAreRosii(boolean areRosii) {
        this.areRosii = areRosii;
    }

    public void setAreCastraveti(boolean areCastraveti) {
        this.areCastraveti = areCastraveti;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Salata{");
        sb.append("areRosii=").append(areRosii);
        sb.append(", areCastraveti=").append(areCastraveti);
        sb.append('}');
        return sb.toString();
    }
}
