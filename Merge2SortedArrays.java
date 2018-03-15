public class Main {
    
    /* merge two sorted arrays 
       This could be done using the Arrays.copyOf and Arrays.sort functions, but this way is O(n) complexity
    */
    public static void main(String[] args) {
        int x[] = {2,3,4,7,9,15,29,39,79,109,227,445,876}; //size 13
        int y[] = {0,3,23,27,31,58,69,88,300,500};      //size 10
        
        printArr(mergeArrays(x,y));
    }
    
    public static int[] mergeArrays(int[]myArray,int[]herArray){
        int [] mergedArr = new int[myArray.length + herArray.length];
        
        int myIndex = 0,herIndex = 0,mergeIndex = 0;
       
        
        while(mergeIndex < mergedArr.length){
             boolean myArrExhausted = myIndex >= myArray.length;
            boolean herArrExhausted = herIndex >= herArray.length;
            if(!myArrExhausted && (herArrExhausted || (myArray[myIndex] < herArray[herIndex])))             {
                mergedArr[mergeIndex] = myArray[myIndex];
                myIndex++;
            }else {
                mergedArr[mergeIndex] = herArray[herIndex];
                herIndex++;
            }
            mergeIndex++;
        }
        return mergedArr;
    }
    
    static void printArr(int[]arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
