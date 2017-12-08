package chat.view;

import chat.controller.ChatbotController;
import javax.swing.JFrame;

public class ChatFrame extends JFrame
{
	private ChatbotController appController;
	private ChatPanel appPanel;
	
	public ChatFrame(ChatbotController appController)
	{
		super();
		this.appController = appController;	
		appPanel = new ChatPanel(appController);
	
		setupFrame();
	}
	/**
	 * This method shows me how to create a frame and what I need to have inside the method.
	 */
	private void setupFrame()
	{
		this.setSize(500,500);
		this.setTitle("Chatbot 2017");
		this.setContentPane(appPanel);
		this.setResizable(false);
		this.setVisible(true);
	}
}
