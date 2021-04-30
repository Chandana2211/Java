package Aggretion;

public class Employee {

	String name;
	int id;
	Address address;
	
	Employee(String name, int id, Address address){
		this.name=name;
		this.id=id;
		this.address=address;
	}
		
		
		
		void display() {
			System.out.println(name + "  "+id);
			System.out.println(address.city+", "+address.state+", "+address.country);
		}
		
	
	
	public static void main(String[] args) {
 	
	Address ad1=new	Address("Mysore","Karnataka","India");
	Address ad2=new	Address("Bangalore","Karnataka","India");
	
	Employee e1=new Employee("Sia",123,ad1);
	Employee e2=new Employee("Nia",321,ad2);
	
	e1.display();
	e2.display();
	
	
		
	}		
	
}
