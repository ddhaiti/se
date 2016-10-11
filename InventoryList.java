import java.sql.*;
import java.util.ArrayList;

/**
* @author Group 2 - Team 2
* @version 1.0
*
* This class creates and manages a list of InventoryItem objects
* InventoryItem objects can be added, removed,  restocked, and/or decreased
* All InventoryItem objects that have been saved can also be retrieved in the form of a complete list
* @see InventoryItem
*/

public class InventoryList
{

	/**
	* Default constructor
	* Constructs a new InventoryList object
	* Has no parameters
	*/
	public InventoryList()
	{
	}

	/**
	* This method saves a new InventoryItem object to the InventoryList
	* @param i	InventoryItem object
	* @see InventoryItem
	*/
	public boolean addNewItem(InventoryItem i )
	{
		ArrayList<InventoryItem> inventoryList = new ArrayList<InventoryItem>();
		inventoryList.add(i);
		InventoryListJDBC myJDBC = new InventoryListJDBC();
		myJDBC.addNewItem(i);
		return true;
	}

	/**
	* This method restocks an InventoryItem object
	* @param itemName The name of the item being restocked
	* @param quantity The current quantity of the item being restocked
	* @return InventoryItem  the InventoryItem object that has been restocked
	* @see InventoryItem
	*/
	/*public InventoryItem restockInventory(int id, int quantity)
	{
		InventoryListJDBC myJDBC = new InventoryListJDBC();
		myJDBC.restockInventory();
		return false;
	}*/


	/**
	* This method decreases quantity of an InventoryItem object
	* @param itemName The name of the item being decreased
	* @param quantity The current quantity of the item being decreased
	* @return InventoryItem  the InventoryItem object that has been decreased
	* @see InventoryItem
	*/
	/*public InventoryItem decreaseInventory(int id, String itemName, int quantity, double price)
	{
		InventoryListJDBC myJDBC = new InventoryListJDBC();
		myJDBC.restockInventory(id, itemName, quantity, price);
	}*/

	/**
	* This method retrieves all the InventoryItem objects stored in the InventoryList
	* @see InventoryItem
	*/
	public void viewInventory()
	{
		ArrayList<InventoryItem> allItems = new ArrayList<InventoryItem>();
		InventoryListJDBC myJDBC = new InventoryListJDBC();

		try{
			allSItems = myJDBC.allItems();
		    for (InventoryItem items : allItems){
		    	System.out.println();
		        System.out.println("Item Id:" + reservation.getItemID());
		        System.out.println("Item Name:" + reservation.getItemName());
		        System.out.println("Item Quantity:" + reservation.getItemQuantity());
		        System.out.println("Item Price:" + items.getItemPrice());

		        System.out.println();
		           }
		}
		catch (SQLException e){
		        e.printStackTrace();
		}

	}

	/**
	* This method checks to see if there are no InventoryItem objects saved in the InventoryList
	* @return boolean true if and only if there are no items stored on InventoryList; false otherwise
	*/
	public boolean isEmpty()
	{
		InventoryListJDBC myJDBC = new InventoryListJDBC();
		return myJDBC.isEmpty();
	}

	/**
	* This method converts the contents of the InventoryList to a String
	* @return String a string representation of the InventoryList
	*/
	public String toString( )
	{
		InventoryListJDBC myJDBC = new InventoryListJDBC();
		return myJDBC.toString();
	}
}