package tichu;

public class Card {
	private String pattern;
	private String number;
	private int point;
	
	public Card(String pattern, String number, int point) {
		this.pattern = pattern;
		this.number = number;
		this.point = point;
	}
	public String getPattern(){
		return pattern;
	}
	public String getNumber() {
		return number;
	}

	public int getPoint(){
		return point;
	}
	
}