package javaassignment2;

public class App {

   public static void main(String[] args) {
      
      Logger asterisk = new AsteriskLogger();
      Logger spaced = new SpacedLogger();
      
      //AsteriskLogger methods
      asterisk.log("Hello");
      asterisk.error("Hello");
      
      //SpacedLogger methods
      spaced.log("Hello");
      spaced.error("Hello");

   }

}
