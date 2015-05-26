package lab209.adam.second;

import java.awt.*;

import javax.swing.*;

@SuppressWarnings("serial")
public class MyLabels extends JPanel {

	public MyLabels() {
		
		this.setPreferredSize(new Dimension(200, 100));
		this.setBorder(BorderFactory.createEtchedBorder());
		this.setToolTipText("I have no idea what I'm doing.");
		JLabel label1 = new JLabel("One");
		JLabel label2 = new JLabel("Two");
		JLabel label3 = new JLabel("Three");
		label2.setToolTipText("Blerg");
		add(label1);
		add(label2);
		add(label3);

	}
	
	public static void main(String[] args) {
		JFrame f = new JFrame("What the hell?");
		f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		f.setLayout(new FlowLayout());
		f.add(new MyLabels());
		f.add(new MyLabels());
		f.add(new MyLabels());
		f.pack();
		f.setVisible(true);
		
	}

}
