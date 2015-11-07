
public class Reverse {
	static String reverse ="";
	public static String reverse(String str){
		//Base case, are there anything else left to reverse
		if(str.length()==0){
			str="";
			//System.out.println(str);
			return str;
		}else{	
			reverse=reverse+str.charAt(str.length()-1);
			System.out.println(reverse);
			str=str.substring(0,str.length()-1);
			reverse(str);
		}
		
		return "";
	}
	public static void main(String[] args){
		String example = "Wasssuppppppp";
		String result = reverse(example);
		System.out.println(result);
	}
}
