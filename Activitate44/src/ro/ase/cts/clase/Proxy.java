package ro.ase.cts.clase;

public class Proxy implements IEntitate {
    private IEntitate entitate;

    public Proxy(IEntitate entitate) {
        this.entitate = entitate;
    }

    @Override
    public void verificare(String numePacient, boolean areAsigurare) {
        System.out.println("Se verifică sistemul de asigurări pentru " + numePacient);

        if (areAsigurare) {
            System.out.println("Asigurare validă. ");

            entitate.verificare(numePacient, areAsigurare);
        } else {
            System.out.println("Pacientul " + numePacient + " NU are asigurare medicală.");
        }
    }
}
