package ro.ase.cts.Prototype.Program;

import ro.ase.cts.Prototype.Clase.Internare;
import ro.ase.cts.Prototype.Clase.InternareBuilder;
import ro.ase.cts.Prototype.Clase.InternareBuilderAlternativ;

public class Main {
    public static void main(String[] args) {
        Internare internare1 = new Internare(true, false, true, true,  "Mihai Popescu");
        Internare internare2 = new Internare(false, true, false, false,  "Ana Maria");
        InternareBuilder builder = new InternareBuilder("Ana Pop");
        Internare internare3 = builder.build();
        Internare internare4 = builder.setNume("Andrei Matei").setPat(true).setPapuci(true).setHalat(true).setMic(true).build();
        System.out.println(internare3.toString());
        System.out.println(internare4.toString());

        InternareBuilderAlternativ builderAlternativ = new InternareBuilderAlternativ();
        builderAlternativ.setMicDejun(true);
        Internare internare101 = builderAlternativ.build("Georgescu");
        Internare internare102 = builderAlternativ.setNumePacient("Georgescu").build("Petre Maria");
        Internare internare103 = builderAlternativ.setNumePacient("Carina").build("Nicolescu");

        System.out.println(internare101.toString());
        System.out.println(internare102.toString());
        System.out.println(internare103.toString());
    }
}
