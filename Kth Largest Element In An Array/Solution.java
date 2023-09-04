class Solution {
    
    public int partition(int [] arr, int low, int high){

        int pivot = arr[high];
        int pivotloc = low;

        for(int i=low; i<= high; i++){
            
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

    public int kthsmallest(int [] arr, int low, int high, int k){

        int partition = partition(arr, low, high);

        if(partition == k-1){

            return arr[partition];
        } 
        else if(partition < k-1){

            return kthsmallest(arr, partition+1, high, k);
        }
        else{

            return kthsmallest(arr, low, partition-1, k);
        }
    }
    
    public int findKthLargest(int[] nums, int k) {

        return kthsmallest(nums, 0, nums.length-1, k);
    }
}
