//simple stack implamentation
class stacks_queues {
    //empty array that will represent our stack
    private int[] stackArray;
    private int arraySize;
    //set to -1 so when you increase it by one then it becomes zero for the first index of the array
    private int stackTop = -1;

    //constructor that creates the stack 
    stacks_queues(int size){
        stackTop++;
        arraySize = size;
        stackArray = new int[arraySize];

    }

    //push method that pushes an item
    public void push(int item){
        //increments the top of the stack and then stores the value
        stackArray[stackTop] = item;
        stackTop++;
    }

    public void printArr(){
        for(int i =0; i < arraySize; i++){
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

    public stackArray[] pop(){
        stackTop--;
        return stackArray[stackTop];
    }
    
    //main method
    public static void main(String[] args){
        stacks_queues stackName = new stacks_queues(10); //private so you wont be able to access the array dirrectly
        stackName.push(10);
        stackName.push(25);
        stackName.push(34);
        System.out.println(stackName.isEmpty());

        stacks_queues testStack = new stacks_queues(5);
        System.out.println(testStack.isEmpty());

    }
}