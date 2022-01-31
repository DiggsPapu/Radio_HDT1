package poo;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class TestRadio_onoff{
	radio radio= new radio();
	
	@Test
	void enciende() {
		radio.onoff_();
		assertEquals(true, radio.isOn_off());
	}
	
	
	
}
