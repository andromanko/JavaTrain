package myInterfaces_Ch9;

public class IFTest3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntStack mystack; //это типа интерфейс создали переменную ссылки на интерфейс;		
		DynStack ds=new DynStack(5);
		FixedStack fs=new FixedStack(8);
		
		mystack=ds;
		for (int i=0;i<12;i++) mystack.push(i);
		mystack=fs;
		for (int i=0;i<8;i++) mystack.push(i);
		mystack=ds;
		System.out.println("In the dyn stack");
		for (int i=0;i<12;i++) System.out.print(mystack.pop()+" ");
		mystack=fs;
		System.out.println("\nIn the fixed stack:");
		for (int i=0;i<20;i++) System.out.print(mystack.pop()+" ");
	}
}
