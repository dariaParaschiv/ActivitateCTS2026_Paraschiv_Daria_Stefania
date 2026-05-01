package ro.ase.cts.clase;

public class OalaNormala {
    private String material;

    public OalaNormala(String material) {
        this.material = material;
    }

    public void incalzestePeInductie(){
        System.out.println("Oala din " + this.material + " se incalzeste normal pe inductie. ");
    }
}
