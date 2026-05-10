package ro.ase.cts.clase;

public class StrategiePeJos implements StrategieTraseu {
    @Override
    public void calculeazaTimp(int distanta) {
        System.out.println("Pe jos vei face: " + (distanta / 5.0) + " ore. ");
    }
}
