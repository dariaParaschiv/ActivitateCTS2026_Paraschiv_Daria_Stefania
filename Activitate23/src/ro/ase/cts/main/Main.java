package ro.ase.cts.main;

import ro.ase.cts.clase.IBuilder;
import ro.ase.cts.clase.Jucarie;
import ro.ase.cts.clase.JucarieBuilder;

public class Main {
    public static void main(String[] args) {
        IBuilder builder = new JucarieBuilder();
        Jucarie jucarie1 = builder.setDenumire("Papusa ").setNumarPiese(7).build();
        Jucarie jucarie2 = builder.build();
        System.out.println(jucarie1.toString());
        System.out.println(jucarie2.toString());
    }
}
