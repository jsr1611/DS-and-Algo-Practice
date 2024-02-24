import java.util.function.Function;

/**
 * author: Jumanazar Said
 * email: jumanazarsaidov@gmail.com
 * date: 2022/08/04 18:45
 * Convert square(int x) method into lambda expression.
 * a) Function<Integer, Integer> squareLambda = (int x) -> {x * x};
 * a) Function<Integer, Integer> squareLambda =  x -> return x * x;
 * a) Function<Integer, Integer> squareLambda = () -> (return x * x);
 * a) Function<Integer, Integer> squareLambda = x -> x * x;     ()
 */

public class Test3 {
    public static void main(String[] args) {
        Function<Integer, Integer> squareLambda = x -> x * x;
        System.out.println(squareLambda.apply(4));
        System.out.println(square(4));
    }
    public static int square(int x){
        return x * x;
    }
}

