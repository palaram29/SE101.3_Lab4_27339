
package com.mycompany.newshapeobj;
public class NewShapeOBJ
{

    public static void main(String[] args) 
    {
        System.out.println("Circle!!!");
        Circle C1=new Circle(7);
        C1.setRadius(7);
        System.out.println("Radius:"+C1.getRadius());
        System.out.println("Area:"+C1.calculateArea());
        System.out.println("Perimeter:"+C1.calculatePerimeter());
        System.out.println("\n");
        
        System.out.println("Rectangle!!!");
        Rectangle R1=new Rectangle (5,4);
        R1.setLength(5);
        R1.setwidth(4);
        System.out.println("Length:"+R1.getLength());
        System.out.println("Width:"+R1.getwidth());
        System.out.println("Area:"+R1.calculateArea());
        System.out.println("Perimeter:"+R1.calculatePerimeter());
         System.out.println("\n");
        
          System.out.println("Triangle!!!");
        Triangle T1=new Triangle(5,7,9);
        T1.setA(5);
        T1.setB(7);
        T1.setC(9);
        System.out.println("A:"+T1.getA());
        System.out.println("B:"+T1.getB());
        System.out.println("C:"+T1.getC());
        System.out.println("Area:"+T1.calculateArea());
        System.out.println("Perimeter:"+T1.calculatePerimeter());
    }
}
