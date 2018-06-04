//simple stack implamentation
class stackExample {
    //empty array that will represent our stack
    private int[] stackArray;
    private int arraySize;
    //set to -1 so when you increase it by one then it becomes zero for the first index of the array. when the stacktop is empty then 
    private int stackTop = -1;
    
    //This is the constructor
    stackExample(int size){
        arraySize = size;
        stackArray = new int[arraySize];

    }
    //How do you pop an element from an array
    public int pop(){
        stackTop--;
        return stackArray[stackTop];
    }
    //push method that pushes an item
    public void push(int item){
        ++stackTop;
        System.out.println("The top of the stack index is " + stackTop);
        System.out.println("added " + item + " to the stack");
        //increments the top of the stack and then stores the value
        stackArray[stackTop] = item;
    }

    public void printArr(){
        for(int i =0; i <= stackTop; i++){
            System.out.println(stackArray[i]);
        }
    }

    public int peek(){
        return stackArray[stackTop]; // returns a number
    }

    //checks if the stack is empty
    public boolean isEmpty(){
       if(stackTop == -1)
            return true;
        return false;
    }
    
    //main method
    public static void main(String[] args){
        stacks_queues stackName = new stacks_queues(10); //private so you wont be able to access the array dirrectly
        stackName.push(10);
        stackName.push(25);
        stackName.push(34);
       stackName.printArr();
    }
}