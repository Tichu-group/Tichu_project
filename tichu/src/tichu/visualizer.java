package tichu;
import java.util.Scanner;
import java.util.ArrayList;

public class Visualizer {
	
	public void show_hand(Player player) {
		
		String pattern;
		String number;
		String name;
		ArrayList<Card> hand;
		
		name = player.getName();
		System.out.println(player.name + ":");
		
		hand = player.getHand();
		for (Card card:hand) {
			pattern = c.getPattern();
			number = c.getNumber();
			System.out.println(String.format("(%s, %s)", pattern, number));
		}
	}
	
	public void show_giving_card(Player giving_player, Player recevied_player, Card card) {
		String pattern;
		String number;
		String name1;
		String name2;
		
		pattern = card.getPattern();
		number = card.getNumber();
		name1 = giving_player.getName();
		name2 = giving_player.getName();
		
		System.out.println(String.format("%s gives (%s,%s) card to %s", name1, pattern, number, name2));
	}
	
	
	public void show_current_card(Round round) {
		ArrayList<Card> cards;
		
		cards = round.getlatestCard;
		for (Card card:hand) {
			pattern = card.getPattern();
			number = card.getNumber();
			System.out.print(String.format("(%s, %s)", pattern, number));
		}
		
	}
	
	public void show_point(Team Team1, Team Team2) {
		int Team1_score;
		int Team2_score;
		
		Team1_score = Team1.getTeamScore();
		Team2_score = Team2.getTeamScore();
		
		System.out.println(String.format("Team1: %s, Team2: %s", Team1_score, Team2_score));
	}
	
	public void update(Team team1, Team team2, Round round) {
		Player player1_1;
		Player player1_2;
		Player player2_1;
		Player player2_2;
		
		player1_1 = team1.player1;
		player1_2 = team1.player2;
		player2_1 = team2.player1;
		player2_2 = team2.player2;
		
		for(int i = 0; i<100; i++) {  //reset console?
			System.out.print("\n");
		}
		
		this.show_point(team1, team2);
		System.out.print("\n");
		
		this.show_hand(player1_1);
		System.out.print("\n");
		
		this.show_hand(player1_2);
		System.out.print("\n");
		
		this.show_hand(player2_1);
		System.out.print("\n");
		
		this.show_hand(player2_2);
		System.out.print("\n");
		
		this.show_current_card(round);
	}
	
}
