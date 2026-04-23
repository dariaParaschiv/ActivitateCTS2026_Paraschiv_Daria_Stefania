package ro.ase.cts.spital;

import ro.ase.cts.farmacie.Medicament;

public class MedicamentAdaptor extends Medicament {

    private ro.ase.cts.spital.Medicament medicamentSpital;

    public MedicamentAdaptor(ro.ase.cts.spital.Medicament medicamentSpital) {
        super(medicamentSpital.getNumeMedicament());
        this.medicamentSpital = medicamentSpital;
    }

    @Override
    public void cumparaMedicament() {
        medicamentSpital.achizioneazaMedicament();
    }
}
