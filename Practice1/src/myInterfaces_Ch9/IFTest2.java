package myInterfaces_Ch9;

public class IFTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DynStack mystack1=new DynStack(5);
		DynStack mystack2=new DynStack(8);
		for (int i=0;i<12;i++) mystack1.push(i);
		for (int i=0;i<20;i++) mystack2.push(i);
		System.out.println("In the stack 1:");
		for (int i=0;i<12;i++) System.out.print(mystack1.pop()+" ");
		System.out.println("\nIn the stack 2:");
		for (int i=0;i<20;i++) System.out.print(mystack2.pop()+" ");
	}
}
