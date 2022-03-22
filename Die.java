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
public class Die {

    private int val;
    
    public Die(){
        val=0;
        
        roll();
    }
    
    public void roll(){
        val=(int)(Math.random()*6)+1;
    }
    
    public int getVal() {return val;}
    
    public String toString(){
        return String.valueOf(val);
    }

}
