package epm;
import java.util.LinkedList;
import java.util.ArrayList;


//import javax.swing.tree.TreeNode;

import java.util.Arrays;

public class Tsk0 {
	public static void main (String[] args) throws NotDeficientNumberException {

	//     System.out.println(reverseString("asdfghjkl"));
	  //   System.out.println(reverseString("adf"));
	//     System.out.println(reverseString(null));
	    System.out.println("isPrime:"+isPrime(12)+" "+isPrime(13)+" "+isPrime(2)+" "+isPrime(42));
	     System.out.println("toggleDoors:"+toggleDoors(1)+"\n_2_"+toggleDoors(2)+"\n_4_"+toggleDoors(4)+"\n_9:_"+toggleDoors(9)+"\n___");
	     int arr[]= {5,3,4,6,7,8,4,3,7,9}//{1,4,6,2,5,9,5,6,8,2}
	     	,arr1[]= {164,67,55,4,6,476,378},arr2[]= {64,67,55,94,6,476,378},arr3[]= {4,6,8,10,12,13},arr4[]= {},//;//= {4,4,4,4};;
	    	arrT1[]= {1,1,1,2,2},arrT2[]= {1,2,5,8,10,12},arrT3[]={1,2,4,7,11,18,29,47},// {10,21,22,100,101,200,300}, //,arrT2[]= ,arrT3[]= ,
	    	arrM1[]= {1,2,3,4,6,7,8,9},arrM2[]= {2,6,7,3,5,8,9,1},arrM3[]= {1,2,3,4,5,6,7,10},
	    	arrP1[]= {1,2,3,4,5},arrP2[]= {2,6,4,8},arrP3[]={-4,-2,0,2,4};;
	     System.out.println(
	    //		"PLNDRM:"+isPalindrome("aba")+" "+isPalindrome("abbc")+"\n"+
	    		 "NumberDeficiency 1: "+NumberDeficiency(1)+" 21:"+NumberDeficiency(21)+" 10:"+NumberDeficiency(10)+" 16: "+NumberDeficiency(16)//+"20: "+NumberDeficiency(20)
	    		 +"\n"+
	    //	 "reverseNumber:"+reverseNumber(-541)+" "+reverseNumber(-33)+" "+reverseNumber(0)+" "+reverseNumber(55)+" "+reverseNumber(122)+" "+reverseNumber(59841)+"\n"+
	    //		 "Benefi: "+ getMaxBenefit(arr)+"\n"+
	     //"narciss:0"+isNarcissistic(0)+" 5: "+isNarcissistic(5)+"10:"+isNarcissistic(10)+" 153: "+isNarcissistic(153)+"8208: "+isNarcissistic(8208)+" "+isNarcissistic(10101)+"\n"+
	     //"SmallestDistInArr"+smallestDistanceInArray(arr1)+" "+smallestDistanceInArray(arr2)+" "+smallestDistanceInArray(arr3)+" "+smallestDistanceInArray(arr4)+" "+"\n"+
	     //"isSemiPrime:"+ isSemiPrime(3)+" "+ isSemiPrime(4)+" "+isSemiPrime(8)+" "+ isSemiPrime(26)+"\n "+
	     //"MinInArr:"+ searchMinValue(arr2)+"\n "+
	     //"NumBerInArr:"+ isNumberInArray(arr,54)+"\n "+
	     "countTriangleTriplets:"+ countTriangleTriplets(arrT1)+" "+countTriangleTriplets(arrT2)+" "+countTriangleTriplets(arrT3)+"\n:"+
	     "findMissingNumber:"+findMissingNumber(arrM1,9)+" "+findMissingNumber(arrM2,9)+" "+findMissingNumber(arrM3,9)+"\n"
	     //"reverseWord:"+reverseWords("the skY is Blue")+"\n"+reverseWords("the cake is a lie")+"\n"+reverseWords(null)+"\nnUll"+reverseWords("")+"\nEmpty\n"+
	     //"StrParenthesis:"+isValid("2*((5-2)/3)")+" "+isValid("(5-1)*2)")+" "+isValid("()")+" "+isValid("()()")+" "+isValid("((")+" "+isValid("))")+" "+isValid(")(")+" "+isValid(null)+"\n"+
	     //"isArithmeticProgression:"+ isArithmeticProgression(arrP1)+" "+isArithmeticProgression(arrP2)+" "+isArithmeticProgression(arrP3)+" "+"\n"
	     );
	    	
}
/*	public String practicePuzzle(Candidate candidate, Tutorial tutorial) {
		
		while (!candidate.isReadyForChallenge()) {
			candidate.playAroundWith(tutorial);
			
			if (candidate.isNervous()) {
				candidate.takeAdeepBreath();
			};
		}	po
		candidate.cliskNextAndStartChallenge();
		return "Good luck have fun!";
	}*/

//+1
public static String reverseString(final String str ) {
		if (str==null) {
			throw new IllegalArgumentException("string can not be null");
		}
		String result=str;
		if (str.length()>1) {
			result=str.charAt(str.length()-1)+reverseString(str.substring(0,str.length()-1));
		}
		return result;
}
//+2
public static boolean isPrime(int number ) {
	if (number<2) {
		throw new IllegalArgumentException("GrEaTer than 1!!!");
	}
	boolean isPrime=true;
	int iterateuntil=number/2;
	for (int i=2;i<iterateuntil && isPrime;++i) {
		isPrime=number%i!=0;
	}
	return isPrime;
}
//+3	
public static String toggleDoors(int numberOfDoors ) { ///WARNING!!! �����!!!
	boolean[] result =new boolean[numberOfDoors];
	for (int i=0;i<numberOfDoors ;++i) {
		result[i]=true;
	}
	for (int i=1;i<=numberOfDoors ;++i) {
		for(int j=i;j<=numberOfDoors;j=j+i) {
			result[j-1]=!result[j-1];
		}
	}
	//return result;
	String str = "";

	for (int i=0; i<result.length; i++) {
		str=str+result[i]+" ";
	}
	return str;
}
//+4
public static boolean isPalindrome(final String str ) {
	boolean result =true;
	if  (str==null) { 
		result=false;
	} else {
	
	for (int i=0;i<str.length()/2 && result ;i++) {
		result=str.charAt(i)==str.charAt(str.length()-i-1);
		}
	}
	return result;
	
}
//+5
public static int NumberDeficiency(int number) throws NotDeficientNumberException {   ///��� ����
	if (number <1) { 
		throw new IllegalArgumentException("Argument number has to be a posiTivE NiMbErRRR");
	}	
	int sumOfDivisors=0;
	for (int i=number;i>=1;i--) {
		if (number %i ==0) {
			sumOfDivisors+=i;
		}
	}
	if (sumOfDivisors>=2*number) {
		throw new NotDeficientNumberException ("DeFiCiEnCy of number "+number+ " is"+(2*number-sumOfDivisors)+",which is less than 1");	
	}
	return 2*number-sumOfDivisors;
	
}
//6+
public static int reverseNumber(int number) {
	int reversed=0;
	while (number!=0) {
		reversed=(reversed*10)+(number%10);
		number=number/10;
	}
	return reversed;
}
//+7
public static int getMaxBenefit(int[] stockPrices) {
	if (stockPrices==null ||stockPrices.length==0) {
		throw new IllegalArgumentException("StOcK pries cannot null or empty");
	}
	int maxBenefit=0, minPrice=stockPrices[0];
	for (int currentPrice:stockPrices) {
		int benefit=currentPrice-minPrice;
		if (benefit>maxBenefit) {
			maxBenefit=benefit;
		}
		if (currentPrice<minPrice) {
			minPrice=currentPrice;
		}
	}
	return maxBenefit;
}
//+8
public static boolean isNarcissistic(int number) {   ///���������!!!
	if (number<0) {
		throw new IllegalArgumentException("GiVeN number ust be positiveOrZero");
	}
	int localNumber = number;/////////FIXED
	ArrayList<Integer> numberDigits=new ArrayList<Integer>();
	while (localNumber>0) {
		numberDigits.add(localNumber%10);
		localNumber/=10;
	}
	int numberLength = numberDigits.size();
	long sum=0;/////FIXED
	for (int i=0;i<numberLength;i++) {
		long digit=numberDigits.get(i);
		for (int j=1;j<numberLength;j++)
			digit*=numberDigits.get(i);
			sum+=digit;
		}	
	return (sum==number);
	}
//+9
public static boolean isArithmeticProgression (int[] numbers) { 
	if (numbers==null) {
		throw new IllegalArgumentException("Input caNNOT BEnULl");
	}
	boolean result=true;
	if (numbers.length<2) {
		result=false;
	} else {
		int firstDiff=Math.abs(numbers[1]-numbers[0]);
		for (int i=2;i<numbers.length && result; ++i) {
			int diff=Math.abs(numbers[i]-numbers[i-1]);
			if (firstDiff !=diff) {
				result= false;
			}
		}
	}
	return result;
}
//+10 
public static String reverseWords(String input) {
	if (input==null || input.length()==0) {
		return "";
	}
	String[] arr = input.trim().split(" ");  ///FIXED
	StringBuilder sb=new StringBuilder();
	for (int i=arr.length-1;i>=0;--i) {
		
		sb.append(arr[i]);
		sb.append(" ");
				
	}
	return sb.length()==0 ? "" : sb.substring(0,sb.length()-1);
}	
//+11
public static boolean isValid(String data) {
	int value=0;
	if (data !=null) {
		for ( int index =0; index < data.length() && value >=0 ; ++index) {
			if (data.charAt(index)=='(') {
			value++;
			} else if (data.charAt(index)==')' ) {
			value--;			
			}
		}
	}
	return value==0;
}
/*
//12
public int cheapestPath(Pyramid pyramid) throws NullPyramidException {
	if (pyramid==null) {
		throw new NullPyramidException();
	}
	Pyramid copyPiramid = pyramid.copyPyramid();
	if (copyPiramid.getNumberOfLevels()>1) {
		for (int j=0;j<i+1;j++) {
			copyPyramid.getPyramidNode(i+1,j).getValue() < copyPyramid.getPyramidNode(i+1,j+1).getValue()+copyPyramid.getPyramidNode(i,j).getValue());
			if (copyPyramid.getPyramidNode)
		}
	}
	if (copyPyramid=pyramid.copyPyramid();)
	
}*/
//+13
public static int findMissingNumber (int[] numbers, int n) {
	if (numbers == null || numbers.length==0 || numbers.length+1!=n) {
		return 0;
	}
	int expectedSum=(n*(n+1))/2, realSum=0;
	int prevNumber=-1;
	Arrays.sort(numbers);
	for (Integer number:numbers) {
		if (number >=1 && number<=n && prevNumber !=number) {
			realSum+=number;
			prevNumber=number;
		} else {
			return 0;
		}
	}
	return expectedSum-realSum;
}

//14 ������ �� ����� �� �� ��������. 
public static boolean contains(TreeNode tree, int toBeFound) {
	if (tree==null) {
		throw new IllegalArgumentException("Params MUST NOt null");
	}
	LinkedList<TreeNode> nodesToCheck=new LinkedList<>();   //FIX
	nodesToCheck.add(tree) ;
	while (!nodesToCheck.isEmpty()) {
	TreeNode currentNode = nodesToCheck.removeFirst();
	if (toBeFound == currentNode.getValue()) {
			return true;
	} else if (toBeFound > currentNode.getValue()) {
		nodesToCheck.addAll(currentNode.getChildren());
		}
	}
	return false;
}
/*	*/	
//+15
public static boolean isSemiPrime(int n) {
	if (n<2) {
		throw new IllegalArgumentException("the param ShouLD be grtr or Eq 2");
	}
	boolean isCube=false; //FIX
	int countRealDivisors=0;
	for (int i=2;i<=n/2 && countRealDivisors <3 && !isCube; i++) {
		if (n%i==0) {
			countRealDivisors++;	
			if (n==i*i*i) {
				isCube=true;//FIX
			}
		}
	}
	return (countRealDivisors ==1 || countRealDivisors==2) && !isCube;
}
//+16
public static int searchMinValue(int[] array) {
	if (array==null) {
		throw new IllegalArgumentException("theArr MUSTNOTBENuLL");
	}
	if (array.length==0) {
		throw new IllegalArgumentException("ArrayCanNoTBEempty");
	}
	int min = array[0];
	for (int i=1;i<array.length;i++) {
		if (array[i]<min) {
			min=array[i];
		}
	}
	return min;
}
//+17 
public static boolean isNumberInArray(int[] numbers, int number) {
	if (numbers !=null && numbers.length >0) {
		for (int index =0;index < numbers.length;index++) {
			if (numbers[index]==number) {
				return true;
			}
		}
	}
	return false;
}
//18
public boolean isSymetric (TreeNode root) {
	if (root==null) {
		throw new IllegalArgumentException("Root shounDN'T be null");
	}
	return isSymmetric(root.left,root.right);
}
public boolean isSymmetric(TreeNode leftNode, TreeNode rightNode) {
	boolean result=true;
	if (leftNode==null || rightNode==null ) {
		result=leftNode ==null && rightNode==null;
	} else if (leftNode.value!=rightNode.value 
				|| !(isSymmmetric(leftNode.left,rightNode.right)
						&& isSymmetric(leftNode.right,rightNode.left))) {
		result=false;
	}
	return result;
}/* */
//+19 
public static long countTriangleTriplets (int[] input) {
	if (input==null) {		throw new NullPointerException("inPuTArraY is NULL");	}
	long result=0;//FIX triangleCounts
	Arrays.sort(input); //�������������
	for (int k=input.length-1;k>1;k--) {//������� ���� ���������
		int i=0; //����� ������ ��� ��� � ���� � 0��
		int j=k-1;   //FIX ������� "��" k-1�� ��������
		while (i!=j) { //���� �� ���������� i�j
			if (input[k]<input[i]+input[j]) {
				result +=j-i; //���� �����������
				j--;
			} else { 
				 //���� �� �����������? ���?
				i++;
			}
		}
	}
	return result;
}
		
//+20
public static Integer smallestDistanceInArray(int[] a) {
	Integer index=null;
	if (!((a==null) || (a.length<2))) {
		index=0; //FIX
		long minDistance=Math.abs((long) a[index+1]-(long) a[index]);
		for (int i=0;i<a.length-1;i++) {
			if (Math.abs((long) a[i+1]-(long)a[i]) < minDistance) {
				minDistance=Math.abs( a[index+1]-a[index]);
				index=i;
			}
		}
	}
	return index;
}
	
	
}


