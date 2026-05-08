package ro.ase.cts.clase;

public class ContBancar implements IContBancar{
    private String numeTitular;

    public ContBancar(String numeTitular) {
        this.numeTitular = numeTitular;
    }

    @Override
    public void retrageBani(int suma) {
        System.out.println("S-a retras suma de: " + suma);
    }
}
