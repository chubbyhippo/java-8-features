package functionalinterfaces;

public class FunctionExample1 {
    static String performConcat(String string) {
        return FunctionExample.addSomeString.apply(string);
    }

    public static void main(String[] args) {
        var result = performConcat("Hello ");
        System.out.println("Result : " + result);

        var result2 = performConcat("Yeah ");
        System.out.println("Result : " + result2);
    }
}
