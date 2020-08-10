package tichu;

public class Game {
	private Round round;
	private int team1_score;
	private int team2_score;
	int finishScore;
	
	public Game() {
		this.round = new Round();
		this.team1_score = 0;
		this.team2_score = 0;
	}
	
	public void setFinishScore(int finishScore) {
		this.finishScore = finishScore;
	}
	
	private boolean performOneRound() {
		this.round.initialize();
		this.round.exchangeCards();
		
		while(true) {
			if(this.round.performOneTrick())
				break;
		}
		this.team1_score += round.team1_score();
		this.team2_score += round.team2_score();
		
		if(this.team1_score >= this.finishScore || this.team2_score >= this.finishScore) {
			return true;
		} else {
			return false;
		}
	}
	
	public void play() {
		while(true) {
			if(this.performOneRound())
				break;
		}
	}
}
