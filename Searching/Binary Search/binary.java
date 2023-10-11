import java.util.Arrays;
class binary {
    public static int search(int[] arr, int x) {
        Arrays.sort(arr);
        int low=0;
        int high=arr.length-1;
        while(low<=high) { 
            int mid=low+(high-low)/2;
            if(arr[mid]==x)
                return mid;
            else if(arr[mid]<x)
                low=mid+1;
            else
                high=mid-1;
        }
        return -1;
    }
    public static void main(String args[]) {
        binary ob=new binary();
        int[] arr={9,5,1,7,6,0,3};
        int x=6;
        int result=ob.search(arr,x);
        if(result==-1)
            System.out.println("Element not found");
        else    
            System.out.println("Element found at index "+result);
    }
}

/*
Time Complexity:
Best Case - O(log n)
Average Case - O(log n)
Worst Case - O(1)
Space Complexity:
O(1)
*/