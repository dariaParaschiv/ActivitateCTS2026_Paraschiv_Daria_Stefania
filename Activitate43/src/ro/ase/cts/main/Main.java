package ro.ase.cts.main;

import ro.ase.cts.clase.Flyweight;
import ro.ase.cts.clase.FlyweightFactory;

public class Main {
    public static void main(String[] args) {
        FlyweightFactory fabrica = new FlyweightFactory();

        Flyweight sectieCardiologie = fabrica.getObiectFlyweight("Cardiologie");
        sectieCardiologie.internare("Pacientul", 5);

        Flyweight sectieCardiologie2 = fabrica.getObiectFlyweight("Cardiologie");
        sectieCardiologie2.internare("Pacientul", 7);

        Flyweight sectieChirurgie = fabrica.getObiectFlyweight("Chirurgie");
        sectieChirurgie.internare("Pacientul", 10);
    }
}
