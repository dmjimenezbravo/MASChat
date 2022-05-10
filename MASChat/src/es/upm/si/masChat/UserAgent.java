package es.upm.si.masChat;

import jade.content.lang.sl.SLCodec;
import jade.core.Agent;
import jade.domain.DFService;
import jade.domain.FIPAException;
import jade.domain.FIPAAgentManagement.DFAgentDescription;
import jade.domain.FIPAAgentManagement.ServiceDescription;

public class UserAgent extends Agent{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ChatJFrame chatJFrame;
	protected CyclicBehaviourRecieveMessage recieveMessageBehaviour;

	public UserAgent(){
		super();
		this.chatJFrame = new ChatJFrame(this);
		this.recieveMessageBehaviour = new CyclicBehaviourRecieveMessage();
	}
	
	protected void setup() {
		DFAgentDescription dfd = new DFAgentDescription();
		dfd.setName(getAID());
		ServiceDescription sd = new ServiceDescription();
		sd.setName("User communication");
		sd.setType("User communication");
		sd.addLanguages(new SLCodec().getName());
		dfd.addServices(sd);
		
		try {
			DFService.register(this, dfd);
		}
		catch(FIPAException e) {
			System.err.println("Agent " + this.getLocalName() + ": " + e.getMessage());
		}

		this.addBehaviour(this.getRecieveMessageBehaviour());

		this.getChatJFrame().setVisible(true);
	}

	public ChatJFrame getChatJFrame() {
		return chatJFrame;
	}

	public void setChatJFrame(ChatJFrame chatJFrame) {
		this.chatJFrame = chatJFrame;
	}

	public CyclicBehaviourRecieveMessage getRecieveMessageBehaviour() {
		return recieveMessageBehaviour;
	}

	public void setRecieveMessageBehaviour(CyclicBehaviourRecieveMessage recieveMessageBehaviour) {
		this.recieveMessageBehaviour = recieveMessageBehaviour;
	}
}
