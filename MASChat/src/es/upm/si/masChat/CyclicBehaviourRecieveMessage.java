package es.upm.si.masChat;

import jade.core.behaviours.CyclicBehaviour;
import jade.lang.acl.ACLMessage;
import jade.lang.acl.MessageTemplate;

public class CyclicBehaviourRecieveMessage extends CyclicBehaviour{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

		public void action() {
			try {
				ACLMessage msg = this.myAgent.receive(MessageTemplate.MatchPerformative(ACLMessage.INFORM));
				
				if(msg != null) {
					((UserAgent) this.myAgent).getChatJFrame().addRecievedMessage(msg.getContent());
				}else {
					this.block(); 
				}		
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		}
}
