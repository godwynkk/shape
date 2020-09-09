//triangle class
class triangle extends Shape
{
    //declaring variables
    private double x,y,z;

    //triangle class
    public triangle(String name)
    {
        super(name);
    }

    //sides of the triangle
    public void setDimension(double x,double y,double z)
    {
        this.x=x;
        this.y=y;
        this.z=z;
    }

    //user input of each side
    public void printDimension()
    {
        System.out.println("Input Side X : "+x+", Input side Y : "+y+" & Input side Z : "+z);
        System.out.println("===============================");
    }
    public double getArea()
    {
        //calculation of a triangle
        //Heron's Formula
        double s=(x+y+z)/2;
        return Math.sqrt((s)*(s-x)*(s-y)*(s-z));
    }
}