package poo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ChangeVolumeUpTest {
	radio radio=new radio();
	@Test
	void test_changeupVolume() {
		//Test para comprobar si aumenta el valor del volumen
		radio.onoff_();
		radio.amfm_();
		for (int i=0; i<=500;i++) {
			radio.change_volume_up();
			
		}
		
		assertEquals(100, radio.getVolume());
	}

}
