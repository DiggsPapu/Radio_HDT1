package poo;
import java.util.ArrayList;

public class radio implements change_up_operations, two_options_operations, change_down_operations, save_radio_operations {
	boolean on_off;
	int volume;
	boolean am_fm;
	double tuned_am;
	double tuned_fm;
	ArrayList<Double> am;
	ArrayList<Double> fm;
	
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
	public ArrayList<Double> getAm() {
		return am;
	}
	public void setAm(ArrayList<Double> am) {
		this.am = am;
	}
	public ArrayList<Double> getFm() {
		return fm;
	}
	public void setFm(ArrayList<Double> fm) {
		this.fm = fm;
	}


	
//Interface two_options_operations
	@Override
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
	

	// Interface change_up_operations
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
	public void change_station_up() {
		// TODO Auto-generated method stub
		if (on_off == true) {
			if (am_fm==true && tuned_fm<=107.7) {
				setTuned_fm(tuned_fm+0.20);
			}
			else if ((am_fm==true && tuned_fm>=107.9)) {
				setTuned_fm(87.9);
			}
			else if (am_fm==false && tuned_am<=1600) {
				setTuned_am(tuned_am+10);
			}
			else if ((am_fm==false && tuned_am>=1610)) {
				setTuned_am(530);
			}
		}
	}
	
	
//Interface change_down_operations
	@Override
	public void change_station_down() {
		// TODO Auto-generated method stub
		if (on_off==true) {
			if (am_fm==true && tuned_fm>=88.1) {
				setTuned_fm(tuned_fm-0.20);
			}
			else if ((am_fm==true && tuned_fm<=87.9)) {
				setTuned_fm(107.9);
			}
			else if (am_fm==false && tuned_am>=540) {
				setTuned_am(tuned_am-10);
			}
			else if ((am_fm==false && tuned_am<=530)) {
				setTuned_am(1610);
			}
		}
	}
	@Override
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

	@Override
	public void saveStation() {
		// TODO Auto-generated method stub
		if(isOn_off()==true && isAm_fm()==true) {
			fm.add(getTuned_fm());
		}
		else if (isOn_off()==true && isAm_fm()==false) {
			am.add(getTuned_am());
		}
	}

	@Override
	public void read_savedStation(int variable) {
		// TODO Auto-generated method stub
		if (on_off==true && am_fm==false) {
			setTuned_am(getAm().get(variable));
		}
		
	}
}
