import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class BullsandCows {
	static String getHint(String secret, String guess) {
		HashMap<Character, Integer> secretMap = new HashMap<>();
		HashMap<Character,Integer> guessMap=new HashMap<>();
		// put the secret/guess into a integer/index  map
		// Count the number of bulls
		int bulls = 0;
		int cows = 0;

		for (int i = 0; i < secret.length(); i++) {
			secretMap.put(secret.charAt(i), i);
			guessMap.put(guess.charAt(i),i);
		}
		
		Iterator sIterator=secretMap.entrySet().iterator();
		Iterator gIterator=guessMap.entrySet().iterator();
		while(sIterator.hasNext()){
			Map.Entry<Character, Integer> sPair = (Map.Entry)sIterator.next();
			Map.Entry<Character, Integer> gPair = (Map.Entry)gIterator.next();
			if(sPair.getKey()==gPair.getKey()){
				if(sPair.getValue()==gPair.getValue()){
					bulls++;
				}else{
					cows++;
				}
				secretMap.remove(sPair);
				guessMap.remove(gPair);
			}
			System.out.println(secretMap.toString());
			System.out.println(guessMap.toString());
		}

		System.out.println(secretMap.toString());
		String statement=Integer.valueOf(bulls)+"A"+Integer.valueOf(cows)+"B";
		return statement;
	}

	public static void main(String[] args) {
		String secret = "11";
		String guess= "01";
		String result = getHint(secret,guess);
		System.out.println(result);
	}
}
