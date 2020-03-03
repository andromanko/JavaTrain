package myInterfaces_Ch9;

public class DynStack implements IntStack {
	private int stck[];
	private int tos;
	DynStack(int size)	{
		stck=new int[size];
		tos=-1;
	}
	public void push(int item)	{
		if (tos==stck.length-1)	{
			int temp[] = new int [stck.length*2];
			for (int i=0;i<stck.length;i++)	temp[i]=stck[i];
			stck=temp;	//ÒÓÒ ÏÐÈÑÂÀÈÂÀÞÒÑß ÓÊÀÇÀÒÅËÈ!!! ÂÎÒ!!!
			stck[++tos]=item;
		}
		else
			stck[++tos]=item;
	}
	public int pop()	{
		if (tos<0)	{
			System.out.println("stack not loaded");
			return 0;
		}
		else
			return stck[tos--];
	}
}
