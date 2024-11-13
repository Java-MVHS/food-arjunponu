//Arjun Ponugubati
//Period 5
//10/23/24
//FoodTester.java

public class FoodTester3 //making a new class
{
	public static void main(String [] args) //making a main method which calls all other methods and runs first
	{	
		Food3 food1 = new Food3();//making a new instance with object food1
		food1.newLines();//calling newLines method which has the 3 blank lines 
		food1 = new Food3 ("baked", "banana", "muffins", 12, 50);//using food1 object to send in values to Food3 class
		food1.printForSale(); //using food1 method to call printForSale
		Food3 food2 = new Food3 ("fried", "yam", "fritters", 3, 100);//making object food2 with class food3
		food2.printForSale();//calling printForSale method using food2 object
		Pizza3 pizza = new Pizza3 ("pepperoni", 8, 250);//making a new object with these values
		pizza.printForSale();//calling printForSale method using pizza object
		DeepDishPizza3 ddp = new DeepDishPizza3("chicken", 10, 300);//instantiating the object with these values
		ddp.printForSale();//calling printForSale method using ddp object
		food1.newLines();//calling newLines method using food1 object
	}
}
