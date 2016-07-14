import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class Main extends JFrame
{
	private Diagram		d;
	private ToolsPanel	panel;
	
	public Main()
	{
		super("gRecursion");
		setBounds(300, 50, 850, 750);
		setLayout(new FlowLayout());
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		setResizable(false);
		
		panel=new ToolsPanel("set Fractal", Color.gray, 100, 700, this);
		d=new Diagram(700, 700);
		
		panel.AddTools("Clear");
		panel.AddTools("F1");
		panel.AddTools("F2");
		panel.AddTools("F3");
		panel.AddTools("F4");
		panel.AddTools("F5");
		panel.AddTools("F6");
		panel.AddTools("F7");
		panel.AddTools("F8");
		panel.AddTools("F9");
		panel.AddTools("F10");
		panel.AddTools("F11");
		panel.AddTools("F12");
		panel.AddTools("F13");
		panel.AddTools("F14");
		panel.AddTools("F15");
		
		this.add(panel);
		this.add(d);
		
		setVisible(true);
	}
	
	
	public static void main(String[] args)
	{
		new Main();
	}
	
	public void ToolsPanelChange()
	{
		d.setTools(panel.getActiveTool());
		d.repaint();
	}
}