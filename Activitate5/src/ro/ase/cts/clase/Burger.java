package ro.ase.cts.clase;

public class Burger {
    protected String chifla;
    protected String carne;
    protected String sos;
    protected boolean areSalata;
    protected boolean areBacon;

    public Burger(String chifla, String carne, String sos, boolean areSalata, boolean areBacon) {
        this.chifla = chifla;
        this.carne = carne;
        this.sos = sos;
        this.areSalata = areSalata;
        this.areBacon = areBacon;
    }

    public void setChifla(String chifla) {
        this.chifla = chifla;
    }

    public void setCarne(String carne) {
        this.carne = carne;
    }

    public void setSos(String sos) {
        this.sos = sos;
    }

    public void setAreSalata(boolean areSalata) {
        this.areSalata = areSalata;
    }

    public void setAreBacon(boolean areBacon) {
        this.areBacon = areBacon;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Burger{");
        sb.append("chifla='").append(chifla).append('\'');
        sb.append(", carne='").append(carne).append('\'');
        sb.append(", sos='").append(sos).append('\'');
        sb.append(", areSalata=").append(areSalata);
        sb.append(", areBacon=").append(areBacon);
        sb.append('}');
        return sb.toString();
    }
}
