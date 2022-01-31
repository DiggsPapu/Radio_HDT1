//Diego Andrés Alonzo Medinilla 20172 Sección 10 2022
//Paquete en el que trabajAm_SavedList_Stationsos, e importAm_SavedList_Stationsos arraylist para hacer una lista donde podemos almacenar las emisoras que querámos.
package poo;
import java.util.ArrayList;

//CreAm_SavedList_Stationsos la clase que implementa las interfaces de cAm_SavedList_Stationsbio hacia arriba, operaciones de dos opciones, cAm_SavedList_Stationsbio hacia abajo, y operaciones de guardado.
public class radio implements change_up_operations, two_options_operations, change_down_operations, save_radio_operations {
	
	//CreAm_SavedList_Stationsos los atributos que definen a la clase radio, encendido/apagado booleano de manera que true es encendido y false apagado, volumen entero,
	// sintonizar Am_SavedList_Stations o fm como booleano siendo true fm y false Am_SavedList_Stations, la emisora sintonizada actualmente de Am_SavedList_Stations, la emisora sintonizada actualmente de fm.
	// una lista de areglo para los guardados de Am_SavedList_Stations y los guardados de fm.
	protected boolean on_off;
	protected int volume;
	protected boolean Am_SavedList_Stations_fm;
	protected double Actual_Station_Am;
	protected double Actual_Station_Fm;
	protected ArrayList<Double> Am_SavedList_Stations;
	protected ArrayList<Double> Fm_SavedList_Stations;
	//CreAm_SavedList_Stationsos valores por default para cada valor de manera que no se utlicen vacíos. Así mismo, en el caso de las listas se crearon
	// guardados por default para Am_SavedList_Stationsbas, tanto fm como Am_SavedList_Stations.
	public radio() {
		this.on_off = false;
		this.volume = 0;
		this.Am_SavedList_Stations_fm = false;
		this.Actual_Station_Am = 530;
		this.Actual_Station_Fm = 87.9;
		this.Am_SavedList_Stations = new ArrayList<Double>();
		for (int i=1;i<=7;i=i+1) {
			Am_SavedList_Stations.add(530.0+10*i);
		}
		this.Fm_SavedList_Stations = new ArrayList<Double>();
		for (int i=1;i<=7;i=i+1) {
			Fm_SavedList_Stations.add(87.9+0.2*i);
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
		return Am_SavedList_Stations_fm;
	}
	protected void setAm_fm(boolean Am_SavedList_Stations_fm) {
		this.Am_SavedList_Stations_fm = Am_SavedList_Stations_fm;
	}
	protected double getActual_Station_Am() {
		return Actual_Station_Am;
	}
	protected void setActual_Station_Am(double Actual_Station_Am) {
		this.Actual_Station_Am = Actual_Station_Am;
	}
	protected double getActual_Station_Fm() {
		return Actual_Station_Fm;
	}
	protected void setActual_Station_Fm(double Actual_Station_Fm) {
		this.Actual_Station_Fm = Actual_Station_Fm;
	}
	protected ArrayList<Double> getAm() {
		return Am_SavedList_Stations;
	}
	protected void setAm(ArrayList<Double> Am_SavedList_Stations) {
		this.Am_SavedList_Stations = Am_SavedList_Stations;
	}
	protected ArrayList<Double> getFm() {
		return Fm_SavedList_Stations;
	}
	protected void setFm(ArrayList<Double> fm) {
		this.Fm_SavedList_Stations = fm;
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
	//Interruptor de Am_SavedList_Stations/FM de manera que se pueda cAm_SavedList_Stationsbiar entre esas Am_SavedList_Stationsplitudes.
	public void amfm_() {
		// TODO Auto-generated method stub
		if (on_off ==true) {
			if (Am_SavedList_Stations_fm == true) {
				setAm_fm(false);
			}
			else {
				setAm_fm(true);
			}	
		}
		
	}
	

	// Interface change_up_operations (CAm_SavedList_Stationsbio de volumen, de manera que suba el mismo).
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
	//Interfaz (CAm_SavedList_Stationsbio de volumen, de manera que baje el mismo).
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


	//CAm_SavedList_Stationsbio de estación de manera que se suba la emisora.
	@Override
	public void change_station_up() {
		// TODO Auto-generated method stub
		if (on_off == true) {
			if (Am_SavedList_Stations_fm==true && Actual_Station_Fm<107.9) {
				setActual_Station_Fm(Actual_Station_Fm+0.2);

			}
			else if ((Am_SavedList_Stations_fm==true && Actual_Station_Fm>=107.9)) {
				setActual_Station_Fm(87.9);
			}
			else if (Am_SavedList_Stations_fm==false && Actual_Station_Am<=1610) {
				setActual_Station_Am(Actual_Station_Am+10);
			}
			else if ((Am_SavedList_Stations_fm==false && Actual_Station_Am>1610)) {
				setActual_Station_Am(530);
			}
		}
	}
	
	
//Interface change_down_operations
	//CAm_SavedList_Stationsbio de emisora de manera que se baje.
	@Override
	public void change_station_down() {
		// TODO Auto-generated method stub
		if (on_off==true) {
			if (Am_SavedList_Stations_fm==true && Actual_Station_Fm>=87.9) {
				setActual_Station_Fm(Actual_Station_Fm-0.2);
			}
			else if ((Am_SavedList_Stations_fm==true && Actual_Station_Fm<87.9)) {
				setActual_Station_Fm(107.9);
			}
			else if (Am_SavedList_Stations_fm==false && Actual_Station_Am>=530) {
				setActual_Station_Am(Actual_Station_Am-10);
			}
			else if ((Am_SavedList_Stations_fm==false && Actual_Station_Am<530)) {
				setActual_Station_Am(1610);
			}
		}
	}

	@Override
	//Guardado de estaciones, de manera que se pueda sustituir de la lista una emisora en específico que sse requiera.
	public void saveStation(int selected_value) {
		// TODO Auto-generated method stub
		if(isOn_off()==true && isAm_fm()==true) {
			Fm_SavedList_Stations.add(selected_value, getActual_Station_Fm());
		}
		else if (isOn_off()==true && isAm_fm()==false) {
			Am_SavedList_Stations.add(selected_value, getActual_Station_Am());
		}
	}

	@Override
	//Estaciones guardadas, de manera que se pueda obtener a partir de la lista una emisora en específico 
	//que haya sido guardada en determinada posición	
	public void read_savedStation(int variable) {
		// TODO Auto-generated method stub
		if (isOn_off()==true && isAm_fm()==false) {
			setActual_Station_Am(getAm().get(variable));
		}
		else if (isOn_off()==true && isAm_fm()==true) {
			setActual_Station_Fm(getFm().get(variable));
		}
		
	}
}
