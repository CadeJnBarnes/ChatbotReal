package chat.view;

import chat.controller.ChatbotController;
import javax.swing.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
 * The JPanel subclass for the chatbot project.
 * @author cade.barnes
 * @version 21/11/17 1.2
 */
public class ChatPanel extends JPanel
{
	private ChatbotController appController;
	private JButton chatButton;
	private JButton searchButton;
	private JButton loadButton;
	private JButton tweetButton;
	private JButton saveButton;
	private JTextField inputField;
	private JTextArea chatArea;
	private SpringLayout appLayout;
	private JButton checkerButton;
	private JLabel infoLabel;
	private JScrollPane chatScrollPane;

	public ChatPanel(ChatbotController appController)
	{
		super();
		this.appController = appController;

		// Initialize GUI data members
		chatButton = new JButton("chat", new ImageIcon(getClass().getResource("/chat/view/images/chatbotimage.png")));
		loadButton = new JButton("load", new ImageIcon(getClass().getResource("/chat/view/images/RealLoadImage.png")));
		saveButton = new JButton("save", new ImageIcon(getClass().getResource("/chat/view/images/SaveImage.png")));
		tweetButton = new JButton("tweet", new ImageIcon(getClass().getResource("/chat/view/images/TweetImage.png")));
		searchButton = new JButton("search", new ImageIcon(getClass().getResource("/chat/view/images/SearchImage.png")));
		chatArea = new JTextArea(10, 15);
		inputField = new JTextField(20);
		appLayout = new SpringLayout();
		chatScrollPane = new JScrollPane();

		infoLabel = new JLabel("Type to chat with the chatbot");
		checkerButton = new JButton("check");
		appLayout.putConstraint(SpringLayout.SOUTH, chatButton, -6, SpringLayout.NORTH, checkerButton);
		appLayout.putConstraint(SpringLayout.EAST, chatButton, 0, SpringLayout.EAST, checkerButton);
		appLayout.putConstraint(SpringLayout.SOUTH, checkerButton, 0, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.EAST, checkerButton, -25, SpringLayout.EAST, this);

		setupPanel();
		setupLayout();
		setupListeners();
		setupScrollPane();

	}

	private void setupScrollPane()
	{
		chatScrollPane.setViewportView(chatArea);
		chatScrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		chatScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);

		appLayout.putConstraint(SpringLayout.NORTH, inputField, 16, SpringLayout.SOUTH, chatScrollPane);
		appLayout.putConstraint(SpringLayout.WEST, inputField, 0, SpringLayout.WEST, chatScrollPane);
		appLayout.putConstraint(SpringLayout.NORTH, chatButton, 12, SpringLayout.SOUTH, chatScrollPane);
	}

	private void setupPanel()
	{

		this.setBackground(Color.CYAN);
		this.setLayout(appLayout);
		this.add(chatButton);
		this.add(loadButton);
		this.add(searchButton);
		this.add(tweetButton);
		this.add(saveButton);
		this.add(checkerButton);
		this.add(inputField);
		this.add(chatScrollPane);
		chatArea.setEnabled(false);
		chatArea.setEditable(false);

	}

	/**
	 * Here the code in setup layout is used to arrange the spots of the chatbot in the popup
	 * window.
	 */
	private void setupLayout()
	{
		appLayout.putConstraint(SpringLayout.NORTH, chatScrollPane, 20, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.WEST, chatScrollPane, 25, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.EAST, chatScrollPane, -25, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.WEST, saveButton, 0, SpringLayout.WEST, searchButton);
		appLayout.putConstraint(SpringLayout.SOUTH, saveButton, -6, SpringLayout.NORTH, searchButton);
		appLayout.putConstraint(SpringLayout.WEST, tweetButton, 0, SpringLayout.WEST, loadButton);
		appLayout.putConstraint(SpringLayout.SOUTH, tweetButton, -6, SpringLayout.NORTH, loadButton);
		appLayout.putConstraint(SpringLayout.NORTH, searchButton, 0, SpringLayout.NORTH, loadButton);
		appLayout.putConstraint(SpringLayout.WEST, searchButton, 6, SpringLayout.EAST, loadButton);
		appLayout.putConstraint(SpringLayout.WEST, loadButton, 10, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.SOUTH, loadButton, -10, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.WEST, chatButton, 357, SpringLayout.WEST, this);

	}

	private void setupListeners()
	{
		chatButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				String userText = inputField.getText();
				String displayText = appController.interactWithChatbot(userText);
				chatArea.append(displayText);
				inputField.setText("");
			}
		});

		checkerButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				String userText = inputField.getText();
				String displayText = appController.useCheckers(userText);
				chatArea.append(displayText);
				inputField.setText("");
			}
		});

		tweetButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{

			}
		});
		searchButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{

			}
		});
		saveButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{

			}
		});
		loadButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{

			}
		});
	}

}
