package Fruit;

public class Apple extends fruit {
	
	public int quantity;
	public double price;
	
	public Apple(String n , int q , double p) {
		super(n);
		this.quantity = q ;
		this.price = p ;
		
	System.out.println("Apple constructor in invoked");
		}	
	
	public double calprice(double p) {  // overloading with 1 parameter
		return this.price ;
	}
	
	public double calprice(int q , double p ) {  //overloading with 2 parameters
	return this.price * this.quantity ;
		}
	
	public String Factsaboutapple() {  // overriding
		return "\n\n---FACTS ABOUT APPLE---" +
               "\nApple is a member of rose family" +
			   "\nIt takes about 36 apples to create one gallon of apple cider"+
			   "\nApples ripen or soften ten times faster at room temperature than if they were refrigerated" ;
		}
	
	public String toString() {  // overriding
        return Factsaboutapple()
        						+"\n\n---APPLES--- :  "
        						+"\nQuantity = "+quantity
        						+"\nPrice per Kg = RM"+calprice(5.50)
        		                +"\nTotal Price= RM"+calprice(3,5.50);
        
       }
	

}