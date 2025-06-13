package Week3.persons;

public class Student  extends Person {
    private String joke;
    public Student(String joke){
        this.joke = joke;
    }
    public String getJoke() {return joke;}
    public void setJoke(String joke) {this.joke = joke;}


    @Override
    public void introduce() {
        super.introduce();  // Call parent version
        tellJoke();         // Add student-specific behavior
    }

    public void tellJoke(){
        System.out.println(joke);
    }
}

/*
Question: Why can’t we access private name directly in Student?
Because:
Private members of a superclass are not accessible directly in subclasses.
Use getters like getName() instead.
This is Java’s encapsulation in action—access is controlled through public methods.*/
