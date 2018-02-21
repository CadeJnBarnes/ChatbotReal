package chat.model;

import chat.controller.ChatbotController;

import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.Twitter;
import twitter4j.Status;

public class CTECTwitter
{
	private ChatbotController appController;
	private Twitter chabotTwitter;
	
	public CTECTwitter(ChatbotController appController)
	{
		this.appController = appController;
		this.chatbotTwitter = TwitterFacotry.getSingleton();
	}
	
	public void sendTweet(String textToTweet)
	{
		
	}
}
