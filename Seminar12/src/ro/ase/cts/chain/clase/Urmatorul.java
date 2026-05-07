package ro.ase.cts.chain.clase;

public abstract class Urmatorul {
    protected Urmatorul urmatorul;

    public Urmatorul() {

        this.urmatorul = null;
    }

    public void setUrmatorul(Urmatorul urmatorul) {
        this.urmatorul = urmatorul;
    }

    public abstract String recomandareMijlocDeTransport(double distanta);
}
