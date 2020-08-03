import java.util.Stack;
import java.util.Collections;

public class CardDeck {
	private Stack<Card> cards;
	private static String[] PATTERNS = {"spade","heart","diamond","club"};
	private static int CARD_NUM = 13;
	
	public CardDeck() {
		this.cards = this.generateCards();
		Collections.shuffle(cards);
	}
	
	private Stack<Card> generateCards(){
		Stack<Card> cards = new Stack<>();
		
		for(String pattern : PATTERNS) {
			for(int i=1; i<=CARD_NUM; i++) {
				Card card;
				if(i==5) {
					card = new Card(pattern,String.valueOf(i),5);
				}
				else if(i==10 || i==13) {
					card = new Card(pattern,String.valueOf(i),10);
				}
				else {
					card = new Card(pattern,String.valueOf(i),0);
				}
				cards.push(card);
			}
		}
		cards.push(new Card("dragon","dragon",25));
		cards.push(new Card("phoenix","phoenix",-25));
		cards.push(new Card("dog","dog",0));
		cards.push(new Card("bird","bird",0));
		return cards;
	}
	
	public Stack<Card> getCards(){
		return cards;
	}
	
	public Card drawCard() {
		return cards.pop();
	}

}
