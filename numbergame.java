import java.util.Random;
import java.util.Scanner;

public class numbergame {
    public static void main(String[] args) {
      Random rand = new Random();
    Scanner scanner=new Scanner(System.in);

      int randomnumber = rand.nextInt(100) +1;
int tryCount =0;
      while (true) {
    

      System.out.println("Enter your guss(1-100):");
 int playerGuess = scanner.nextInt();
tryCount++;
 if (playerGuess==randomnumber){
    System.out.println("You Win");
    System.out.println("It took you "+ tryCount+" tries");
    break;
 }   
 else if (randomnumber>playerGuess) {
    System.out.println("nope! The number is heigher .guess again.");

    
 }
 else{
    System.out.println("nope ! The number is lower.Guess again.");
 }}
 scanner.close();   }
    
}
