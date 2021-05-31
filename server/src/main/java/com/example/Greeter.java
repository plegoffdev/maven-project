package com.example;

/**
 * My <b>Greeter</b>.
 * Fonctionnalités pour les salutations
 */
public class Greeter {
  
  /**
  *default constructor
  */
  public Greeter() {
  }

  /**
  * Return a string, etc... 
  *
  * @param String
  * @return String
  */
  public final String greet(final String someone) {
    return String.format("Hello babacar, %s!", someone);
  }
}
