public class binarySearch {
    public static void main(String[] args) {
        System.out.println(search(new int[]{1,2,3,4,5,6,7,8,9,10,11,12},12));
        
    }

    static boolean search(int[] arr,int key){
        int l=0 , r=arr.length-1;
        int mid =0;
        while(l<=r){
            mid = (r+l)/2;
            System.out.println(mid);
            if(arr[mid] == key){
                return true;
            }
            else if(arr[mid] > key){
                r = mid-1;
            }
            else{
                l=mid+1;
            }
        }
        
        return false;
    }

    
}
