class insertion {
    public static void printArray(int[] arr) {
        for(int i=0;i<arr.length-1;i++) {
            System.out.println(arr[i]+" ");
        }
    }
    public static void sort(int[] arr) {
        for(int i=1;i<arr.length-1;i++) {
            int current=arr[i];
            int j=i-1;
            while(j>=0 && current<arr[j]) {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=current;
        }
    }
    public static void main(String args[]) {
        int[] arr={7,1,8,0,3,2};
        System.out.println("Array before sorting:\n");
        printArray(arr);
        System.out.println("\n");
        sort(arr);
        System.out.println("Array after sorting:\n");
        printArray(arr);
    }
}

/*
Time Complexity:
Best Case - O(n)
Average Case - O(n^2)
Worst Case - O(n^2)
Space Complexity:
O(1)
*/