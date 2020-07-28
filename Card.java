
public class Card {
	private String pattern;
	private String number;
	
	public Card(String pattern, String number) {
		this.pattern = pattern;
		this.number = number;
	}
	public String getPattern(){
		return pattern;
	}
	public void setPattern(String pattern) {
		this.pattern = pattern;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
}
