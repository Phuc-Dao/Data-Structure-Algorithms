//uses Stacks to reverse a string
class node{
    int number;
    node next;

    //constructor for the node data structure
    node(int num){
        this.number = num;
    }

}

class stack{
    //This is the top node
    node top;

    stack(){
        top = null;
    }

    //This pops the top node
    public void pop(){
        if(top != null){

        }
    }
    //This pushes the new node
    public void push(node obj){
        node temp = new node(5);
        top = temp;
    }
    public static void main(String[] args){
     //implamentation of a stack
     
    }
}