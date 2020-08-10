package tichu;

public class Team {
	public Player player1;
	public Player player2;
	private int teamscore;
	
	public Team(Player player1, Player player2) {
		this.player1 = player1;
		this.player2 = player2;
		this.teamscore = 0;
	}
	
	public int getTeamScore() {
		return teamscore;
	}
	
	public void setTeamScore(int score) {
		this.teamscore = score;
	}
}
