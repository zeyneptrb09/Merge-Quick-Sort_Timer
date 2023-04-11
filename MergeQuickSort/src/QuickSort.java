import java.util.Random;

public class QuickSort {

	public static void quickSort(int[] arrayToSort, String pivotType) {
		
		pivotType = pivotType.toLowerCase();
		 
		if(pivotType.contains("first")) {
			quickSortFirst(arrayToSort,0,arrayToSort.length-1);
		}
		else if(pivotType.contains("random")) {
			quickSortRandom(arrayToSort,0,arrayToSort.length-1);
		}
		else if(pivotType.contains("mid")) {
			quickSortMid(arrayToSort,0,arrayToSort.length-1);
		}
		else {
			System.out.println("pivotType is not ture. Please try again");
		}
	}
	
		//swap for all functions
		public static void swap(int[] arr,int j, int i) {
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			
		}
		
		//function that always choose first element for pivot
		public static int partitionfirst(int[] arr, int low, int high) {
			
			int pivot=arr[low];
			
			int i = low+1;
			
			for(int j=low+1;j<=high;j++) {
				if(arr[j]<pivot) {
					
					swap(arr,i,j);
					i++;
				}
			}
			
			swap(arr,i-1,low);
			return (i-1);
		}
		
		public static void quickSortFirst(int[] arr,int low,int high) {
			if(low<high) {
				
				int pi=partitionfirst(arr,low,high);
				
				quickSortFirst(arr,low,pi-1);//recursive
				quickSortFirst(arr,pi+1,high);
				
			}
		}
		
	
		public static int partitionRandom(int[] arr, int low, int high) {//function that random pivot
			Random r = new Random();
			int number=r.nextInt(high-low+1)+low;//random index

			int pivot=arr[number];
			
			int i = low-1;
			
			for(int j=low;j<=high;j++) {
				if(arr[j]<pivot) {
					i++;
					if(j!=number && i!=number) {//pivot not swap control
						swap(arr,i,j);
					}
						
				}
				
			}
			
			
			swap(arr,i+1,number);
			
			return (i+1);
			
		}
		
		public static void quickSortRandom(int[] arr,int low,int high) {
			if(low<high) {
				
				int pi=partitionRandom(arr,low,high);
				
				
				quickSortRandom(arr,low,pi-1);
				quickSortRandom(arr,pi+1,high);
				
			}
		}
		public static int findMedian(int a, int b, int c) {//find the median of three numbers entered
		    int max = Math.max(Math.max(a, b), c);
		    int min = Math.min(Math.min(a, b), c);
		    return a + b + c - max - min;
		}
		
		public static int partitionMid(int[] arr, int low, int high) {//function that choose mid of first, middle and last for pivot
			int middle=0;
			
			if((high-low)%2==0) {//for odd array
				middle=(high-low)/2;
			}
			if((high-low)%2==1) {//for even array
				middle=(high-low+1)/2;
			}
			
			
			int pivot=findMedian(arr[low], arr[middle], arr[high]);
			int number=0;
			if (pivot == arr[low]) {//control for find pivot index
			    number = low;
			} else if (pivot == arr[middle]) {
			    number = middle;
			} else {
			    number = high;
			}
			
			int i = low-1;
			
			for(int j=low;j<=high;j++) {
				if(arr[j]<pivot) {
					i++;
					if(j!=number && i!=number) {
						swap(arr,i,j);
					}
						
				}
			}
			
			
			swap(arr,i+1,number);
			return (i+1);
			
		}
		
		public static void quickSortMid(int[] arr,int low,int high) {
			if(low<high) {
				
				int pi=partitionMid(arr,low,high);
		
				quickSortMid(arr,low,pi-1);
				quickSortMid(arr,pi+1,high);
				
			}
		}
}
