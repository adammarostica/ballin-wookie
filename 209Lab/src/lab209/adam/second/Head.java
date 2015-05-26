package lab209.adam.second;

import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import java.io.*;

import javax.imageio.ImageIO;
import javax.swing.*;

@SuppressWarnings("serial")
public class Head extends JPanel {

	private Image backgroundImage;
	private Image hatImage;
	private boolean hatBoolean = false;
	private boolean mouseInside = false;
	
	public Head() throws IOException {
		
		this.setPreferredSize(new Dimension(1280, 800));
		//set the images
		backgroundImage = ImageIO.read(new File("meadow.jpg"));
		hatImage = ImageIO.read(new File("hat.png"));
	}
	
	public void paintComponent(Graphics g) {
		
		//standard setup
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON);
		
		//draw the background
		g2.drawImage(backgroundImage, 0, 0, this);
		
		//draw the head shape
		Color skinColor = new Color(211, 164, 147);
		g2.setPaint(Color.BLACK);
		g2.setStroke(new BasicStroke(15));
		g2.drawOval(400, 300, 400, 450);
		g2.drawOval(375, 475, 50, 100);
		g2.drawOval(775, 475, 50, 100);
		g2.setPaint(skinColor);
		g2.fillOval(375, 475, 50, 100);
		g2.fillOval(775, 475, 50, 100);
		g2.fillOval(400, 300, 400, 450);
		
		//draw the eyes open or closed depending on the mouse position
		if (mouseInside) {
			g2.setPaint(Color.BLACK);
			g2.setStroke(new BasicStroke(6));
			g2.drawOval(475, 475, 85, 50);
			g2.drawOval(625, 475, 85, 50);
			g2.setPaint(Color.WHITE);
			g2.fillOval(475, 475, 85, 50);
			g2.fillOval(625, 475, 85, 50);
			Color eyeColor = new Color(31, 159, 64);
			g2.setPaint(eyeColor);
			g2.fillOval(496, 477, 45, 45);
			g2.fillOval(645, 477, 45, 45);
			g2.setPaint(Color.BLACK);
			g2.fillOval(509, 489, 20, 20);
			g2.fillOval(658, 489, 20, 20);
			g2.setPaint(Color.WHITE);
			g2.fillOval(509, 489, 6, 6);
			g2.fillOval(658, 489, 6, 6);
		}
		else {
			g2.setPaint(Color.BLACK);
			g2.setStroke(new BasicStroke(2));
			QuadCurve2D shutLeftEye = new QuadCurve2D.Float();
			QuadCurve2D shutRightEye = new QuadCurve2D.Float();
			shutLeftEye.setCurve(475, 505, 517.5, 545, 560, 505);
			shutRightEye.setCurve(625, 505, 667.5, 545, 710, 505);
			g2.draw(shutLeftEye);
			g2.draw(shutRightEye);
		}
		
		
		//draw the nose
	    g2.setPaint(Color.BLACK);
	    g2.setStroke(new BasicStroke(5));
	    QuadCurve2D nose = new QuadCurve2D.Float();
	    nose.setCurve(550, 550, 592, 500, 634, 550);
	    g2.draw(nose);
	    g2.fillOval(565, 544, 12, 12);
	    g2.fillOval(607, 544, 12, 12);
	    
	    //draw the mouth
	    QuadCurve2D mouth = new QuadCurve2D.Float();
	    QuadCurve2D mouthRight = new QuadCurve2D.Float();
	    mouth.setCurve(500, 625, 675, 650, 700, 600);
	    mouthRight.setCurve(685, 590, 705, 590, 705, 615);
	    g2.draw(mouth);
	    g2.draw(mouthRight);
	    
	    //draw a speech bubble, why not?
	    g2.setPaint(Color.WHITE);
	    g2.fillOval(900, 500, 300, 250);
	    GeneralPath gp = new GeneralPath();
	    gp.moveTo(915, 675);
	    gp.curveTo(915, 700, 850, 700, 800, 675);
	    gp.curveTo(850, 750, 950, 750, 960, 720);
	    gp.closePath();
	    g2.fill(gp);
	    JLabel hatLabel = new JLabel("Add a hat!");
	    hatLabel.setFont(new Font("Arial", Font.BOLD, 32));
	    hatLabel.setBounds(985, 610, 200, 40);
	    add(hatLabel);
	    
	    //draws the hat or not depending on the checkbox
	    if (hatBoolean) {
	    	g2.drawImage(hatImage, 275, 125, this);
	    }
	    
	    //create, set and add listener for checkbox
	    JCheckBox addHat = new JCheckBox("Check out my sweet hat, bro!");
		addHat.setBounds(950, 620, 20, 20);
		add(addHat);
						
		class MyItemListener implements ItemListener {
			
				public void itemStateChanged(ItemEvent ie) {
			
					if (ie.getStateChange() == ItemEvent.SELECTED) {
						hatBoolean = true;
						repaint();
					}
					else {
						hatBoolean = false;
						repaint();
					}
			}
		}
		
		addHat.addItemListener(new MyItemListener());
		
		class MyMouseListener implements MouseListener {
			
			public void mouseEntered(MouseEvent e) {
				mouseInside = true;
				repaint();
			}
			
			public void mouseExited(MouseEvent e) {
				mouseInside = false;
				repaint();
			}

			@Override
			public void mouseClicked(MouseEvent e) {}

			@Override
			public void mousePressed(MouseEvent e) {}

			@Override
			public void mouseReleased(MouseEvent e) {}
			
		}
		
		addMouseListener(new MyMouseListener());		
	}
	
	
	
	public static void main(String[] args) throws IOException {
		JFrame f = new JFrame("Does this hat make me look fancy?");
		f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		f.add(new Head());
		f.setResizable(false);
		f.pack();
		f.setVisible(true);
		
		
	}

}