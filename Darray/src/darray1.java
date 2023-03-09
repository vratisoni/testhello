
public class darray1 {

	public static void main(String[] args) {
		
		int[] array = {10,20,30,40};
		int sum = 0;
		for(int n : array)
		{
			sum = sum+n;
		}
       int avg = sum/array.length;
       System.out.println("Average is = " +avg);
	}

}
