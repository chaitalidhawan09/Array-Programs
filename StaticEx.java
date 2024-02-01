import java.util.Scanner;
public class StaticEx 
{
	 int i=5;

     static int j=10;
	public StaticEx() 
	{

		System.out.println("Constructor called");
	}
	 void show()

     {

    	 System.out.println(i+" "+j);

     }
	public static void main(String[] args)
	{

		StaticEx se=new StaticEx();

		StaticEx se2=new StaticEx();

		se.i++;

		se.j++;

	System.out.println(se.i);//non static

	System.out.println(se2.i);

    System.out.println(se.j);

    System.out.println(se2.j);
	}

}
