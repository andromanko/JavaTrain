package myInterfaces_Ch9;

public class Testa2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Callback c = new MyIntRlz();	//один объект
		AnotherMyClassInt ob = new AnotherMyClassInt();	//другойй объект
		c.callback(42);
		c = ob;
		c.callback(13);	//тот же метод!
	}

}
