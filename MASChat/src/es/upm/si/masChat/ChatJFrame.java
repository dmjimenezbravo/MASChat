package es.upm.si.masChat;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import jade.core.AID;
import jade.domain.AMSService;
import jade.domain.FIPAAgentManagement.AMSAgentDescription;
import jade.domain.FIPAAgentManagement.SearchConstraints;
import jade.lang.acl.ACLMessage;

import javax.swing.JTextArea;
import javax.swing.JEditorPane;
import javax.swing.JButton;
import javax.swing.JSeparator;

public class ChatJFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChatJFrame frame = new ChatJFrame(null);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ChatJFrame(UserAgent userAgent) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 538);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.SOUTH);
		panel.setLayout(new BorderLayout(0, 0));
		
		JEditorPane messageArea = new JEditorPane();
		panel.add(messageArea);
		
		JButton btnNewSend = new JButton("Send");
		btnNewSend.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					AMSAgentDescription [] agents = null;
				    try {
				        SearchConstraints c = new SearchConstraints();
				        c.setMaxResults(new Long(-1));
				        agents = AMSService.search(userAgent, new AMSAgentDescription(), c);
				    }
				    catch (Exception ex) {
				    	ex.printStackTrace();
				    }
					
					ACLMessage msg = new ACLMessage(ACLMessage.INFORM);
					for(int i = 0; i<agents.length; i++) {
						if(agents[i].getName().getLocalName().startsWith("UserAgent") && !agents[i].getName().getLocalName().equals(userAgent.getLocalName())) {
							msg.addReceiver(new AID(agents[i].getName().getLocalName(), AID.ISLOCALNAME));
						}
					}
					msg.setContent(messageArea.getText());
					userAgent.send(msg);
					
					addMessage(messageArea.getText());
					messageArea.setText("");
				}
				catch (Exception ex) {
					System.out.println(ex.getMessage());
				}
				
			}
		});
		panel.add(btnNewSend, BorderLayout.EAST);
		
		JSeparator separator = new JSeparator();
		panel.add(separator, BorderLayout.NORTH);
		
		JTextArea conversationArea = new JTextArea();
		contentPane.add(conversationArea, BorderLayout.CENTER);
	}
	
	public void addMessage(String message) {
		JTextArea conversationArea = null;
		boolean finded = false;
		for(int i = 0; i<this.contentPane.getComponentCount() && !finded; i++) {
			if(this.contentPane.getComponent(i) instanceof JTextArea) {
				conversationArea = (JTextArea) this.contentPane.getComponent(i);
				finded = true;
			}
		}
		if(finded) {
			conversationArea.append("My message:\n" + message + "\n");
			this.contentPane.add(conversationArea, BorderLayout.CENTER);
			this.revalidate();
			this.repaint();
		}
	}
	
	public void addRecievedMessage(String message) {
		JTextArea conversationArea = null;
		boolean finded = false;
		for(int i = 0; i<this.contentPane.getComponentCount() && !finded; i++) {
			if(this.contentPane.getComponent(i) instanceof JTextArea) {
				conversationArea = (JTextArea) this.contentPane.getComponent(i);
				finded = true;
			}
		}
		if(finded) {
			conversationArea.append("Recieved message:\n" + message + "\n");
			this.contentPane.add(conversationArea, BorderLayout.CENTER);
			this.revalidate();
			this.repaint();
		}
	}

}
