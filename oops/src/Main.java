// oops lecture 1
public class Main {
    public static void main(String[] args) {
        class Student {
            int rollNumber;
            String name;
            float marks;

//            Student() {
//                this.rollNumber = 0;
//                this.name = "Siddhartha Singh";
//                this.marks = 90.3f;
//            }
            // how to call the constructor from another constructor lets just say that one of them ios empty
Student(){
    this(385,"siddharth",345f);
}

            Student(int rollNumber, String name, float marks) {
                this.rollNumber = rollNumber;
                this.name = name;
                this.marks = marks;
            }

            void changeName(String name) {
                this.name = name;
            }
 // function overriding in the use .
            public String toString() {
                System.out.println(" ");
                return "Student" + "{rollNumber=" +rollNumber + ", name='" + this.name + "', marks=" + marks + "}";
            }

        }
// s1 is the reference variable in the scenario
        Student s1 = new Student();

        System.out.println(s1
        ) ;
    }
}
