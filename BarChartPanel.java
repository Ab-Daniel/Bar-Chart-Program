import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class BarChartPanel extends JPanel 
{
	private static final long serialVersionUID = 1L;
	public BarChartPanel()
	{
		chart = new BarChart();
		setSize(500, 500);
	}
	public void newBar(double value)
	{
		chart.add(value);
		repaint();
	}
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D)g;
		try
		{
			chart.draw(g2, getWidth(), getHeight());
		}
		catch(IndexOutOfBoundsException e){}
	}
	private BarChart chart;
}

