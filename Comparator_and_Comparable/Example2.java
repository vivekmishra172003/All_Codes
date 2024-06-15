import java.util.*;

class Student implements Comparable<Student> {
    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public String toString() {
        return "Student age is " + age + ", name is " + name;
    }

    // Fixed the compareTo method to correctly implement comparison logic
    public int compareTo(Student that) {
        if (this.age > that.age) {
            return 1;
        } else if (this.age < that.age) {
            return -1;
        } else {
            return 0; // Added this condition for equality
        }
    }
}

public class Example2 {
    public static void main(String[] args) {
        System.out.println("Check");

        // Create a list of students
        List<Student> studs = new ArrayList<>();
        studs.add(new Student(21, "Navin"));
        studs.add(new Student(12, "John"));
        studs.add(new Student(18, "Parul"));
        studs.add(new Student(20, "Kira"));

        // Sort naturally using Comparable
        Collections.sort(studs);

        // Print sorted students
        for (Student s : studs) {
            System.out.println(s);
        }

        // Comparator to sort integers based on their last digit
        Comparator<Integer> com = new Comparator<Integer>() {
            public int compare(Integer i, Integer j) {
                // If we return 1, it means swap
                // If we return -1, it means no swap
                if (i % 10 > j % 10) {
                    return 1;
                } else if (i % 10 < j % 10) {
                    return -1;
                } else {
                    return 0; // Added this condition for equality
                }
            }
        };

        // Create a list of integers
        List<Integer> nums1 = new ArrayList<>();
        nums1.add(43);
        nums1.add(31);
        nums1.add(72);
        nums1.add(29);

        // Sort integers using the custom comparator
        Collections.sort(nums1, com);

        // Print sorted integers
        System.out.println(nums1);
    }
}
