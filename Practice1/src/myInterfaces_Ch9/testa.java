package myInterfaces_Ch9;

public class testa {

	public static void main (String args[])	{
		Callback c = new MyIntRlz(); //������ ����� ������ MyIntRlz - ��� ��� � ��� ����������, ���� CALLBACK 
		c.callback(42);
	}

}
