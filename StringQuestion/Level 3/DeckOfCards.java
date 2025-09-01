public class DeckOfCards {
    public static String[] createDeck() {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
        String[] deck = new String[suits.length * ranks.length];
        for(int i=0; i<suits.length; i++)
            for(int j=0; j<ranks.length; j++)
                deck[i*ranks.length+j] = ranks[j] + " of " + suits[i];
        return deck;
    }
    public static void shuffle(String[] deck) {
        for(int i=0; i<deck.length; i++) {
            int rand = i + (int)(Math.random() * (deck.length-i));
            String temp = deck[i];
            deck[i] = deck[rand];
            deck[rand] = temp;
        }
    }
    public static void deal(String[] deck, int players, int cards) {
        if (players*cards > deck.length) {
            System.out.println("Not enough cards!");
            return;
        }
        for(int i=0; i<players; i++) {
            System.out.print("Player " + (i+1) + ": ");
            for(int j=0; j<cards; j++)
                System.out.print(deck[i*cards + j] + ", ");
            System.out.println();
        }
    }
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int players = sc.nextInt(), cards = sc.nextInt();
        String[] deck = createDeck();
        shuffle(deck);
        deal(deck, players, cards);
    }
}
