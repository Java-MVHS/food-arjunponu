/*
 * Arjun Ponugubati
 * Period 5
 * 10/23/24
 * Food.java
 */



public class Food //Making a new class
{
	protected String str; //Making a new protected variable so subclasses can access it
	
	public Food () //default constructor is made
	{
		str = new String(""); //initializing a variable
	}
	
	public Food (String prepMethod, String ingredient, String name) //new overloaded constructor with 3 parameters
	{	
		str = "At the sale: " + name + " " + prepMethod + " with " + ingredient; //initializing using variables from parameters
	}

	public void printForSale() //new method for printfor sale
	{
		System.out.println(str); //prints out what your buying using the constructor's variables
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
