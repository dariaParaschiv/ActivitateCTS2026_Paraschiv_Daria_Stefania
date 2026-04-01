package ro.ase.cts.clase;

public class Cadou {
    private boolean areFelicitare;
    private boolean areFunda;

    public Cadou(boolean areFelicitare, boolean areFunda) {
        this.areFelicitare = areFelicitare;
        this.areFunda = areFunda;
    }

    public void setAreFelicitare(boolean areFelicitare) {
        this.areFelicitare = areFelicitare;
    }

    public void setAreFunda(boolean areFunda) {
        this.areFunda = areFunda;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cadou{");
        sb.append("areFelicitare=").append(areFelicitare);
        sb.append(", areFunda=").append(areFunda);
        sb.append('}');
        return sb.toString();
    }
}
