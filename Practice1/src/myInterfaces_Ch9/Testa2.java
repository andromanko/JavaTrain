package myInterfaces_Ch9;

public class Testa2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Callback c = new MyIntRlz();	//���� ������
		AnotherMyClassInt ob = new AnotherMyClassInt();	//������� ������
		c.callback(42);
		c = ob;
		c.callback(13);	//��� �� �����!
	}

}
