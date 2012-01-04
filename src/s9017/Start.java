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
	}

}
