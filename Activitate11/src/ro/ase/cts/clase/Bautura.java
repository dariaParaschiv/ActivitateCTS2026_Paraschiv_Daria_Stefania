package ro.ase.cts.clase;

public abstract class Bautura implements IBautura{
    private String numeBautura;
    private Double cantitate;
    private String reteta;

    public Bautura(String numeBautura, Double cantitate, String reteta) {
        this.numeBautura = numeBautura;
        this.cantitate = cantitate;
        this.reteta = reteta;
    }

    @Override
    public void preparareBautura() {

    }

    @Override
    public void afisareDescriere() {

    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Bautura{");
        sb.append("numeBautura='").append(numeBautura).append('\'');
        sb.append(", cantitate=").append(cantitate);
        sb.append(", reteta='").append(reteta).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
