package oopdesignprinciples;

public class LiskovSubstitutionPrinciple
{

}

interface Shape
{
    void setLength(double length);
    void setWidth(double width);
    double area();
}

class Rectangle implements Shape
{
    double length;
    double width;
    @Override
    public void setLength(double length)
    {
        this.length=length;
    }

    @Override
    public void setWidth(double width)
    {
        this.width=width;
    }

    @Override
    public double area()
    {
        return length*width;
    }
}

class Mains1
{
    public static void main(String[] args) {

        Shape s=new Rectangle();
        s.setLength(3);
        s.setWidth(10);
        System.out.println("Area : "+s.area());
    }
}
