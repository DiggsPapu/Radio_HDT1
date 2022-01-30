package poo;
//Interface para guardar las operaciones para guardar las emisoras de radio. Tanto la lectura de las guardadas como guardar las mismas.
public interface save_radio_operations {
	public  void saveStation(int selected_value);
	public void read_savedStation(int value);
}
