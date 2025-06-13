package Week2;
/*
Implement a simple calculator for integers with the four basic arithmetic operations.
Create a private field (property) to store the result of the calculation. The result can be
accessed through a method called getResult()
In the constructor, set the initial value of the result to 0 .
Then, create four methods for the basic arithmetic operations: plus , minus , multiply ,
and divide
The arithmetic operations should always use the last result and a parameter of the
method
To test the results, create a second class ( CalculatorTest ) with only a main method.
Try the following example:
Calculator myCalculator = new Calculator();
myCalculator.plus(8);
myCalculator.multiply(2);
myCalculator.devide(4);
System.out.println(myCalculator.getResult()); // Output: 4
Note: When dividing integers in Java, it automatically rounds off. This is acceptable for this
exercise
Questions to think about (discuss with your study buddy)

-What is the difference between an object and a class?
Klasse: Eine Vorlage, die beschreibt, wie Objekte und die Inhalte von Variablen und Methoden strukturiert sind.
Objekt (Object): Eine konkrete Instanz einer Klasse mit echten Werten.

-Is an object of type reference or a primitive type?
Reference Type
*/

public class Calculator {
    private int result;

    public Calculator() {
        this.result = 0;
    }

    public void Plus(int x) {
        result +=x;
    }

    public void minus(int x) {
        result -=x;
    }

    public void multiply(int x) {
        result *=x;
    }

    public void divide(int x) {
        if (x != 0) {
            result /= x;
        }
    }

    public int getResult() {
        return result;
    }
}

class CalculatorTest {
    public static void main(String[] args) {
        Calculator myCalculator = new Calculator();
        myCalculator.Plus(8);
        myCalculator.multiply(2);
        myCalculator.divide(4);
        System.out.println("The Result : "+myCalculator.getResult());
    }
}
