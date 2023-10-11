class merge {
    public static void printArray(int[] arr) {
        for(int i=0;i<arr.length-1;i++) {
            System.out.println(arr[i]+" ");
        }
    }
    public static void divide(int[] arr, int si, int ei) {
        if(si>=ei)
            return;
        int mid=si+(ei-si)/2;
        divide(arr,si,mid);
        divide(arr,mid+1,ei);
        conquer(arr,si,mid,ei);
    }
    public static void conquer(int[] arr, int si, int mid, int ei) {
        int merged[]=new int[ei-si+1];
        int idx1=si;
        int idx2=mid+1;
        int x=0;
        while(idx1<=mid && idx2<=ei) {
            if(arr[idx1]<=arr[idx2])
                merged[x++]=arr[idx1++];
            else
                merged[x++]=arr[idx2++];
        }
        while(idx1<=mid)
            merged[x++]=arr[idx1++];
        while(idx2<=ei)
            merged[x++]=arr[idx2++];
        for(int i=0,j=si;i<merged.length;i++,j++)
            arr[j]=merged[i];
    }
    public static void main(String args[]) {
        int[] arr={7,1,8,0,3,2};
        int n=arr.length;
        System.out.println("Array before sorting:\n");
        printArray(arr);
        System.out.println("\n");
        divide(arr,0,n-1);
        System.out.println("Array after sorting:\n");
        printArray(arr);
    }
}

/*
Time Complexity:
Best Case - O(nlog n)
Average Case - O(n log n)
Worst Case - O(n logn)
Space Complexity:
O(n)
*/