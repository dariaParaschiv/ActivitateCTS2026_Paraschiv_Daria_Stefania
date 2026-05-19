package ro.ase.cts.clase;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
    private Map<String, Flyweight> colectie = new HashMap<>();

    public Flyweight getObiectFlyweight(String cheieSectie){
        if(!colectie.containsKey(cheieSectie)){
            System.out.println("Cream sectia " + cheieSectie);
            colectie.put(cheieSectie, new FlyweightConcret(cheieSectie));
        }
        return colectie.get(cheieSectie);
    }
}
