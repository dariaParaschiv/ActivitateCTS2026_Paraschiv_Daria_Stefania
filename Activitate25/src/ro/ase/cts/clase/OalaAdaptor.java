package ro.ase.cts.clase;

public class OalaAdaptor extends OalaNormala{
    private OalaSpeciala oalaSpeciala;

    public OalaAdaptor(OalaSpeciala oalaSpeciala) {
        super("Cupru adaptat");
        this.oalaSpeciala = oalaSpeciala;
    }

    @Override
    public void incalzestePeInductie() {
        System.out.println("Adaptorul transforma undele magnetice in caldura: ");
        oalaSpeciala.incalzesteLaFocDeschis();
    }
}
