/*
 * Sean Luo 10/09/2018
 * Area of triangle.java
 * This progrem calculates the area of triangle.
 */

package areaoftriangle;

import java.util.Scanner;

/**
 *
 * @author toluo7449
 */
public class AreaOfTriangle {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double a,b,c,p,area;
        //a,b, and c represent the three sides of a triangle.
        //p  is the semi-perimeter of the triangle. 
        //area is the area of the triangle
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of three edges：");
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        if(a+b>c && a+c>b && b+c>a){
        p = (a+b+c)/2;
        area = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        System.out.println("The area of this triangle is："+area);
        }
        else{
        System.out.println("These three sides cannot form a triangle"+ "");
}
    }
}