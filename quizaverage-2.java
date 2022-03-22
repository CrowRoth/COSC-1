/*
 * File Name: quizaverage.java
 * 
 * Name: Dustin Riley
 * 
 * Req: output table of quizes average and overall average from file inputs.
 * 
 * Variables:
 * 	input: names, grid
 * 
 * 	calc: avg, avgall, line, words, u , sum, count
 * 
 * Output: String results = String.format("%-10s%-10s%-10s%-10s%-10s\n", "Name","Q1","Q2","Q3","Avg");
 * results += String.format("%-10s%-10.2f%-10.2f%-10.2f%-10.2f\n", names[i], grid[i][0], grid[i][1], grid[i][2], grid[i][4]);
 * results += String.format("Class average for all quizzes: %-2.2f", avgall);
 * 
 * Design: 
 *  
 * Tests: same results as original
*/
import java.awt.Font;
import java.util.*;
import java.io.*;
import javax.swing.*;

public class quizaverage {

    public static void main(String[] args) throws FileNotFoundException {
        String [] names = new String [20];
        double grid[][] = new double[20][4] ;
        double avgall=0;
        String line, words[];
        int u=0, sum=0, count=0;
        
        Scanner infile= new Scanner(new File("quizes.txt"));
        
        for(int r=0;r<20;r++){
            for(int c=0;c<4;c++){
                grid[r][c] = 0;
            }
        }
            
        while(infile.hasNext()){
            line = infile.nextLine();
            words = line.split(" ");
            
            names[u] = (words[0]);
            
            for(int c=0;c<3;c++){
            grid[u][c] = Double.parseDouble(words[1]);
            count += 3;
            }
            grid[u][3] = (grid[u][0]+grid[u][1]+grid[u][2])/3;
            u++;
        }
        
        
                
        UIManager.put("OptionPane.messageFont", new Font(Font.MONOSPACED, Font.BOLD, 24));
        String results = String.format("%-10s%-10s%-10s%-10s%-10s\n", "Name","Q1","Q2","Q3","Avg");
        
        for(int i=0;i<u;i++){
            results += String.format("%-10s%-10.2f%-10.2f%-10.2f%-10.2f\n", names[i], grid[i][0], grid[i][1], grid[i][2], grid[i][4]);
        }
        
        for(int r=0;r<u;r++){
            for(int c=0;c<3;c++){
            sum += grid[r][c];
            }
        }
            
        avgall = sum/count;    
        results += String.format("Class average for all quizzes: %-2.2f", avgall);
        
        JOptionPane.showMessageDialog(null, results, "Quiz Average Program Results", 1);
        
        infile.close();
    }

}
