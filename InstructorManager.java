package interiance_tekrar;

public class InstructorManager extends UserManager{

    public void updateInstructor(Instructor instructor){
        System.out.println("Eğitmen güncellendi: "+instructor.getFirstName()+" "+instructor.getLastName());
    }

}
