package ro.ase.cts.clase;

public class Spital implements IEntitate {
    @Override
    public void verificare(String numePacient, boolean areAsigurare) {
        System.out.println("Pacientul " + numePacient + " a fost internat. ");
    }
}
