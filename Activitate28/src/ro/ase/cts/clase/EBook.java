package ro.ase.cts.clase;

public class EBook {
    String numeAutor;

    public EBook(String numeAutor) {
        this.numeAutor = numeAutor;
    }

    public String getNumeAutor() {
        return numeAutor;
    }

    public void scrollOnline(){
        System.out.println("Caut cartea cu autorul: " + this.numeAutor);
    }
}
