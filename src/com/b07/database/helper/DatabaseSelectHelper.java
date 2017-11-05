package com.b07.database.helper;

import com.b07.database.DatabaseSelector;
import com.b07.inventory.Inventory;
import com.b07.inventory.Item;
import com.b07.store.Sale;
import com.b07.store.SalesLog;
import com.b07.users.User;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/*
 * TODO: Complete the below methods to be able to get information out of the database.
 * TODO: The given code is there to aide you in building your methods.  You don't have
 * TODO: to keep the exact code that is given (for example, DELETE the System.out.println())
 */
public class DatabaseSelectHelper extends DatabaseSelector {
  public static List<Integer> getRoleIds() {
    Connection connection = DatabaseDriverHelper.connectOrCreateDataBase();
    ResultSet results = DatabaseSelector.getRoles(connection);
    List<Integer> ids = new ArrayList<>();
    while (results.next()) {
      System.out.println(results.getInt("ID"));
    }
    results.close();
    connection.close();
    return ids;    
  }
  
  public static String getRoleName(int roleId) {
    Connection connection = DatabaseDriverHelper.connectOrCreateDataBase();
    String role = DatabaseSelector.getRole(roleId, connection);
    connection.close();
    return role;
  }
  
  public static int getUserRoleId(int userId) {
    Connection connection = DatabaseDriverHelper.connectOrCreateDataBase();
    int roleId = DatabaseSelector.getUserRole(userId, connection);
    connection.close();
    return roleId;
  }
  
  public static List<Integer> getUsersByRole(int roleId) {
    Connection connection = DatabaseDriverHelper.connectOrCreateDataBase();
    ResultSet results = DatabaseSelector.getUsersByRole(roleId, connection);
    List<Integer> userIds = new ArrayList<>();
    while (results.next()) {
      System.out.println(results.getInt("USERID"));
    }
    results.close();
    connection.close();
    return userIds;
    
  }
  
  public static List<User> getUsersDetails() {
    Connection connection = DatabaseDriverHelper.connectOrCreateDataBase();
    ResultSet results = DatabaseSelector.getUsersDetails(connection);
    List<User> users = new ArrayList<>();
    while (results.next()) {
      System.out.println(results.getInt("ID"));
      System.out.println(results.getString("NAME"));
      System.out.println(results.getInt("AGE"));
      System.out.println(results.getString("ADDRESS"));
    }
    results.close();
    connection.close();
    return users;
  }
  
  public static User getUserDetails(int userId) {
    Connection connection = DatabaseDriverHelper.connectOrCreateDataBase();
    ResultSet results = DatabaseSelector.getUserDetails(userId, connection);
    while (results.next()) {
      System.out.println(results.getInt("ID"));
      System.out.println(results.getString("NAME"));
      System.out.println(results.getInt("AGE"));
      System.out.println(results.getString("ADDRESS"));
    }
    results.close();
    connection.close();
    return null;
  }
  
  public static String getPassword(int userId) {
    Connection connection = DatabaseDriverHelper.connectOrCreateDataBase();
    String password = DatabaseSelector.getPassword(userId, connection);
    connection.close();
    return password;
  }
  
  public static List<Item> getAllItems() {
    Connection connection = DatabaseDriverHelper.connectOrCreateDataBase();
    ResultSet results = DatabaseSelector.getAllItems(connection);
    List<Item> items = new ArrayList<>();
    while(results.next()) {
      System.out.println(results.getInt("ID"));
      System.out.println(results.getString("NAME"));
      System.out.println(new BigDecimal(results.getString("PRICE")));
    }
    results.close();
    connection.close();
    return items;
  }
  
  public static Item getItem(int itemId) {
    Connection connection = DatabaseDriverHelper.connectOrCreateDataBase();
    ResultSet results = DatabaseSelector.getItem(itemId, connection);
    while(results.next()) {
      System.out.println(results.getInt("ID"));
      System.out.println(results.getString("NAME"));
      System.out.println(new BigDecimal(results.getString("PRICE")));
    }
    results.close();
    connection.close();
    return null;
  }
  
  public static Inventory getInventory() {
    Connection connection = DatabaseDriverHelper.connectOrCreateDataBase();
    ResultSet results = DatabaseSelector.getInventory(connection);
   
    while(results.next()) {
      System.out.println(results.getInt("ITEMID"));
      System.out.println(results.getString("QUANTITY"));
    }
    results.close();
    connection.close();
    return null;
  }
  
  public static int getInventoryQuantity(int itemId) {
    Connection connection = DatabaseDriverHelper.connectOrCreateDataBase();
    int quantity = DatabaseSelector.getInventoryQuantity(itemId, connection);
    connection.close();
    return quantity;
  }
  
  public static SalesLog getSales() {
    Connection connection = DatabaseDriverHelper.connectOrCreateDataBase();
    ResultSet results = DatabaseSelector.getSales(connection);
    
    while(results.next()) {
      System.out.println(results.getInt("ID"));
      System.out.println(results.getInt("USERID"));
      System.out.println(new BigDecimal(results.getString("TOTALPRICE")));
    }
    results.close();
    connection.close();
    return null;
  }
  
  public static Sale getSaleById(int saleId) {
    Connection connection = DatabaseDriverHelper.connectOrCreateDataBase();
    ResultSet results = DatabaseSelector.getSaleById(saleId, connection);
    while(results.next()) {
      System.out.println(results.getInt("ID"));
      System.out.println(results.getInt("USERID"));
      System.out.println(new BigDecimal(results.getString("TOTALPRICE")));
    }
    results.close();
    connection.close();
    return null;
  }
  
  public List<Sale> getSalesToUser(int userId) {
    Connection connection = DatabaseDriverHelper.connectOrCreateDataBase();
    ResultSet results = DatabaseSelectHelper.getSalesToUser(userId, connection);
    List<Sale> sales = new ArrayList<>();
    while (results.next()) {
      System.out.println(results.getInt("ID"));
      System.out.println(results.getInt("USERID"));
      System.out.println(new BigDecimal(results.getString("TOTALPRICE")));
    }
    results.close();
    connection.close();
    return sales;
  }
  public static void getItemizedSaleById(int saleId, Sale sale) {
    Connection connection = DatabaseDriverHelper.connectOrCreateDataBase();
    ResultSet results = DatabaseSelector.getItemizedSaleById(saleId, connection);
    while (results.next()) {
      System.out.println(results.getInt("SALEID"));
      System.out.println(results.getInt("ITEMID"));
      System.out.println(results.getInt("QUANTITY"));
    }
    results.close();
    connection.close();
  }
  
  public static void getItemizedSales(SalesLog salesLog) {
    Connection connection = DatabaseDriverHelper.connectOrCreateDataBase();
    ResultSet results = DatabaseSelector.getItemizedSales(connection);
    while (results.next()) {
      System.out.println(results.getInt("SALEID"));
      System.out.println(results.getInt("ITEMID"));
      System.out.println(results.getInt("QUANTITY"));
    }
    results.close();
    connection.close();
  }
}
