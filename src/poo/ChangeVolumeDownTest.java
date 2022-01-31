package poo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ChangeVolumeDownTest {
	radio radio=new radio();
	@Test
	void test_changeupVolume() {
		//Test para comprobar si baja o no el volumen
		radio.onoff_();
		radio.amfm_();
		for (int i=0; i<=500;i++) {
			radio.change_volume_up();
			
		}
		for(int k=0; k<=68;k++) {
			radio.change_volume_down();
		}
		
		assertEquals(100-69, radio.getVolume());
	}

}
