package sorting_tech;

public class selectoin_sort
{
	public static void main(String[]args) 
	{
	int arr[]= {12,34,2,4,87,90,123};
	int size =arr.length;
	int temp=0;
	int minindex=-1;
	for(int i=0;i<size-1;i++) 
	{
		minindex=i;
		for(int j=i+1;j<size;j++) 
		{
			if(arr[minindex]>arr[j]) {
				minindex=j;
			}
			
		}
		temp=arr[minindex];
		arr[minindex]=arr[i];
		arr[i]=temp;
	}
	System.out.print("sorted array:");
	System.out.println();
	System.out.print("     ");
	for(int num:arr)
		System.out.print(num+" ");
	}
	
}
