import java.awt.BorderLayout;
import java.awt.geom.Line2D;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BarChartPanel extends JPanel
{
	
	public BarChartPanel()
	{
		
		JPanel controlPanel = new JPanel();
		JButton barButton = new JButton("Add Bar");
		JLabel heightLabel = new JLabel("Bar Height = ");
		controlPanel.add(heightLabel);
		controlPanel.add(heightField);
		controlPanel.add(barButton);
		add(controlPanel, BorderLayout.NORTH);
		
		JPanel displayPanel = new JPanel();
		add(displayPanel);
		
		bottom = new Line2D.Double(0, 5, getWidth(), 5);
		
		
		
	}
	
	
	private Line2D.Double bottom;
	
	final static JTextField heightField = new JTextField(5);
	
}
