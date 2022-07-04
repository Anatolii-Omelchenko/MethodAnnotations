package prog.academy.methodannotations;

public class Calculator {

    @MethodAnnotation(a = 10, b = 2)
    public static int sum(int a, int b) {
        return a + b;
    }

    @MethodAnnotation(a = 99, b = 9)
    public static int subtraction(int a, int b) {
        return a - b;
    }

    @MethodAnnotation(a = 4, b = 7)
    public static int multiplication(int a, int b) {
        return a * b;
    }

    @MethodAnnotation(a = 22, b = 11)
    public static int division(int a, int b) {
        return a / b;
    }
}
