class q1{

// method that counts the number of primes
public static int countPrimes(int n){
    int primeCount = 0;
    boolean notPrime = false;

    if(n<3){
        return 0;
    }

    //for loop that loops through the numbers
    for(int i = 2; i < n; i++){
       if(i % 2 == 0 || i % 3 == 0 || i%7 == 0){
           System.out.println("hello");
       }
        
    }
    return primeCount;
}


public static void main(String[] args){
    System.out.println(7%7);
}

}