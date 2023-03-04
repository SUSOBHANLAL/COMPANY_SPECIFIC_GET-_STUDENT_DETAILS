package employeeexample11;
import java.util.*;
class Student {
    private String name;
    private int age;
    private String college;
    private int[] marks;
    private double averageMarks;
    
    public Student(String name, int age, String college, int[] marks, double averageMarks) {
        this.name = name;
        this.age = age;
        this.college = college;
        this.marks = marks;
        this.averageMarks = averageMarks;
    }
    
    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }
    
    public String getCollege() {
        return college;
    }
    
    public int[] getMarks() {
        return marks;
    }
    
    public double getAverageMarks() {
        return averageMarks;
    }
}
public class susobhan {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        ArrayList<Student> students = new ArrayList<>();
	        
	        // Get number of students
	        System.out.print("Enter number of students: ");
	        int numStudents = scanner.nextInt();
	        scanner.nextLine(); // consume the newline character
	        
	        // Get details for each student
	        for (int i = 0; i < numStudents; i++) {
	            System.out.println("Enter details for student " + (i + 1) + ":");
	            
	            // Get student details
	            System.out.print("Name: ");
	            String name = scanner.nextLine();
	            
	            System.out.print("Age: ");
	            int age = scanner.nextInt();
	            scanner.nextLine(); // consume the newline character
	            
	            System.out.print("College: ");
	            String college = scanner.nextLine();
	            
	            // Get marks for five subjects
	            int[] marks = new int[5];
	            for (int j = 0; j < 5; j++) {
	                System.out.print("Marks for subject " + (j + 1) + ": ");
	                marks[j] = scanner.nextInt();
	            }
	            
	            
	            
	            // Calculate average marks
	            double sum = 0;
	            for (int j = 0; j < 5; j++) {
	                sum += marks[j];
	            }
	            
	            
	            double averageMarks = sum / 5.0;
	            
	            // Create Student object and add to ArrayList
	            Student student = new Student(name, age, college, marks, averageMarks);
	            students.add(student);
	            
	            scanner.nextLine(); // consume the newline character
	        }
	        
	        // student is pass or fail
	        for (int i = 0; i < students.size(); i++) {
	            Student student = students.get(i);
	            String result;
	            if (student.getAverageMarks() >= 35) {
	                result = "Pass";
	            } else {
	                result = "Fail";
	            }
	            System.out.println("Student " + (i + 1) + ": " + student.getName() + ", " + student.getCollege() + ", " + result+"   avgmarks"+student.getAverageMarks());
	        }
	    }
	}


