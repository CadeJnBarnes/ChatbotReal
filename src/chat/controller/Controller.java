package chat.controller;

import chat.model.Chatbot;
import chat.view.PopupDisplay;

public class Controller
{
	private Chatbot chatbot;
	private PopupDisplay display;
	
	public Controller()
	{
		chatbot = new Chatbot("CadeBarnes");
		display = new PopupDisplay();
	}
	
	public void start()
	{
		String response = display.collectResponse("What do you want to talk about?");
		
		while (chatbot.lengthChecker(response) && !chatbot.quitChecker(response))
		{
			response = popupChat(response);
			response = display.collectResponse(response);
		}
	}
	
	public String interactWithChatbot(String input)
	{
		return null;
	}
	
	private String popupChat(String chat)
	{
		String chatbotSays = "";
		
		chatbotSays += chatbot.processConversation(chat);
		
		
		return chatbotSays;
	}
	
	
}
