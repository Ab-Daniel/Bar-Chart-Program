import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class BarChartFrame extends JFrame 
{
	private static final long serialVersionUID = 1L;
	public BarChartFrame()
	{
		final BarChartPanel panel = new BarChartPanel();
		
		JPanel buttonP = new JPanel();
		buttonP.setLayout(new GridLayout(1, 3));
		buttonP.add(new JLabel("Bar height = ", SwingConstants.RIGHT));
		final JTextField height = new JTextField(15);
		height.setEditable(true);
		buttonP.add(height);
		
		JButton button = new JButton("Add Bar");
		class Listener implements ActionListener
		{  
			public void actionPerformed(ActionEvent event)
			{  
				String s = height.getText();
				int i = Integer.parseInt(s);
				double v = 0;
				if(i>0)
				{
					v = Integer.parseInt(s);
					panel.newBar(v);
				}
				else 
					JOptionPane.showMessageDialog(null, "The values entered are not valid");
				height.setText("");
			}
		}	
		ActionListener listener = new Listener();
		button.addActionListener(listener);
		buttonP.add(button);
		getContentPane().add(buttonP, BorderLayout.NORTH);
		
		getContentPane().add(panel, BorderLayout.CENTER);
		setTitle("Barchart");
		pack();
		setSize(600, 600);
	}
}
