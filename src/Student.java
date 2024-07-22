public class Student extends Person{
    private String rollNo;
    private String course;
    private String department;

    public Student(String name, int age, String rollNo, String course, String department) {
        super(name, age);
        this.rollNo = rollNo;
        this.course = course;
        this.department = department;
    }

    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public static void main(String[] args){
        Student student1 = new Student("Amar", 25, "A123", "Computer Science", "Master");
        String name = student1.getName();
        int age = student1.getAge();
        String rollNo = student1.getRollNo();
        String course = student1.getCourse();
        String department = student1.getDepartment();
        System.out.printf("name: %s%n" , name);
        System.out.printf("age: %d%n" , age);
        System.out.printf("roleNo: %s%n" , rollNo);
        System.out.printf("course: %s%n" , course);
        System.out.printf("department: %s%n" , department);

        //using getter and setter function
        student1.setName("Akshay");
        student1.setAge(20);
        student1.setRollNo("36435");
        student1.setCourse("Mechanical");
        student1.setDepartment("Engineer");

        String name1 = student1.getName();
        int age1 = student1.getAge();
        String rollNo1 = student1.getRollNo();
        String course1 = student1.getCourse();
        String department1 = student1.getDepartment();
        System.out.printf("name1: %s%n" , name1);
        System.out.printf("age1: %d%n" , age1);
        System.out.printf("roleNo: %s%n" , rollNo1);
        System.out.printf("course: %s%n" , course1);
        System.out.printf("department: %s%n" , department1);

    }
}