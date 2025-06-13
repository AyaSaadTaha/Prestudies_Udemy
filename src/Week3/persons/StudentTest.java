package Week3.persons;

public class StudentTest {
    public static void main(String[] args) {
        Student max = new Student("I like numbers in Java - aren't they int-eresting?!");
        max.setName("Mohamed"); max.setAge(28); max.setAddress("Spechtweg 4,85591 Vaterstetten");
        max.introduce();    // From superclass
        //max.tellJoke();    // From subclass

    }
}
