package phandinhnhat_btth2.main;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ClientSender extends JFrame implements ActionListener {

	public ClientSender() {

		JFrame frame = new JFrame("Chat Frame");

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.setSize(400, 400);

		JPanel panel = new JPanel(); 

		JLabel label = new JLabel("Enter Text");

		JTextField tf = new JTextField(10); 

		JButton send = new JButton("Send");

		JButton reset = new JButton("Reset");

		panel.add(label); // Components Added using Flow Layout

		panel.add(tf);

		panel.add(send);

		panel.add(reset);

		// Text Area at the Center

		JTextArea ta = new JTextArea();

		// Adding Components to the frame.

		frame.getContentPane().add(BorderLayout.SOUTH, panel);

//		frame.getContentPane().add(BorderLayout.NORTH, mb);

		frame.getContentPane().add(BorderLayout.CENTER, ta);

		frame.setVisible(true);

	}

	public static void main(String[] args) {
		new ClientSender().setVisible(false);
	}

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}


}
