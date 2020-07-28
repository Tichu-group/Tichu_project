import java.util.ArrayList;
public class Player {
	private ArrayList<Card> cards;
	
	public Player() {
		this.cards = new ArrayList<>();
	}
	
	public void receiveCard(Card card) {
		cards.add(card);
	}
}
