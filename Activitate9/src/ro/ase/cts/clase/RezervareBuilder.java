package ro.ase.cts.clase;

public class RezervareBuilder implements IBuilder {
    private boolean locLaFereastra = false;
    private boolean scauneErgonomice = false;
    private String decoratiuni = "Standard";
    private String muzica = "Standard";

    public RezervareBuilder setLocLaFereastra(boolean locLaFereastra) {
        this.locLaFereastra = locLaFereastra;
        return this;
    }

    public RezervareBuilder setScauneErgonomice(boolean scauneErgonomice) {
        this.scauneErgonomice = scauneErgonomice;
        return this;
    }

    public RezervareBuilder setDecoratiuni(String decoratiuni) {
        this.decoratiuni = decoratiuni;
        return this;
    }

    public RezervareBuilder setMuzica(String muzica) {
        this.muzica = muzica;
        return this;
    }

    public Rezervare build(){
        return new Rezervare(locLaFereastra, scauneErgonomice, decoratiuni, muzica);
    }
}
