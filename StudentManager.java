package interiance_tekrar;

public class StudentManager extends UserManager{
    public void updateStudent(Student student) {
        System.out.println("Öğrenci güncellendi: "+student.getFirstName()+" "+student.getLastName());
    }
}
