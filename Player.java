import java.util.ArrayList;
public class Player {
	private ArrayList<Card> hand;
	private ArrayList<Card> obtained;
	private boolean largeTichu;
	private boolean smallTichu;
	private boolean out;
	
	public Player() {
		this.hand = new ArrayList<>();
		this.obtained = new ArrayList<>();
		this.largeTichu = false;
		this.smallTichu = false;
		this.out = false;
	}
		
	public boolean isLargeT(){
		return largeTichu;
	}
	
	public void setLargeT(boolean set) {
		this.largeTichu = set;
	}
	
	public boolean isSmallT(){
		return smallTichu;
	}
	
	public void setSmallT(boolean set) {
		this.smallTichu = set;
	}
	
	public boolean isOut(){
		return out;
	}
	
	public void setOut(boolean set) {
		this.out = set;
	}
	
	public ArrayList<Card> getHand(){
		return hand;
	}
	
	public ArrayList<Card> getObtained(){
		return obtained;
	}
	
	public void receiveCard(Card card) { //received from dealer
		hand.add(card);
	}
	
	public void getCard(Card card) { //get from the turn which I win
		obtained.add(card);
	}
	
	public void removeCard(Card card) {
		if(hand.contains(card)) {
			hand.remove(card);
		}
		else {
			System.out.println("There is no such card.");
		}
	}
	
	public int numOfCard() {
		return hand.size();
	}
	
	public int getScore() {
		int score = 0;
		for (Card card : obtained){
			score += card.getPoint();
		}
		return score;
	}
}
