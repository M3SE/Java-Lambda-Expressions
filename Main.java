import java.util.function.BinaryOperator;
import java.util.function.Predicate;
import java.util.function.Function;
import java.util.function.Consumer;
import java.util.function.Supplier;

@FunctionalInterface
interface ArithmeticOperation {
    int operate(int a, int b);
}

public class Main {
    public static void main(String[] args) {
        simpleLambdaExpressions();

        customFunctionalInterfaces();

        builtInFunctionalInterfaces();
    }

    public static void simpleLambdaExpressions() {
        System.out.println("Task 1: Simple Lambda Expressions");

        BinaryOperator<Integer> add = (a, b) -> a + b;
        System.out.println("Addition of 5 and 3: " + add.apply(5, 3));

        BinaryOperator<Integer> subtract = (a, b) -> a - b;
        System.out.println("Subtraction of 5 and 3: " + subtract.apply(5, 3));


        BinaryOperator<Integer> multiply = (a, b) -> a * b;
        System.out.println("Multiplication of 5 and 3: " + multiply.apply(5, 3));


        BinaryOperator<Integer> divide = (a, b) -> a / b;
        System.out.println("Division of 6 by 3: " + divide.apply(6, 3));

        System.out.println();
    }

    public static void customFunctionalInterfaces() {
        System.out.println("Task 2: Lambda Expressions with Custom Functional Interfaces");

        ArithmeticOperation add = (a, b) -> a + b;
        System.out.println("Addition of 5 and 3: " + add.operate(5, 3));

        ArithmeticOperation subtract = (a, b) -> a - b;
        System.out.println("Subtraction of 5 and 3: " + subtract.operate(5, 3));

        ArithmeticOperation multiply = (a, b) -> a * b;
        System.out.println("Multiplication of 5 and 3: " + multiply.operate(5, 3));

        ArithmeticOperation divide = (a, b) -> a / b;
        System.out.println("Division of 6 by 3: " + divide.operate(6, 3));

        System.out.println();
    }

    public static void builtInFunctionalInterfaces() {
        System.out.println("Task 3: Lambda Expressions with Built-in Functional Interfaces");

        Predicate<Integer> isEven = n -> n % 2 == 0;
        System.out.println("Is 4 even? " + isEven.test(4));

        Function<String, Integer> stringLength = str -> str.length();
        System.out.println("Length of 'hello': " + stringLength.apply("hello"));

        Consumer<String> printString = str -> System.out.println(str);
        printString.accept("Hello, world!");

        Supplier<String> constantString = () -> "This is a constant string.";
        System.out.println(constantString.get());

        System.out.println();
    }
}
