class Emp
{
	int age;
	String name;
	Emp(String name, int age)
	{
		this.name=name;
		this.age=age;
	}
	void display()
	{
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);

	}
	void raiseSalary()
	{}
}
class Tester extends Emp
{
	int age;
	String name;
	int salary;
	String des;
	Tester(String name, int age)
	{
		super(name, age);
		this.name=name;
		this.age=age;
		this.salary=15000;
		this.des="TESTER";
	}
	void display()
	{
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Salary: "+salary);
		System.out.println("Designation: "+des+"\n");
	}
	void raiseSalary()
	{
		salary+=2000;

	}
}

class Programmer extends Emp
{
	int age;
	String name;
	int salary;
	String des;
	Programmer(String name, int age)
	{
		super(name, age);
		this.name=name;
		this.age=age;
		this.salary=30000;
		this.des="PROGRAMMER";
	}
	void display()
	{
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Salary: "+salary);
		System.out.println("Designation: "+des+"\n");
	}
	void raiseSalary()
	{
		salary+=5000;

	}
}

class Manager extends Emp
{
	int age;
	String name;
	int salary;
	String des;
	Manager(String name, int age)
	{
		super(name, age);
		this.name=name;
		this.age=age;
		this.salary=90000;
		this.des="TESTER";
	}
	void display()
	{
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Salary: "+salary);
		System.out.println("Designation: "+des+"\n");
	}
	void raiseSalary()
	{
		salary+=10000;

	}
}

class Employee
{
	public static void main(String args[])
	{
		Emp e1=new Tester("Ravi",25);
		Emp e2=new Programmer("Prashant",33);
		Emp e3=new Manager("Mamta",45);

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