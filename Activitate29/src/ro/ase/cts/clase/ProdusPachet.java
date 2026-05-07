package ro.ase.cts.clase;

public class ProdusPachet {
    private String denumireProdus;

    public ProdusPachet(String denumireProdus) {
        this.denumireProdus = denumireProdus;
    }

    public String getDenumireProdus() {
        return denumireProdus;
    }

    public void scaneazaCodBare(){
        System.out.println("Produsul: " + this.denumireProdus + " a fost scanat. ");
    }
}
