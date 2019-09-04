
public class vector {
	private double x=0;
	private double y=0;
	private double z=0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	};
	
	public vector (double x, double y, double z){
		this.x=x;
		this.y=y;
		this.z=z;
	}
	
	public double length() {
		return Math.sqrt(x*x+y*y+z*z);
	}
	
	public double scalarMul(vector vector2) {
		return x*vector2.x+y*vector2.y+z*vector2.z;
	}
	
	

}
