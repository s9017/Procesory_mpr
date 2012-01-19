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
	
	
	public List<Procesory> getProcesory() {
		return procesory;
	}
	
	public Procesory getProcesor(int i){
		return procesory.get(i);
		}



	public void dodaj_Procesor(String nazwaP, String gniazdoP) {
		procesory.add(new Procesory(nazwaP,gniazdoP));
	}
	public void wyswietl_Procesor(){
		System.out.println("Lista procesorow: ");
		for(Procesory p: procesory){
			p.wyswietlP();
			
		}
	}
	public Procesory szukaj_Procesor(String string){
		Procesory z = null;
		for(Procesory p : procesory){
			if(p.getNazwaP().equals(string)) z = p;
		}
		return z;
	}
	public void usun_Procesor(String string){
		procesory.remove(szukaj_Procesor(string));
	}
	public void edytuj_Procesor(String string1, String string2){
		Procesory p;
		p = szukaj_Procesor(string1);
		p.setNazwaP(string2);
	}
}
