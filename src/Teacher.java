public class Teacher extends Person {
        private String department;
        private String specialisation;

        public Teacher(String name, int age, String department, String specialisation) {
            super(name, age);
            this.department = department;
            this.specialisation = specialisation;
        }

        public String getDepartment() {
            return department;
        }

        public void setDepartment(String department) {
            this.department = department;
        }

        public String getSpecialisation() {
            return specialisation;
        }

        public void setSpecialisation(String specialisation) {
            this.specialisation = specialisation;
        }

        public static void main(String[] args) {
            Teacher teacher = new Teacher("Amar", 30, "Mechanical", "Data Science");
            System.out.printf("Teacher name: %s%n", teacher.getName());
            System.out.printf("Teacher age: %d%n", teacher.getAge());
            System.out.printf("Teacher department: %s%n", teacher.getDepartment());
            System.out.printf("Teacher specialisation: %s%n", teacher.getSpecialisation());

            teacher.setDepartment("Math");
            teacher.setSpecialisation("Mathematics");
            String deparment = teacher.getDepartment();
            String specialization = teacher.getSpecialisation();
            System.out.printf("Teacher department: %s%n", deparment);
            System.out.printf("Teacher specialisation: %s%n", specialization);


        }
    }

