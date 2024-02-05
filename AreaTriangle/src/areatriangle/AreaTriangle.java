/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package areatriangle;

/**
 *
 * @author muema
 */
public class AreaTriangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Initialise base, height and hypotenuse
        int base=10;
        int height=7;
        double hypotenuse=12;
        double area= 0.5*base*height;
        System.out.println("The area of the triangle is " +area); //Calculate and print the area of the triangle
        double perimeter= base+height+hypotenuse;
        System.out.println("The perimeter of the triangle is "+perimeter); //Calculate and print the perimeter of the triangle
    }
    
}
