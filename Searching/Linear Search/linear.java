class linear {
    public static int search(int[] arr, int x) {
        int i;
        for(i=0;i<arr.length;i++) {
            if(arr[i]==x)
                return i;
        }
        return -1;
    }
    public static void main(String args[]) {
        linear ob=new linear();
        int[] arr={9,5,1,7,6,0,3};
        int x=9;
        int result=ob.search(arr,x);
        if(result==-1)
            System.out.println("Element not found");
        else    
            System.out.println("Element found at index "+result);
    }
}

/*
Time Complexity:
Best Case - O(1)
Average Case - O(n)
Worst Case - O(n)
Space Complexity:
O(1)
*/