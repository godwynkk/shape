class Square extends Shape
{
    //declaring variables l and w
    private double length,width;
    public Square(String name)
    {
        super(name);
    }
    public void setDimension(double length,double width)
    {
        this.length=length;
        this.width=width;
    }
    public void printDimension()
    {
        //print the value input of the user
        System.out.println("Length : "+length+" & height : "+width);
        System.out.println("===============================");

    }
    public double getArea()
    {
        //calculation
        return length*width;
    }
}