package tichu;

import java.util.Scanner;

public class Round{
    private Player[] players;
    private int first_player;
    private int[] ranking;
    private CardDeck card_on_field;
    private CardDeck latestCard;

    public Round(Player[] players, int first_player){
        this.players = players;
        this.first_player = first_player;
    }

    public void initialize(Round round){
        CardDeck deck = new CardDeck();
        Scanner sc = new Scanner(System.in);

        for (Player player : players){
            player.receiveCard(deck.draw_n_cards(8));


            //visualizer.showhand();?
            boolean LargeTichuStated = false;

            while (!LargeTichuStated){
                System.out.println("Will you state Large Tichu? <Y/N>\n");
                String isLargeTichu = sc.nextLine();
                if (isLargeTichu.equals("Y") || isLargeTichu.equals("y")){
                    player.setLargeT(true);
                    LargeTichuStated = true;
                }
                else if (isLargeTichu.equals("N") || isLargeTichu.equals("n")){
                    player.setLargeT((false));
                    LargeTichuStated = true;
                }
                else {
                    System.out.println("wrong input\n");
                }
            }




        }
    }


}