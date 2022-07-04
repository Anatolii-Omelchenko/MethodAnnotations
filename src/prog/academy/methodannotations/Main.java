package prog.academy.methodannotations;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {

        Class<?> cls = Calculator.class;
        Method[] methods = cls.getMethods();

        for (Method method : methods) {
            if (method.isAnnotationPresent(MethodAnnotation.class)) {
                MethodAnnotation annotation = method.getAnnotation(MethodAnnotation.class);
                int result = (int) method.invoke(null, annotation.a(), annotation.b());
                System.out.print("Number a = " + annotation.a() + " | number b = " + annotation.b());
                System.out.println(" | " + method.getName() + ": " + result);
            }
        }
    }
}
