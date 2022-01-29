package poo;
import java.util.ArrayList;

public class radio {
	boolean on_off;
	int volume;
	boolean am_fm;
	double tuned_am;
	double tuned_fm;
	ArrayList<String> am;
	ArrayList<String> fm;
	String SavedStations;
	
	public radio() {
		this.on_off = false;
		this.volume = 0;
		this.am_fm = false;
		this.tuned_am = 530;
		this.tuned_fm = 87.9;
		this.SavedStations=null;
		
	}
	
	public void onoff() {
		if (on_off == true) {
			on_off=false;
		}
		else {
			on_off= true;
		}
		
	}
	
	public void am_fm() {
		if (on_off ==true) {
			if (am_fm == true) {
				am_fm=false;
			}
			else {
				am_fm= true;
			}
			
		}
		
	}
	
	public void change_up_tuned() {
		if (on_off == true) {
			if (am_fm==true && tuned_fm<108.1) {
				setTuned_fm(tuned_fm+0.2);
			}
			else if ((am_fm==true && tuned_fm>=108.1)) {
				setTuned_fm(87.9);
			}
			else if (am_fm==false && tuned_am<1620) {
				setTuned_am(tuned_am+10);
			}
			else if ((am_fm==false && tuned_am>=1620)) {
				setTuned_am(530);
			}
			
		}
		
	}
	
	public void change_down_tuned() {
		if (on_off==true) {
			if (am_fm==true && tuned_fm<108.1) {
				setTuned_fm(tuned_fm-0.2);
			}
			else if ((am_fm==true && tuned_fm>=108.1)) {
				setTuned_fm(107.9);
			}
			else if (am_fm==false && tuned_am>530) {
				setTuned_am(tuned_am-10);
			}
			else if ((am_fm==false && tuned_am<=530)) {
				setTuned_am(1610);
			}

		}
	}
	
	
	public boolean isOn_off() {
		return on_off;
	}
	public void setOn_off(boolean on_off) {
		this.on_off = on_off;
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	public boolean isAm_fm() {
		return am_fm;
	}
	public void setAm_fm(boolean am_fm) {
		this.am_fm = am_fm;
	}
	public double getTuned_am() {
		return tuned_am;
	}
	public void setTuned_am(double tuned_am) {
		this.tuned_am = tuned_am;
	}
	public double getTuned_fm() {
		return tuned_fm;
	}
	public void setTuned_fm(double tuned_fm) {
		this.tuned_fm = tuned_fm;
	}
	public ArrayList<String> getAm() {
		return am;
	}
	public void setAm(ArrayList<String> am) {
		this.am = am;
	}
	public ArrayList<String> getFm() {
		return fm;
	}
	public void setFm(ArrayList<String> fm) {
		this.fm = fm;
	}
	public String getSavedStations() {
		return SavedStations;
	}
	public void setSavedStations(String savedStations) {
		SavedStations = savedStations;
	}
}
