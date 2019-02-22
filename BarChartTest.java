import javax.swing.JFrame;

public class BarChartTest 
{
	
	public static void main(String[] args) 
	{
		
		JFrame frame = new JFrame();
		frame.setSize(500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Bar Chart Program");
		frame.setVisible(true);
		
		BarChartFrame p = new BarChartFrame();
		frame.add(p);
		
	}
	
}
