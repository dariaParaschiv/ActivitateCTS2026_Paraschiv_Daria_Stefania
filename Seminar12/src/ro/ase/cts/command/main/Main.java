package ro.ase.cts.command.main;

import ro.ase.cts.command.clase.Autobuz;
import ro.ase.cts.command.clase.Command;
import ro.ase.cts.command.clase.Operator;
import ro.ase.cts.command.clase.Plecare;

public class Main {
    public static void main(String[] args) {
        Autobuz autobuz = new Autobuz("Mercedes ");
        Command comanda1 = new Plecare(new Autobuz("Mercedes "), 123);
        Command comanda2 = new Plecare(new Autobuz("Mercedes "), 223);

        Operator operator = new Operator();
        operator.adaugaComanda(comanda1);
        operator.adaugaComanda(comanda2);
        operator.adaugaComanda(new Plecare(new Autobuz("Dacia "), 123));

        operator.executaComanda();
        operator.executaComanda();
        operator.executaComanda();
        operator.executaComanda();

    }
}
