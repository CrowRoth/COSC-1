/* RandomCounts.java
 * 
 * generates a certain amount of random numbers between 1 and 10
 * 
 * Modify this code as follows:
 * 
 * As is, this code just outputs the random numbers to a dialog box.
 * 
 * Create two arrays where indicated: counts (int) and percents (double). Each of size 10
 * 
 * initialize counts where indicated
 * 
 * update counts where indicated, and remove code that updates results
 * 
 * calculate percentages using a for loop where indicated
 * 
 * output both arrays where indicated
 * 
 * Remember: arrays are zero based. Your arrays of size 10 will have indices 0-9, NOT 1-10
 */
import java.awt.Font;
import javax.swing.*;

public class RandomCountsStart {

	public static void main(String[] args) {
		
		int [] counts = new int [10];
        double [] percents = new double [10];
		
		int num, amount, choice=0;
		
				
		while (choice == 0){
			
			for(int i=0;i<10;i++){
                counts[i]=0;
            }
            // initialize counts here using a for loop
			
			amount = Integer.parseInt(JOptionPane.showInputDialog(null, "Input the amount of random numbers to generate"));
			
			 // will not need this for the completed lab
			
			// generate the numbers in a for loop
            
			for(int i = 1; i <= amount; i++){
				num = (int)(Math.random()*10) + 1;
				// remove this stuff when doing the lab.
				counts[num-1]++;
				
				// here is where you should update the array counts based on which num was generated
				// for example: if num is 3, update the array element that counts 3's
			}
			
			for(int i=0;i<10;i++){
                percents[i]= ((double)counts[i]/amount)*100;
            }
            // calculate percentages
			// go through the count array and determine the percentage of each value. Store the
			// percentage in the appropriate element in percents (parallel array example)
			UIManager.put("OptionPane.messageFont", new Font(Font.MONOSPACED, Font.BOLD, 24));
            String results = "Results for " + amount + " random numbers: \n";
            results += String.format("%-10s%-10s%-10s\n", "Number","Count","Percent");
            
            for(int i=0;i<10;i++){
                results += String.format("%-10d%-10d%-2.2f%%\n", i+1, counts[i], percents[i]);
            
            }
			//create results
			// results starting out is just the numbers. Remove the code from the for loop above that does that,
			// and instead use a for loop and go through both arrays creating the output string results with
			// the count and percentage of each of the 10 numbers one per line.
			
			results = results + "\n\nRepeat this? Yes or No";
			
			// show results in a confirm dialog that will also control the loop
			choice = JOptionPane.showConfirmDialog(null, results, "Results", 0);
			
		}

	}
	
	

}
