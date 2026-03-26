package ro.ase.cts.main;

import ro.ase.cts.clase.FelDeMancare;
import ro.ase.cts.clase.Supa;
import ro.ase.cts.enums.TipDesert;
import ro.ase.cts.enums.TipSupa;
import ro.ase.cts.fabrici.FabricaDesert;
import ro.ase.cts.fabrici.FabricaFelDeMancare;
import ro.ase.cts.fabrici.FabricaSupa;

public class Main {
    public static void main(String[] args) {
        FabricaFelDeMancare fabricaFelDeMancare = new FabricaSupa();
        FelDeMancare supaVita = fabricaFelDeMancare.creareFelDeMancare(TipSupa.SupaDeVita, 200, 150);
        FelDeMancare supaLegume = fabricaFelDeMancare.creareFelDeMancare(TipSupa.SupaDeLegume, 200, 150);

        FabricaFelDeMancare fabricaFelDeMancare1 = new FabricaDesert();
        FelDeMancare papanasi = fabricaFelDeMancare1.creareFelDeMancare(TipDesert.Papanasi, 200, 150, 1000);
        FelDeMancare clatite = fabricaFelDeMancare1.creareFelDeMancare(TipDesert.Clatite, 200, 150, 1000);

        supaVita.afisareDescriere();
        supaLegume.afisareDescriere();
        papanasi.afisareDescriere();
        clatite.afisareDescriere();
    }
}
