package poo;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JEditorPane;
import javax.swing.JTextPane;

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
		
		
		
		JLabel lblNewLabel = new JLabel("AM");
		lblNewLabel.setBounds(89, 159, 22, 14);
		contentPane.add(lblNewLabel);
		lblNewLabel.setBackground(Color.RED);
		lblNewLabel.setOpaque(true);
		
		JLabel lblFm = new JLabel("FM");
		lblFm.setBounds(89, 214, 22, 14);
		contentPane.add(lblFm);
		lblFm.setBackground(Color.RED);
		lblFm.setOpaque(true);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.RED);
		panel.setBounds(130, 11, 22, 23);
		contentPane.add(panel);
		
		JLabel lblNewLabel_1 = new JLabel("FM/AM");
		lblNewLabel_1.setBounds(204, 82, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("0");
		lblNewLabel_2.setBounds(83, 55, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		//Buttons
		
		JButton btnNewButton = new JButton("1");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (radio_operaciones.am_fm==false) {
					
				}
			}
		});
		btnNewButton.setBounds(113, 155, 39, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("2");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(162, 155, 39, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("3");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2.setBounds(211, 155, 39, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("4");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_3.setBounds(260, 155, 39, 23);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("5");
		btnNewButton_4.setBounds(309, 155, 39, 23);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("6");
		btnNewButton_5.setBounds(358, 155, 39, 23);
		contentPane.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("1");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_6.setBounds(113, 210, 39, 23);
		contentPane.add(btnNewButton_6);
		
		JButton btnNewButton_1_1 = new JButton("2");
		btnNewButton_1_1.setBounds(162, 210, 39, 23);
		contentPane.add(btnNewButton_1_1);
		
		JButton btnNewButton_2_1 = new JButton("3");
		btnNewButton_2_1.setBounds(211, 210, 39, 23);
		contentPane.add(btnNewButton_2_1);
		
		JButton btnNewButton_3_1 = new JButton("4");
		btnNewButton_3_1.setBounds(260, 210, 39, 23);
		contentPane.add(btnNewButton_3_1);
		
		JButton btnNewButton_4_1 = new JButton("5");
		btnNewButton_4_1.setBounds(309, 210, 39, 23);
		contentPane.add(btnNewButton_4_1);
		
		
		JButton btnNewButton_5_1 = new JButton("6");
		btnNewButton_5_1.setBounds(358, 210, 39, 23);
		contentPane.add(btnNewButton_5_1);
		
		JButton btnNewButton_7 = new JButton("AM/FM");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				radio_operaciones.amfm_();
				if (radio_operaciones.am_fm==false) {
					lblNewLabel.setBackground(Color.GREEN);
					lblFm.setBackground(Color.RED);
				}
				else {
					lblNewLabel.setBackground(Color.RED);
					lblFm.setBackground(Color.GREEN);
				}
				
			}
		});
		btnNewButton_7.setBounds(26, 184, 76, 23);
		contentPane.add(btnNewButton_7);
		
		
		JButton btnNewButton_8 = new JButton("Tune Up");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				radio_operaciones.change_station_up();
				if (radio_operaciones.am_fm==false) {
					String station_actual_am=String.valueOf(radio_operaciones.getTuned_am());
					lblNewLabel_1.setText(station_actual_am);
					
				}
				else if (radio_operaciones.am_fm==true){
					String station_actual_fm=String.valueOf(radio_operaciones.getTuned_fm());
					lblNewLabel_1.setText(station_actual_fm);
				}
			}
		});
		btnNewButton_8.setBounds(308, 78, 89, 23);
		contentPane.add(btnNewButton_8);
		
		JButton btnNewButton_8_1 = new JButton("Tune Down");
		btnNewButton_8_1.addActionListener(new ActionListener() {
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
		btnNewButton_8_1.setBounds(308, 121, 89, 23);
		contentPane.add(btnNewButton_8_1);
		
		JButton btnNewButton_9 = new JButton("+");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				radio_operaciones.change_volume_up();
				String a=Integer.toString(radio_operaciones.getVolume());
				lblNewLabel_2.setText(a);
			}
		});
		btnNewButton_9.setBounds(40, 78, 89, 23);
		contentPane.add(btnNewButton_9);
		
		JButton btnNewButton_10 = new JButton("-");
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				radio_operaciones.change_volume_down();
				String volumen_actual=Integer.toString(radio_operaciones.getVolume());
				lblNewLabel_2.setText(volumen_actual);
			}
		});
		btnNewButton_10.setBounds(40, 121, 89, 23);
		contentPane.add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton("On/Off");
		btnNewButton_11.addActionListener(new ActionListener() {
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
		btnNewButton_11.setBounds(10, 11, 89, 23);
		contentPane.add(btnNewButton_11);
		
		
		
	}
}
