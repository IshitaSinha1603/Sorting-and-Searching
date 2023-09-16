class linear {
    public static void linear(int[] arr, int x) {
        int c=0;
        for(int i=0;i<arr.length;i++) {
            if(arr[i]==x)
                c++;
        }
        if(c==1)
            System.out.println("Element found");
        else    
            System.out.println("Element not found");
    }
    public static void main(String args[]) {
        int[] arr={9,5,1,7,6,0,3};
        int x=6;
        linear(arr,x);
    }
}