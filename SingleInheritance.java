//1.create a class named animal which includes method like eat() and sleep().
//create a child class of animal named of animal named bird and override the parent class method. add a new method named fly().
//create an instance of animal class and invoke the eat and sleep method using this object.
//create an instance of bird class and invoke the eat,sleep and fly method using this object. 

package oopsconcept;
class Animal
{ 
	 String eat(String y)
	{ 
		
	return y;
	}
	 String sleep(String n)
		{ 
		
			return n;
		}
	 
}
class Bird extends Animal
{
	@Override
	 String eat(String y)
		{ 
			 
			return y;
		}
	@Override
		 String sleep(String n)
			{ 
				return n;
			}
		 String fly(String f)
		 {
			 return f;
		 }
		 
}

public class SingleInheritance {
	public static void main(String []args)
	{
		Animal a=new Animal();
		System.out.println(""+a.eat("Animals like rabbit , cat and dog are pritty"));
		System.out.println(""+a.sleep("they sleep at night"));
		System.out.println("************************************");
		Bird b=new Bird();
		System.out.println(""+b.eat("birds eatting small bajara seeds"));
		System.out.println(""+b.sleep("they sleep in their own home or nest"));
		System.out.println(""+b.fly("they flying on sky"));
	}

}
