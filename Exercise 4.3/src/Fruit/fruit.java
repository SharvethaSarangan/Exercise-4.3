package Fruit;

public class fruit {

		protected String name;
		public fruit(String name) {  //overloading with argument
			this.name = name;
			System.out.println("Fruit constructor is invoked");
			
		}

		public String getName() {
			return this.name;
		}
		
		public String Factsaboutfruit() { // overriding
			return "\n\n---FACTS ABOUT FRUITS---" +
				   "\nThe study of fruits is called POMOLOGY" +
				   "\nRed-coloured fruits keep your heart strong" +
				   "\nOrange -coloured fruits tend to keep your eyes healthy" +
				   "\nYellow-coloured fruits prevent you from getting sick" ;
		}

		
		public String toString() {  //overriding
			return Factsaboutfruit()
			+ "\nFruit Name = "+name;
		   }
		

	}
