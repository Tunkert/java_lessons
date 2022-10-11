public class OtherDataTypes004 {
    public static void main(String[] args) {
        // other data types
        char grade = 'A';

        // print out the char
        System.out.println("My grade is Java is an " + grade + ".");

        // print out the ascii value of char
        System.out.println("The ascii value of " + grade + " is " + (int) grade + ".");

        // booleans
        boolean isTeacher = true;
        boolean isStudent = false; // could be true?

        // could use in conditionals
        if (isTeacher)
            System.out.println("I am a teacher.");
        else
            System.out.println("I am not a teacher.");

        if (isStudent)
            System.out.println("I am a student.");
        else
            System.out.println("I am not a student.");

        // bytes
        byte maxByte = Byte.MAX_VALUE;
        byte minByte = Byte.MIN_VALUE;

        // print out byte values
        System.out.println("The maximum value of a byte is " + maxByte + ".");
        System.out.println("The minimum value of a byte is " + minByte + ".");
    }
}
