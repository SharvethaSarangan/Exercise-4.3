package Fruit;

public class GreenApple extends Apple {
	
	public String place;
	public String season;
	
	public GreenApple(String n , int q , double p, String g , String s , String i , String l) {
		super(n ,q , p);
		this.place = g;
		this.season = s;
	}
	
	public String Growingplace() {
	return this.place;
	}
	
	public String Season() {
	return this.season;
	}
	
	public String Recipes() { // overloading with 0 parameter
		return "\nGreen apples can used to make smoothies" ;
	}
	
	public String Recipes(String i) { // overloading with 1 parameter
		return "\nGreen apples can use to make smoothies " + i ;
	}
	
	public String Recipes(String i , String l) {  //overloading with 2 parameters
		return "\nGreen apples can used to make smoothies " +  i  +  "and"  + l ;
	}
	
    public double caltotalprice() {
	return this.price * this.quantity ;
    }
	

    public String toString() { //overriding method
    		return super.toString() + Recipes() + Recipes("Pies")+ Recipes("Pies", "Salad");
    	}
}