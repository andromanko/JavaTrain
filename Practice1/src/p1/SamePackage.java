package p1;

public class SamePackage {
	SamePackage()	{
		Protection p=new Protection();
		System.out.println("constr of the same packge");
		System.out.println("n="+p.n);
		//System.out.println("n_pri _ NOT 
		System.out.println("n_pro="+p.n_pro);
		System.out.println("n_pub="+p.n_pub);
	}
}
