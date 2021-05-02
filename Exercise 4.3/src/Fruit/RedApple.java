package Fruit;

public class RedApple extends Apple {
	
	public RedApple(String n , int q , double p) {
		super(n ,q , p);
	    }

	public double calprice(double p) {  // overloading with 1 parameter
		return this.price ;
	}
	
	public double calprice(int q , double p ) {  //overloading with 2 parameters
	return this.price * this.quantity ;
		}
	
	public String toString() { // overriding 
        return super.toString()+"\nQuantity = "+ quantity
        		        	   +"\nPrice per Kg = RM"+calprice(5.50)
                               +"\nTotal Price= RM"+calprice(3,5.50);

}
}