package ro.ase.cts.main;

import ro.ase.cts.clase.FelDeMancare;
import ro.ase.cts.clase.Supa;
import ro.ase.cts.enums.TipSupa;
import ro.ase.cts.fabrici.FabricaFelDeMancare;
import ro.ase.cts.fabrici.FabricaSupa;

public class Main {
    public static void main(String[] args) {
        FabricaFelDeMancare fabricaFelDeMancare = new FabricaSupa();
        FelDeMancare supaDeVita = fabricaFelDeMancare.creareFelDeMancare(TipSupa.SupaDeVita, 200, 30);

    }
}
