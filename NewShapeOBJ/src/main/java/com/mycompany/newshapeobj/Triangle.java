
package com.mycompany.newshapeobj;
public class Triangle implements Shape
{
    private double A;
    private double B;
    private double C;
    
    public Triangle(double A, double B, double C) 
    {
        this.A = A;
        this.B = B;
        this.C = C;
    }
    
     public void setA(double A) 
     {
        this.A = A;
     }
     public double getA() 
     {
        return A;
     }
     
     public void setB(double B) 
     {
        this.B = B;
     }
     public double getB() 
     {
        return B;
     }
     
     public void setC(double C) 
     {
        this.C = C;
     }
     public double getC() 
     {
        return C;
     }
     
      @Override
    public double calculateArea()
    {
        double s = ((A + B + C) / 2);
        return Math.sqrt(s * (s - A) * (s - B) * (s - C)); 
    }
    
     @Override
    public double calculatePerimeter() 
    {
        return A + B + C;
    }
    

}
