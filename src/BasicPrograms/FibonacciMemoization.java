package BasicPrograms;


import java.util.HashMap;
import java.util.Map;

// Memoization: To overcome the inefficiency of the recursive approach, we can employ memoization. It involves storing the results of expensive function calls and returning the cached result when the same inputs occur again. In the context of Fibonacci, this means storing previously calculated Fibonacci numbers to avoid redundant calculations
public class FibonacciMemoization {
    static Map<Integer,Integer> memo=new HashMap<>();
    static int fibonacciNumberAtN(int n){
        if(n<=1){
            return n;
        }
        if (memo.containsKey(n)){
            return memo.get(n);
        }
        int result=fibonacciNumberAtN(n-1)+fibonacciNumberAtN(n-2);
        memo.put(n,result);
        return result;
    }
    public static void main(String[] args) {
        int n=10;
        for (int i = 0; i < n; i++) {
            System.out.println(fibonacciNumberAtN(i));
        }
    }
}
