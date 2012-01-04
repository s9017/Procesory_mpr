package s9017;

public class Start {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Producent Intel=new Producent("Intel");
		Intel.dodaj_Procesor("Pentium", "LGA775");
		Intel.dodaj_Procesor("Celeron", "Socket 478");
		Intel.dodaj_Procesor("Core i5", "LGA1155");
		
		
		Intel.wyswietl_Procesor();
		
		System.out.println("Procesor Pentium ma gniazdo typu: " + Intel.szukaj_Procesor("Pentium").getGniazdoP());
		
		Intel.usun_Procesor("Celeron");
		
		Intel.edytuj_Procesor("Pentium", "Pentium 4");
		
		Intel.wyswietl_Procesor();
	}

}
