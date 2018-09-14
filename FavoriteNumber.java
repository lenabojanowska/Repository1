import java.util.Scanner;


public class FavoriteNumber
{
   public static void main(String[] args)
   {
      Scanner info = new Scanner(System.in);
      System.out.println("What is your favorite number?");
      int number = info.nextInt();
      info.close();
      
      System.out.println("Your favorite number, "+number+"!");
      
   }
}
