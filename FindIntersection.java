package week1day2;

public class FindIntersection {

	public static void main(String[] args) {
		
		int[] arr= {3,2,11,4,6,7};
		int[] arr1= {1,2,8,4,9,7};
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr1.length;j++)
			{
				if(arr[i]==arr1[j])
				{
					System.out.println("Intersection of two array is  "+arr[i]);
				}
			}
		}
	}

}
