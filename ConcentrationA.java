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
public class ConcentrationA {

    private int playerNumber;
    private String [] names;
    private int [] scores;
    private int player;
    
    public ConcentrationA(String []newnames){
        playerNumber = (int)(newnames.length);
        names = new String[playerNumber];
        scores = new int[playerNumber];
        for(int i=0;i<playerNumber;i++){
            names [i] = newnames[i];
            scores[i] = 0;
        }
        player = 0;
        
        initialize();
    }
    
    public void initialize(){
        for(int i=0;i<playerNumber;i++){
            scores[i] = 0;
        }
        player = 0;
    }
    
    public void nextPlayer(){
        if(player == playerNumber-1){
            player = -1;
        }
        player = player + 1;
    }
    
    public void bumpScore(){
        scores[player]++;
    }
    
    public String getPlayer(){
        return names[player];
    }
    
    public String justScores(){
        String scoreBoard = "Scores:\n";
        
        for(int i=0;i<playerNumber;i++){
            scoreBoard += String.format("%8s%2s\n", names[i], scores[i]); 
        }
        
        return scoreBoard;
    }
    
    public String winner(){
        int temp=0;
        for(int i = 0; i<playerNumber; i++ ){
            for(int j = i+1; j<playerNumber; j++){
                if(scores[i]>scores[j]){
                    temp = scores[i];
                    scores[i] = scores[j];
                    scores[j] = temp;
                }
            }
        }
        String win;
        if(scores[playerNumber-1]==scores[playerNumber-2]){
            win = "Cleared the board!\nResults: With a score of " + temp + "\nthe winner is " + names[playerNumber-1] + " & " + names[playerNumber-2];
        }
        
        win = "Cleared the board!\nResults: With a score of " + scores[playerNumber-1] + "\nthe winner is " + names[player];
        
        return win;
    }
    
}
