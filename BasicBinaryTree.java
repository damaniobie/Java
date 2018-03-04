// "static void main" must be defined in a public class.
public class Main {
    public static void main(String[] args) {
        Node n = new Node(50);
        n.insert(20);
        n.insert(300);
        n.insert(48);
        n.printInOrder();
    }
}

class Node{
    int data;
    Node left,right;
    
    public Node(int data){
        this.data = data;
    }
    
    public void insert(int value){
        if(value <= data){
            if(left== null){
                left = new Node(value);
            }else{
                left.insert(value);
            }
        }else{
            if(right==null){
                right = new Node(value);
            }else{
                right.insert(value);
            }
        }
    }
    
    public boolean contains(int value){
        if(value==data){
            return true;
        }else if(value < data){
            if(left==null){
                return false;
            } else{
               return left.contains(value);
            }
        }else{
            if(right==null){
                return false;
            }else{
                return right.contains(value);
            }
        }
    }
    
    public void printInOrder(){
        if(left!=null){
            left.printInOrder();
        }
        System.out.println(data);
        if(right!=null){
            right.printInOrder();
        }
    }
        
    
    
}
