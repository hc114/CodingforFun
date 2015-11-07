import java.util.Stack;
import java.util.regex.Pattern;

public class ReverseString {
	static String reverse(char[] c){
		String start="";
		String Result = "";
		Stack<String> sentences = new Stack<>();
		for (int j=0; j<c.length; j++){
			start=start+j;
		}
		System.out.println(start);
		String[] words = start.split(" ");
		for(int i=0; i<words.length; i++){
			sentences.push(words[i]);
		}

	return Result;	
	}
	
	public static void main(String[] args){
		String example = "Perfect makes Practice";
		char[] exam = new char[250];
		String answer = reverse(exam);
		System.out.println(answer);
		
	}

}
