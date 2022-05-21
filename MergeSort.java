/**
 * 
 * Implementation of merge sort
 */

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = new int[]{1,5,2,3,7,4,9,6,-1};
        sort(arr,0,8);
        for(int i=0;i<8;i++){
            System.out.println(arr[i]);
        }
        
    }

    static void sort(int[] arr,int beg,int end){
        if(beg<end){
            int mid = (beg+end)/2;
            sort(arr,beg,mid);
            sort(arr,mid+1,end);
            merge(arr, beg, mid, end);
        }
    }

    static void merge(int[] arr,int beg,int mid,int end){
        int left[] = new int[mid-beg+1];
        int right[] = new int[end-mid];
        int n1 = mid-beg+1;
        int n2 = end-mid;
        for(int i = 0;i<n1;i++){
            left[i] = arr[beg+i];
        }
        for(int j=0 ; j<n2 ; j++){
            right[j] = arr[mid+1+j];
        }

        int k = beg;
        int i = 0;
        int j = 0;
        while(i<n1 && j<n2){
            if(left[i] < right[j]){
                arr[k++] = left[i++];
            }
            else{
                arr[k++] = right[j++];
            }
        }
        while(i<n1){
            arr[k++] = left[i++]; 
        }

        while(j<n2){
            arr[k++] = right[j++];
        }
    }
}
