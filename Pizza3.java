//Arjun Ponugubati
//Period 5
//10/23/24
//Pizza.java

public class Pizza3 extends Food3 //making a new class that extends Food3
{
	public Pizza3(String ingredientIn, int count, int cost)//makes the overloaded constructor with 3 parameters
	{
		
		super("baked", ingredientIn, "pizza", count, cost);//calling super constructor with those values
		
	}
	
	public Pizza3(String ingredientIn, String nameIn, int count, int cost)//overloaded constructor with 4 parameters
	{
		super("baked", ingredientIn, nameIn, count, cost);//calling constructor of super with those values
	}

}
