public class Student {
    String name;
    double GPA;
    int age;

    Student(String name, double GPA, int age) {
        this.name = name;
        this.GPA = GPA;
        this.age = age;
    }

    public String description() {
        return this.name + " has a GPA of " + this.GPA + " and is age " + this.age + ".";
    }

    public String passOrFail() {
        if (this.GPA >= 1.0) {
            return this.name + " passed!";
        } else {
            return this.name + " did not pass.";
        }
    }
}
