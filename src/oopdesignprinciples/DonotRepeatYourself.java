package oopdesignprinciples;

import java.util.Scanner;

public class DonotRepeatYourself
{
    public static void main(String[] args)
    {
        int[] a= addIntArray(7);
        dispArray(a);

        int[] b=addIntArray(4);
        dispArray(b);
    }

    public static int[] addIntArray(int size)
    {
        int[] a =new int[size];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter "+size+" elements");
        for(int i=0;i<size;i++)
        {
            a[i]=sc.nextInt();
        }
        return a;
    }

    public static void dispArray(int[] a)
    {
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
}
