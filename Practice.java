import java.util.*;


class Student {

    public String name;
    public int rollNumber;
    public double percentage;

    public Student(String name, int rollNumber, double percentage) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.percentage = percentage;
    }


    @Override
    public String toString() {
        return "Name: " + this.name + "Rollnumber: " + this.rollNumber + "Percentage: " + this.percentage;
    }

    @Override
    public int hashCode() {
        return name.hashCode() + Integer.hashCode(rollNumber) + Double.hashCode(percentage);
    }

    @Override
    public boolean equals(Object obj) {
        Student s1 = (Student) obj;
        if (s1 == null || this == null) {
            return false;
        }
        if (this.rollNumber == s1.rollNumber
                && this.name.equals(s1.name)
                && this.percentage == s1.percentage) {
            return true;
        }
        return false;
    }
}


//
//class CustomException extends RuntimeException {
//
//    public CustomException(String msg) {
//        super(msg);
//    }
//}

//class Prac {
//
//    public void check(int n) {
//        if (n == 0) {
//            throw new CustomException("Here we threw the exception");
//        }
//    }
//}


public class Practice {

    public static void main(String[] args) {

        Student s1 = new Student("Rushikesh", 1, 35.35);
        Student s2 = new Student("Rushikesh", 1, 35.35);
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
    }
}

