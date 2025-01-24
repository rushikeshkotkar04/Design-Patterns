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


}

class CustomException extends RuntimeException {

    public CustomException(String msg) {
        super(msg);
    }
}

class Prac {

    public void check(int n) {
        if (n == 0) {
            throw new CustomException("Here we threw the exception");
        }
    }
}

public class Practice {

    public static void main(String[] args) {
        Prac p = new Prac();
        try {
            p.check(0);
        } catch (CustomException e) {
            System.out.println(e);
        }


//        List<Integer> stack = new Stack<>();
//        Queue<Integer> que = new ArrayDeque<>();
//        List<Integer> l1 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
//        PriorityQueue<Integer> pq = new PriorityQueue<>();
//        List<Integer> linkedList = new LinkedList<>(l1);
//        HashMap<Integer, List<Integer>> hashmap = new HashMap<>();
//        List<Integer> list = new ArrayList<>();
//        hashmap.put(1, new ArrayList<>());
//        hashmap.put(2, hashmap.getOrDefault(2, List.of(1)));
    }
}

