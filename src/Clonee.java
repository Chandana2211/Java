
public class Clonee implements Cloneable {

	String name;
	int id;
	
	Clonee(String name, int id){
		this.name=name;
		this.id=id;
	}
	
	public Object clone()throws CloneNotSupportedException {
		return super.clone();
	} 
	
	public static void main(String[] args) {
		
		try{
		Clonee clo =new Clonee("Sia",123);
		Clonee clo2=(Clonee)clo.clone();
		
		System.out.println(clo.name+" "+clo.id);
		System.out.println(clo2.name+" "+clo2.id);
	}catch(CloneNotSupportedException e) {}
	}
}


