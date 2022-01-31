package poo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestRadio_SavedStationAm {
	radio radio= new radio();
	@Test
	void test_readSavedStation() {
		//Esta primera parte del test es para comprobar que se obtienen los valores correctos de la lista de Am
		radio.onoff_();
		radio.read_savedStation(3);
		assertEquals(530+10*3, radio.getActual_Station_Am());
		
		
	}

}
