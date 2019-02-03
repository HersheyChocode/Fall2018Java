package w11day2;
import apcs.Window;
public class DeckOfCards {

	private int[] deck;
	public static final int NUMCARDS = 52;
	
	public DeckOfCards(){
		deck = new int[NUMCARDS];
		for(int x = 0; x<deck.length; x++) {
			deck[x] = x+1;
		}
	}
	public void writeDeck() {
		for(int x  = 0; x<deck.length; x++) {
			System.out.print(deck[x]+" ");
		}
		System.out.print("\n");
	}
	public void swap(int i, int j) {
		i-=1;
		j-=1;
		int x = deck[i];
		int y = deck[j];
		deck[i] = y;
		deck[j] = x;
	}
	public void shuffle() {
		int i;
		int j;
		for(int l = 0; l<NUMCARDS+1; l++) {
		i = Window.random(1, NUMCARDS);
		j = Window.random(1, NUMCARDS);
		swap(i,j);
		}
	}
}