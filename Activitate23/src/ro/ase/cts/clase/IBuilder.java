package ro.ase.cts.clase;

public interface IBuilder {
    Jucarie build();
    JucarieBuilder setDenumire(String denumire);
    JucarieBuilder setNumarPiese(int numarPiese);
}
