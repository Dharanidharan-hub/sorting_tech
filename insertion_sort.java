package sorting_tech;
class insertion_sort{
	public static void main(String[] args) {
		int arr[]= {5,3,6,8,1};
		int size=arr.length;
		for(int i=1;i<size;i++) {
			int key=arr[i];
			int j=i-1;
			while(j>=0 &&arr[j]>key) {
				arr[j+1]=arr[j];
				j--;
				
			}
			arr[j+1]=key;
		}
		for(int n:arr)
			System.out.print(n+" ");
		
		
	}
	
}