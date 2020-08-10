package tichu;

public class GameManager {
	private Game game = new Game();
	
	public void run() {
		int finishScore = Visualiser.inputFinishScore();
		game.setFinishScore(finishScore);
		game.play();
	}
}
