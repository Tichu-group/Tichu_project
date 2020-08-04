package tichu;

import java.util.ArrayList;
import java.util.Scanner;

public class Round{
    private Player[] players;
    private int first_player;
    private int[] ranking;
    private CardDeck card_on_field;
    private CardDeck latestCard;

    public Round(Player[] players){
        this.players = players;
    }

    public void initialize(){
        System.out.println("Round Initialized\n");
        System.out.println("shuffling deck\n");
        CardDeck deck = new CardDeck();
        Scanner sc = new Scanner(System.in);

        //처음 8장을 드로우하고 라티를 선언한다
        //원래 플레이어별로 해야하는데 지금은 그냥 한명이 플레이하는 거니까 이렇게
        //내 생각엔 일단 이렇게 짜는데 라티 선언 부분을 플레이어로 넘겨야 할 것 같다
        for (Player player : players){
            System.out.println("draw 8 cards\n");
            player.receiveCard(deck.draw_n_cards(8));


            System.out.println(player.getHand()); //나중에 비주얼라이저로 대체..?
            //visualizer.showhand();?


            boolean LargeTichuStated = false;

            while (!LargeTichuStated){
                System.out.println("Will you state Large Tichu? <Y/N>\n");
                String isLargeTichu = sc.nextLine();
                if (isLargeTichu.equals("Y") || isLargeTichu.equals("y")){
                    System.out.println("You stated Large Tichu!\n");
                    player.setLargeT(true);
                    LargeTichuStated = true;
                }
                else if (isLargeTichu.equals("N") || isLargeTichu.equals("n")){
                    System.out.println("You didn't state Large Tichu!\n");
                    player.setLargeT((false));
                    LargeTichuStated = true;
                }
                else {
                    System.out.println("wrong input\n");
                }
            }
        }

        //6장 드로우하고 스티 선언! 이것도 멀티플레이어로 확장해야한다!
        //그러면 for문이 아니라 각자 플레이어에게 동시에 인풋을 받아서 먼가 while을 써서 제데로 된 인풋을 받을 때까지 기다려나하는 것 같은데 그걸 어케하지?

        for (Player player : players){
            System.out.println("draw 6 cards\n");
            player.receiveCard(deck.draw_n_cards(8));

            System.out.println(player.getHand()); //나중에 비주얼라이저로 대체..?
            //visualizer.showhand();?

            boolean SmallTichuStated = false;

            while (!SmallTichuStated){
                System.out.println("Will you state Small Tichu? <Y/N>\n");
                String isSmallTichu = sc.nextLine();
                if (isSmallTichu.equals("Y") || isSmallTichu.equals("y")){
                    System.out.println("You stated Small Tichu!\n");
                    player.setSmallT(true);
                    SmallTichuStated = true;
                }
                else if (isSmallTichu.equals("N") || isSmallTichu.equals("n")){
                    System.out.println("you didn't state Small Tichu\n");
                    player.setSmallT(false);
                    SmallTichuStated = true;
                }
                else {
                    System.out.println("wrong input\n");
                }
            }
        }

        //짹을 찾아서 선 설정
        boolean found_bird = false;
        for (int i = 0; i < 4; i++){
            ArrayList<Card> hand = players[i].getHand();
            for (Card card: hand){
                if (card.getPattern().equals("bird")){
                    first_player = i;
                    found_bird = true;
                }
            }

            if (found_bird){ break; }
        }

        sc.close();
    }

    public void exchangeCard(){
        //요기도 위에랑 마찬가지.. 일단 for문으로 짤게!
        Scanner sc = new Scanner(System.in);

        for (Player player : players){
            System.out.println("choose card for your team\n");
            System.out.println("type (pattern, number)"); //나중에는 그냥 패에서 몇번째에 있는지로 바꾸어도 될듯!

        }
    }


}