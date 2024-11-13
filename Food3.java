/*
 * Arjun Ponugubati
 * Period 5
 * 10/23/24
 * Food.java
 */



public class Food3 //making a new class
{
	protected String str; //making a protected variable string so the subclasses can use it
	
	public Food3 () //making a default constructor
	{
		str = new String(""); //intitializing str with these values
	}
	
	public Food3 (String prepMethod, String ingredient, String name, int count, int cost)//making a overloaded constructor with these parameters
	{	
		double price = count*(double)(cost)/100;//making the variable price by calculating cost and count math
		str = "At the sale: " + name + " " + prepMethod + " with " + ingredient + " will be sold for " + cost
				+ " cents each. With " + count + " " + name + "(s) " + "$" + price + " can be made.";//Format to print out all the values
		//using quotes and values
		
	}

	public void printForSale()//the method that does all of the printing by using the value str
	{
		System.out.println(str); //printing out str
	}
	
	public void newLines() //method with the 3 blank lines
	{
		System.out.println("\n\n\n");//printing out 3 blank lines
	}
}


/*
In FoodTester's main method
		Food food1 = new Food ("baked", "banana", "muffins");
		food1.printForSale();
		Food food2 = new Food ("fried", "yam", "fritters");
		food2.printForSale();
		Pizza pizza = new Pizza ("pepperoni");
		pizza.printForSale();
*/
