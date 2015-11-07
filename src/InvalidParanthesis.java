import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

/* Go through with a stack front to back and back to front. 
 * Check the entire string to make sure the necessary pair isn't there*/
public class InvalidParanthesis {
	static Stack<Character> store = new Stack<>();
	static HashMap<Character, Integer> indexedLetters = new HashMap<>();
	static String word = "";
	static List<String> listofStrings=new ArrayList<>();
	
	public static void forwardStack(String s) {
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(') {
				store.push(s.charAt(i));
				// word=word+s.charAt(i);
			}

			if (s.charAt(i) != '(' && s.charAt(i) != ')') {
				indexedLetters.put(s.charAt(i), i);
				// word = word + s.charAt(i);
				// store.push(s.charAt(i));
			}

			if (s.charAt(i) == ')') {
				if (store.contains('(')) {
					word = word + store.pop();
					// System.out.println("before adding charAt" + word);
					word = word + s.charAt(i);
				}
			}
			
		}
		
		
		// The case of "("
		if (word.length() == 1) {
			word = "";
			listofStrings.add(word);
		}
		System.out.println(word);
		word=addindexedStrings(word, indexedLetters);
		
		listofStrings.add(word);
		System.out.println(listofStrings.toString());
	}
	
	
	public static String addindexedStrings(String s, HashMap<Character, Integer> map) {
		// System.out.println(map.toString());
		String initial=s;
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {	
			char key = entry.getKey();
			int value = entry.getValue();
			String start = s.substring(0, value);
			String end = s.substring(value, s.length());
			s = start + key + end;
			
			//.out.println("start is :" + start);
			 //System.out.println("end is :" + end);
			 //System.out.println(s);
			return s;
		}
		return initial;
	}

	public static void main(String[] args) {
		String example = "(a)())()";
		// String example=")(";
		 //String example="()())()";
		forwardStack(example);
		//reverseStack(example);

	}
}
