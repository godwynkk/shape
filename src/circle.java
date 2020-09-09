class Circle extends Shape
{
    //declaring radius variable of the circle
    private double radius;
    public Circle(String name)
    {
        super(name);
    }
    public void setDimension(double radius)
    {
        this.radius=radius;
    }
    public void printDimension()
    {
        //user input radius length
        System.out.println("Radius : "+radius);
        System.out.println("===============================");

    }
    public double getArea()
    {
        //equation to calculate circle area
        return 3.14*radius*radius;
    }
}