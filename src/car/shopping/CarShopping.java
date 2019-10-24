/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package car.shopping;
import java.util.Scanner;
// Import Scanner Class
 
public class CarShopping
{
   private static Scanner kb = new Scanner(System.in);
    // Create static Scanner Object call it kb

   public static void main(String[] args)
   {
      int totalCost = 0;
      totalCost += base();
      totalCost += automaticWindows();
      totalCost += remoteEntry();
      totalCost += onStar();
      totalCost += abs();
      totalCost += wheelPedals();
      totalCost += sunroof();
      totalCost += coldWeather();
      totalCost += gps();
      totalCost += cupHolders();
      totalCost += miniFridge();
      totalCost += TV();
      System.out.println("The car you built costs: $" + totalCost);
      //TODO: call methods that you write for each feature
      //TODO: print the total cost of the vehicle
   }
   
   public static int base()
   {
      System.out.println("Our inventory:");
      System.out.println("Model 1 - $15,000");
      System.out.println("Model 2 - $24,000");
      System.out.println("Model 3 - $40,000");
       System.out.println("Which base model did the customer choose?"
               + "(enter full model name ex. Model 1): ");
      String model = kb.nextLine();
      if(model.equalsIgnoreCase("Model 1"))
         return 15000;
      else if(model.equalsIgnoreCase("Model 2")){
      return 24000;
      }
      else{
          return 40000;
      }
      
      }
   

   
   public static int automaticWindows()
   {
      System.out.print("Automatic Windows for $500? (yes/no) > ");
      String windows = kb.nextLine();
      if(windows.equals("yes")){
      return 500;
      }
       return 0;
   }
   
    public static int remoteEntry()
   {
      System.out.print("Remote keyless entry for $1000? (yes/no) > ");
      String remote = kb.nextLine();
      if(remote.equals("yes")){
      return 1000;
      }
       return 0;
   }
    
     public static int onStar()
   {
      System.out.print("OnStar System for $1000? (yes/no) > ");
      String onStar = kb.nextLine();
      if(onStar.equals("yes")){
      return 1000;
      }
       return 0;
   }
     
      public static int abs()
   {
      System.out.print("Anti-lock Brakes for 500? (yes/no) > ");
      String ABS = kb.nextLine();
      if(ABS.equals("yes")){
      return 500;
      }
       return 0;
   }
      
       public static int wheelPedals()
   {
      System.out.print("Telescoping steering wheel/adjustable pedals for $1000? (yes/no) > ");
      String wheel = kb.nextLine();
      if(wheel.equals("yes")){
      return 1000;
      }
       return 0;
   }
       
        public static int sunroof()
   {
      System.out.print("Sunroof for $800? (yes/no) > ");
      String roof = kb.nextLine();
      if(roof.equals("yes")){
      return 800;
      }
       return 0;
   }
        
         public static int coldWeather()
   {
      System.out.print("Cold Weather Package for $1500? (yes/no) > ");
      String cold = kb.nextLine();
      if(cold.equals("yes")){
      return 1500;
      }
       return 0;
   }
         
         public static int gps()
   {
      System.out.print("GPS Navigation for $750? (yes/no) > ");
      String GPS = kb.nextLine();
      if(GPS.equals("yes")){
      return 750;
      }
       return 0;
   }
         
         public static int cupHolders()
   {
      System.out.print("Cup Holders for $30,000? (yes/no) > ");
      String cup = kb.nextLine();
      if(cup.equals("yes")){
      return 300000;
      }
       return 0;
   }
         
         public static int miniFridge()
   {
      System.out.print("Mini Fridge for $2000? (yes/no) > ");
      String fridge = kb.nextLine();
      if(fridge.equals("yes")){
      return 2000;
      }
       return 0;
   }
         
         public static int TV()
   {
      System.out.print("Cold Weather Package for $1500? (yes/no) > ");
      String tv = kb.nextLine();
      if(tv.equals("yes")){
      return 7500;
      }
       return 0;
   }
}
