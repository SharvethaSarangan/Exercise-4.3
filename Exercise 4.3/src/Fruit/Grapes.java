package Fruit;

public class Grapes extends fruit {
	
	protected int quantity ;
	protected double calories;
	protected double price;
	protected int noofFruits;
	
	public Grapes(String n , int q , double c,  double p , int f) {
		super(n);
		this.quantity = q ;
		this.calories = c ;
		this.price = p ;
		this.noofFruits = f;
		
	}
		
	public double caltotalprice() {
	return this.price * this.quantity ; }
	
	public void eat() { // overloading with 0 parameter
		System.out.println("John is eating");
		
	}
	
	public void eat(String n) { // overloading with 1 parameter
		System.out.println("John is eating Grapes");
	}
	
	public void eat(String n , int f) {  // overloading with 2 parameters
		System.out.println("John ate " + f + " grapes ");
	}
	

 	public String Factsaboutgrapes() {  // overriding
		return "\n\n---FACTS ABOUT GRAPES---" +
			   "\nGrapes Have Around for 65 Million Years" +
			   "\nFruit grows in pyramid-shaped clusters.One cluster contains 75 berries on average" +
			   "\nLeaves are large, green and partially lobed. They have toothed edges" ;
				}
 	
		public String toString() { // overriding
         return Factsaboutgrapes () +
        		"\n\n--- GRAPES--- :  "
        		+"\nQuantity = "+ quantity
        		+"\nPrice per Kg = RM"+ price
        		+"\nCalories per 100g = " + calories
        	    +"\nTotal Price= RM"+caltotalprice()  ;

        

    	
	
}
}