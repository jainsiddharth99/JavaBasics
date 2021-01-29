class Parentclass
{
   Parentclass(){
	System.out.println("no-arg constructor of parent class");
   }
   Parentclass(String str){
	System.out.println("parameterized constructor of parent class");
   }
}
class Subclass extends Parentclass
{
   Subclass(){
 	super("Hahaha");
	System.out.println("Constructor of child class");

   }
   void display(){
	System.out.println("Hello");
   }
   public static void main(String args[]){		
	Subclass obj= new Subclass();
	obj.display();	 
   }
}