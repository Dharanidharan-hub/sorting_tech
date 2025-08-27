package sorting_tech;

public class bubble_sort {
	public static void main(String[]args) {
		int temp;
		int arr[]= {180,9,23,1,90};
		int size=arr.length;
		for(int i=0;i<size;i++) {
			for(int j=0;j<size-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					
					
				}
			}
			for(int num:arr)
				System.out.print(num+" ");
			System.out.println();
		}
	}

}
