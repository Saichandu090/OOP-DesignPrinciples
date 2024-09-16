package oopdesignprinciples;

import java.nio.file.WatchService;

public class InterfaceSegregationPrinciple
{

}

interface Animal
{
    void walk();
}

interface WaterAnimal
{
    void swim();
}

interface Birds
{
    void fly();
}

class Lion implements Animal
{
    @Override
    public void walk()
    {
        System.out.println("Walking !!");
    }
}

class Fish implements WaterAnimal
{
    @Override
    public void swim()
    {
        System.out.println("Swimming !!");
    }
}

class Zoo
{
    public static void main(String[] args) {

        Fish f=new Fish();
        f.swim();

        Lion l=new Lion();
        l.walk();
    }
}