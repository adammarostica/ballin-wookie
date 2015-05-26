package lab209.adam.second;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class MyButtons extends JPanel {

	public MyButtons() {
		
		this.setPreferredSize(new Dimension(250, 100));
		this.setToolTipText("Press me, homie!");
		JButton button1 = new JButton("Red");
		JButton button2 = new JButton("Green");
		JButton button3 = new JButton("Blue");
		add(button1);
		add(button2);
		add(button3);
	
	
		class MyActionListener implements ActionListener {
		
			public void actionPerformed(ActionEvent ae) {
				if (ae.getSource() == button1) setBackground(Color.RED);
				if (ae.getSource() == button2) setBackground(Color.GREEN);
				if (ae.getSource() == button3) setBackground(Color.BLUE);
			}
		}
		button1.addActionListener(new MyActionListener());
		button2.addActionListener(new MyActionListener());
		button3.addActionListener(new MyActionListener());
	}
	
	public static void main(String[] args) {
		JFrame f = new JFrame("Color Changing Frame");
		f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		f.setLayout(new GridLayout(2, 3));
		f.add(new MyButtons());
		f.add(new MyButtons());
		f.add(new MyButtons());
		f.add(new MyButtons());
		f.add(new MyButtons());
		f.add(new MyButtons());
		f.pack();
		f.setVisible(true);
		
	}
	
	

}
