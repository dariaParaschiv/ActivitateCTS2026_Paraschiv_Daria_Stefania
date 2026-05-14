package ro.ase.cts.clase;

import java.util.ArrayList;
import java.util.List;

public class AgentieTurism {

	private List<ro.ase.cts.clase.PachetTuristic> pacheteTuristice;
	
	public AgentieTurism() {
		pacheteTuristice=new ArrayList<ro.ase.cts.clase.PachetTuristic>();
	}
	
	public void adaugaPachet(ro.ase.cts.clase.PachetTuristic pachet) {
		pacheteTuristice.add(pachet);
	}
	
	public double calculareSumaTotalaPachete() {
		double suma=0;
		for(ro.ase.cts.clase.PachetTuristic pachet:pacheteTuristice) {
			suma+=pachet.getPret();
		}
		
		return suma;
	}
}
