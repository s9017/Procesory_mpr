package s9017.test;

import static org.junit.Assert.*;

import org.junit.Test;

import s9017.Procesory;
import s9017.Producent;

public class AppTest {
	
	Producent Test = new Producent("Test");

	@Test
	public void test() {
		assertTrue( true );
	}
	@Test
    public void test_dodaj() {
    	assertNotNull(Test);
    	Test.dodaj_Procesor("PPP", "775");
    	assertNotNull(Test.szukaj_Procesor("PPP"));
}
	@Test
    public void test_wyswietl(){
    	Test.dodaj_Procesor("PPP", "775");
    	for( Procesory p : Test.getProcesory()) assertNotNull(p);

}
	@Test
    public void test_szukaj(){
    
    Test.dodaj_Procesor("PPP", "775"); 
    assertNotNull(Test.getProcesor(0));
     assertSame(Test.getProcesor(0), Test.szukaj_Procesor("PPP"));
    }
	@Test
    public void test_usun(){
    
    Test.dodaj_Procesor("PPP", "775");
    Test.usun_Procesor("PPP");
     assertNull(Test.szukaj_Procesor("PPP"));
    }
	@Test
    public void test_edytuj(){
		
    Test.dodaj_Procesor("PPP", "775");
    Test.edytuj_Procesor("PPP", "PPP2");
     assertTrue(Test.getProcesor(0).getNazwaP()=="PPP2");
    }

}
