package javaassignment2;

public class App {

   public static void main(String[] args) {
      
      Logger asterisk = new AsteriskLogger();
      Logger spaced = new SpacedLogger();
      
      String msg = "Welcome";
      
      //AsteriskLogger methods
      asterisk.log(msg);
      asterisk.error(msg);
      
      //SpacedLogger methods
      spaced.log(msg);
      spaced.error(msg);

   }

}
