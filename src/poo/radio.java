//Diego Andrés Alonzo Medinilla 20172 Sección 10 2022
//Paquete en el que trabajamos, e importamos arraylist para hacer una lista donde podemos almacenar las emisoras que querámos.
package poo;
import java.util.ArrayList;

//Creamos la clase que implementa las interfaces de cambio hacia arriba, operaciones de dos opciones, cambio hacia abajo, y operaciones de guardado.
public class radio implements change_up_operations, two_options_operations, change_down_operations, save_radio_operations {
	
	//Creamos los atributos que definen a la clase radio, encendido/apagado booleano de manera que true es encendido y false apagado, volumen entero,
	// sintonizar am o fm como booleano siendo true fm y false am, la emisora sintonizada actualmente de am, la emisora sintonizada actualmente de fm.
	// una lista de areglo para los guardados de am y los guardados de fm.
	boolean on_off;
	int volume;
	boolean am_fm;
	double tuned_am;
	double tuned_fm;
	ArrayList<Double> am;
	ArrayList<Double> fm;
	//Creamos valores por default para cada valor de manera que no se utlicen vacíos. Así mismo, en el caso de las listas se crearon
	// guardados por default para ambas, tanto fm como am.
	public radio() {
		this.on_off = false;
		this.volume = 0;
		this.am_fm = false;
		this.tuned_am = 530;
		this.tuned_fm = 87.9;
		this.am = new ArrayList<Double>();
		for (int i=1;i<=7;i=i+1) {
			am.add(530.0+10*i);
		}
		this.fm = new ArrayList<Double>();
		for (int i=1;i<=7;i=i+1) {
			fm.add(87.9+0.2*i);
		}

	}	
	
	//Se obtuvieron los getters y setters.
	protected boolean isOn_off() {
		return on_off;
	}
	protected void setOn_off(boolean on_off) {
		this.on_off = on_off;
	}
	protected int getVolume() {
		return volume;
	}
	protected void setVolume(int volume) {
		this.volume = volume;
	}
	protected boolean isAm_fm() {
		return am_fm;
	}
	protected void setAm_fm(boolean am_fm) {
		this.am_fm = am_fm;
	}
	protected double getTuned_am() {
		return tuned_am;
	}
	protected void setTuned_am(double tuned_am) {
		this.tuned_am = tuned_am;
	}
	protected double getTuned_fm() {
		return tuned_fm;
	}
	protected void setTuned_fm(double tuned_fm) {
		this.tuned_fm = tuned_fm;
	}
	protected ArrayList<Double> getAm() {
		return am;
	}
	protected void setAm(ArrayList<Double> am) {
		this.am = am;
	}
	protected ArrayList<Double> getFm() {
		return fm;
	}
	protected void setFm(ArrayList<Double> fm) {
		this.fm = fm;
	}


	
//Interface two_options_operations
	@Override
	//Interruptor de encendido apagado de la radio.
	public void onoff_() {
		// TODO Auto-generated method stub

		if (on_off == true) {
			setOn_off(false);

		}
		else if (on_off==false) {
			setOn_off(true);

		}

	}

	@Override
	//Interruptor de am/FM de manera que se pueda cambiar entre esas amplitudes.
	public void amfm_() {
		// TODO Auto-generated method stub
		if (on_off ==true) {
			if (am_fm == true) {
				setAm_fm(false);
			}
			else {
				setAm_fm(true);
			}	
		}
		
	}
	

	// Interface change_up_operations (Cambio de volumen, de manera que suba el mismo).
	@Override
	public void change_volume_up() {
		// TODO Auto-generated method stub
		if (on_off==true) {
			if (volume<=99) {
				setVolume(volume+1);
			}
		}
	}
	
	@Override
	//Interfaz (Cambio de volumen, de manera que baje el mismo).
	public void change_volume_down() {
		// TODO Auto-generated method stub
		if (on_off==true) {
			if (volume>0) {
				setVolume(volume-1);	
			}
			else {
				
			}
		}
	}


	//Cambio de estación de manera que se suba la emisora.
	@Override
	public void change_station_up() {
		// TODO Auto-generated method stub
		if (on_off == true) {
			if (am_fm==true && tuned_fm<107.9) {
				setTuned_fm(tuned_fm+0.2);

			}
			else if ((am_fm==true && tuned_fm>=107.9)) {
				setTuned_fm(87.9);
			}
			else if (am_fm==false && tuned_am<=1610) {
				setTuned_fm(tuned_am+10);
			}
			else if ((am_fm==false && tuned_am>1610)) {
				setTuned_am(530);
			}
		}
	}
	
	
//Interface change_down_operations
	//Cambio de emisora de manera que se baje.
	@Override
	public void change_station_down() {
		// TODO Auto-generated method stub
		if (on_off==true) {
			if (am_fm==true && tuned_fm>=87.9) {
				setTuned_fm(tuned_fm-0.2);
			}
			else if ((am_fm==true && tuned_fm<87.9)) {
				setTuned_fm(107.9);
			}
			else if (am_fm==false && tuned_am>=530) {
				setTuned_am(tuned_am-10);
			}
			else if ((am_fm==false && tuned_am<530)) {
				setTuned_am(1610);
			}
		}
	}

	@Override
	//Guardado de estaciones, de manera que se pueda sustituir de la lista una emisora en específico que sse requiera.
	public void saveStation(int selected_value) {
		// TODO Auto-generated method stub
		if(isOn_off()==true && isAm_fm()==true) {
			fm.add(selected_value, getTuned_fm());
		}
		else if (isOn_off()==true && isAm_fm()==false) {
			am.add(selected_value, getTuned_am());
		}
	}

	@Override
	//Estaciones guardadas, de manera que se pueda obtener a partir de la lista una emisora en específico 
	//que haya sido guardada en determinada posición	
	public void read_savedStation(int variable) {
		// TODO Auto-generated method stub
		if (isOn_off()==true && isAm_fm()==false) {
			setTuned_am(getAm().get(variable));
		}
		else if (isOn_off()==true && isAm_fm()==true) {
			setTuned_fm(getFm().get(variable));
		}
		
	}
}
