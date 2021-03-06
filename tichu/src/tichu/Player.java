package tichu;
import java.util.ArrayList;
import java.util.Collections;

public class Player {
	private String name;
	private ArrayList<Card> hand;
	private ArrayList<Card> obtained;
	private boolean largeTichu;
	private boolean smallTichu;
	private boolean out;
	
	public Player(String name) {
		this.name = name;
		this.hand = new ArrayList<>();
		this.obtained = new ArrayList<>();
		this.largeTichu = false;
		this.smallTichu = false;
		this.out = false;
	}
	public String getName() {
		return name;
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
	
	public void receiveCard(ArrayList<Card> cards) { //received from dealer
		hand.addAll(cards);
	}
	
	public void getCard(ArrayList<Card> cards) { //get from the turn which I win
		obtained.addAll(cards);
	}
	
	public void removeCards(ArrayList<Card> cards) {
		hand.removeAll(cards);
	}
	public void removeAllCard(ArrayList<Card> cards) {
		cards.clear();
	}
	
	public ArrayList<Card> selectCard(ArrayList<Integer> cards) {
		ArrayList<Card> cardlist = new ArrayList<>();
		for(int card : cards) {
			cardlist.add(hand.get(card));
			}
		return cardlist;
	}
	public void changeCard(Player player, int select) {
		ArrayList<Card> cardlist = new ArrayList<>();
		cardlist.add(hand.get(select));
		player.getCard(cardlist);
		this.removeCards(cardlist);
	}
	
	public void sortcard_bynumber() {
		Collections.sort(hand,new Numbercomp());
		
	}
	
	public void sortcard_bypattern() {
		Collections.sort(hand,new Patterncomp());
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

