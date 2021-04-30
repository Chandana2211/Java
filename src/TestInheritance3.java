class Animal{  
	
	Animal(){System.out.println("animal constructor...");}  
int eat(){System.out.println("eating..."); return 1;}  
}  
class Dog extends Animal{  
	Dog(){System.out.println("Dog const");}
void bark(){System.out.println("barking...");}  
}  
class Cat extends Animal{ 
	Cat(){System.out.println("cat cons...");}  
void meow(){System.out.println("meowing...");}  
}  
class TestInheritance3{  
public static void main(String args[]){  
Cat c=new Cat(); 


//c.meow();  
//c.eat();  
//c.bark();//C.T.Error  
}} 