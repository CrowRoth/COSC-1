/*
 * File Name: Pentagonal.java
 * 
 * Name: Dustin Riley
 * 
 * Req: output file of first 100 pentagonal numbers
 * 
 * Variables:
 * 	input: 
 * 
 * 	calc: int n,num,pent
 * 
 * Output: outfile.printf("%6s%12s\n","n","Pentagonal");
 * outfile.printf("%6d%12d\n",n,pent);
 * 
 * Design: output formatted table of first 100 pentagonal numbers
 *  
 * Tests:
 *  n   pent
 *  1   5
 *  3   12
 *  99  14652
*/

import java.io.*;

public class Pentagonal {
    
    public static void main(String[] args) throws FileNotFoundException {
        int n=1,pent;
        
        PrintWriter outfile = new PrintWriter(new File("Pentagonals.txt"));
        
        outfile.printf("%6s%12s\n","n","Pentagonal");
        
        while(n<101){
            pent=PNum(n);
            outfile.printf("%6d%12d\n",n,pent);
            n=n+1;
        }
        
        outfile.close();

    }
    
    public static int PNum(int n){
        int num;
        num=n*(3*n-1)/2;
        return num;
    }

}
