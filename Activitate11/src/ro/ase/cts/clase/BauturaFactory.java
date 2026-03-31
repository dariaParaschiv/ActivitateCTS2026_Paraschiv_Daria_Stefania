package ro.ase.cts.clase;

public class BauturaFactory {
    public Bautura getBautura(String nume, Double cantitate, String reteta, BauturaType tip) {
        return switch (tip) {
            case BauturaType.Cafea -> new Cafea(nume, cantitate, reteta);
            case BauturaType.Ceai -> new Ceai(nume, cantitate, reteta);
            case BauturaType.CiocolataCalda -> new CiocolataCalda(nume, cantitate, reteta);
            default -> null;
        };
    }
}
