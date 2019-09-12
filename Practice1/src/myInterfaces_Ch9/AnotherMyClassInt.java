package myInterfaces_Ch9;

public class AnotherMyClassInt implements Callback {
	public void callback (int p)	{
		System.out.println("another variant of realize callback()");
		System.out.println("P^2=" + p*p);
	}
}
