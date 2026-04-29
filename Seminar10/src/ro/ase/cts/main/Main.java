package ro.ase.cts.main;

import ro.ase.cts.clase.NotaDePlata;
import ro.ase.cts.clase.NotaDePlataAbstract;
import ro.ase.cts.decorator.NotaDePlata1Mai;
import ro.ase.cts.decorator.NotaDePlataDecorator;
import ro.ase.cts.decorator.NotaDePlataPrintatNouAn;

public class Main {
    public static void main(String[] args) {
        //decorator
        NotaDePlataAbstract notaDePlata = new NotaDePlata(100.00f, "12.03.2026");
        notaDePlata.printeaza();

        //int a = 2;
        int a = 1;
        NotaDePlataDecorator notaDePlataDecorator = null;
        if(a == 1){
            notaDePlataDecorator = new NotaDePlataPrintatNouAn(notaDePlata);
        }
        else{
            notaDePlataDecorator = new NotaDePlata1Mai(notaDePlata);
        }
        notaDePlataDecorator.printeaza();
        notaDePlataDecorator.printeazaFelicitare();
    }
}
