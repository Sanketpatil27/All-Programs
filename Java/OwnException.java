class MyException extends Exception
{
	public MyException(String msg)
	{
		super(msg);
	}
}
public class OwnException
{
	String s1="cpp";
	String s2="java";
	void check()
	{
		try{
		if(s1!=s2)
			throw new MyException("String Not Matched Exception");
		else
			System.out.println("String Matches");
		 }catch(Exception e){System.out.println(e.getMessage());}
	}
	public static void main(String args[])
	{
		OwnException oe = new OwnException();
		oe.check();
	}
}