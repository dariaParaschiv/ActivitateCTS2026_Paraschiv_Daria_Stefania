package ro.ase.cts.clase;

import java.util.ArrayList;
import java.util.List;

public abstract class SubiectMeci {
    private List<Fan> faniAbonati = new ArrayList<Fan>();

    public void abonareFan(Fan fan) {
        faniAbonati.add(fan);
    }

    public void dezabonareFan(Fan fan) {
        faniAbonati.remove(fan);
    }

    public void notifica(String mesaj){
        for(Fan fan : faniAbonati){
            fan.primesteNotificare(mesaj);
        }
    }
}
