package ro.ase.cts.main;

import ro.ase.cts.clase.BuchetFlori;
import ro.ase.cts.clase.BuchetFloriBuilder;

public class Main {
    public static void main(String[] args) {
        BuchetFlori buchet1 = new BuchetFloriBuilder().setTipEveniment("Nunta").setNrFlori(25).setCuloare("Roz pastel").build();
        BuchetFlori buchet2 = new BuchetFloriBuilder().setCuloare("Mov").build();

        System.out.println("Buchet 1: " + buchet1);
        System.out.println("Buchet 2: " + buchet2);
    }
}
