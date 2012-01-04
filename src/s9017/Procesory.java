package s9017;

public class Procesory {

	private String nazwaP;
	private String gniazdoP;
	
	public Procesory(String nazwaP, String gniazdoP) {
		this.nazwaP=nazwaP;
		this.gniazdoP=gniazdoP;
	}
	public String getNazwaP() {
		return nazwaP;
	}
	public void setNazwaP(String nazwaP) {
		this.nazwaP = nazwaP;
	}
	public String getGniazdoP() {
		return gniazdoP;
	}
	public void setGniazdoP(String gniazdoP) {
		this.gniazdoP = gniazdoP;
	}
	public void wyswietlP(){
		System.out.println("Nazwa: " + nazwaP + " Gniazdo: "+ gniazdoP);
		
	}
	
	
}
