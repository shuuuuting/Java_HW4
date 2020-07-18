public class Person{
	String name,email;
	int age;
	public Person(String n,String e,int a){
		name = n;
		email = e;
		age = a; 
	}	
	@Override 
	public String toString(){
		return name+" "+email+" "+age;
	}
}