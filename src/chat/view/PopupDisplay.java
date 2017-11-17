package chat.view;

import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class PopupDisplay
{
/**
 * These lines are what make the chatbot respond to anything the user says or asks.
 * this is the popup display class so this is the gateway of communication.
 */
	private ImageIcon icon;
	private String windowTitle;
	
	public PopupDisplay()
	{
		icon = new ImageIcon(getClass().getResource("images/chatbotimage.png"));
		windowTitle = "Chatbot says";
	}
	
	public void displayText(String message)
	{
		JOptionPane.showMessageDialog(null,  message, windowTitle, JOptionPane.INFORMATION_MESSAGE, icon);
		
	}
	
	public String collectResponse(String question)
	{
		String answer = "";
		
		answer += JOptionPane.showInputDialog(null, question, windowTitle, JOptionPane.PLAIN_MESSAGE, icon, null, "");
		
		return answer;
	}
}
