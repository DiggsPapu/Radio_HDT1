package poo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestRadio_SavedStationFm {
	radio radio= new radio();
	@Test
	void test_readSavedStation() {
		
		radio.onoff_();
		
		
		//Esta segunda del test es para comprobar que se obtiene lo correcto de la lista Fm
		radio.amfm_();
		radio.read_savedStation(6);
		assertEquals(87.9+0.2*6,radio.getActual_Station_Fm());
	}

}
