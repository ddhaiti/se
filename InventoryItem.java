/**
* @author Group 2 - Team 2
* @version 1.0
*
* This class which initializes and manipulates inventory item data.
* It constructs an InventoryItem object with all the inputted infomation.
* It contains get/set methods for all components of InventoryItem data as well as
* a toString method which outputs InventoryItem objects in a organized way.
*/

public class InventoryItem
{

	int _itemId = 0;
	String _itemName = "";
	int _itemQuantity = 0;
	double _itemPrice = 0.0;

	/**
	* Default constructor
	* Has no parameters
	*/
	public InventoryItem()
	{
	}

	//
	/**
	* This an overloaded constructor
	* Constructs a new InventoryItem object with given values for each parameter
	* @param itemName		Name of the inventory item
	* @param itemQuantity	The amount of the aformentioned item that is in stock
	*/
	public InventoryItem(int itemId, String itemName, int itemQuantity, double itemPrice)
	{
		_itemId = itemId;
		_itemName = itemName;
		_itemQuantity = itemQuantity;
		_itemPrice = itemPrice;
	}

	/**
	* This is an accessor method which accesses the value of itemName
	* @return String  the name of the item associated with this InventoryItem object
	*/

	public int getItemID()
	{
		return _itemId;
	}

	public String getItemName()
	{
		return _itemName;
	}

	/**
	* This is an accessor method which accesses the value of itemQuantity
	* @return int  the quantity of the item associated with this InventoryItem object
	*/
	public int getItemQuantity()
	{
		return _itemQuantity;
	}


	public double getItemPrice()
	{
		return _itemPrice;
	}


	/**
	* This is an mutator method which mutates the value of itemName
	* @param itemName Name of the inventory item
	*/
	public void setItemId(int itemId)
	{
		_itemId = itemId;
	}
	public void setItemName(String itemName)
	{
		_itemName = itemName;
	}


	/**
	* This is an mutator method which mutates the value of itemQuantity
	* @param itemQuantity Quantity of the inventory item
	*/
	public void setItemQuantity(int itemQuantity)
	{
		_itemQuantity = itemQuantity;
	}

	public void setItemPrice(double itemPrice)
	{
		_itemPrice = itemPrice;
	}
	/**
	* This method converts this InventoryItem object to a String
	* @return String a string representation of this inventory item and the details associated with it
	*/
	public String toString( )
	{
		return _itemId + "\t" + _itemName + "\t" + _itemQuantity + "\t" + _itemPrice;
	}

}