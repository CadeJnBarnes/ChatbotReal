package chat.controller;

import chat.model.Chatbot;
import chat.view.PopupDisplay;
import chat.view.ChatFrame;

public class Controller
{
	private Chatbot chatbot;
	private PopupDisplay display;
	private ChatFrame appFrame;
	
	public Controller()
	{
		chatbot = new Chatbot("CadeBarnes");
		//View initialized after Model
		display = new PopupDisplay();
		appFrame = new ChatFrame(this);
	}
	
	public void start()
	{
		display.displayText("Welcome to Chatbot");
	}
	
	public String interactWithChatbot(String input)
	{
		String chatbotSays = "";
		
		if(chatbot.quitChecker(input))
		{
			close();
		}
		
		chatbotSays += chatbot.processConversation(input);
		
		
		return chatbotSays;
	}
	
	private void close()
	{
		display.displayText("Goodbye");
		System.exit(0);
	}
	
	private String popupChat(String chat)
	{
		String chatbotSays = "";
		
		chatbotSays += chatbot.processConversation(chat);
		
		
		return chatbotSays;
	}
	
	
}
