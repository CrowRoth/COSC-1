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
    private static int format=0;
    
    public Die(){
        val=0;
        
        roll();
    }
    
    public void roll(){
        val=(int)(Math.random()*6)+1;
    }
    
    public static void setFormat( int f) {
    	if (f >= 0 && f <= 1)
    		format = f;
    }
    
    public int getVal() {return val;}
    
    public String getValAsString() {
        if (format == 0) {																																													
        	return String.valueOf(val);
        }
        else if (format == 1) {
           	switch ( val ) {
            case 1:     return "\u2680";
	    	case 2:     return "\u2681";
	    	case 3:     return "\u2682";
	    	case 4:     return "\u2683";
            case 5:     return "\u2684";
            default:    return "\u2685";
           	}

        }
        return " ";
    }
    
    public String toString(){
        return getValAsString();
    }

}
