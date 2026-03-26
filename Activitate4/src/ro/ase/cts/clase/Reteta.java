package ro.ase.cts.clase;

public class Reteta implements PrototypeReteta {
    private String nume;
    private int numarIngrediente;
    private String descriere;

    public Reteta(String nume, int numarIngrediente, String descriere) {
        if(nume.length() >= 2){
        this.nume = nume; }
        else{
            this.nume = "Reteta";
        }
        if(numarIngrediente > 0){
            this.numarIngrediente = numarIngrediente;
        }
        else{
            this.numarIngrediente = 1;
        }
        if(descriere.length() >= 2){
            this.descriere = descriere;
        }
        else{
            this.descriere = "Standard";
        }
    }

    private Reteta(){
    }

    public void setNumarIngrediente(int numarIngrediente) {
        this.numarIngrediente = numarIngrediente;
    }

    @Override
    public PrototypeReteta copiaza() {
        Reteta retetaNoua = new Reteta();
        retetaNoua.nume = this.nume;
        retetaNoua.numarIngrediente = this.numarIngrediente;
        retetaNoua.descriere = this.descriere;
        return retetaNoua;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Reteta{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", numarIngrediente=").append(numarIngrediente);
        sb.append(", descriere='").append(descriere).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
