package ro.ase.cts.clase;

public class StrategieMasina implements StrategieTraseu {
    @Override
    public void calculeazaTimp(int distanta) {
        System.out.println("Cu masina vei face: " + (distanta / 60.0) + " ore. ");
    }
}
