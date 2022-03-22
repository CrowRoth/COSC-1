/*
 * File Name: .java
 * 
 * Name: Dustin Riley
 * 
 * Req: 
 * 
 * Variables:
 * 	input: 
 * 
 * 	calc: 
 * 
 * Output: 
 * 
 * Design:
 *  
 * Tests:
*/
import java.awt.Font;
import javax.swing.*;

public class ConcentrationDriverB {

    public static void main(String[] args)  {
        
        ConcentrationB myGame;
        myGame = new ConcentrationB();
        
        
        UIManager.put("OptionPane.messageFont", new Font(Font.MONOSPACED, Font.BOLD, 24));
        String size;
        int players;
        size = JOptionPane.showInputDialog(null,"Enter # of players\n");
        players = Integer.parseInt(size);
        String[] names = new String[players];
        for(int i=0;i<players;i++){
            names[i] = JOptionPane.showInputDialog(null,"Enter Player " + (i+1) + " name\n");
        }
        
        ConcentrationA Game;
        Game = new ConcentrationA(names);
        
        String guess;
		int count=0;
		while(myGame.notDone()==true) {
            int spot1,spot2,row1,col1;
            guess = JOptionPane.showInputDialog(null,Game.getPlayer() + " enter a spot, A-D 1-4...\n" + Game.justScores() + "\n" + myGame, "i.e. A1...");
            guess = guess.toUpperCase();
            char row = guess.charAt(0);
            char c = guess.charAt(1);
            int r = (int)(row)-65;
            int col = (int)(c)-49;
            while(!checkGuess(guess, myGame,row, r, col)){
                guess = JOptionPane.showInputDialog(null,Game.getPlayer() + " enter a spot, A-D 1-4...\n" + Game.justScores() + "\n" + myGame, "ERROR!", JOptionPane.ERROR_MESSAGE);
                guess = guess.toUpperCase();
                row = guess.charAt(0);
                c = guess.charAt(1);
                r = (int)(row)-65;
                col = (int)(c)-49;
            }
            row1 = r;
            col1 = col;
            spot1 = myGame.getNum(row, col);
            
            guess = JOptionPane.showInputDialog(null,Game.getPlayer() + " enter another spot, A-D 1-4...\n" + Game.justScores() + "\n" + myGame, "i.e. A1...");
            guess = guess.toUpperCase();
            row = guess.charAt(0);
            c = guess.charAt(1);
            r = (int)(row)-65;
            col = (int)(c)-49;
            while(!checkGuess(guess, myGame,row, r, col)){
                guess = JOptionPane.showInputDialog(null,Game.getPlayer() + " enter another spot, A-D 1-4...\n" + Game.justScores() + "\n" + myGame, "ERROR!", JOptionPane.ERROR_MESSAGE);
                guess = guess.toUpperCase();
                row = guess.charAt(0);
                c = guess.charAt(1);
                r = (int)(row)-65;
                col = (int)(c)-49;
            }
            
            spot2 = myGame.getNum(row, col);
            
            if(spot1==spot2){
                Game.bumpScore();
                JOptionPane.showMessageDialog(null, "You got a match!\n" + Game.justScores() + "\n" + myGame,"Concentration",1);
                myGame.clearSpot(row, col);
                row=(char)(row1+65);
                col=col1;
                myGame.clearSpot(row, col);
            }
            else{
                JOptionPane.showMessageDialog(null, "not a match.\n" + Game.justScores() + "\n" + myGame,"Concentration",1);
                myGame.hideSpot(row, col);
                row=(char)(row1+65);
                col=col1;
                myGame.hideSpot(row, col);
                Game.nextPlayer();
            }
            count++;
        }
        
		JOptionPane.showMessageDialog(null, Game.winner(),"Concentration",1);

    }
    
    public static boolean checkGuess(String guess,ConcentrationB myGame,char row, int r, int col){
        if(guess.length()!=2){
            return false;
        }
        
        if(-1 < r && r <4 && -1 < col && col <4 && myGame.validGuess(row, col)){
            myGame.displaySpot(row, col);
            return true; 
        }
        return false;
    }

}
