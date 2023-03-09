import java.util.Scanner;

public class inputarray {
	
	public  int[] arrayinut()
	{  
		Scanner s = new Scanner(System.in);
		System.out.println("input the size of the array");
		int size = s.nextInt();	
		int[] a = new int[size];
		System.out.println("enter the elements of array");
		for(int i=0;i<size;i++)
		{
		a[i]=s.nextInt();	
		}
		return a;			
	}

	public static void main(String[] args) {
		inputarray in = new inputarray();
		int[] arr = in.arrayinut();
		for(int a : arr)
		{
			System.out.println(a);
		}

	}

}
