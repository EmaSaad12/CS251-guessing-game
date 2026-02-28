import java.util.Scanner;

class GuessingGame{
private Scanner input =new Scanner(System.in);
private String name;

public GuessingGame(String name){
    this.name=name;
}
public void StartGame(){

String playagain;

do{
        int guess;
       
        int attempts = 0;
        System.out.println("Welcome to the number guessing game: " + name);
        System.out.println("1 -Easy :");
        System.out.println("2- Medium :");
        System.out.println("3- Hard :");
        int level=input.nextInt();
        int Maxrange=100;
        int maxattemppts=Integer.MAX_VALUE;
        if(level==1){
            Maxrange=50;
        }else if(level==2){
            Maxrange=100;
            maxattemppts=7;
        }else if(level==3){
            Maxrange=200;
            maxattemppts=5;
        }
         int rand = (int)(Math.random()*(Maxrange+1));


        boolean stillplay = true;

        while (stillplay) {
            System.out.println("Please guess the number between 0 to "+Maxrange);
            guess = input.nextInt();
            attempts++;
            if(attempts==maxattemppts){
                System.out.println("Game is over! the number was " + rand);
                stillplay=false;

            }

            if (guess > rand) {
                System.out.println("The number is too large");
            } 
            else if (guess < rand) {
                System.out.println("The number is too small");
            } 
            else {
                System.out.println("Congratulations You win!");
                System.out.println("Number of attempts: " + attempts);

                if (attempts <= 3) {
                    System.out.println(" Rating: herooo!");
                } 
                else if (attempts <= 6) {
                    System.out.println(" Rating: Excellent!");
                } 
                else {
                    System.out.println(" Rating: Good!");
                }

                stillplay = false;   
            }
        }
        System.out.println("DO you want to play again? (yes/no)");
      playagain=input.next();
   

    } 
    while(playagain.equalsIgnoreCase("yes"));
    System.out.println("Thanks for playing "+ name);

}

}

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("#################################");
        System.out.println("Number guessing game");
        System.out.println("#################################");

        System.out.println("Please enter your name");
        String name = input.nextLine();
      
        GuessingGame game = new GuessingGame(name);
        game.StartGame();
        
}
}
