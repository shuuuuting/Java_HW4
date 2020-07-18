public class EmployTest{
	public static void main(String[] args){
		Employ e1 = new Employ(new Person("Sabrina Wang","sab123@gmail.com",25),28000,new Date(2015,5,2),Occupation.SALESMAN);
		Person p2 = new Person("Jacky Chen","kingchen@gmail.com",50);
		Date d2 = new Date(1998);
		Employ e2 = new Employ(p2,45000,d2,Occupation.MANAGER);
		System.out.println("employ1 is"+e1);
		System.out.println("employ2 is"+e2);
	}
}