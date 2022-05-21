/***
 * Recursive implementation of binary search
 */


public class binarySearchRecursive {
    private static boolean search;
    public static void main(String[] args) {
        search = search(new int[]{1,2,3,4,5,6,7,8,9,10,11,12},0,11,1);
        System.out.println(search);
    }
    static boolean search(int[] arr,int l,int r,int key){
        
        int mid = (l+r)/2;
        
        if(l>r){
            return false;
        }
        if(key > arr[mid]){
            return search(arr,mid+1,r,key);
        }
        else if(key < arr[mid]){
            return search(arr, l, mid-1, key);
        }
        return true;
    }
}
