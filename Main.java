package interiance_tekrar;

public class Main {

    public static void main(String[] args) {
        Student student = new Student();
        student.setFirstName("Memati");
        student.setLastName("Baş");
        student.setEmail("memati_bas@......com");
        student.setAge(47);
        student.setId(97854);
        student.setDetail("Karizmatik");
        student.setTakenCourse("java");
        student.setPassword("33889966");
        student.setNationalId("1000000000000");

        Instructor instructor = new Instructor();
        instructor.setId(1);
        instructor.setFirstName("Engin");
        instructor.setLastName("Demiroğ");
        instructor.setEmail("engin_demiroğ@............com");
        instructor.setAge(43);
        instructor.setDetail("Maşallahı var");
        instructor.setGivenCourse("java");
        instructor.setNationalId("800000000000000000");
        instructor.setPassword("121212121");

        StudentManager studentManager = new StudentManager();
        studentManager.updateStudent(student);
        studentManager.getInformationAboutUser(student);

        System.out.println("*-----------------------------------------------*");

        InstructorManager instructorManager = new InstructorManager();
        instructorManager.getInformationAboutUser(instructor);
        instructorManager.updateInstructor(instructor);
    }
}
