package emp.assignment;
import java.util.Scanner;
abstract class Emp
{
	String name;
	int age;
	int salary;
	String designation;
	int count = 0;
	Scanner sc = new Scanner(System.in);
	Emp()
	{
		count++;
		System.out.println("Enter name: ");
		name = sc.next();
		System.out.println("Enter age: ");
		age = sc.nextInt();

	}
	public void raiseSalary()
	{
		System.out.println("Enter increment amount: ");
		int inc = sc.nextInt();
		salary += inc;
	}
	public final void display()
	{
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
		System.out.println("Salary : "+salary);
		System.out.println("Designation : "+designation+"\n");
	}
}
final class Tester extends Emp
{
	Tester()
	{
		super();
		salary = 15000;
		designation = "Tester";
	}
}
final class Programmer extends Emp
{
	Programmer()
	{
		super();
		salary = 30000;
		designation = "Programmer";
	}
}
final class Manager extends Emp
{
	Manager()
	{
		super();
		salary = 90000;
		designation = "Manager";
	}

}
public class Employee
{
	public static void main(String args[])
	{
		Emp e1 = new Tester();
		Emp e2 = new Programmer();
		Emp e3 = new Manager();

		e1.display();
		e2.display();
		e3.display();

		e1.raiseSalary();
		e2.raiseSalary();
		e3.raiseSalary();
	
		e1.display();
		e2.display();
		e3.display();	

	}
}