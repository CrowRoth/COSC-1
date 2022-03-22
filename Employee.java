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
public class Employee {

    protected String fname, lname;
    protected int empNum, dept, deductions;
    
    public Employee(){
        fname = "Mary";
        lname = "Jane";
        empNum = 0;
        dept = 0;
        deductions = 0;
    }
    
    public void setNames(String f,String l){
        fname = f;
        lname = l;
    }
    
    public String getfname(){return fname;}
    
    public String getlname(){return lname;}
    
    public void setEmpNum(int n){
        if (n>0){
        empNum = n;
        }
    }
    
    public int getEmpNum(){return empNum;}
    
    public void setDept(int d){
        if (d>0){
        dept = d;
        }
    }
    
    public int getDept(){return dept;}
    
    public void setDeductions(int d){
        if (d>=0){
            deductions = d;
        }
    }
    
    public int getDeductions(){return deductions;}
    
    public String empData(){
        String i;
        i = toString() + "Department: ";
        switch (dept){
            case 1: i += "Warehouse";break;
            case 2: i += "Sales";break;
            default: i += "Admin";break;
        }
        i += "\n" + "Deductions: " + deductions + "\n";
        return i;
    }
    
    public String toString(){
        return empNum + " " + lname + ", " + fname + "\n";
    }

}
