package poo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestsaveStation {
	radio radio=new radio();
	@Test
	void test_savesstationfm() {
		//Test para comprobar si sube o no la emisora en Fm
		radio.onoff_();
		radio.amfm_();
		for (int i=0; i<=5;i++) {
			radio.change_station_up();
			
		}
		radio.saveStation(3);
		radio.read_savedStation(3);
		assertEquals(87.9+0.2+0.2+0.2+0.2+0.2+0.2, radio.getActual_Station_Fm());
	}

}
