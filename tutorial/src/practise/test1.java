package practise;

public class test1
{
	public static void main(String[] args)
	{
		test t =new test();
		t.name = "Shadab";
		t.colour = "Black";
		System.out.println(t.name);
		System.out.println(t.colour);
		
		test e1;
		e1 = t;
		e1.name = "Sushmita";
		e1.colour = "Yellow";
		System.out.println(e1.name);
		System.out.println(e1.colour);
		
		
	}
}