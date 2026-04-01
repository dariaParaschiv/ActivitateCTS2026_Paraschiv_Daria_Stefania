package ro.ase.cts.clase;

import java.util.HashMap;
import java.util.Map;

public class FarmacieFactory {
    private Map<String, IPrototypeMedicament> tipMedicament = new HashMap<>();

    public FarmacieFactory() {
        tipMedicament.put("Raceala ", new Medicament("Paracetamol ", "Raceala si gripa ", 100));
        tipMedicament.put("Durere de cap ", new Medicament("Nurofen forte ", "Durere de cap ", 100));
    }

    public IPrototypeMedicament returneazaMedicament(String tip){
        return tipMedicament.get(tip).copiaza();
    }
}
