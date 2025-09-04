package BasicPrograms;

public class FibonacciSeries { // Fibonacci series is series of numbers which are sum of previous                                  two numbers
                               // F(n)=F(n-1)+F(n-2)   0 1 1 2 3 5 8 13 21

    public static void main(String[] args){
        int n1=0,n2=1,n3,count=10;
        System.out.print(" "+n1);
        System.out.print(" "+n2);
        for (int i = 2; i <count ; i++) {
            n3=n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;
        }
    }
}
