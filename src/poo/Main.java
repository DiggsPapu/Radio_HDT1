//
package poo;
import java.awt.EventQueue;

import javax.swing.*;
      

public class Main{
   
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RadioGUI frame = new RadioGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
	