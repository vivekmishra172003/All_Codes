import java.util.*;

public class Classroom {
    public static void main(String[] args) {
        System.out.println("Checking the priority queue");

        // Correcting the declaration of PriorityQueue and adding Student objects correctly
        PriorityQueue<Student> pq = new PriorityQueue<>();
        pq.add(new Student("mona", 4));   // Corrected: Creating new Student object with name and rank
        pq.add(new Student("anmol", 2));  // Corrected: Creating new Student object with name and rank
        pq.add(new Student("vivek", 1));  // Corrected: Creating new Student object with name and rank
        pq.add(new Student("nikes", 2));  // Corrected: Creating new Student object with name and rank

        // Printing elements from the priority queue
        while (!pq.isEmpty()) {
            System.out.println(pq.peek());  // Printing the student at the front of the queue
            pq.remove();                    // Removing the student from the front of the queue
        }
    }

    // Static nested class Student implementing Comparable interface
    static class Student implements Comparable<Student> {
        String name;
        int rank;

        public Student(String name, int rank) {
            this.name = name;
            this.rank = rank;
        }

        @Override
        public int compareTo(Student other) {  // Corrected: Method name should start with lowercase 'c'
            return Integer.compare(this.rank, other.rank);  // Corrected: Comparing ranks of students
        }

        @Override
        public String toString() {
            return "Student{name='" + name + "', rank=" + rank + '}';  // Corrected: Changed 'marks' to 'rank'
        }
    }
}
