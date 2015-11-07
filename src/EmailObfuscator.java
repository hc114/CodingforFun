import java.util.ArrayList;
import java.util.LinkedList;
import java.util.regex.Pattern;

public class EmailObfuscator {

	public static String obfuscate(String email) {
		LinkedList<String> emailList = new LinkedList<>();
		
//Attack the dots		
		String[] chunks = email.split(Pattern.quote("."));
		String[] atChunks=null;
		int dotCounter=chunks.length-1;
		
		for (int i = 0; i < chunks.length; i++) {
			emailList.addLast(chunks[i]);
			if(dotCounter!=0){
			emailList.addLast("[.]");
			dotCounter--;
			}
		}
//Attack the @
		for(int j=0; j<emailList.size(); j++){
			if(emailList.get(j).contains("@")){
				atChunks = emailList.get(j).split(Pattern.quote("@"));
				emailList.remove(j);
				emailList.add(j, atChunks[0]);
				emailList.add(j+1,"[at]");
				emailList.add(j+2,atChunks[1]);
			}
		}
		
		System.out.println(toString(emailList));
		return toString(emailList);
		
	}
	
	public static String toString(LinkedList l){
		String result="";
		for(int i=0; i<l.size(); i++){
			result=result+l.get(i)+" ";
		}
		return result;
	}

/*	public static void main(String[] args) {
		obfuscate("hojeannie.chung@duke.edu");
	}*/
}