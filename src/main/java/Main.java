import java.util.Scanner;
import java.util.concurrent.Callable;
public class Main {
    public static void main(String[] args) throws Exception {
        Integer numCallable = getCallableInteger().call();
        System.out.printf("Callable Number: %s",numCallable);
    }
    public static Callable<Integer> getCallableInteger() {
        // your code here
        Scanner scanner = new Scanner(System.in);
        Callable<Integer> callableNum = ()-> scanner.nextInt();

        return callableNum;
    }
}