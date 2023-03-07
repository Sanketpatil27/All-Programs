import java.util.*;
class MyException extends Exception
{
	public MyException(String msg)
	{
		super(msg);
	}
}
public class OwnException555
{
//	String s1="cpp";
//	String s2="java";
int age;
	void check()
	{
		System.out.println("Enter age of Person");
		Scanner sc=new Scanner(System.in);
		age=sc.nextInt();
		try{
		if(age<0)
			throw new MyException("Age Negative");
		else
			System.out.println("Age Positive");
		 }catch(Exception e){System.out.println(e.getMessage());}
	}
	public static void main(String args[])
	{
		OwnException555 oe = new OwnException555();
		oe.check();
	}
}