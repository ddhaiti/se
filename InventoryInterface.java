import java.util.Scanner;
import java.sql.*;
/**
* @author Group 2 - Team 2
* @version 1.0
*
* This class creates the interface which the user will use to edit InventoryList
* The user is given the option to add, remove, restock, and/or decrease items from the list
* Utilizes all functions within class InventoryList
* @see InventoryList
*/

public class InventoryInterface
{
	public static void main(String[]args)
	{
		InventoryList il = new InventoryList();
		Scanner scan = new Scanner(System.in);
			String s;
			int a,b;
			double c;
			System.out.println("make item");
			System.out.println("item id: ");
			a = scan.nextInt();
			System.out.println("item name: ");
			s = scan.next();
			System.out.println("quantity: ");
			b = scan.nextInt();
			System.out.println("price: ");
			c = scan.nextDouble();
		InventoryItem x = new InventoryItem(a,s,b,c);
		il.addNewItem(x);
	}

}