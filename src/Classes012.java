public class Classes012 {
    public static void main(String[] args) {
        System.out.println(Numbers.square(3)); //  9
        System.out.println(Numbers.exponent(3, 4)); // 81
        System.out.println(Numbers.insult()); // You're a dingleberry
        Numbers.sayHi(); // Hi!

        // create a new instance of a student
        Student s1 = new Student("Tim", 4.0, 46);

        // print out student description
        System.out.println(s1.description());

        // print out whether student passed or not
        System.out.println(s1.passOrFail());
    }
}
