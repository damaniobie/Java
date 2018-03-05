import java.lang.*;
public class Main {
    public static void main(String[] args) {
       
       /* Test manipulating arrays (NOT USING OBJECTS)*/
       
        int x[] = new int[20];
        x = fillArray();
        printArray(x);
        findValue(x,12);
        System.out.println(findAtIndex(x,7));
        /*System.out.println("\n\nAfter Sorting...\n");
        sortAscending(x);
        printArray(x);*/
        
    }
    
    static int[] fillArray(){
        int a[] = new int[20];
        for(int i=0;i<a.length;i++){
            a[i] = (int) (Math.random()* 50) + 1;
        }
        return a;
    }
    
    static void printArray(int [] a){
        System.out.println("Index\tValue\n------------");
        for(int i=0;i<a.length;i++){
            System.out.println(+i+"\t"+a[i]);
        }
    }
    
    static boolean findValue(int[]a,int x){
        for(int i=0;i<a.length;i++){
            if(x == a[i]){
                System.out.println(x+" was found at index "+i);
                return true;
            }
        }
        System.out.println(x+" was not found!");
        return false;
    }
    
    static int findAtIndex(int[]a, int x){
        if(x < a.length && x >= 0){
            return a[x];
        }
        return -1; //failure to find
    }
    
    static void swapSpots(int[]a, int x, int y){
        if(x >= 0 && x < a.length && y < a.length && y >= 0){
            int temp = a[x];
            a[x] = a[y];
            a[y] = temp;
        }
    }
    
    static void deleteIndex(int [] a, int index){
        for(int i=index;i<a.length;i++){
            a[i] = a[i+1];
        }
    }
    
    //These won't work without objects
   /* static int[] sortAscending(int[]a){
        System.out.println("Sorting from lowest value to highest value..");
        for(int i=0;i<a.length;i++){
            if(a[i] < a[i+1]){
                swap(a[i],a[i+1]);
            }
        }
        return a;
    }
    
    static void swap(int x, int y){
        int temp = x;
        x = y;
        y = temp;
    }*/
    
}
