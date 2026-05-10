package ro.ase.cts.clase;

import java.util.Stack;

public class EditorInvoker {
    private Stack<IComanda> istoricOperatii = new Stack<>();

    public void inregistreazaOperatie(IComanda comanda){
        istoricOperatii.push(comanda);
    }

    public void executaOperatii(){
        while(!istoricOperatii.isEmpty()){
            IComanda c = istoricOperatii.pop();
            c.executa();
        }
    }
}
