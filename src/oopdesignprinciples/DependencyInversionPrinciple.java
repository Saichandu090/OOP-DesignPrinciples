package oopdesignprinciples;

public class DependencyInversionPrinciple
{

}

interface IComputer
{
    void boot();
}

class Computer implements IComputer
{
    @Override
    public void boot()
    {
        System.out.println("Booting.....");
    }
}

class User
{
    public void bootComputer(IComputer i)
    {
        i.boot();//Up-Casting
    }
}

class Main2
{
    public static void main(String[] args) {

        User user=new User();
        Computer com=new Computer();
        user.bootComputer(com);
    }
}
