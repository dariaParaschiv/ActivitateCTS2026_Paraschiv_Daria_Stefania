package ro.ase.cts.clase;

public class Rezervare {
    private boolean locLaFereastra;
    private boolean scauneErgonomice;
    private String decoratiuni;
    private String muzica;

    public Rezervare(boolean locLaFereastra, boolean scauneErgonomice, String decoratiuni, String muzica) {
        this.locLaFereastra = locLaFereastra;
        this.scauneErgonomice = scauneErgonomice;
        this.decoratiuni = decoratiuni;
        this.muzica = muzica;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rezervare{");
        sb.append("locLaFereastra=").append(locLaFereastra);
        sb.append(", scauneErgonomice=").append(scauneErgonomice);
        sb.append(", decoratiuni='").append(decoratiuni).append('\'');
        sb.append(", muzica='").append(muzica).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
