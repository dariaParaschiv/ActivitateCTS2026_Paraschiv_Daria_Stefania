package ro.ase.cts.clase;

public class EWallet {
    private String numeTitular;

    public EWallet(String numeTitular) {
        this.numeTitular = numeTitular;
    }

    public void efectueazaPlataOnline(float suma){
        System.out.println("Titularul: " + this.numeTitular + " a platit prin eWallet suma de: " + suma);
    }
}
