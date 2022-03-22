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
public class Worker extends Employee{

    private double rate;
    
    public Worker(){
        super();
        rate = 0;
    }
    
    public void setRate(double r){
        rate = r;
    }
    
    public double getRate(){return rate;}
    
    public String empData(){
        return super.empData() + "Hourly Worker\nPay per Hour: $" + rate + " per hour\n";
        
    }

}
