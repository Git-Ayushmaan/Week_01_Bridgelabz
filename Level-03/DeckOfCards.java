public class DeckOfCards {
    private static final String[] SUITS = {"Hearts", "Diamonds", "Clubs", "Spades"};
    private static final String[] RANKS = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

    public static String[] createDeck() {
        String[] deck = new String[SUITS.length * RANKS.length];
        int index = 0;
        for (String suit : SUITS) {
            for (String rank : RANKS) {
                deck[index++] = rank + " of " + suit;
            }
        }
        return deck;
    }

    public static void shuffleDeck(String[] deck) {
        for (int i = 0; i < deck.length; i++) {
            int randomCardNumber = i + (int) (Math.random() * (deck.length - i));
            String temp = deck[i];
            deck[i] = deck[randomCardNumber];
            deck[randomCardNumber] = temp;
        }
    }

    public static String[][] distributeCards(String[] deck, int numOfCards, int numOfPlayers) {
        if (numOfPlayers * numOfCards > deck.length) {
            throw new IllegalArgumentException("Not enough cards in the deck to distribute.");
        }
        String[][] players = new String[numOfPlayers][numOfCards];
        int cardIndex = 0;
        for (int i = 0; i < numOfPlayers; i++) {
            for (int j = 0; j < numOfCards; j++) {
                players[i][j] = deck[cardIndex++];
            }
        }
        return players;
    }

    public static void printPlayersCards(String[][] players) {
        for (int i = 0; i < players.length; i++) {
            System.out.println("Player " + (i + 1) + "'s cards: ");
            for (String card : players[i]) {
                System.out.println(card);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        String[] deck = createDeck();
        shuffleDeck(deck);
        int numOfCards = 5;
        int numOfPlayers = 4;
        String[][] players = distributeCards(deck, numOfCards, numOfPlayers);
        printPlayersCards(players);
    }
}
