package myInterfaces_Ch9;

public class MyIntRlz implements Callback { //наименование интерфейса
	public void callback (int p)	{ //методы определенные в интерфейсе
		System.out.println("methon callback with valiue "+p);
	}
	void nonIfaceMeth()	{ //свои методы
		System.out.println("other methods and objects");
	}
	
}

