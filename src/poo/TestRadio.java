package poo;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class TestRadio{
	radio radio= new radio();
	
	@Test
	
	void test_readSavedStation() {
		//Esta primera parte del test es para comprobar que se obtienen los valores correctos de la lista de Am
		radio.onoff_();
		radio.read_savedStation(3);
		
		assertEquals(560, radio.getActual_Station_Am());
		
	}
	
}
