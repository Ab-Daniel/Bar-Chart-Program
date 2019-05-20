import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;

public class BarChart 
{
	public BarChart()
	{
		data = new ArrayList<Double>();
	}
	public void add(double value)
	{
		data.add(value);
	}
	public void draw(Graphics2D g2, double width, double height)
	{
		int numBars = data.size();
		double bottomY = height - 5;
		g2.draw(new Line2D.Double(0, bottomY, width, bottomY));
		double barWidth = width / ((numBars * 2) + 1);
		
		double max = data.get(0);
		for(int i = 1; i < data.size(); i++)
			if(max < data.get(i))
				max = data.get(i);
		
		double maxbarheight = height - 10;
		double onehigh = maxbarheight / max;
		
		double x = barWidth;
		for(int i = 0; i < data.size(); i++)
		{
			double barHeight = data.get(i) * onehigh;
			double y = bottomY - barHeight;
			g2.draw(new Rectangle2D.Double(x, y, barWidth, barHeight));
			x += barWidth * 2;
		}
	}
	private ArrayList<Double> data;
}
