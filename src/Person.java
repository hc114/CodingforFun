
public class Person {
	static String name;
	public Person(String personName){
		name = personName;
	}
	public static String greet(String yourName){
		Person self=new Person("Jeannie Chung");
		return String.format("Hi %s, my name is %s", name,yourName);
	}
	public static void main(String[] args){
		String myName="Michael Lee";
		System.out.println(greet(myName));
	}
}
