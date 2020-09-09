import java.util.Scanner;
public class main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        //calling all class in the program and input values
        System.out.println("User Input length and Width for Square :");
        Square square=new Square("Square");
        square.setDimension(sc.nextDouble(),sc.nextDouble());
        System.out.println("User Input radius for Circle :");
        Circle circle=new Circle("Circle");
        circle.setDimension(sc.nextDouble());
        System.out.println("User Input x, y and z for Triangle :");
        triangle triangle=new triangle("Triangle");
        triangle.setDimension(sc.nextDouble(),sc.nextDouble(),sc.nextDouble());
        System.out.println("User Input side for EquilateralTriangle :");
        EquilateralTriangle equilateraltriangle =new EquilateralTriangle("Equilateral Triangle");
        equilateraltriangle .setDimension(sc.nextDouble());


        //Print output of all the areas
        System.out.println("===========AREA INPUT AND SOLUTION =========");
        System.out.println("\n"+square.getName());
        square.printDimension();
        System.out.println("Area: "+square.getArea());
        System.out.println("\n"+circle.getName());
        circle.printDimension();
        System.out.println("Area: "+circle.getArea());
        System.out.println("\n"+triangle.getName());
        triangle.printDimension();
        System.out.println("Area: "+triangle.getArea());
        System.out.println("\n"+equilateraltriangle.getName());
        equilateraltriangle.printDimension();
        System.out.println("Area: "+equilateraltriangle.getArea());

    }
}
/*
==Test==
User Input length and Width for Square :
2
2
User Input radius for Circle :
2
User Input x, y and z for Triangle :
2
3
4
User Input side for EquilateralTriangle :
3
===========AREA INPUT AND SOLUTION =========

Square
Length : 2.0 & height : 2.0
===============================
Area: 4.0

Circle
Radius : 2.0
===============================
Area: 12.56

Triangle
Input Side X : 2.0, Input side Y : 3.0 & Input side Z : 4.0
===============================
Area: 2.9047375096555625

Equilateral Triangle
Input Side X : 3.0, Input side Y : 3.0 & Input side Z : 3.0
===============================
Area: 3.897114317029974

Process finished with exit code 0
*/