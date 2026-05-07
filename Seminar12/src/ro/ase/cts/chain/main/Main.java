package ro.ase.cts.chain.main;

import ro.ase.cts.chain.clase.*;

public class Main {
    public static void main(String[] args) {
        Urmatorul calatorieAutobuz = new Autobuz();
        Urmatorul calatorieTroleibuz = new Troleibuz();
        Urmatorul calatorieTramvai = new Tramvai();
        Urmatorul calatorieMetrou = new Metrou();

        calatorieTroleibuz.setUrmatorul(calatorieAutobuz);
        calatorieAutobuz.setUrmatorul(calatorieTramvai);
        calatorieTramvai.setUrmatorul(calatorieMetrou);

        System.out.println(calatorieTroleibuz.recomandareMijlocDeTransport(2));
        System.out.println(calatorieTroleibuz.recomandareMijlocDeTransport(5));
        System.out.println(calatorieTroleibuz.recomandareMijlocDeTransport(12));

    }
}
