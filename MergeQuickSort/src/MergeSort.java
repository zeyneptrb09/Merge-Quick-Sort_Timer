
public class MergeSort {
	
	public static void mergeSort(int[] arrayToSort, int numberOfPartitions) {
		if(numberOfPartitions==2) {
			mergeSort(arrayToSort, 0, arrayToSort.length-1);
		}
		else if(numberOfPartitions==3) {
			mergeSort3(arrayToSort, 0, arrayToSort.length-1);
		}
	}

	
	public static void mergeSort(int arr[], int l, int r) 
    { 
        if (l < r) 
        { 
            // middle
            int m = (l+r)/2; 
  
            // first and second halves sorted recursive  
            mergeSort(arr, l, m); 
            mergeSort(arr , m+1, r); 
  
            // merge for halves that sorted 
            merge2(arr, l, m, r); 
        }
        
        
    }
	
	public static void merge2(int arr[], int l, int m, int r) // merge function for 2 halves 
    { 
        int n1 = m - l + 1; //find array length
        int n2 = r - m; 
  
        int L[] = new int [n1]; 
        int R[] = new int [n2]; 
  
        for (int i=0; i<n1; ++i) 
            L[i] = arr[l + i]; 
        for (int j=0; j<n2; ++j) 
            R[j] = arr[m + 1+ j]; 
  
  
  
        int i = 0, j = 0; 
  
        int k = l; 
        while (i < n1 && j < n2) 
        { 
            if (L[i] <= R[j]) 
            { 
                arr[k] = L[i]; 
                i++; 
            } 
            else
            { 
                arr[k] = R[j]; 
                j++; 
            } 
            k++; 
        } 
    
        while (i < n1) 
        { 
            arr[k] = L[i]; 
            i++; 
            k++; 
        } 
    
        while (j < n2) 
        { 
            arr[k] = R[j]; 
            j++; 
            k++; 
        } 
    }
	
	public static void mergeSort3(int arr[], int l, int r) 
    { 
        if (l < r) 
        { 
            // middle
        	int n = r - l + 1;
            int m1 = l + n / 3 - 1;
            int m2 = l + 2 * n / 3 - 1;
  
            // first and second halves sorted recursive  
  		  	mergeSort3(arr, l, m1); 
            mergeSort3(arr , m1+1, m2); 
            mergeSort3(arr, m2+1, r);

  
            // merge for halves that sorted 
            merge3(arr, l, m1,m2, r); 
        }
        
        
    }
	
	public static void merge3(int arr[], int l, int m1,int m2, int r) //merge function for 3 halves
    { 
        int n1 = m1 - l + 1; 
        int n2 = m2 - m1; 
        int n3=r-m2;
  
        int L[] = new int [n1];
        int M[] = new int [n2]; 
        int R[] = new int [n3];
  
        for (int i=0; i<n1; ++i) 
            L[i] = arr[l + i]; 
        for (int i=0; i<n2; ++i) 
            M[i] = arr[m1 + 1+ i]; 
        for (int i=0; i<n3; ++i) 
            R[i] = arr[m2 + 1+ i]; 
  
  
  
        int i = 0, j = 0, k=0;
  
        int index = l; 
      
        while (i < n1 && j < n2 && k < n3) 
        { 
        	if (L[i] <= M[j] && L[i] <= R[k]) {
                arr[index] = L[i];
                i++;
                
            } else if (M[j] <= L[i] && M[j] <= R[k]) {
                arr[index] = M[j];
                j++;
            } else {
                arr[index] = R[k];
                k++;
            }
        	index++;
        } 
   
        while (i < n1 && j < n2) {
            if (L[i] <= M[j]) {
                arr[index] = L[i];
                i++;
            } else {
                arr[index] = M[j];
                j++;
            }
            index++;
        }
        while (j < n2 && k < n3) {
            if (M[j] <= R[k]) {
                arr[index] = M[j];
                j++;
            } else {
                arr[index] = R[k];
                k++;
            }
            index++;
        }
        while (i < n1 && k < n3) {
            if (L[i] <= R[k]) {
                arr[index] = L[i];
                i++;
            } else {
                arr[index] = R[k];
                k++;
            }
            index++;
        }
        while (i < n1) {
            arr[index] = L[i];
            i++;
            index++;
        }
        while (j < n2) {
            arr[index] = M[j];
            j++;
            index++;
        }
        while (k < n3) {
            arr[index] = R[k];
            k++;
            index++;
        }
    }
	

  

}
