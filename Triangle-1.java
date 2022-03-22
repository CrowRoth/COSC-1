/*
 * File Name: Triangle.java
 * 
 * Name: Dustin Riley
 * 
 *  
 * UML: Triangle
 * - double a
 * 
 * - double b
 * 
 * - double c
 * 
 * + Triangle()
 * 
 * + Triangle(double s1, double s2, double s3)
 * 
 * + double getA()
 * 
 * + double getB()
 * 
 * + double getC()
 * 
 * + setSides(double s1, double s2, double s3)
 * 
 * + double getPerimeter()
 * 
 * + double getArea()
 * 
 * + String toString()
 * 
*/
public class Triangle {

    private double a;
    private double b;
    private double c;
    
    public Triangle(){
        a=1;
        b=1;
        c=1;
    }
    
    public Triangle(double s1,double s2,double s3){
        a=1;
        b=1;
        c=1;
        
        setSides(s1,s2,s3);
    }
    
    public double getA() {return a;}
    public double getB() {return b;}
    public double getC() {return c;}
    
    public void setSides(double s1,double s2,double s3){
        if(s1 > 0 && s2 > 0 && s3>0) {
            if(s1<(s2+s3) && s2<(s1+s3) && s3<(s1+s2)){
                a=s1;
                b=s2;
                c=s3;
            }
		}
    }
    
    public double getPerimeter(){
        return a+b+c;
    }
    
    public double getArea(){
        return Math.sqrt((getPerimeter()/2)*((getPerimeter()/2)-a)*((getPerimeter()/2)-b)*((getPerimeter()/2)-c));
    }
    public String toString(){
        String results = "Side 1: " + a + "Side 2: " + b + "Side 3: " + c + " Area: " + getArea();
		return results;
    }
}
