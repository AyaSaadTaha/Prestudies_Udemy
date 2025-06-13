package Week2;

import java.util.Arrays;

/*
Write a program that calculates and outputs the sum of the following array.
int[] numbers = new int[] {12, -22, 300, 43, 0};
Is an array a primitive or reference data type? Why? Come up with a Java code snippet
which proofs this.

Ist ein Referenztyp .
Das bedeutet: Wenn man ein Array an ein Methode übergibt,wird die Speicheradresse (Referenztyp)
übergeben-nicht ein Kopie des Arrays.
Arrays können viele Elemante enthalten .Eine Kopie bei jeder übergabe wäre langsam und ineffizent.

 */
public class BasicSum_Maximum_Minimum {
    public static void main(String[] args) {
        int[] numbers = new int[] {12, -22, 300, 43, 0};
        //stream instead of loop
        //The sum of the array
        System.out.println("The sum of the array: " + Arrays.stream(numbers).sum());

        //The Max and Min of the array
        System.out.println("The max of the array: " + Arrays.stream(numbers).max().getAsInt());
        System.out.println("The min of the array: " + Arrays.stream(numbers).min().getAsInt());

    }


}
