package poo;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class RadioGUI extends JFrame {
	
	radio radio_operaciones = new radio();

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
		
		JButton Button_savedStation_1_Am = new JButton("1");
		Button_savedStation_1_Am.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int save_Am1 = 1;
				radio_operaciones.read_savedStation(save_Am1);
				lblNewLabel_1.setText(String.valueOf(radio_operaciones.getTuned_am()));
			}
		});
		Button_savedStation_1_Am.setBounds(42, 155, 54, 23);
		contentPane.add(Button_savedStation_1_Am);
		
		JButton Button_savedStation_2_Am = new JButton("2");
		Button_savedStation_2_Am.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int save_Am2 = 2;
				radio_operaciones.read_savedStation(save_Am2);
				lblNewLabel_1.setText(String.valueOf(radio_operaciones.getTuned_am()));
			}
		});
		Button_savedStation_2_Am.setBounds(106, 155, 54, 23);
		contentPane.add(Button_savedStation_2_Am);
		
		JButton Button_savedStation_3_Am = new JButton("3");
		Button_savedStation_3_Am.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int save_Am3 = 3;
				radio_operaciones.read_savedStation(save_Am3);
				lblNewLabel_1.setText(String.valueOf(radio_operaciones.getTuned_am()));
			}
		});
		Button_savedStation_3_Am.setBounds(170, 155, 56, 23);
		contentPane.add(Button_savedStation_3_Am);
		
		JButton Button_savedStation_4_Am = new JButton("4");
		Button_savedStation_4_Am.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int save_Am4 = 4;
				radio_operaciones.read_savedStation(save_Am4);
				lblNewLabel_1.setText(String.valueOf(radio_operaciones.getTuned_am()));
			}
		});
		Button_savedStation_4_Am.setBounds(236, 155, 54, 23);
		contentPane.add(Button_savedStation_4_Am);
		
		JButton Button_savedStation_5_Am = new JButton("5");
		Button_savedStation_5_Am.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int save_Am5 = 5;
				radio_operaciones.read_savedStation(save_Am5);
				lblNewLabel_1.setText(String.valueOf(radio_operaciones.getTuned_am()));
			}
		});
		Button_savedStation_5_Am.setBounds(300, 155, 54, 23);
		contentPane.add(Button_savedStation_5_Am);
		
		JButton Button_savedStation_6_Am = new JButton("6");
		Button_savedStation_6_Am.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int save_Am6 = 6;
				radio_operaciones.read_savedStation(save_Am6);
			}
		});
		Button_savedStation_6_Am.setBounds(364, 155, 60, 23);
		contentPane.add(Button_savedStation_6_Am);
		
		JButton Button_savedStation_1_Fm = new JButton("1");
		Button_savedStation_1_Fm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int save_Fm1 = 1;
				radio_operaciones.read_savedStation(save_Fm1);
				lblNewLabel_1.setText(String.valueOf(radio_operaciones.getTuned_fm()));
			}
		});
		Button_savedStation_1_Fm.setBounds(42, 232, 54, 23);
		contentPane.add(Button_savedStation_1_Fm);
		
		JButton Button_savedStation_2_Fm = new JButton("2");
		Button_savedStation_2_Fm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int save_Fm2 = 2;
				radio_operaciones.read_savedStation(save_Fm2);
				lblNewLabel_1.setText(String.valueOf(radio_operaciones.getTuned_fm()));
			}
		});
		Button_savedStation_2_Fm.setBounds(106, 232, 54, 23);
		contentPane.add(Button_savedStation_2_Fm);
		
		JButton Button_savedStation_3_Fm = new JButton("3");
		Button_savedStation_3_Fm.setBounds(170, 232, 56, 23);
		contentPane.add(Button_savedStation_3_Fm);
		
		JButton Button_savedStation_4_Fm = new JButton("4");
		Button_savedStation_4_Fm.setBounds(236, 232, 54, 23);
		contentPane.add(Button_savedStation_4_Fm);
		
		JButton Button_savedStation_5_Fm = new JButton("5");
		Button_savedStation_5_Fm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Button_savedStation_5_Fm.setBounds(300, 232, 54, 23);
		contentPane.add(Button_savedStation_5_Fm);
		
		
		JButton Button_savedStation_6_Fm = new JButton("6");
		Button_savedStation_6_Fm.setBounds(364, 232, 60, 23);
		contentPane.add(Button_savedStation_6_Fm);
		
		JButton Button_Am_Fm = new JButton("AM/FM");
		Button_Am_Fm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				radio_operaciones.amfm_();
				if (radio_operaciones.am_fm==false) {
					lblNewLabel.setBackground(Color.GREEN);
					lblFm.setBackground(Color.RED);
					lblNewLabel_1.setText(String.valueOf(radio_operaciones.getTuned_am()));
				}
				else {
					lblNewLabel.setBackground(Color.RED);
					lblFm.setBackground(Color.GREEN);
					lblNewLabel_1.setText(String.valueOf(radio_operaciones.getTuned_fm()));
				}
				
			}
		});
		Button_Am_Fm.setBounds(10, 202, 76, 23);
		contentPane.add(Button_Am_Fm);
		
		
		JButton Button_NextTrack = new JButton("Next");
		Button_NextTrack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				radio_operaciones.change_station_up();
				if (radio_operaciones.am_fm==false) {
					lblNewLabel_1.setText(String.valueOf(radio_operaciones.getTuned_am()));
					
				}
				else if (radio_operaciones.am_fm==true){
					String station_actual_fm=String.valueOf(radio_operaciones.getTuned_fm());
					lblNewLabel_1.setText(station_actual_fm);
				}
			}
		});
		Button_NextTrack.setBounds(345, 78, 89, 23);
		contentPane.add(Button_NextTrack);
		
		JButton Button_pastTrack = new JButton("Back");
		Button_pastTrack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				radio_operaciones.change_station_down();
				if (radio_operaciones.am_fm==false) {
					String station_actual_am=String.valueOf(radio_operaciones.getTuned_am());
					lblNewLabel_1.setText(station_actual_am);
					
				}
				else {
					String station_actual_fm=String.valueOf(radio_operaciones.getTuned_fm());
					lblNewLabel_1.setText(station_actual_fm);
				}
			}
		});
		Button_pastTrack.setBounds(246, 78, 89, 23);
		contentPane.add(Button_pastTrack);
		
		JButton Button_moreVolume = new JButton("+");
		Button_moreVolume.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				radio_operaciones.change_volume_up();
				String a=Integer.toString(radio_operaciones.getVolume());
				lblNewLabel_2.setText(a);
			}
		});
		Button_moreVolume.setBounds(75, 78, 54, 23);
		contentPane.add(Button_moreVolume);
		
		JButton Button_lessVolume = new JButton("-");
		Button_lessVolume.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				radio_operaciones.change_volume_down();
				String volumen_actual=Integer.toString(radio_operaciones.getVolume());
				lblNewLabel_2.setText(volumen_actual);
			}
		});
		Button_lessVolume.setBounds(0, 78, 54, 23);
		contentPane.add(Button_lessVolume);
		
		JButton Button_On_Off = new JButton("On/Off");
		Button_On_Off.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				radio_operaciones.onoff_();
				if (radio_operaciones.on_off==true) {
					panel.setBackground(Color.green);
				}
				else if (radio_operaciones.on_off==false){
					panel.setBackground(Color.RED);
				}
			}
		});
		Button_On_Off.setBounds(10, 11, 89, 23);
		contentPane.add(Button_On_Off);
		
		//Saved Stations
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(344, 179, 80, 22);
		contentPane.add(comboBox);
		comboBox.addItem(1);
		comboBox.addItem(2);
		comboBox.addItem(3);
		comboBox.addItem(4);
		comboBox.addItem(5);
		comboBox.addItem(6);
		
		JButton Button_Save_Station = new JButton("Save");
		Button_Save_Station.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		Button_Save_Station.setBounds(345, 202, 80, 23);
		contentPane.add(Button_Save_Station);
        
		
		
	}
}
