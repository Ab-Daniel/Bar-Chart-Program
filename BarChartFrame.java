import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BarChartFrame extends JComponent
{
	
	public BarChartFrame()
	{
		
		controlPanel = new JPanel();
		barButton = makeButton("Draw");
		JLabel heightLabel = new JLabel("Bar Height = ");
		heightField = new JTextField(5);
		
		controlPanel.add(heightLabel);
		controlPanel.add(heightField);
		controlPanel.add(barButton);
		add(controlPanel, BorderLayout.NORTH);
	
	}
	
	
	
	
	public void paintComponent(Graphics g)
	{
		
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D)g;
		
	}
	
	public JButton makeButton(String name)
	{
		
		JButton button = new JButton(name);
		
		class BarButtonListener implements ActionListener
		{
			
			public void actionPerformed(ActionEvent event)
			{
				int n = 5; 
				System.out.println(":P");
				double height = Double.parseDouble(heightField.getText());
				if(height > getHeight() - controlPanel.getHeight() - 5)
				{
					bar = new Rectangle2D.Double(n, getHeight() - controlPanel.getHeight() - 5, 25, getHeight() - controlPanel.getHeight() - 5);
				}
				
				if(height < getHeight() - controlPanel.getHeight() - 5)
				{
					bar = new Rectangle2D.Double(n, height - 5, 25, height);
				}
				
				n=n + 30; 
				
				repaint();
				
			}
			
		}
		
		ActionListener listener = new BarButtonListener();
		button.addActionListener(listener);
		return button;
		
	}
		
		
	
	
	private JButton barButton;
	private JPanel controlPanel;
	//private JPanel displayPanel;
	private Rectangle2D bar;
	private JTextField heightField;
	
}
