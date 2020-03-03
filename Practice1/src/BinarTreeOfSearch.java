import java.util.Arrays;
//import java.util.Collections;
import java.util.Random;
public class BinarTreeOfSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 3.0 from habr. Sorting of arrray is long-time-function, but binary searching is immediately!!!
		
		final Random random = new Random();
		final int number = 100000000;
		int[] arrayOfInt = new int [number];
		final int maxrnd=255000000;
		for (int i=0;i<number;i++)	{
			arrayOfInt[i]=random.nextInt(maxrnd);
		}
		int rndNumber=random.nextInt(maxrnd);
		System.out.println("NumSrch:"+rndNumber);
		
		//ArrPrnln(arrayOfInt);
		
		System.out.println("BruteForce");
		long begin = System.currentTimeMillis();
		System.out.println(brtFrc(rndNumber, arrayOfInt));
		System.out.println("Time:"+(System.currentTimeMillis()-begin));
		
		System.out.println("BinarySrch");
		Arrays.parallelSort(arrayOfInt);
		
		begin = System.currentTimeMillis();
		System.out.println(binSrch(rndNumber, arrayOfInt));
		System.out.println("Time:"+(System.currentTimeMillis()-begin));
		
		begin = System.currentTimeMillis();
		System.out.println(binarySearchRecursively(arrayOfInt,rndNumber));
		System.out.println("Time:"+(System.currentTimeMillis()-begin));
		//ArrPrnln(arrayOfInt);
		
		
		return ;
		//sort
		//Arrays.sort(arrayOfInt);
		//find
	}

	public static boolean binSrch (int numbSrch,int[] array)	{
		int arrBeg = 0;
		int arrEnd=array.length-1;
		
		while (arrEnd-arrBeg>1){
			
			if (array[(arrBeg+arrEnd)/2] > numbSrch)	{
				arrEnd=(arrBeg+arrEnd)/2;
				continue;
			}
			else if (array[(arrBeg+arrEnd)/2] < numbSrch)	{
				arrBeg=(arrBeg+arrEnd)/2;
				continue;
			}
			else {
				//System.out.println("EXIST!"+(arrBeg+arrEnd)/2);
				//break;
				System.out.println("beg"+arrBeg+"End"+arrEnd);
				return true;
			}
		}
		System.out.println("beg"+arrBeg+"End"+arrEnd);
		return false;
	}
	
	public static boolean brtFrc(int numbSrch, int[] array)	{
		
		for (int i=0;i<array.length-1;i++)	{
			if (array[i]==numbSrch) 
				return true;
		}
		return false;
	}

	public static int binarySearchRecursively(int[] sortedArray, int key) {
        return binarySearchRecursively(sortedArray, key, 0, sortedArray.length);
    }
	private static int binarySearchRecursively (int[] sortedArray, int key, int low, int high) {
		int middle = (low + high) / 2; // середина
		if (high < low) { // больше делить нечего
			return -1;
		}
		if (key == sortedArray[middle]) { // если нашёлся
			return middle;
		} else if (key < sortedArray[middle]) { // ищем в левой половине
			return binarySearchRecursively(sortedArray, key, low, middle - 1);
			} else {
				return binarySearchRecursively(sortedArray, key, middle + 1, high);
				}
	}
	public static void ArrPrnln(int arry[])	{
		for (int i=0;i<arry.length;i++)	{
			System.out.print(arry[i]+" ");
			if ((i!=0)&(i % 20==0))	{
				System.out.println();
			}
		}
		System.out.println();
	}
}
