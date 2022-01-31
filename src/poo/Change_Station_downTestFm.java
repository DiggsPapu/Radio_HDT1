package poo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Change_Station_downTestFm {
	radio radio=new radio();
	@Test
	void test_changeupFm() {
		//Test para comprobar si sube o no la emisora en Fm
		radio.onoff_();
		radio.amfm_();
		for (int i=0; i<=3;i++) {
			radio.change_station_up();
			
		}
		
		assertEquals(87.9+0.2+0.2+0.2+0.2, radio.getActual_Station_Fm());
	}

}
