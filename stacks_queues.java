class stacks_queues {
    //empty array that will represent our stack
    private int[] stackArray;
    private int arraySize;
    //set to -1 so when you increase it by one then it becomes zero for the first index of the array
    private int stackTop = -1;

    //constructor that creates the stack 
    stacks_queues(int size){
        arraySize = size;
        stackArray = new int[arraySize];

    }

    //push method that pushes an item
    public void push(int item){
        stackTop++;
        stackArray[stackTop++] = item;
    }

    public void printArr(){
        for(int i =0; i < stackArray.length; i++){
            System.out.println(stackArray[i]);
        }
    }

    //main method
    public static void main(String[] args){
        stacks_queues stackName = new stacks_queues(10); //private so you wont be able to access the array dirrectly
        stackName.push(10);
        stackName.printArr();
    }
}