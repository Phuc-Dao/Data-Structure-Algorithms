class stack {
    char[] charArray; //character array
    int stackTop; //index of the top item
    int arrSize; //size of the array
        
    stack(int stringSize){
        stackTop = -1;
        arrSize = stringSize;
        charArray = new char[arrSize];
    }

    public void push(char item){
        stackTop++;
        charArray[stackTop] = item;
    }

    public char pop(){
        return charArray[stackTop--];
    }

    public boolean checkEmpty(){
        if(stackTop == -1)
            return true;
        else
            return false;
    }

    public void printAll(){
        if(checkEmpty()){
            System.out.println("Stack is empty");
        }
        else {
            for(int i = 0; i < stackTop + 1; i++){
                System.out.println(charArray[i]);
            }
        }
    }
    public static void main(String[] args){
        stringReverser reversal = new stringReverser("this is the input");
        System.out.println(reversal.reverse());
    }
}

