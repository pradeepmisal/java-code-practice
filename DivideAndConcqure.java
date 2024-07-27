public class DivideAndConcqure {
    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println();
    }
    public static void QuickSort(int[] arr,int si, int ei){
       if (si>=ei) {
        return;
       }
        //last element
       int pIdx =partition(arr, si, ei);
       QuickSort(arr , si, pIdx-1 );
       QuickSort(arr, pIdx+1, ei);
    }
    public static int partition(int arr[], int si , int ei){
        int pivot =arr[ei-1];
        int i = si-1;//TO make placr in the array which are smaller than pivot
        for (int j=0; j<ei; j++){
            if (arr[j]<= pivot){
                i++;
                //swap
                int temp=arr[j];
                arr [j]= arr[i];
                arr[i]=temp;
            }
        }
        i++;
        //swap
        int temp=pivot;
        arr [ei]= arr[i];
        arr[i]=temp;
        return i;
    }
    public static void main(String[] args) {
        int arr[]={6,3,9,5,2,8};
        QuickSort(arr, 0 , arr.length-1);
        printArr(arr);
        
}
}
