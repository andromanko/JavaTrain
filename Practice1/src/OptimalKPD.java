/*We have 2 arrays of KPD for different power of boiler.
 * This class is need to solve how need task for each boiler to achieve task power
 * 
 * 
 */
public class OptimalKPD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double boilerKPD1[] = {0.5,
                0.6,
                0.64,
                0.65,
                0.66,
                0.67,
                0.66,
                0.64,
                0.62,
                0.62,0.66};
		double boilerKPD2[] = {0.5,
                0.6,
                0.64,
                0.65,
                0.66,
                0.67,
                0.51,
                0.64,
                0.52,
                0.52,0.41};
		double boilerKPDsum[][] = new double [20][3];
		int task2=0;
		for (int task=0; task<20;task++) {
			boilerKPDsum[task][0]=0;
			for (int task1=0;(task1<=10);task1++) {
				task2=task-task1;
				if ((task2>10) || (task2<0)) continue;
				if (boilerKPD1[task1]+boilerKPD2[task2]>boilerKPDsum[task][0]) {
						boilerKPDsum[task][0]=boilerKPD1[task1]+boilerKPD2[task2];
						boilerKPDsum[task][1]=task1;
						boilerKPDsum[task][2]=task2;
				}
				//System.out.println(task+" "+task1+" "+task2+" "+boilerKPDsum[task][0]);
			}
			System.out.println(task+"\t"+boilerKPDsum[task][0]+"\t"+boilerKPDsum[task][1]+"\t"+boilerKPDsum[task][2]);
		}
	}
}
