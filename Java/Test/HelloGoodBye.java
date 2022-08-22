/**
 * author: Jumanazar Said
 * email: jumanazarsaidov@gmail.com
 * date: 2022/08/10 17:36
 */

public class HelloGoodBye {
    public static void main(String[] args) {
        if(args.length >= 2){
            System.out.println("Hello " + args[0] + " and " + args[1] + ".");
            System.out.println("Goodbye " + args[1] + " and " + args[0] + ".");
        }
        if(args.length == 1){
            System.out.println("Hello " + args[0] + ".");
            System.out.println("Goodbye " + args[0] + ".");
        }
    }
}
