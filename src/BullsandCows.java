import java.util.HashMap;

public class BullsandCows {
	static String getHint(String secret, String guess) {
		HashMap<Character, Integer> secretMap = new HashMap<>();
		// put the secret into a map
		for (int i = 0; i < secret.length(); i++) {
			secretMap.put(secret.charAt(i), i);
		}

		// Count the number of bulls and cows
		int bulls = 0;
		int cows = 0;

		for (int j = 0; j < guess.length(); j++) {
			if(secretMap.containsKey(guess.charAt(j))){
				if (j == secretMap.get(guess.charAt(j))) {
					secretMap.remove((guess.charAt(j)));
					bulls++;
				}else{
					cows++;
				}
			}	
		}
		System.out.println(secretMap.toString());
		String statement=Integer.valueOf(bulls)+"B"+Integer.valueOf(cows)+"C";
		return statement;
	}

	public static void main(String[] args) {
		String secret = "11";
		String guess= "10";
		String result = getHint(secret,guess);
		System.out.println(result);
	}
}
