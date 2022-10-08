package javaassignment2;

public class SpacedLogger implements Logger {
   
   private String addSpace(String msg) {
      String[] msgCharacters = msg.split("");
      String newMsg = "";
      for (String character : msgCharacters) {
         newMsg += character + " ";         
      }
      return newMsg;      
   }

   @Override
   public void log(String msg) {
      System.out.println(this.addSpace(msg));
   }

   @Override
   public void error(String msg) {
      System.out.println("ERROR: " + this.addSpace(msg));
   }

}
