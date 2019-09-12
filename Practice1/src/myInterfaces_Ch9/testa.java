package myInterfaces_Ch9;

public class testa {

	public static void main (String args[])	{
		Callback c = new MyIntRlz(); //объект новый КЛАССА MyIntRlz - так как в нем реализация, типа CALLBACK 
		c.callback(42);
	}

}
