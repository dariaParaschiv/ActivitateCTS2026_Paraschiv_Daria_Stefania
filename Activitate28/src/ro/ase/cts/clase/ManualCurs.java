package ro.ase.cts.clase;

public class ManualCurs {
    private String titlu;

    public ManualCurs(String titlu) {
        this.titlu = titlu;
    }

    public String getTitlu() {
        return titlu;
    }

    public void rasfoiestePagini(){
        System.out.println("Cartea cu titlul: " + this.titlu + " a fost rasfoita. ");
    }
}
