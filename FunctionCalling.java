import java.util.Scanner;
public class FunctionCalling 
{
	  int i;

	  int j=5;

	public FunctionCalling() 
	{

		System.out.println("Constructor called");
	}
	  void callFun()
	  {

			 System.out.println("Function called"); 

		  }

		  void add(int a,int b)

		  {

			  int c=a+b;

			  System.out.println(c);

		  }



	public static void main(String[] args) 
	{
		  int x,y;

		  Scanner sc=new Scanner(System.in);

		  x=sc.nextInt();

		  y=sc.nextInt();

		  FunctionCalling s=new FunctionCalling();

		System.out.println(s.j);

		s.callFun();

		s.add(s.i,s.j);

		s.add(3, 5);
	}

}
