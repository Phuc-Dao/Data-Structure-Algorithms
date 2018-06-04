public class stringReverser{
    String input;
    String output;
    stringReverser(String someString){
        input = someString;
    }
   
public String reverse(){
    output = "";
    stack charStack = new stack(input.length()); //create a new word stack
    //pushes each item onto the stack
   for(int i = 0; i < input.length(); i++){
       charStack.push(input.charAt(i));
   }
   //pops each item out of the stack
   while(!charStack.checkEmpty()){
       output += charStack.pop();
   }
   return output;

}
}