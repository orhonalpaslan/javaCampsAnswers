package Day3.Answer2;

public class Main {
    public static void main(String[] args) {

        /*
        Kodlama.io projesini yazdığınızı düşünelim.
        User, Instructor, Student nesnelerini modelleyiniz. (Class-Inheritance)
        UserManager, InstructorManager, StudentManager için sistemde olabilecek operasyonları tahminleyip modelleyiniz. (Class-Inheritance-Method)
        Kural -- Sadece gördüğümüz konulardan yararlanmalısınız.
        */

        User user1 = new User(1, "orhonalpaslan", "3267462", "Orhon", "ALPASLAN");
        Student user2 = new Student(2, "fetiözge", "7895654", "Feti", "Özge", "JAVA");
        Instructor user3 = new Instructor(3, "fırattaşkın", "fırat7789", "Fırat", "Taşkın", "JAVA");
        UserManager userManager = new UserManager();
        StudentManager studentManager = new StudentManager();
        InstructorManager instructorManager = new InstructorManager();
        userManager.add(user1);


    }
}
