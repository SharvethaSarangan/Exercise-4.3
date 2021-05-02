package Fruit;

public class Main {


	public static void main(String[] args) {
		
		fruit obj  = new fruit("Fruits");
		System.out.println(obj);
		
		Apple obj1= new Apple("Apple",3,5.50);
		System.out.println(obj1);
		
		GreenApple obj2 = new GreenApple("Green Apple" , 3 , 5.50, "Australia , Soth Africa" , "Year Around" , "Pies" , "Salad");
		System.out.println(obj2);
		
		RedApple obj3 = new RedApple("Red Apple" , 3, 5.50 );
		System.out.println(obj3);
		
		Grapes obj5 = new Grapes("Grapes" , 2 , 10.00, 67, 4);
		System.out.println(obj5);
		obj5.eat();
		obj5.eat(null);
		obj5.eat(null, 5);
		
		
		
		

	
	}

}