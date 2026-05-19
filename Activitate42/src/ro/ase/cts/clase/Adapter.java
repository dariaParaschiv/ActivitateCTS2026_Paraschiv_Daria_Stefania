package ro.ase.cts.clase;

public class Adapter implements IAplicatieNoua {
    private SoftVechiBazaDate dosar;

    public Adapter(SoftVechiBazaDate dosar) {
        this.dosar = dosar;
    }

    @Override
    public void afiseazaIstoric() {
        dosar.scoateDosar();
    }
}
