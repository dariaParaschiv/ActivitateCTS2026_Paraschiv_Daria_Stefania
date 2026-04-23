package ro.ase.cts.main;

import ro.ase.cts.farmacie.Medicament;
import ro.ase.cts.spital.MedicamentAdaptor;

public class Main {
    private static void procuraMedicament(Medicament medicament) {
        medicament.cumparaMedicament();
    }

    public static void main(String[] args) {
        Medicament medicamentFarmacie = new Medicament("Nurofen");
        ro.ase.cts.spital.Medicament medicamentSpital = new ro.ase.cts.spital.Medicament("Erdomed", 100);
        medicamentSpital.achizioneazaMedicament();
        medicamentFarmacie.cumparaMedicament();

        procuraMedicament(medicamentFarmacie);
        //procuraMedicament(medicamentSpital);

        MedicamentAdaptor medicamentAdaptor = new MedicamentAdaptor(medicamentSpital);
        procuraMedicament(medicamentAdaptor);

    }
}
