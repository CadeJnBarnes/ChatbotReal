package chat.view;

import chat.controller.Controller;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SpringLayout;


public class ChatPanel extends JPanel
{
	private Controller appController;
	private JButton chatButton;
	private JTextField inputField;
	private JTextArea chatArea;
	private SpringLayout baseLayout;
	
	public ChatPanel(Controller appController)
	{
		super();
		this.appController = appController;
		
		setupPanel();
		setupLayout();
		setupListeners();
		
	}
	private void setupPanel()
	{
		
	}
	
	private void setupLayout()
	{
		
	}
	
	private void setupListeners()
	{
		
	}
	
	
}
