import java.util.Scanner;
import java.util.concurrent.Callable;
public class Main {
    public static void Main(String[] args) throws Exception {
        Integer numCallable = getCallableInteger().call();
        System.out.print(numCallable);
    }
    public static Callable<Integer> getCallableInteger() {
        // your code here
        Scanner scanner = new Scanner(System.in);
        Callable<Integer> callableNum = ()-> scanner.nextInt();
        scanner.close();
        return callableNum;
    }
}