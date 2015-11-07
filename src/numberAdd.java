import java.util.Stack;

public class numberAdd {
	//Split the number into digits
	public static void splitDigit(int Number){
		Stack<Integer> digits = new Stack<>();
		Integer sum;
		//Find the remainder
		while(Number>0){
			int Remainder = Number%10;
			Number=Number/10;
			digits.push(Remainder);
		}
		//Check
		System.out.println(digits.toString());
		sum=addDigits(digits);
		System.out.println(sum);
	}
	
	public static Integer addDigits(Stack d){
		Integer temp=0;
		while(!d.empty()){
			temp=temp+(Integer)d.pop();
			//temp=temp+Integer.parseInt(d.pop().toString());
		}
		
		if(temp>=10){
			splitDigit(temp);
		}else{
			return temp;
		}
		return 0;
	}
	
	
	public static void main(String[] args){
		int Number=1052024;
		splitDigit(Number);

	}

}
