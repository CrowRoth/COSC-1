/*
 * File Name: quizaverage.java
 * 
 * Name: Dustin Riley
 * 
 * Req: output table of quizes average and overall average from file inputs.
 * 
 * Variables:
 * 	input: names, q1, q2, q3,
 * 
 * 	calc: avg, avgall, line, words, u , sum, count
 * 
 * Output: String results = String.format("%-10s%-10s%-10s%-10s%-10s\n", "Name","Q1","Q2","Q3","Avg");
 * results += String.format("%-10s%-10.2f%-10.2f%-10.2f%-10.2f\n", names[i], q1[i], q2[i], q3[i], avg[i]);
 * results += String.format("Class average for all quizzes: %-2.2f", avgall);
 * 
 * Design: 
 *  
 * Tests:
*/
import java.awt.Font;
import java.util.*;
import java.io.*;
import javax.swing.*;

public class quizaverage {

    public static void main(String[] args) throws FileNotFoundException {
        String [] names = new String [20];
        double [] q1 = new double [20], q2 = new double [20], q3 = new double [20], avg = new double [20];
        double avgall=0;
        String line, words[];
        int u=0, sum=0, count=0;
        
        Scanner infile= new Scanner(new File("quizes.txt"));
        
        for(int i=0;i<20;i++){
                q1[i]=0;
                q2[i]=0;
                q3[i]=0;
                avg[i]=0;
        }
        
       
        while(infile.hasNext()){
            line = infile.nextLine();
            words = line.split(" ");
            
            names[u] = (words[0]);
            q1[u] = Double.parseDouble(words[1]);
            q2[u] = Double.parseDouble(words[2]);
            q3[u] = Double.parseDouble(words[3]);
            avg[u] = (q1[u]+q2[u]+q3[u])/3;
            count += 3;
            u++;
        }
        
        
                
        UIManager.put("OptionPane.messageFont", new Font(Font.MONOSPACED, Font.BOLD, 24));
        String results = String.format("%-10s%-10s%-10s%-10s%-10s\n", "Name","Q1","Q2","Q3","Avg");
        
        for(int i=0;i<u;i++){
            results += String.format("%-10s%-10.2f%-10.2f%-10.2f%-10.2f\n", names[i], q1[i], q2[i], q3[i], avg[i]);
            
        }
        
        for(int i=0;i<u;i++){ 
            sum += q1[i] + q2[i] + q3[i];
        }
            
        avgall = sum/count;    
        results += String.format("Class average for all quizzes: %-2.2f", avgall);
        
        JOptionPane.showMessageDialog(null, results, "Quiz Average Program Results", 1);
        
        infile.close();
    }

}
