package ro.ase.cts.clase;

public class DocumentFoto {
    private String nume;

    public DocumentFoto(String nume) {
        this.nume = nume;
    }

    public void refaceDimensiune(int latime, int lungime){
        System.out.println("Imaginea " + this.nume + " a fost redimensionata la " + latime + " si la " + lungime);
    }
}
