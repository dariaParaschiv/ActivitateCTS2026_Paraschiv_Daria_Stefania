package ro.ase.cts.clase;

public class Linie implements LinieTransport {
    private int nrLinie;
    private String primaStatie;
    private String ultimaStatie;

    protected Linie(int nrLinie, String primaStatie, String ultimaStatie) {
        this.nrLinie = nrLinie;
        this.primaStatie = primaStatie;
        this.ultimaStatie = ultimaStatie;
    }

    @Override
    public void afiseazaAutobuzLinie(Autobuz autobuz) {
        System.out.print(autobuz.toString());
        System.out.println(this.toString());
    }

    @Override
    public void afiseazaNrMaxCalatoriPerTraseu(Autobuz autobuz) {
        System.out.println("De la statia " + this.primaStatie + " pana la statia " + this.ultimaStatie + " vor merge maxim " + autobuz.getNrLocuri() + " calatori. ");
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Linie{");
        sb.append("nrLinie=").append(nrLinie);
        sb.append(", primaStatie='").append(primaStatie).append('\'');
        sb.append(", ultimaStatie='").append(ultimaStatie).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
