package chat.controller;

import chat.model.Chatbot;
import chat.view.PopupDisplay;
import chat.view.ChatFrame;

public class ChatbotController
{
	private Chatbot chatbot;
	private PopupDisplay display;
	private ChatFrame appFrame;
	
	public ChatbotController()
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
	
	public String useCheckers(String text)
	{
		String response = "";
		
		if(chatbot.contentChecker(text))
		{
			response += "This text matches the special content\n";
		}
		if(chatbot.cuteAnimalMemeChecker(text))
		{
			response += "";
		}
		if(chatbot.htmlTagChecker(text))
		{
			response += "";
		}
		if(chatbot.userNameChecker(text))
		{
			response += "";
		}
		if(chatbot.contentChecker(text))
		{
			response += "";
		}
		if(chatbot.shoppingListChecker(text))
		{
			response += "";
		}
		if(chatbot.movieTitleChecker(text))
		{
			response += "";
		}
		if(chatbot.movieGenreChecker(text))
		{
			response += "";
		}
		if(chatbot.keyboardMashChecker(text))
		{
			response += "";
		}
		
		//continue with all checkers except length and quit checker
		// tryC
		
		return response;
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
