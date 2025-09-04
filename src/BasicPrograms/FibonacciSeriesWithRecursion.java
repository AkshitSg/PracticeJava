package BasicPrograms;

public class FibonacciSeriesWithRecursion {

    static int n1=0,n2=1,n3,count=10;
    static void printFibonacciSeries(int count){       // method to print next number in series.
        if(count>0){
            n3=n2+n1;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;
            printFibonacciSeries(count-1);       // recursive call.
        }
    }
    public static void main(String[] args) {           // main method to start fibonacci series call.
        System.out.print(n1+" "+n2);
        printFibonacciSeries(count-2);
        System.out.println("\n");
    }
}
