public class secondlargst {
    public static void main (String args[]){
        int arr[]={7,2,3,6,5};
        int largest=0;
        int secondlgst=0;
        
        for (int i=0;i<arr.length;i++){
            if (arr[i]>largest){
                secondlgst=largest;
                largest=arr[i];
            }
            else if(arr[i]>secondlgst && arr[i]!=largest){
                secondlgst=arr[i];
            }
            
        }
        System.out.println(secondlgst);
    }
}
