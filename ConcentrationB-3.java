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
public class ConcentrationB {

    private int[][] nums,show;
    
    public ConcentrationB(){
        nums=new int[4][4];
        show=new int[4][4];
        
        initialize();
    }
    
    public void initialize(){
        int[] counts = new int[8];
		int num;
		
		for(int i = 0; i<8;i++)
			counts[i] = 0;
		
		for(int r = 0; r < 4; r++ )
			for(int c = 0; c < 4; c++) {
				num = (int) (Math.random() * 8) + 1;
				while (counts[num-1] == 2)
					num = (int) (Math.random() * 8) + 1;
				counts[num-1]++;
				nums[r][c] = num;
			}
        
        for(int r = 0; r < 4; r++ )
			for(int c = 0; c < 4; c++) {
                show[r][c]=0;
            }
    }
    
    public boolean notDone(){
        int check=0;
        for(int r = 0; r < 4; r++ ){
			for(int c = 0; c < 4; c++) {
                if(show[r][c]==2){
                    check++;
                }
            }
        }
        
        if(check==16){
            return false;
        }
        else{
            return true;
        }
    }
    
    public void displaySpot(char row, int col){
        int r = (int)(row)-65;
        show[r][col]=1;
    }
    
    public void hideSpot(char row, int col){
        int r = (int)(row)-65;
        show[r][col]=0;
    }
    
    public void clearSpot(char row, int col){
        int r = (int)(row)-65;
        show[r][col]=2;
    }
    
    public int getNum(char row, int col){
        int r = (int)(row)-65;
        return nums[r][col];
    }
    
    public boolean validGuess(char row, int col){
        int r = (int)(row)-65;
        if(show[r][col]==0){
            return true;
        }
        else{
            return false;
        }
    }
    
    public String toString(){
        String results = String.format("\n%3s%2s%2s%2s\n", "1","2","3","4");
		for(int r=0; r < 4; r++){
            switch(r){
                case 0: results += "A"; break; 
                case 1: results += "B"; break;
                case 2: results += "C"; break;
                default: results += "D"; break;
            }
            for(int c = 0; c < 4; c++){
                if(show[r][c]==0){
                    results += String.format("%2s","\u039E");
                }
                if(show[r][c]==1){
                    switch(nums[r][c]){
                        case 1: results += String.format("%2s", "\u03B1"); break;
                        case 2: results += String.format("%2s", "\u03B2"); break;
                        case 3: results += String.format("%2s", "\u03B3"); break;
                        case 4: results += String.format("%2s", "\u03B4"); break;
                        case 5: results += String.format("%2s", "\u03B5"); break;
                        case 6: results += String.format("%2s", "\u03B6"); break;
                        case 7: results += String.format("%2s", "\u03B7"); break;
                        default: results += String.format("%2s", "\u03B8"); break;
                    }
                }
                if(show[r][c]==2){
                    results += "  ";
                }
            }
        results += "\n";
        }
        
        
            
		return results;
    }

}
