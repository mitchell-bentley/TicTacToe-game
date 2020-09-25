
import java.util.Scanner;


public class Gameboard {
    private String position1;
    private String position2;
    private String position3;
    private String position4;
    private String position5;
    private String position6;
    private String position7;
    private String position8;
    private String position9;
    
    public String getPos1value()
    {
        return this.position1;
    }
    public Gameboard()
    {
        position1 = "-";
        position2 = "-";
        position3 = "-";
        position4 = "-";
        position5 = "-";
        position6 = "-";
        position7 = "-";
        position8 = "-";
        position9 = "-";
    }
    String[][] gameboard = new String[3][3];
    
    public void displayDirections() 
    {
        System.out.println("Please select a move using the key below");
        System.out.println(" 1  |   2   |   3");
        System.out.println("------------------");
        System.out.println(" 4  |   5   |   6");
        System.out.println("------------------");
        System.out.println(" 7  |   8   |   9");
    }
    
    
    public void setMove1(String move1)
    {
        this.position1 = move1;
    }
    public void setMove2(String move2)
    {
        this.position2 = move2;
    }
    public void setMove3(String move3)
    {
        this.position3 = move3;
    }
    public void setMove4(String move4)
    {
        this.position4 = move4;
    }
    public void setMove5(String move5)
    {
        this.position5 = move5;
    }
    public void setMove6(String move6)
    {
        this.position6 = move6;
    }
    public void setMove7(String move7)
    {
        this.position7 = move7;
    }
    public void setMove8(String move8)
    {
        this.position8 = move8;
    }
    public void setMove9(String move9)
    {
        this.position9 = move9;
    }
    public void displayGameboard() 
    {
        this.gameboard[0][0] = position1;
        this.gameboard[0][1] = position2;
        this.gameboard[0][2] = position3;
        this.gameboard[1][0] = position4;
        this.gameboard[1][1] = position5;
        this.gameboard[1][2] = position6;
        this.gameboard[2][0] = position7;
        this.gameboard[2][1] = position8;
        this.gameboard[2][2] = position9;
        
        System.out.println("Gameboard:");
        System.out.println(" " + gameboard[0][0] + "  |   " + gameboard[0][1] + "   |   " + gameboard[0][2]);
        System.out.println("------------------");
        System.out.println(" " + gameboard[1][0] + "  |   " + gameboard[1][1] + "   |   " + gameboard[1][2]);
        System.out.println("------------------");
        System.out.println(" " + gameboard[2][0] + "  |   " + gameboard[2][1] + "   |   " + gameboard[2][2]);
    }     
    
    public void print()
    {
        //Scanner scan = new Scanner (System.in);
        //displayDirections();
        //System.out.println("");
        displayGameboard();
        
        //int playerMove = scan.nextInt();
        //if (playerMove == 1)
        //{
            
        //    displayGameboard();
        //}
        //else if (playerMove == 2)
        //{
        //    displayGameboard();
        //}
    }
}
    
