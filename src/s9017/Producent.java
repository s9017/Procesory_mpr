package s9017;

import java.util.ArrayList;
import java.util.List;

public class Producent {

	private String firma;

	public Producent(String nazwa) {
		this.firma=nazwa;
	}

	public String getFirma() {
		return firma;
	}

	public void setFirma(String firma) {
		this.firma = firma;
	}
	
	private List<Procesory> procesory = new ArrayList<Procesory>();
	
	
	public void dodaj_Procesor(String nazwaP, String gniazdoP) {
		procesory.add(new Procesory(nazwaP,gniazdoP));
	}
	public void wyswietl_Procesor(){
		System.out.println("Lista procesorow: ");
		for(Procesory p: procesory){
			p.wyswietlP();
			
		}
	}
	
}
