package ro.ase.cts.clase;

import java.util.HashMap;
import java.util.Map;

public class MedicamentFactory {
    private Map<String, MedicamentFlyweight> medicamente = new HashMap<>();

    public MedicamentFlyweight getMedicament(String numeMedicament) {
        if(!medicamente.containsKey(numeMedicament)) {
            medicamente.put(numeMedicament, new MedicamentConcret(numeMedicament));
            System.out.println("Am adaugat medicamentul: " + numeMedicament);
        }
        return medicamente.get(numeMedicament);
    }
}
