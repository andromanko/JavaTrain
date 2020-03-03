
public class eqSolver {
	//WORKING!!!
	public static double func(double x)	{
		return Math.cos(Math.pow(x,5))+Math.pow(x,4)-345.3*x-23;
	}
	public static double eqSlvr(double begin, double end, double accuracy)	{
		if (Math.abs(begin-end)<accuracy) {
			return (begin+end)/2;
		}	
		double x=begin+(end-begin)/2;
		
		if (func(begin)*func(x)>0)	{//одного знака - то нужен другой отрезок
			 return eqSlvr(x,end,accuracy);
		} else {
			return eqSlvr(begin,x,accuracy);
		}
	}	

	public static double eqSlvr(double begin, double end)	{
		//if (begin==end) {			return begin;		}	
		double x=(end+begin)/2;	//
		if ((x==end)||(x==begin))	return x;
		
		if (func(begin)*func(x)>0)	{//одного знака - то нужен другой отрезок
			 return eqSlvr(x,end);
		} else {
			return eqSlvr(begin,x);
		}
	}	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("X="+eqSlvr(0,10));
		
	}

}
