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

public class conc {

    public static void main(String[] args)  {
        int board[][]=new int [4][4];
        int count[]=new int [8];
        int choice=0,num;
        
        for(int r=0;r<4;r++){
            for(int c=0;c<4;c++){
                board[r][c] = 0;
            }
        }
        for(int r=0;r<8;r++){
            count[r]=0;
        }
        
        while(choice==0) {
            for(int r=0;r<4;r++){
                for(int c=0;c<4;c++){
                    num=(int)(Math.random()*8)+1;
                    board[r][c]=num;
                    count[num-1]++;
                    while(count[num-1]>2){
                            count[num-1]=count[num-1]-1;
                            num=(int)(Math.random()*8)+1;
                            board[r][c]=num;
                            count[num-1]++;
                    }
                }
            }
            
            UIManager.put("OptionPane.messageFont", new Font(Font.MONOSPACED, Font.BOLD, 24));
            String gameboard = String.format("%-10s%-10s%-10s%-10s%-10s\n", " ", "A","B","C","D");
            
            for(int i=0;i<4;i++){
                gameboard += String.format("%-10d%-10d%-10d%-10d%-10d\n", i+1, board[i][0], board[i][1], board[i][2], board[i][3]);
            }
            choice=JOptionPane.showConfirmDialog(null,gameboard,"Concentration",0);
        }
    }
}
