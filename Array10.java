public class Array10 {
    public static void leaders(int[] arr){
        int last= arr[arr.length-1];
        System.out.print(last+" ");

        for(int i=arr.length-1; i>=0; i--){
            if(arr[i]>last){
                last=arr[i];
                System.out.print(arr[i]+" ");
                }
                }
                }
                public static void main(String[] args) {
                    int[] arr={7,10,4,10,6,5,2};
                    leaders(arr);
                    }
                    }

