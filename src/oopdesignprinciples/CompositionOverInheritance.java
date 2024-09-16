package oopdesignprinciples;

public class CompositionOverInheritance
{

}

class Singer
{
    void sing()
    {
        System.out.println("Singing...");
    }
}

class Dancer
{
    void dance()
    {
        System.out.println("Dancing...");
    }
}

class Teacher
{
    Singer s=new Singer();
    Dancer d=new Dancer();

    void perform()
    {
        s.sing();
        d.dance();
    }
}

class Main4
{
    public static void main(String[] args)
    {
        Teacher t=new Teacher();
        t.perform();
    }
}
