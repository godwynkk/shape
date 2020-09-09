class EquilateralTriangle extends triangle
{
    //declaring side
    private double x1;
    public EquilateralTriangle(String name)
    {
        super(name);
    }
    public void setDimension(double x1)
    {
        //number of side in a triangle
        super.setDimension(x1,x1,x1);
        this.x1=x1;
    }
}