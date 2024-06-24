import java.util.*;

public class Classroom {
    public static void main(String[] args) {
        System.out.println("Checking the priority queue");

        
        PriorityQueue<Student> pq = new PriorityQueue<>();
        pq.add(new Student("mona", 4));   
        pq.add(new Student("anmol", 2));  
        pq.add(new Student("vivek", 1));  
        pq.add(new Student("nikes", 2));  

        
        while (!pq.isEmpty()) {
            System.out.println(pq.peek());  
            pq.remove();                    
        }
    }

    
    static class Student implements Comparable<Student> {
        String name;
        int rank;

        public Student(String name, int rank) {
            this.name = name;
            this.rank = rank;
        }

        @Override
        public int compareTo(Student other) {  
            return Integer.compare(this.rank, other.rank);  
        }

        @Override
        public String toString() {
            return "Student{name='" + name + "', rank=" + rank + '}';  
        }
    }
}
