package ro.ase.cts.clase;

public class FlyweightConcret implements Flyweight {
    private String numeSectie;

    public FlyweightConcret(String numeSectie) {
        this.numeSectie = numeSectie;
    }

    @Override
    public void internare(String numePacient, int numarSalon) {
        System.out.println("Pe sectia " + numeSectie + " se interneaza pacientul " + numePacient + " in salonul " + numarSalon);
    }
}
