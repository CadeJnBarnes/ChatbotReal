package chat.view;

import chat.controller.Controller;
import javax.swing.JFrame;

public class ChatFrame extends JFrame
{
	private Controller appController;
	
	public ChatFrame(Controller appController)
	{
		super();
		this.appController = appController;	
	
		setupFrame();
	}
	
	
	private void setupFrame()
	{
		this.setVisible(true);
	}
}
