public class minmax {
    public static void main(String args[]){
    int arr[]={1,2,4,6,7,4,7,4,6};
    int min =Integer.MAX_VALUE;
    int max=0;
    for (int i =0;i<arr.length;i++){
        if ( min>arr[i]){
            min=arr[i];
        }
        if(max<arr[i]){
            max=arr[i];
        }
    }
    System.out.println(min);
    System.out.println(max);
}
}
