package myInterfaces_Ch9;

public class MyIntRlz implements Callback { //������������ ����������
	public void callback (int p)	{ //������ ������������ � ����������
		System.out.println("methon callback with valiue "+p);
	}
	void nonIfaceMeth()	{ //���� ������
		System.out.println("other methods and objects");
	}
	
}

