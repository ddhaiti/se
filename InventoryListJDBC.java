/**
* @author Group 2 - Team 2
* @version 1.0
*
* This class creates and manages a list of InventoryItem objects
* InventoryItem objects can be added, removed,  restocked, and/or decreased
* All InventoryItem objects that have been saved can also be retrieved in the form of a complete list
* @see InventoryItem
*/

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class InventoryListJDBC
{
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost:3306/inventory";
	static final String USER = "root";
	static final String PASS = "";
	Connection conn = null;
	Statement stmt = null;


	/**
	* This method saves a new InventoryItem object to the InventoryList
	* @param i	InventoryItem object
	* @see InventoryItem
	*/
	public boolean addNewItem(InventoryItem i )
	{
		startConnection();
		try
		{
			String query = "Insert Into items" + "values (?,?,?,?)";

			PreparedStatement preparedStmt = conn.prepareStatement(query);
			preparedStmt.setInt(1, i.getItemID());
			preparedStmt.setString (2, i.getItemName());
			preparedStmt.setInt (3, i.getItemQuantity());
			preparedStmt.setDouble(4, i.getItemPrice());

			preparedStmt.execute();
			conn.close();
			return true;
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		return false;
	}


	/**
	* This method restocks an InventoryItem object
	* @param itemName The name of the item being restocked
	* @param quantity The current quantity of the item being restocked
	* @return InventoryItem  the InventoryItem object that has been restocked
	* @see InventoryItem
	*/
	/*public InventoryItem restockInventory(InventoryItem i)
	{{
		   startConnection();
		   try{
		      String query = " update items set itemsid = ?, itemname = ?,
		      itemquantity = ?," + " itemsprices = ?";

		      // Create the MYSQL modify prepared statement
		      PreparedStatement preparedStmt = conn.prepareStatement(query);
		      preparedStmt.setInt (1, r.getItemID());
		      preparedStmt.setString (2, r.getItemName());
		      preparedStmt.setInt (3, r.getItemQuantity());
		      preparedStmt.setDouble (4, r.getItemPrice());


		      preparedStmt.execute();
		      conn.close();
		      return true;
		   }
		   catch(SQLException se){
		        //Handle errors for JDBC
		        se.printStackTrace();
		     }catch(Exception e){
		        //Handle errors for Class.forName
		        e.printStackTrace();
		     }
		   return false;
		}

	}*/


	/**
	* This method decreases quantity of an InventoryItem object
	* @param itemName The name of the item being decreased
	* @param quantity The current quantity of the item being decreased
	* @return InventoryItem  the InventoryItem object that has been decreased
	* @see InventoryItem
	*/
	//public InventoryItem decreaseInventory(String itemName, int quantity)
	//{}

	/**
	* This method retrieves all the InventoryItem objects stored in the InventoryList
	* @see InventoryItem
	*/
	/*public void viewInventory()
	 	{
		public ArrayList<InventoryItem> viewInventory()throws SQLException
	   {
	   String query = "SELECT * FROM items";
	   ArrayList<InventoryItem> allItems = new ArrayList<InventoryItem>();
	   InventoryItem items = null;
	   ResultSet rs = null;
	   PreparedStatement preparedStmt = null;

	     try{
	    	 startConnection();
	    	 preparedStmt = conn.prepareStatement(query);
	    	 rs = preparedStmt.executeQuery(query);

	        while (rs.next())
	        {
	    items = new InventoryItem();

	   /* item.setItemID(rs.getInt("item_id"));
	    reservation.setItemName(rs.getString("item_name"));
	    reservation.setItemQuantity(rs.getInt("item_quantity"));
	    reservation.setItemPrice(rs.getDouble("item_price"));

	    //add each reservation to the list
	                   allItems.add(items);
	    }    conn.close();
	     }catch(SQLException se){
	        //Handle errors for JDBC
	        se.printStackTrace();
	     }catch(Exception e){
	        //Handle errors for Class.forName
	        e.printStackTrace();
	     }finally{
	        //finally block used to close resources
	        try{
	           if(preparedStmt!=null)
	              conn.close();
	        }catch(SQLException se){
	        }// do nothing
	        try{
	           if(conn!=null)
	              conn.close();
	        }catch(SQLException se){
	           se.printStackTrace();
	        }//end finally try
	     }//end try
	     return allItems;
	   }

		}
	 */
	/**
	* This method checks to see if there are no InventoryItem objects saved in the InventoryList
	* @return boolean true if and only if there are no items stored on InventoryList; false otherwise
	*/
	/*public boolean isEmpty() throws SQLException, Exception
		{
		   boolean result;
		   startConnection();
		   Statement stmt = null;
		   stmt = conn.createStatement();
		   ResultSet rs = stmt.executeQuery("SELECT COUNT(*) FROM items");
		   rs.next();

		   int count = rs.getInt("COUNT(*)") ;

		   if (count == 0)
		   {result = true;}
		   else
		   {result = false;}

		   rs.close() ;
		   conn.close();
		   return result;
	   }
	*///
	//

	/**
	* This method converts the contents of the InventoryList to a String
	* @return String a string representation of the InventoryList
	*/
//	public String toString( )
/*	{
		String query = "SELECT * FROM items";
		int count = 0;
		ResultSet rs = null;
		Statement stmt = null;

		try
	   	{
		   startConnection();
		   stmt = conn.createStatement();
		   rs = stmt.executeQuery(query);
	  	while (rs.next())
	   	{
		   System.out.println();
		   System.out.println("Item ID:" + rs.getInt("_itemId"));
		   System.out.println("Item Name:" + rs.getString("_itemName"));
		   System.out.println("Item Quantity:" + rs.getString("_itemQuantity"));
		   System.out.println("Item Price:" + rs.getInt("_itemPrice"));
		   System.out.println();
		   count++;
	   	}
	   }
	   		catch(SQLException se)
	   		{
	   			//Handle errors for JDBC
	   			se.printStackTrace();
	   		}
	   		catch(Exception e)
	   		{
	   			//Handle errors for Class.forName
	   			e.printStackTrace();
	   		}
	   		finally
	   		{
	   			//finally block used to close resources
	   			try
	   			{
	   				if(stmt!=null)
	   					conn.close();
	   			}
	   			catch(SQLException se)
	   			{
	   			}// do nothing
	   			try
	   			{
	   				if(conn!=null)
	   					conn.close();
	   			}
	   			catch(SQLException se)
	   			{
	   				se.printStackTrace();
	   			}//end finally try
	   		}//end try

	   		String str = "There are " + count  + " items stored in the database.";
	   		return str;
	   }
	}
*/
	public void startConnection()
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Connecting to a selected database...");
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
			System.out.println("Connected to database successfully..");
			System.out.println("Ready to create a statement");
		}
		catch (Exception ex)
		{
			ex.printStackTrace();
		}
	}
}