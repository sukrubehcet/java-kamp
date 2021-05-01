package interiance_tekrar;

public class UserManager {
    public void getName(User user){
        System.out.println(user.getFirstName()+user.getLastName());
    }

    public void getInformationAboutUser(User user){
        System.out.println("Kullanıcı Adı: "+user.getFirstName()+" "+user.getLastName());
        System.out.println("Kullanıcı Yaşı: "+user.getAge());
        System.out.println("Kullanıcı Detay: "+ user.getDetail());
        System.out.println("Kullanıcı Email: "+user.getEmail());
    }


    public void removeUser(User user){
        System.out.println("Eğitmen Silindi: "+user.getFirstName()+" "+ user.getLastName());
    }

    public void addUser(User user){
        System.out.println("Eğitmen Eklendi: "+user.getFirstName()+" "+user.getLastName());
    }

}
