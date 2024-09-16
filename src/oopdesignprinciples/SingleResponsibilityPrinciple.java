package oopdesignprinciples;

public class SingleResponsibilityPrinciple
{

}

class Student
{
    int age;
    String name;
    Student(int age,String name)
    {
        this.age=age;
        this.name=name;
    }

    public void displayDetails()
    {
        System.out.println("Name : "+name+", Age : "+age);
    }
}

class NameService
{
    public void getNameServ(Student s,String meassage)
    {
        System.out.println("Student with name "+s.name+" says the message : "+meassage);
    }
}

class Mains
{
    public static void main(String[] args) {

        Student s=new Student(22,"Chandu");
        s.displayDetails();

        NameService n=new NameService();
        n.getNameServ(s,"Hi all");
    }
}
