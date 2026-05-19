package ro.ase.cts.main;

import ro.ase.cts.clase.ConsumAbstract;
import ro.ase.cts.clase.SectiuneRestaurant;
import ro.ase.cts.clase.SursaConsum;

public class Main {
    public static void main(String[] args) throws Exception {
        ConsumAbstract intregRestaurantul = new SectiuneRestaurant("Restaurant complet ");
        ConsumAbstract bucatarie = new SectiuneRestaurant("Bucatarie ");

        ConsumAbstract friteuza = new SursaConsum("Friteuza ", 3.5f);

        bucatarie.adaugaNod(friteuza);
        intregRestaurantul.adaugaNod(bucatarie);

        intregRestaurantul.calculeazaConsum();
    }
}
