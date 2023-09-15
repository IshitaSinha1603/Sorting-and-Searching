class bubble {
    public static void printArray(int[] arr) {
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void sort(int[] arr) {
        for(int i=0;i<arr.length-1;i++) {
            for(int j=0;j<arr.length-i-1;j++) {
                if(arr[j]>arr[j+1]) {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void main(String args[]) {
        int[] arr={9,6,2,4,0,1};
        System.out.println("Array before sorting:\n");
        printArray(arr);
        System.out.println("\n");
        sort(arr);
        System.out.println("Array after sorting:\n");
        printArray(arr);
    }
}