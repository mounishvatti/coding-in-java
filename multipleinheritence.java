import java.util.Scanner;
class Event {
   public void start(String time){
      System.out.print("\n\nStart Time: "+time);
   }
}
class Sports extends Event {
   public void play(String type){
      System.out.print("\nGame type: "+type);
   }
}
class Football extends Sports{
   public void venue(String venue){
      System.out.print("\nVenue: "+venue);
   }
}
public class multipleinheritence{
   public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter Start Time: ");
      String time = sc.nextLine();
      System.out.print("Enter type of game to be played: ");
      String type = sc.nextLine();
      System.out.print("Enter venue: ");
      String venue = sc.nextLine();
      sc.close();
      Football football = new Football();
      football.start(time);
      football.play(type);
      football.venue(venue);
   }
}