class Solution {
	
	public int partition(int [] arr, int low, int high){

		int pivot = arr[high];
		int pivotloc = low;
		
		for(int i=low; i<=high; i++){
			
			if(arr[i] > pivot){

				int temp = arr[i];
				arr[i] = arr[pivotloc];
				arr[pivotloc] = temp;
				pivotloc++;				
			}		
		}
		
		int temp = arr[high];
		arr[high] = arr[pivotloc];
		arr[pivotloc] = temp;
		
		return pivotloc;		
	}
	
	public int kthlargest(int [] arr, int low, int high, int k){
		
		int partition = partition(arr, low, high);
		
		if(partition == k-1){
			
			return arr[partition];			
		}
		else if(partition < k-1){

			return kthlargest(arr, partition+1, high, k);			
		}
		else{
			
			return kthlargest(arr, low, partition-1, k);
		}		
	}
	
	
	int getKthLargestElement(int[] list, int k) {
	    				
		return kthlargest(list, 0, list.length-1, k);		
	}
	
}
