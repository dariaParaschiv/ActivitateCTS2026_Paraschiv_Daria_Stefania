package ro.ase.cts.clase;

import java.util.HashMap;
import java.util.Map;

public class LinieFactory {
    public Map<Integer, LinieTransport> linieTransport = new HashMap<>();

    public LinieTransport getLinieTransport(int nrLinie, String primaStatie, String ultimaStatie) {
        if(linieTransport.containsKey(nrLinie)) {
            return linieTransport.get(nrLinie);
        }
        else{
            LinieTransport linie = new Linie(nrLinie, primaStatie, ultimaStatie);
            linieTransport.put(nrLinie, linie);
            return linie;
        }
    }
}
