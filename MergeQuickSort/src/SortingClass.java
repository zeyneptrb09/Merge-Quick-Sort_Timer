import java.util.*;

public class SortingClass {

	public static void sort(int[] arr) {
		Scanner input = new Scanner(System.in);
		MergeSort merge = new MergeSort();
		QuickSort quick = new QuickSort();
		
		System.out.println("Please pick a sort way?");
		System.out.println("1-merge2");
		System.out.println("2-merge3");
		System.out.println("3-quickfirst");
		System.out.println("4-quickrandom");
		System.out.println("5-quickmid");
		
		int sort=input.nextInt();
		System.out.println(" ");
		switch(sort) {
		 case 1 :
			 long startTime1 = System.nanoTime();
			 merge.mergeSort(arr,2);
			 long estimatedTime1 = System.nanoTime() - startTime1;
			 System.out.println("Time:  " + estimatedTime1 / 1000000.0 + " ms");
			 break;
		 case 2 :
			 long startTime2 = System.nanoTime();
			 merge.mergeSort(arr,3);
			 long estimatedTime2 = System.nanoTime() - startTime2;
			 System.out.println("Time:  " + estimatedTime2 / 1000000.0 + " ms");
			 break;
		 case 3 :
			 long startTime3 = System.nanoTime();
			 quick.quickSort(arr,"first");
			 long estimatedTime3 = System.nanoTime() - startTime3;
			 System.out.println("Time:  " + estimatedTime3 / 1000000.0 + " ms");
			 break;
		 case 4 :
			 long startTime4 = System.nanoTime();
			 quick.quickSort(arr,"random");
			 long estimatedTime4 = System.nanoTime() - startTime4;
			 System.out.println("Time:  " + estimatedTime4 / 1000000.0 + " ms");
			 break;
		 case 5 :
			 long startTime5 = System.nanoTime();
			 quick.quickSort(arr,"mid");
			 long estimatedTime5 = System.nanoTime() - startTime5;
			 System.out.println("Time:  " + estimatedTime5 / 1000000.0 + " ms");
			 break;
		}
	}
	public static void print(int[] arr) {
		System.out.print("Sorted Array: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random r = new Random();
		int n=0;
		int number=0;
		
		System.out.println("Please pick a size?");
		System.out.println("1-1000");
		System.out.println("2-10000");
		System.out.println("3-100000");
		
		n=input.nextInt();
		
		System.out.println("Please pick a array?");
		System.out.println("1-Equal");
		System.out.println("2-Random");
		System.out.println("3-Increasing");
		System.out.println("4-Decreasing");
		
		number=input.nextInt();
		
		
		
		switch(n) {
		 case 1 :
			 int[] ArraySort1= new int[1000];
			 switch(number) {
			 case 1:
				 for(int i=0;i<1000;i++) {
					 ArraySort1[i]=2;
				 }
				 sort(ArraySort1);
				 System.out.println("");
				 print(ArraySort1);
				 break;
			 case 2:
				 for(int i=0;i<1000;i++) {
					 ArraySort1[i]=r.nextInt(0,100);
				 }
				 sort(ArraySort1);
				 System.out.println("");
				 print(ArraySort1);
				 break;
			 case 3:
				 for(int i=0;i<1000;i++) {
					 ArraySort1[i]=i;
				 }
				 sort(ArraySort1);
				 System.out.println("");
				 print(ArraySort1);
				 break;
			 case 4:
				 for(int i=999;i>=0;i--) {
					 ArraySort1[i]=i;
				 }
				 sort(ArraySort1);
				 System.out.println("");
				 print(ArraySort1);
				 break;
			 }
			 break;
			 
		 case 2 :
			 int[] ArraySort2= new int[10000];
			 switch(number) {
			 case 1:
				 for(int i=0;i<10000;i++) {
					 ArraySort2[i]=2;
				 }
				 sort(ArraySort2);
				 System.out.println("");
				 print(ArraySort2);
				 break;
			 case 2:
				 for(int i=0;i<10000;i++) {
					 ArraySort2[i]=r.nextInt(0,100);
				 }
				 sort(ArraySort2);
				 System.out.println("");
				 print(ArraySort2);
				 break;
			 case 3:
				 for(int i=0;i<10000;i++) {
					 ArraySort2[i]=i;
				 }
				 sort(ArraySort2);
				 System.out.println("");
				 print(ArraySort2);
				 break;
			 case 4:
				 for(int i=9999;i>=0;i--) {
					 ArraySort2[i]=i;
				 }
				 sort(ArraySort2);
				 System.out.println("");
				 print(ArraySort2);
				 break;
			 }
			 break;
		 case 3 :
			 int[] ArraySort3= new int[100000];
			 switch(number) {
			 case 1:
				 for(int i=0;i<100000;i++) {
					 ArraySort3[i]=2;
				 }
				 sort(ArraySort3);
				 System.out.println("");
				 //print(ArraySort3);
				 break;
			 case 2:
				 for(int i=0;i<100000;i++) {
					 ArraySort3[i]=r.nextInt(0,100);
				 }
				 sort(ArraySort3);
				 System.out.println("");
				 //print(ArraySort3);
				 break;
			 case 3:
				 for(int i=0;i<100000;i++) {
					 ArraySort3[i]=i;
				 }
				 sort(ArraySort3);
				 System.out.println("");
				 //print(ArraySort3);
				 break;
			 case 4:
				 for(int i=99999;i>=0;i--) {
					 ArraySort3[i]=i;
				 }
				 sort(ArraySort3);
				 System.out.println("");
				 //print(ArraySort3);
				 break;
			 }
			 break;
		}
		
		
		
		
	}

}
