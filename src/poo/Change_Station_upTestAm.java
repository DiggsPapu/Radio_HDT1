package poo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Change_Station_upTestAm {
	radio radio=new radio();
	@Test
	void test_changeupAm() {
		//Test para comprobar si sube o no la emisora en Am
		radio.onoff_();
		radio.change_station_up();
		assertEquals(530+10, radio.getActual_Station_Am());
	}

}
