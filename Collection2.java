package collec6;

import java.util.Comparator;
import java.util.TreeSet;

public class Collection2 {

	public static void main(String[] args) {
		TreeSet<employee> obj=new TreeSet<>(new FirstComparator());
		obj.add(new employee(1,"Hello",2000.0,"Tech"));
		obj.add(new employee(2,"Iam",2000.0,"Solider"));
		obj.add(new employee(3,"21",2000.0,"student"));
		obj.add(new employee(4,"Years",2000.0,"Multiverse"));
		obj.add(new employee(5,"old",2000.0,"10 rings"));
		obj.add(new employee(6,"Naveen",2000.0,"smash"));
		obj.add(new employee(7,"Happy",2000.0,"Agent"));
		obj.add(new employee(8,"To",2000.0,"Management"));
		obj.add(new employee(9,"See",2000.0,"Time travel"));
		obj.add(new employee(10,"You",2000.0,"magic"));
		
		for(employee e :obj) {
			System.out.println(e);
		}
		
//		System.out.println("select the options:\n");
//	
//		System.out.println("a) id: " );
	}

}
 class FirstComparator implements Comparator<employee>{

	@Override
	public int compare(employee o1, employee o2) {
		// TODO Auto-generated method stub
		return (o1.id).compareTo(o2.id);
	}
	
}
 class employee {
	
	public Integer id;
	public String name;
	public Double salary;
	public String department;
	public employee(Integer id, String name, Double salary, String department) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.department = department;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
	
	public Integer getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public Double getSalary() {
		return salary;
	}
	public String getDepartment() {
		return department;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Employee [id =" + this.id + ", name = " +this.name +", salary= "+ this.salary +", department= "+ this.department+"]";
	}
	
	
	
	
}
