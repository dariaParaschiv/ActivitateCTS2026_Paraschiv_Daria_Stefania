package ro.ase.cts.clase;

public class Manager extends Angajat{
    @Override
    public void aprobaCheltuiala(float suma, String motiv) {
        if(suma <= 500){
            System.out.println("Managerul a aprobat " + suma + " pentru: " + motiv);
        }
        else if(succesor != null){
            System.out.println("Manager: suma e prea mare. Pasam catre succesor... ");
            succesor.aprobaCheltuiala(suma, motiv);
        }
    }
}
