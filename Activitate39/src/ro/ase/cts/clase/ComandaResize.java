package ro.ase.cts.clase;

public class ComandaResize implements IComanda{
    private DocumentFoto document;

    private int nouaLatime;
    private int nouaLungime;

    public ComandaResize(DocumentFoto document, int latime, int lungime) {
        this.document = document;
        this.nouaLatime = latime;
        this.nouaLungime = lungime;
    }

    @Override
    public void executa() {
        document.refaceDimensiune(nouaLatime, nouaLungime);
    }
}
