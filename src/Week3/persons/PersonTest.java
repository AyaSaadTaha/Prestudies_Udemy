package Week3.persons;
//If name or age are not set, Java will print default values: null for String, 0 for int.
//To avoid this:
//1 Use constructor-based initialization.
//2 Add null/zero checks in introduce().
//3 make fields required through a builder or factory.
public class PersonTest {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Aya");
        person.setAge(28);
        person.setAddress("Spechtweg 4,85591 Vaterstetten");
        person.introduce();
    }
}
