package com.example;


public class Greeter {
  
  /**
  *default constructor
  */
  public Greeter() {

  }

    /**
* Return a string, etc... 
*
* 
* @param  String someone
* @return      String
*/
  public final String greet(final String someone) {
    return String.format("Hello babacar, %s!", someone);
  }
}
