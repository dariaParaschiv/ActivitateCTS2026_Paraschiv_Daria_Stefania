package ro.ase.cts.clase;

public class Director extends Angajat{
    @Override
    public void aprobaCheltuiala(float suma, String motiv) {
        if(suma <= 2000){
            System.out.println("Directorul a aprobat " + suma + " pentru: " + motiv);
        }
        else if(succesor != null){
            System.out.println("Director: nici eu nu pot. Trimitem la CEO... ");
            succesor.aprobaCheltuiala(suma, motiv);
        }
    }
}
