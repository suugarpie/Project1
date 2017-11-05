package com.b07.database.helper;

import com.b07.database.DatabaseInserter;
import com.b07.database.helper.DatabaseDriverHelper;

import java.math.BigDecimal;
import java.sql.Connection;


public class DatabaseInsertHelper extends DatabaseInserter {
  
  public static int insertRole(String name) {
    //TODO Implement this method as stated on the assignment sheet 
    //hint: You should be using these three lines in your final code
    Connection connection = DatabaseDriverHelper.connectOrCreateDataBase();
    int roleId = DatabaseInserter.insertRole(name, connection);
    connection.close();
    return roleId;
  }
  
  public static int insertNewUser(String name, int age, String address, String password) {
    //TODO Implement this method as stated on the assignment sheet 
    //hint: You should be using these three lines in your final code
    Connection connection = DatabaseDriverHelper.connectOrCreateDataBase();
    int userId = DatabaseInserter.insertNewUser(name, age, address, password, connection);
    connection.close();
    return userId;
  }
  
  public static int insertUserRole(int userId, int roleId) {
    //TODO Implement this method as stated on the assignment sheet 
    //hint: You should be using these three lines in your final code
    Connection connection = DatabaseDriverHelper.connectOrCreateDataBase();
    int userRoleId = DatabaseInserter.insertUserRole(userId, roleId, connection);
    connection.close();
    return userRoleId;
  }

  public int insertItem(String name, BigDecimal price) {
    //TODO Implement this method as stated on the assignment sheet 
    //hint: You should be using these three lines in your final code
    Connection connection = DatabaseDriverHelper.connectOrCreateDataBase();
    int itemId = DatabaseInserter.insertItem(name, price, connection);
    connection.close();
    return itemId;
  }

  public int insertInventory(int itemId, int quantity) {
    //TODO Implement this method as stated on the assignment sheet 
    //hint: You should be using these three lines in your final code
    Connection connection = DatabaseDriverHelper.connectOrCreateDataBase();
    int inventoryId = DatabaseInserter.insertInventory(itemId, quantity, connection);
    connection.close();
    return inventoryId;
  }

  public int insertSale(int userId, BigDecimal totalPrice) {
    //TODO Implement this method as stated on the assignment sheet 
    //hint: You should be using these three lines in your final code
    Connection connection = DatabaseDriverHelper.connectOrCreateDataBase();
    int saleId = DatabaseInserter.insertSale(userId, totalPrice, connection);
    connection.close();
    return saleId;
  }

  public int insertItemizedSale(int saleId, int itemId, int quantity) {
  //TODO Implement this method as stated on the assignment sheet 
    //hint: You should be using these three lines in your final code
    Connection connection = DatabaseDriverHelper.connectOrCreateDataBase();
    int itemizedId = DatabaseInserter.insertItemizedSale(saleId, itemId, quantity, connection);
    connection.close();
    return itemizedId;
  }

  
}
