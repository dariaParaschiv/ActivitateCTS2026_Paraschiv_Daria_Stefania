package ro.ase.cts.clase;

public class CafeaSimpla extends Bautura {
    public CafeaSimpla() {
        super("Cafea simpla ");
    }

    @Override
    public float calculeazaPret() {
        return 5.0f;
    }
}
