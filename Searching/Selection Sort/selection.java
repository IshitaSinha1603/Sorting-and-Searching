class selection {
    public static void printArray(int[] arr) {
        for(int i=0;i<arr.length-1;i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void sort(int[] arr) {
        for(int i=0;i<arr.length-1;i++) {
            int smallest=i;
            for(int j=i+1;j<arr.length;j++) {
                if(arr[smallest]>arr[j])
                    smallest=j;
            }
            int temp=arr[smallest];
            arr[smallest]=arr[i];
            arr[i]=temp;
        }
    }
    public static void main(String args[]) {
        int[] arr={7,8,6,1,0,9};
        System.out.println("Array before sorting:\n");
        printArray(arr);
        System.out.println("\n");
        sort(arr);
        System.out.println("Array after sorting:\n");
        printArray(arr);
    }
}

/* 
Finding the index in smallest and checking it with every element and swapping accordingly
 */