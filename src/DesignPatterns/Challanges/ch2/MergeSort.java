package DesignPatterns.Challanges.ch2;

public class MergeSort implements SortingStrategy{
    @Override
    public void sort(Integer[] list) {
        int len = list.length;
        if (len < 2){return;}

        int mid = len / 2;
        Integer[] left_arr = new Integer[mid];
        Integer[] right_arr = new Integer[len-mid];

        //Dividing array into two and copying into two separate arrays
        int k = 0;
        for(int i = 0;i<len;++i){
            if(i<mid){
                left_arr[i] = list[i];
            }
            else{
                right_arr[k] = list[i];
                k = k+1;
            }
        }
        // Recursively calling the function to divide the subarrays further
        sort(left_arr);
        sort(right_arr);
        // Calling the merge method on each subdivision
        merge(left_arr,right_arr,list,mid,len-mid);
    }


    private static void merge(Integer[] left_arr,Integer[] right_arr, Integer[] arr,Integer left_size, Integer right_size){

        int i=0,l=0,r = 0;
        //The while loops check the conditions for merging
        while(l<left_size && r<right_size){

            if(left_arr[l]<right_arr[r]){
                arr[i++] = left_arr[l++];
            }
            else{
                arr[i++] = right_arr[r++];
            }
        }
        while(l<left_size){
            arr[i++] = left_arr[l++];
        }
        while(r<right_size){
            arr[i++] = right_arr[r++];
        }
    }
}
