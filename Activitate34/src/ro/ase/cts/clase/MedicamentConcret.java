package ro.ase.cts.clase;

public class MedicamentConcret implements MedicamentFlyweight{
    private String numeMedicament;
    private String prospect;

    public MedicamentConcret(String numeMedicament) {
        this.numeMedicament = numeMedicament;
        this.prospect = "Prospect pentru: " + numeMedicament;
    }

    @Override
    public void afiseazaReteta(String numePacient) {
        System.out.println("Pacient: " + numePacient + "are reteta: " + this.numeMedicament);
    }
}
