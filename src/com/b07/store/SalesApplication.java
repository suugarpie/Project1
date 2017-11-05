package com.b07.store;

import java.sql.Connection;

public class SalesApplication {
  /**
   * This is the main method to run your entire program! Follow the "Pulling it together" 
   * instructions to finish this off.
   * @param argv unused.
   */
  public static void main(String[] argv) {
    
    Connection connection = DatabaseDriverExtender.connectOrCreateDataBase();
    if (connection == null) {
      System.out.print("NOOO");
    }
    try {
      //TODO Check what is in argv 
      //If it is -1
      /*
       * TODO This is for the first run only!
       * Add this code:
       * DatabaseDriverExtender.initialize(connection);
       * Then add code to create your first account, an administrator with a password
       * Once this is done, create an employee account as well.
       * 
       */
      //If it is 1
      /*
       * TODO In admin mode, the user must first login with a valid admin account
       * This will allow the user to promote employees to admins. Currently, this
       * is all an admin can do.
       */
      //If anything else - including nothing
      /*
       * TODO Create a context menu, where the user is prompted with:
       * 1 - Employee Login
       * 2 - Customer Login
       * 0 - Exit
       * Enter Selection: 
       */
      //If the user entered 1
      /*
       * TODO Create a context menu for the Employee interface
       * Prompt the employee for their id and password
       * Attempt to authenticate them.
       * If the Id is not that of an employee or password is incorrect, end the session
       * If the Id is an employee, and the password is correct, create an EmployeeInterface object
       * then give them the following options:
       * 1. authenticate new employee
       * 2. Make new User
       * 3. Make new account
       * 4. Make new Employee
       * 5. Restock Inventory
       * 6. Exit
       * 
       * Continue to loop through as appropriate, ending once you get an exit code (9)
       */
      //If the user entered 2
      /*
       * TODO create a context menu for the customer Shopping cart
       * Prompt the customer for their id and password
       * Attempt to authenticate them
       * If the authentication fails or they are not a customer, repeat
       * If they get authenticated and are a customer, give them this menu:
       * 1. List current items in cart
       * 2. Add a quantity of an item to the cart
       * 3. Check total price of items in the cart
       * 4. Remove a quantity of an item from the cart
       * 5. check out 
       * 6. Exit
       * 
       * When checking out, be sure to display the customers total, and ask them if they wish
       * to continue shopping for a new order
       * 
       * For each of these, loop through and continue prompting for the information needed
       * Continue showing the context menu, until the user gives a 6 as input.
       */
      //If the user entered 0
      /*
       * TODO Exit condition
       */
      //If the user entered anything else:
      /*
       * TODO Re-prompt the user
       */
      
      
      
      
    } catch (Exception e) {
      //TODO Improve this!
      System.out.println("Something went wrong :(");
    } finally {
      try {
        connection.close();
      } catch (Exception e) {
        System.out.println("Looks like it was closed already :)");
      }
    }
    
  }
}
