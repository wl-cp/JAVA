package homework5;
import java.util.Scanner;
public class Emp {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Please input the employee's name:");
		String n=in.next();
		System.out.println("Please input the employee's age:");
		int a=in.nextInt();
		System.out.println("Please input the employee's sarary:");
		float s=in.nextFloat();
		System.out.println("Please input the employee's bonus:");
		float b=in.nextFloat();
		Employee e=new Employee(n,a,s,b);
		e.employee();

	}

}
class Employee{
	String name;
	int age;
	float sarary;
	float bonus;
	Employee(String n,int a,float s,float b){
		name=n;
		age=a;
		sarary=s;
		bonus=b;
	}
	void employee() {
		System.out.println("Employee's name: "+name);
		System.out.println("Employee's age: "+age);
		System.out.println("Employee's income: "+(sarary+bonus));
	}
}
