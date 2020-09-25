import java.util.ArrayList;
import java.util.Scanner;

public class App {
   
    public static void main(String[] args) {
        Gameboard game1 = new Gameboard();

        Scanner scan = new Scanner (System.in);
              
        boolean done = false;
        boolean move1 = false;
        boolean move2 = false;
        boolean move3 = false;
        boolean move4 = false;
        boolean move5 = false;
        boolean move6 = false;
        boolean move7 = false;
        boolean move8 = false;
        boolean move9 = false;
        boolean humanMove1 = false;
        boolean humanMove2 = false;
        boolean humanMove3 = false;
        boolean humanMove4 = false;
        boolean humanMove5 = false;
        boolean humanMove6 = false;
        boolean humanMove7 = false;
        boolean humanMove8 = false;
        boolean humanMove9 = false;
        boolean cpuMove1 = false;
        boolean cpuMove2 = false;
        boolean cpuMove3 = false;
        boolean cpuMove4 = false;
        boolean cpuMove5 = false;
        boolean cpuMove6 = false;
        boolean cpuMove7 = false;
        boolean cpuMove8 = false;
        boolean cpuMove9 = false;
        boolean cpuPass = false;
        
        ArrayList<Integer> numsUsed = new ArrayList<Integer>();     //array of previous moves
        
        while(!done)
        {
            game1.displayDirections();
            game1.displayGameboard();
            int userMove = scan.nextInt();
            
            if (userMove == 1 && !move1)        //sets moves on gameboard based on value of userMove
            {                                   //but doesn't allow for the same move to be made twice
                game1.setMove1("X");
                move1 = true;
                humanMove1 = true;
            }
            else if (userMove == 2 && !move2)
            {
                game1.setMove2("X");
                move2 = true;
                humanMove2 = true;
            }
            else if (userMove == 3 && !move3)
            {
                game1.setMove3("X");
                move3 = true;
                humanMove3 = true;
            }
            else if (userMove == 4 && !move4)
            {
                game1.setMove4("X");
                move4 = true;
                humanMove4 = true;
            }
            else if (userMove == 5 && !move5)
            {
                game1.setMove5("X");
                move5 = true;
                humanMove5 = true;
            }
            else if (userMove == 6 && !move6)
            {
                game1.setMove6("X");
                move6 = true;
                humanMove6 = true;
            }
            else if (userMove == 7 && !move7)
            {
                game1.setMove7("X");
                move7 = true;
                humanMove7 = true;
            }
            else if (userMove == 8 && !move8)
            {
                game1.setMove8("X");
                move8 = true;
                humanMove8 = true;
            }
            else if (userMove == 9 && !move9)
            {
                game1.setMove9("X");
                move9 = true;
                humanMove9 = true;
            }
            else                    //if user tries to make a move that has already been made
            {
                System.out.println("Invalid move. Try again.");    
                cpuPass = true;     //tells CPU not to make a move, since user did not make a move
            }
            if (humanMove1 && humanMove2 && humanMove3)     //human winning combinations
            {
                game1.displayGameboard();
                System.out.println("Human player wins.");
                done = true;
            }
            if (humanMove4 && humanMove5 && humanMove6)
            {
                game1.displayGameboard();
                System.out.println("Human player wins.");
                done = true;
            }
            if (humanMove7 && humanMove8 && humanMove9)
            {
                game1.displayGameboard();
                System.out.println("Human player wins.");
                done = true;
            }
            if (humanMove1 && humanMove4 && humanMove7)
            {
                game1.displayGameboard();
                System.out.println("Human player wins.");
                done = true;
            }
            if (humanMove2 && humanMove5 && humanMove8)
            {
                game1.displayGameboard();
                System.out.println("Human player wins.");
                done = true;
            }
            if (humanMove3 && humanMove6 && humanMove9)
            {
                game1.displayGameboard();
                System.out.println("Human player wins.");
                done = true;
            }
            if (humanMove1 && humanMove5 && humanMove9)
            {
                game1.displayGameboard();
                System.out.println("Human player wins.");
                done = true;
            }
            if (humanMove3 && humanMove5 && humanMove7)
            {
                game1.displayGameboard();
                System.out.println("Human player wins.");
                done = true;
            }
            if(!cpuPass)
            {
                boolean moveExistsAlready = false;
                
                while (!moveExistsAlready)
                {
                    int cpuMove = (int)(Math.random() * 9 + 1);     //randomly generates a move
                    numsUsed.add(userMove);                         //adds human moves to array
                    if (!numsUsed.contains(cpuMove))                //keeps generating random numbers until an unused one has been found
                    {
                        moveExistsAlready = true;
                    }
                    numsUsed.add(cpuMove);                          //adds new computer move to array
                
                    
                    if (cpuMove == 1 && !move1)                     //sets computer move on gameboard 
                    {                                               //doesn't allow user to make a move already made by CPU
                        game1.setMove1("O");
                        move1 = true;
                        cpuMove1 = true;

                    }
                    else if (cpuMove == 2 && !move2)
                    {
                        game1.setMove2("O");
                        move2 = true;
                        cpuMove2 = true;
                    }
                    else if (cpuMove == 3 && !move3)
                    {
                        game1.setMove3("O");
                        move3 = true;
                        cpuMove3 = true;
                    }
                    else if (cpuMove == 4 && !move4)
                    {
                        game1.setMove4("O");
                        move4 = true;
                        cpuMove4 = true;
                    }
                    else if (cpuMove == 5 && !move5)
                    {
                        game1.setMove5("O");
                        move5 = true;
                        cpuMove5 = true;
                    }
                    else if (cpuMove == 6 && !move6)
                    {
                        game1.setMove6("O");
                        move6 = true;
                        cpuMove6 = true;
                    }
                    else if (cpuMove == 7 && !move7)
                    {
                        game1.setMove7("O");
                        move7 = true;
                        cpuMove7 = true;
                    }
                    else if (cpuMove == 8 && !move8)
                    {
                        game1.setMove8("O");
                        move8 = true;
                        cpuMove8 = true;
                    }
                    else if (cpuMove == 9 && !move9)
                    {
                        game1.setMove9("O");
                        move9 = true;
                        cpuMove9 = true;
                    }
                }
            }
            if (cpuMove1 && cpuMove2 && cpuMove3)       //CPU winning combinations
            {
                game1.displayGameboard();
                System.out.println("Computer wins.");
                done = true;
            }
            if (cpuMove4 && cpuMove5 && cpuMove6)
            {
                game1.displayGameboard();
                System.out.println("Computer wins.");
                done = true;
            }
            if (cpuMove7 && cpuMove8 && cpuMove9)
            {
                game1.displayGameboard();
                System.out.println("Computer wins.");
                done = true;
            }
            if (cpuMove1 && cpuMove4 && cpuMove7)
            {
                game1.displayGameboard();
                System.out.println("Computer wins.");
                done = true;
            }
            if (cpuMove2 && cpuMove5 && cpuMove8)
            {
                game1.displayGameboard();
                System.out.println("Computer wins.");
                done = true;
            }
            if (cpuMove3 && cpuMove6 && cpuMove9)
            {
                game1.displayGameboard();
                System.out.println("Computer wins.");
                done = true;
            }
            if (cpuMove1 && cpuMove5 && cpuMove9)
            {
                game1.displayGameboard();
                System.out.println("Computer wins.");
                done = true;
            }
            if (cpuMove3 && cpuMove5 && cpuMove7)
            {
                game1.displayGameboard();
                System.out.println("Computer wins.");
                done = true;
            }
            
        } 
    }
}
