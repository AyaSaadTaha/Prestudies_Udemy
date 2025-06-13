package Week2;

import java.util.Arrays;

/*
Create a new method printMultipliedArray , which multiplies all entries of an int array
by the factor multiplier . Afterwards print out the array. The method accepts two
parameters multiplier (of type int ) and numbers (of type int[] ). The return type is
( void ). The resulting method should be called like this:
/ Step 1: Call the method
int[] numbers = new int[] {2, 2, 10, 11, 10};
int multiplier = 2;
printMultipliedArray(numbers, multiplier); // does return 'void'
// Output on the terminal: 4 4 20 22 20

// Step 2: print out 'numbers'
// Step 3: print out 'mulitiplier'
Step 1: Implement the method printMultipliedArray
Step 2: What happens if you print out numbers array (see code example). Is the array
unchanged (as before the printMultipliedArray was executed) or did the values
change? Explain the observed behavior
Step 3: Let's change the printMultipliedArray one last time: Increment the multiplier
by 1 (in example 2->3 ) before we multiply the array with the multiplier. In our example
every number would be then multiplied by 3 , if the passed in multiplier was 2 . Now the
interesting part: Print out the multiplier in the main method after the
printMultipliedArray (see code example). What values does it have? 2 or 3 .
Explain why.
 */
public class UsingMethods {
    public static void main(String[] args) {
        //3. Using methods
        int multiplier=2;
        int[] numbers = new int[] {2, 2, 10, 11, 10};

        //before Calling Func (numbers)
        System.out.println("The numbers before Calling Function:");
        Arrays.stream(numbers).forEach(x -> System.out.print(x + " , "));
        System.out.println();

        //after Calling Func (numbers)
        // changed (reference type)
        printMultipliedArray(numbers,multiplier);
        System.out.println("The numbers after Calling Function:");
        Arrays.stream(numbers).forEach(x -> System.out.print(x + " , "));

        //before Calling Func (multiplier)
        System.out.println("\nThe multiplier before Calling Function:"+multiplier);

        //after Calling Func (multiplier)
        // not changed ,multiplier ist int (primitive type)
        System.out.println("The multiplier after Calling Function:"+multiplier);


    }
    public static void printMultipliedArray(int[] numbers, int multiplier){

        System.out.println("Inside method - numbers") ;
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] *= multiplier;
        }
        for (int num : numbers) {
            System.out.print(num + " , ");
        }
        System.out.println();

        // multiplier++;
        multiplier++;
        System.out.println("Inside method - multiplier") ;
        System.out.println(multiplier);

    }
}
