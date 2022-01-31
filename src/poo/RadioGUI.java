package poo;
// Importación de swing para hacer la interfaz gráfica.
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JComboBox;
// Esta clase hereda de la super JFrame
public class RadioGUI extends JFrame {
	//Definimos el objeto radio.
	radio Radio = new radio();
	private JPanel contentPane;


	/**
	 * Create the frame.
	 */
	public RadioGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//Text of the parts
		JLabel lblNewLabel_1_1 = new JLabel("Volume");
		lblNewLabel_1_1.setBounds(10, 55, 46, 14);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel = new JLabel("AM");
		lblNewLabel.setBounds(10, 159, 22, 14);
		contentPane.add(lblNewLabel);
		lblNewLabel.setBackground(Color.RED);
		lblNewLabel.setOpaque(true);
		
		JLabel lblFm = new JLabel("FM");
		lblFm.setBounds(10, 236, 22, 14);
		contentPane.add(lblFm);
		lblFm.setBackground(Color.RED);
		lblFm.setOpaque(true);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.RED);
		panel.setBounds(130, 11, 22, 23);
		contentPane.add(panel);
		
		JLabel lblNewLabel_1 = new JLabel("FM/AM");
		lblNewLabel_1.setBounds(300, 34, 62, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("0");
		lblNewLabel_2.setBounds(83, 55, 46, 14);
		contentPane.add(lblNewLabel_2);
		
//Buttons
		
		//Estos son los botones para guardar las estaciones de radio en AM.
		JButton Button_savedStation_1_Am = new JButton("1");
		Button_savedStation_1_Am.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int save_Am1 = 1;
				Radio.read_savedStation(save_Am1);
				lblNewLabel_1.setText(String.valueOf(Radio.getActual_Station_Am()));
			}
		});
		Button_savedStation_1_Am.setBounds(42, 155, 54, 23);
		contentPane.add(Button_savedStation_1_Am);
		Button_savedStation_1_Am.setEnabled(false);
		
		JButton Button_savedStation_2_Am = new JButton("2");
		Button_savedStation_2_Am.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int save_Am2 = 2;
				Radio.read_savedStation(save_Am2);
				lblNewLabel_1.setText(String.valueOf(Radio.getActual_Station_Am()));
			}
		});
		Button_savedStation_2_Am.setBounds(106, 155, 54, 23);
		contentPane.add(Button_savedStation_2_Am);
		Button_savedStation_2_Am.setEnabled(false);
		
		JButton Button_savedStation_3_Am = new JButton("3");
		Button_savedStation_3_Am.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int save_Am3 = 3;
				Radio.read_savedStation(save_Am3);
				lblNewLabel_1.setText(String.valueOf(Radio.getActual_Station_Am()));
			}
		});
		Button_savedStation_3_Am.setBounds(170, 155, 56, 23);
		contentPane.add(Button_savedStation_3_Am);
		Button_savedStation_3_Am.setEnabled(false);
		
		JButton Button_savedStation_4_Am = new JButton("4");
		Button_savedStation_4_Am.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int save_Am4 = 4;
				Radio.read_savedStation(save_Am4);
				lblNewLabel_1.setText(String.valueOf(Radio.getActual_Station_Am()));
			}
		});
		Button_savedStation_4_Am.setBounds(236, 155, 54, 23);
		contentPane.add(Button_savedStation_4_Am);
		Button_savedStation_4_Am.setEnabled(false);
		
		JButton Button_savedStation_5_Am = new JButton("5");
		Button_savedStation_5_Am.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int save_Am5 = 5;
				Radio.read_savedStation(save_Am5);
				lblNewLabel_1.setText(String.valueOf(Radio.getActual_Station_Am()));
			}
		});
		Button_savedStation_5_Am.setBounds(300, 155, 54, 23);
		contentPane.add(Button_savedStation_5_Am);
		Button_savedStation_5_Am.setEnabled(false);
		
		JButton Button_savedStation_6_Am = new JButton("6");
		Button_savedStation_6_Am.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (Radio.isOn_off()==true) {
					int save_Am6 = 6;
					Radio.read_savedStation(save_Am6);
					lblNewLabel_1.setText(String.valueOf(Radio.getActual_Station_Am()));
				}
				
			}
		});
		Button_savedStation_6_Am.setBounds(364, 155, 60, 23);
		contentPane.add(Button_savedStation_6_Am);
		Button_savedStation_6_Am.setEnabled(false);
		
		//Estos son los botones para guardar las estaciones de radio en FM.
		JButton Button_savedStation_1_Fm = new JButton("1");
		Button_savedStation_1_Fm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int save_Fm1 = 1;
				Radio.read_savedStation(save_Fm1);
				lblNewLabel_1.setText(String.valueOf(Radio.getActual_Station_Fm()));
			}
		});
		Button_savedStation_1_Fm.setBounds(42, 232, 54, 23);
		contentPane.add(Button_savedStation_1_Fm);
		Button_savedStation_1_Fm.setEnabled(false);
		
		JButton Button_savedStation_2_Fm = new JButton("2");
		Button_savedStation_2_Fm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int save_Fm2 = 2;
				Radio.read_savedStation(save_Fm2);
				lblNewLabel_1.setText(String.valueOf(Radio.getActual_Station_Fm()));
			}
		});
		Button_savedStation_2_Fm.setBounds(106, 232, 54, 23);
		contentPane.add(Button_savedStation_2_Fm);
		Button_savedStation_2_Fm.setEnabled(false);
		
		JButton Button_savedStation_3_Fm = new JButton("3");
		Button_savedStation_3_Fm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int save_Fm3 = 3;
				Radio.read_savedStation(save_Fm3);
				lblNewLabel_1.setText(String.valueOf(Radio.getActual_Station_Fm()));
			}
		});
		Button_savedStation_3_Fm.setBounds(170, 232, 56, 23);
		contentPane.add(Button_savedStation_3_Fm);
		Button_savedStation_3_Fm.setEnabled(false);
		
		JButton Button_savedStation_4_Fm = new JButton("4");
		Button_savedStation_4_Fm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int save_Fm4 = 4;
				Radio.read_savedStation(save_Fm4);
				lblNewLabel_1.setText(String.valueOf(Radio.getActual_Station_Fm()));
			}
		});
		Button_savedStation_4_Fm.setBounds(236, 232, 54, 23);
		contentPane.add(Button_savedStation_4_Fm);
		Button_savedStation_4_Fm.setEnabled(false);
		
		JButton Button_savedStation_5_Fm = new JButton("5");
		Button_savedStation_5_Fm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int save_Fm5 = 5;
				Radio.read_savedStation(save_Fm5);
				lblNewLabel_1.setText(String.valueOf(Radio.getActual_Station_Fm()));
			}
		});
		Button_savedStation_5_Fm.setBounds(300, 232, 54, 23);
		contentPane.add(Button_savedStation_5_Fm);
		Button_savedStation_5_Fm.setEnabled(false);
		
		JButton Button_savedStation_6_Fm = new JButton("6");
		Button_savedStation_6_Fm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int save_Fm6 = 6;
				Radio.read_savedStation(save_Fm6);
				lblNewLabel_1.setText(String.valueOf(Radio.getActual_Station_Fm()));
			}
		});
		Button_savedStation_6_Fm.setBounds(364, 232, 60, 23);
		contentPane.add(Button_savedStation_6_Fm);
		Button_savedStation_6_Fm.setEnabled(false);
		
		//Botones para cambiar las emisoras (adelante y atrás).
		JButton Button_NextTrack = new JButton("Next");
		Button_NextTrack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Radio.change_station_up();
				if (Radio.isAm_fm() ==false) {
					lblNewLabel_1.setText(String.valueOf(Radio.getActual_Station_Am()));
					
				}
				else if (Radio.isAm_fm()==true){
					String station_actual_fm=String.valueOf(Radio.getActual_Station_Fm());
					lblNewLabel_1.setText(station_actual_fm);
				}
			}
		});
		Button_NextTrack.setBounds(345, 78, 89, 23);
		contentPane.add(Button_NextTrack);
		Button_NextTrack.setEnabled(false);
		
		JButton Button_pastTrack = new JButton("Back");
		Button_pastTrack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Radio.change_station_down();
				if (Radio.isAm_fm()==false) {
					String station_actual_am=String.valueOf(Radio.getActual_Station_Am());
					lblNewLabel_1.setText(station_actual_am);
					
				}
				else {
					String station_actual_fm=String.valueOf(Radio.getActual_Station_Fm());
					lblNewLabel_1.setText(station_actual_fm);
				}
			}
		});
		Button_pastTrack.setBounds(246, 78, 89, 23);
		contentPane.add(Button_pastTrack);
		Button_pastTrack.setEnabled(false);
		//Botón para cambiar el volumen (más o menos volumen).
		JButton Button_moreVolume = new JButton("+");
		Button_moreVolume.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Radio.change_volume_up();
				String a=Integer.toString(Radio.getVolume());
				lblNewLabel_2.setText(a);
			}
		});
		Button_moreVolume.setBounds(75, 78, 54, 23);
		contentPane.add(Button_moreVolume);
		Button_moreVolume.setEnabled(false);
		
		JButton Button_lessVolume = new JButton("-");
		Button_lessVolume.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Radio.change_volume_down();
				String volumen_actual=Integer.toString(Radio.getVolume());
				lblNewLabel_2.setText(volumen_actual);
			}
		});
		Button_lessVolume.setBounds(0, 78, 54, 23);
		contentPane.add(Button_lessVolume);
		Button_lessVolume.setEnabled(false);
		
		
		
//Saved Stations
		
		//Para elegir en donde se guardará la emisora tanto(FM como AM).
		JComboBox<Integer> comboBox = new JComboBox<Integer>();
		comboBox.setBounds(344, 179, 80, 22);
		contentPane.add(comboBox);
		comboBox.addItem(1);
		comboBox.addItem(2);
		comboBox.addItem(3);
		comboBox.addItem(4);
		comboBox.addItem(5);
		comboBox.addItem(6);
		comboBox.setEnabled(false);
		
		
		JButton Button_Save_Station = new JButton("Save");
		Button_Save_Station.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				comboBox.getSelectedItem();
				if (Radio.isAm_fm()==false) {
					Radio.saveStation((Integer)comboBox.getSelectedItem());
				}
				else if (Radio.isAm_fm()==true) {
					Radio.saveStation((Integer)comboBox.getSelectedItem());
				}
				
			}
		});
		Button_Save_Station.setBounds(345, 202, 80, 23);
		contentPane.add(Button_Save_Station);
		Button_Save_Station.setEnabled(false);
        
//Change frequency
		
		//Cambiar Am_Fm o On_Off
		JButton Button_Am_Fm = new JButton("AM/FM");
		Button_Am_Fm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Radio.amfm_();
				if (Radio.isAm_fm()==false) {
					lblNewLabel.setBackground(Color.GREEN);
					lblFm.setBackground(Color.RED);
					lblNewLabel_1.setText(String.valueOf(Radio.getActual_Station_Am()));
					
					Button_pastTrack.setEnabled(true);
					Button_NextTrack.setEnabled(true);
					
					Button_lessVolume.setEnabled(true);
					Button_moreVolume.setEnabled(true);
					
					Button_Save_Station.setEnabled(true);
					comboBox.setEnabled(true);
					
					Button_savedStation_1_Am.setEnabled(true);
					Button_savedStation_2_Am.setEnabled(true);
					Button_savedStation_3_Am.setEnabled(true);
					Button_savedStation_4_Am.setEnabled(true);
					Button_savedStation_5_Am.setEnabled(true);
					Button_savedStation_6_Am.setEnabled(true);
					
					Button_savedStation_1_Fm.setEnabled(false);
					Button_savedStation_2_Fm.setEnabled(false);
					Button_savedStation_3_Fm.setEnabled(false);
					Button_savedStation_4_Fm.setEnabled(false);
					Button_savedStation_5_Fm.setEnabled(false);
					Button_savedStation_6_Fm.setEnabled(false);
				}
				else {
					lblNewLabel.setBackground(Color.RED);
					lblFm.setBackground(Color.GREEN);
					lblNewLabel_1.setText(String.valueOf(Radio.getActual_Station_Fm()));
					
					Button_pastTrack.setEnabled(true);
					Button_NextTrack.setEnabled(true);
					
					Button_lessVolume.setEnabled(true);
					Button_moreVolume.setEnabled(true);
					
					Button_Save_Station.setEnabled(true);
					comboBox.setEnabled(true);
					
					Button_savedStation_1_Am.setEnabled(false);
					Button_savedStation_2_Am.setEnabled(false);
					Button_savedStation_3_Am.setEnabled(false);
					Button_savedStation_4_Am.setEnabled(false);
					Button_savedStation_5_Am.setEnabled(false);
					Button_savedStation_6_Am.setEnabled(false);
					
					Button_savedStation_1_Fm.setEnabled(true);
					Button_savedStation_2_Fm.setEnabled(true);
					Button_savedStation_3_Fm.setEnabled(true);
					Button_savedStation_4_Fm.setEnabled(true);
					Button_savedStation_5_Fm.setEnabled(true);
					Button_savedStation_6_Fm.setEnabled(true);
				}
				
			}
		});
		Button_Am_Fm.setBounds(10, 202, 76, 23);
		contentPane.add(Button_Am_Fm);
		Button_Am_Fm.setEnabled(false);
		
		JButton Button_On_Off = new JButton("On/Off");
		Button_On_Off.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Radio.onoff_();
				if (Radio.isOn_off()==true) {
					panel.setBackground(Color.green);
					
					Button_Am_Fm.setEnabled(true);
				}
				else if (Radio.isOn_off()==false){
					panel.setBackground(Color.RED);
					Button_lessVolume.setEnabled(false);
					Button_moreVolume.setEnabled(false);
					
					Button_pastTrack.setEnabled(false);
					Button_NextTrack.setEnabled(false);
					
					Button_Am_Fm.setEnabled(false);
					Button_Save_Station.setEnabled(false);
					comboBox.setEnabled(false);
					
					Button_savedStation_1_Am.setEnabled(false);
					Button_savedStation_2_Am.setEnabled(false);
					Button_savedStation_3_Am.setEnabled(false);
					Button_savedStation_4_Am.setEnabled(false);
					Button_savedStation_5_Am.setEnabled(false);
					Button_savedStation_6_Am.setEnabled(false);
					
					Button_savedStation_1_Fm.setEnabled(false);
					Button_savedStation_2_Fm.setEnabled(false);
					Button_savedStation_3_Fm.setEnabled(false);
					Button_savedStation_4_Fm.setEnabled(false);
					Button_savedStation_5_Fm.setEnabled(false);
					Button_savedStation_6_Fm.setEnabled(false);
				}
			}
		});
		Button_On_Off.setBounds(10, 11, 89, 23);
		contentPane.add(Button_On_Off);
		
		
	}
}
