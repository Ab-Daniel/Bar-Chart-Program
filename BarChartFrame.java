import javax.swing.JFrame;
import javax.swing.JPanel;

public class BarChartFrame extends JFrame
{
	
	public BarChartFrame()
	{
		
		setSize(500,500);
		setTitle("Bar Chart Program");
		
		
		
		JPanel panel = new BarChartPanel();
		add(panel);
		
	}
	
	
	
	
	
	
}
