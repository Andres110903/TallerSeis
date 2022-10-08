import java.util.ArrayList;
import java.util.Collections;

public class Deck {
	int i = 0;
	Card[] cardArray = new Card[52];
	Deck(){ //constructor
		int suits = 4;
		int cardType = 13;
		int cardCount = 0;
		
		ArrayList<Integer> list = new ArrayList<>();
		
		for(i = 1; i <= suits; ++i)
			for(int j = 1; j <= cardType; ++j){
				list.add(i);
				cardArray[cardCount] = new Card(i,j);
				cardCount++;
 }
		Collections.shuffle(list);
		System.out.println(list);
 }

public void print(){
for(int i = 0; i < cardArray.length; i++)
System.out.println(cardArray[i]);
}
}
