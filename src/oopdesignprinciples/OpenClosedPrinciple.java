package oopdesignprinciples;

interface OpenClosedPrinciple
{
    double perform(double a,double b);
}

class Addition implements OpenClosedPrinciple
{
    @Override
    public double perform(double a, double b)
    {
        return a+b;
    }
}

class Subtraction implements OpenClosedPrinciple
{
    @Override
    public double perform(double a,double b)
    {
        return a-b;
    }
}

class Calculator
{
     void calculate(OpenClosedPrinciple p,double a,double b)
     {
         System.out.println(p.perform(a,b));
     }
}

class Main
{
    public static void main(String[] args)
    {

        Calculator c=new Calculator();
        c.calculate(new Addition(),4,5);
        c.calculate(new Subtraction(),9,6);
    }
}
