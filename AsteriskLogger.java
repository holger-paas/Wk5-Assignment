package javaassignment2;

public class AsteriskLogger implements Logger {

   @Override
   public void log(String msg) {
      System.out.println("***" + msg + "***");      
   }

   @Override
   public void error(String msg) {
      String border = "*".repeat(13 + msg.length());
      System.out.println(border);
      System.out.println("***ERROR: " + msg + "***");
      System.out.println(border);      
   }

}
