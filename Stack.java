import java.util.*;
public class Main {
    public static void main(String[] args) {
        Stacker s = new Stacker(10);
        s.push("16");
        s.push("17");
        s.push("27");
        s.pushMultiple("13 56 78 43 2");
        s.peek();
    }
}

 class Stacker{
    private String[] arr;
    private int size;
    private int top = -1;
    
    public Stacker(int s){
        size = s;
        arr = new String[s];
        Arrays.fill(arr, "-1");
    }
    
    public void push(String input){
        if(top + 1 < size){
            top++;
            arr[top] = input;
        }else{
            System.out.println("The stack is full");
        }
        displayStack();
        System.out.println(input+" was added");
    }
    
    public String pop(){
        if(top >= 0){
            displayStack();
            System.out.println("Popped "+arr[top]+" from the stack");
            arr[size] = "-1";
            return arr[top--];
        }else{
            System.out.println("The stack is empty");
            return "-1";
        }
    }
    
    public String peek(){
        if(size>0){
            System.out.println(arr[top]+" is at the top of the stack");
            return arr[top];
        }else{
            return "-1";
        }
    }
    
    public void displayStack(){
        for(int i=size-1;i>=0;i--){
            System.out.print("| "+i+"|");
            System.out.print("| "+arr[i]+"|\n");
        }
    }
     
     public void pushMultiple(String manyValues){
        String[] temp = manyValues.split(" ");
         for(int i=0;i<temp.length;i++){
             push(temp[i]);
         }
     }
}
