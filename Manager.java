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
public class Manager extends Employee{

    private double salary;
    
    public Manager(){
        super();
        salary = 0;
    }
    
    public void setSalary(double s){
        salary = s;
    }
    
    public double getSalary(){return salary;}
    
    public String empData(){
        return super.empData() + "Manager\nSalary: $" + salary + " per week\n";
        
    }

}
