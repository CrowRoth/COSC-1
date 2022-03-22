/*
 * File Name: Concentration.java
 * 
 * Name: Dustin Riley
 * 
 * 
 * - int[][] board
 * + Concentration()
 * + void initialize
 * + String toString()
 * The constructor should create a new 4x4 array with board, and then call initialize
 * initialize should set the numbers 1-8 randomly into the board
 * toString should return a multi-line string with the board displayed
 * 
 * 
 * Tests:
*/


public class Concentration {

    private int [][]board; 
    
    public Concentration(){
        board=new int [4][4];
        for(int r=0;r<4;r++){
            for(int c=0;c<4;c++){
                board[r][c] = 0;
            }
        }
        
        initialize();
    }
    
    public void initialize() {
        int num;
        int count[]=new int [8];
        for(int r=0;r<8;r++){
            count[r]=0;
        }
        
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
    }
    
    public String toString(){
        String mygame = String.format("Concentration\n%-10s%-10s%-10s%-10s%-10s\n", " ", "A","B","C","D");
        
        for(int i=0;i<4;i++){
            mygame += String.format("%-10d%-10d%-10d%-10d%-10d\n", i+1, board[i][0], board[i][1], board[i][2], board[i][3]);
        }
       
        return mygame;
    }
    
    
}
