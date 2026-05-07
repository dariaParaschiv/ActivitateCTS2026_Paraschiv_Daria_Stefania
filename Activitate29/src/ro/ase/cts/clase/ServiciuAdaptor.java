package ro.ase.cts.clase;

public class ServiciuAdaptor extends ProdusPachet{
    private ServiciuMentenanta serviciuMentenanta;

    public ServiciuAdaptor(ServiciuMentenanta serviciuMentenanta) {
        super(serviciuMentenanta.getNumeServiciu());
        this.serviciuMentenanta = serviciuMentenanta;
    }

    @Override
    public void scaneazaCodBare() {
        serviciuMentenanta.valideazaCodDigital();
    }
}
