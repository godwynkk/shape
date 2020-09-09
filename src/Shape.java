import java.util.*;
class Shape
{
    public String name;

    public Shape(String name)
    {
        this.name=name;
    }
    public String getName()
    {
        return name;
    }
    public double getArea()
    {
        return 0.0;
    }
    public void printDimension()
    {
        System.out.println("No Dimension");
    }
}