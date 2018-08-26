package oops;

public class ConstructorExample {
	
	

	public static void main(String[] args) {
	
		Car car = new Car("Honda");
		
		//Car car1 = new Car("Camry");

	}
	
	

}


class Automobile{
	
	/*public Automobile(){
		System.out.println("Automobile constrcutor default");
	}*/
	
	public Automobile(String name){
		System.out.println("Automobile constrcutor=="+name);
	}
}


class Car extends Automobile{
	
	static{
		System.out.println("During class load");
	}
	
	{
		System.out.println("During object creation");
	}
	
	
	public Car(String type){
		
		super(type);
		System.out.println("Car constrcutor");
		//
	}
	
}
