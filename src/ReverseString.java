import java.util.Stack;
import java.util.regex.Pattern;

public class ReverseString {
	static String reverse(char[] c){
		String start=new String(c);
		String[] words=start.split(" ");
		//testing what is in words
		String Result = "";
		Stack<String> sentences = new Stack<>();		
		for(int i=0; i<words.length; i++){
			sentences.push(words[i]);
		}
		
		for(int j=0; j<words.length; j++){
			Result=Result+sentences.pop()+" ";
		}
		
		
	return Result;	
	}
	
	public static void main(String[] args){
		String example = "Death to technical interviews";
		char[] exam = new char[example.length()];
		for(int i=0; i<example.length(); i++){
			exam[i]=example.charAt(i);
		}
		
		String answer = reverse(exam);
		System.out.println(answer);
	}

}
