import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class ToolsPanel extends JPanel
{
	private Main	main;
	private String	Title;
	private Color	bgColor;
	private int		Width, Height;
	
	private JLabel	title;
	private JLabel	activeTool;
	
	private JButton	toolsButton[]	=new JButton[20];
	private int		ctoolsButton	=0;
	
	public ToolsPanel(String Title, Color bgColor, int Width, int Height, Main main)
	{
		super();
		
		this.main=main;
		this.Title=Title;
		this.bgColor=bgColor;
		this.Width=Width;
		this.Height=Height;
		
		this.setBackground(this.bgColor);
		this.setPreferredSize(new Dimension(this.Width, this.Height));
		
		title=new JLabel();
		title.setOpaque(true);
		title.setBackground(Color.white);
		title.setText(Title);
		title.setHorizontalAlignment(JLabel.CENTER);
		title.setPreferredSize(new Dimension(this.Width-2, 20));
		
		activeTool=new JLabel();
		activeTool.setOpaque(true);
		activeTool.setBackground(Color.green);
		activeTool.setText("select...");
		activeTool.setHorizontalAlignment(JLabel.CENTER);
		activeTool.setPreferredSize(new Dimension(this.Width-2, 20));
		
		this.setLayout(new FlowLayout());
		
		
		this.add(title);
		this.add(activeTool);
		
	}
	
	public void AddTools(String toolsName)
	{
		toolsButton[ctoolsButton]=new JButton();
		toolsButton[ctoolsButton].setText(toolsName);
		toolsButton[ctoolsButton].setPreferredSize(new Dimension(this.Width-14, 20));
		toolsButton[ctoolsButton].addActionListener(new ToolsClick());
		
		this.add(toolsButton[ctoolsButton]);
		ctoolsButton++;
	}
	
	private class ToolsClick implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e)
		{
			activeTool.setText(((JButton) e.getSource()).getText());
			main.ToolsPanelChange();
		}
	}
	
	public String getActiveTool()
	{
		return activeTool.getText();
	}
	
}
