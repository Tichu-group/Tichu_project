import java.util.Stack;
import java.util.Collections;

public class CardDeck {
	private Stack<Card> cards;
	private static String[] PATTERNS = {"spade","heart","diamond","club"};
	private static int CARD_NUM = 13;
	
	public CardDeck() {
		this.cards = this.generateCards();
		Collections.shuffle(this.cards);
	}
	
	private Stack<Card> generateCards(){
		Stack<Card> cards = new Stack<>();
		
		for(String pattern : PATTERNS) {
			for(int i=1; i<=CARD_NUM; i++) {
				Card card = new Card(pattern,String.valueOf(i));
				cards.push(card);
			}
		}
		cards.push(new Card("dragon","dragon"));
		cards.push(new Card("phoenix","phoenix"));
		cards.push(new Card("dog","dog"));
		cards.push(new Card("bird","bird"));
		return cards;
	}
	
	public Stack<Card> getCards(){
		return this.cards;
	}
	
	public Card drawCard() {
		return this.cards.pop();
	}

}
