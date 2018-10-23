import java.util.Scanner;

public class Prompter{
  Scanner scanner = new Scanner(System.in);
  String nameOfItem;
  String maxItemsString;
  int maxItems;
  
  
  public Prompter(){
    boolean isAcceptable = false;
    System.out.print("What type of item should go in the jar: ");
    nameOfItem = scanner.nextLine();
    do{
    System.out.print("What is the maximum amount of " + nameOfItem + " that should go in the jar: ");
    String maxItemsString = scanner.nextLine();
      try{
        maxItems = Integer.parseInt(maxItemsString); 
        isAcceptable = true;
      }catch(NumberFormatException ex){
         System.out.printf("%s. Enter an integer, please try again. %n", ex.getMessage());
      }
    }while(!isAcceptable);    
  }
  
  public String nameOfItem(){
    return this.nameOfItem;
  }
  
  public int maxItems(){
   return this.maxItems; 
  }
  
  public void guess(int answer){
    String playerGuessString;
    int playerGuess = 0;
    int countGuess = 0;  
    boolean isAcceptable = false;
    
    System.out.println("---------------------\n\n\n");
    System.out.println("---------------------");
    System.out.println("Welcome to the guessing game!");
      
    do{
      System.out.print("How many " + nameOfItem + " are in the jar? Pick a number between 1 and " + maxItems + ": ");
      playerGuessString = scanner.nextLine();
      try{
        playerGuess = Integer.parseInt(playerGuessString); 
        if(playerGuess > maxItems){
          System.out.println("Your guess must be less than " + maxItems + ".");
          continue;
        }
        if(playerGuess>answer){
          System.out.println("Your guess is too high.");
        }else if(playerGuess<answer){
          System.out.println("Your guess is too low.");
        }
        isAcceptable = true;
        countGuess++;
      }catch(NumberFormatException ex){
         System.out.printf("%s. Enter an integer, please try again. %n", ex.getMessage());
      }
    }while(playerGuess!=answer || isAcceptable!=true);
      
    if(playerGuess==answer){
      System.out.println("Congrats! You got it in " + countGuess + " attempts!");
    }
  }
  
}