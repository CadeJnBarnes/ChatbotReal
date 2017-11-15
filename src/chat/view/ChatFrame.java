package chat.view;

import chat.controller.Controller;
import javax.swing.JFrame;

public class ChatFrame extends JFrame
{
	private Controller appController;
	private ChatPanel appPanel;
	
	public ChatFrame(Controller appController)
	{
		super();
		this.appController = appController;	
		appPanel = new ChatPanel(appController);
	
		setupFrame();
	}
	private void setupFrame()
	{
		this.setSize(500,500);
		this.setTitle("Chatbot 2017");
		this.setContentPane(appPanel);
		this.setResizable(false);
		this.setVisible(true);
	}
}
