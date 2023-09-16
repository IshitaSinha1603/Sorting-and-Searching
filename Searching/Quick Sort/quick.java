class quick {
    public static void printArray(int[] arr) {
        for(int i=0;i<arr.length-1;i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static int partition(int[] arr, int low, int high) {
        int pivot=arr[high];
        int i=low-1;
        for(int j=low;j<high;j++) {
            if(arr[j]<pivot) {
                //swap
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        //swap with pivot
        i++;
        int temp=arr[i];
        arr[i]=arr[high];
        arr[high]=temp;
        return i;
    }
    public static void sort(int[] arr, int low, int high) {
        if(low<high) {
            int pi=partition(arr,low,high);
            sort(arr,low,pi-1);
            sort(arr,pi+1,high);
        }
    }
    public static void main(String args[]) {
        int[] arr={7,8,6,1,0,9};
        System.out.println("Array before sorting:\n");
        printArray(arr);
        System.out.println("\n");
        sort(arr,0,arr.length-1);
        System.out.println("Array after sorting:\n");
        printArray(arr);
    }
}

//Worst case occurs when pivot is always the smallest or the largest element