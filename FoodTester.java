//Arjun Ponugubati
//Period 5
//10/23/24
//FoodTester.java

public class FoodTester //new class is being made
{
	public static void main(String [] args) //main method that runs first that instantiates 
	{
		System.out.println("\n\n\n"); //3 new lines	
		Food food1 = new Food(); //instantiates Food with object food1
		food1 = new Food ("baked", "banana", "muffins"); //using object and giving Food parameters to print out
		food1.printForSale(); //calling printForSale() method that that prints out the variables
		Food food2 = new Food ("fried", "yam", "fritters");//instantiating class called Food with object food2
		food2.printForSale();//calling printForSale() method using food2 object
		Pizza pizza = new Pizza ("pepperoni");//instantiating Pizza class with pizza object
		pizza.printForSale();//calling printForSale methods using pizza object
		System.out.println("\n\n\n");//3 new lines
	}
}
