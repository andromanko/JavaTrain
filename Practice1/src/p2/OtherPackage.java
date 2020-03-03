package p2;

public class OtherPackage {
	OtherPackage()	{
		p1.Protection p=new p1.Protection();
		System.out.println("constr from Other package");
		//System.out.println("n= NOT access
		//System.out.println("n_pri = NOT access
		//System.out.println("n_pro = NOT access
		System.out.println("n_pub="+p.n_pub);
	}
}
