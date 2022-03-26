package Day2.Answer1;

public class Main {

        /*
        Özellik nesnesi olarak tanımladığımızı düşündüğünüz iki örnek veriniz.
        Bunlara ait class, contructor yapılarını oluşturup diziye ekleyip listeleyiniz.
        İş sınıfı olarak tanımladığımızı düşündüğünüz bir class oluşturunuz. En az iki metot yazınız.
        */

    public static void main(String[] args) {
        Instructor instructor = new Instructor();
        instructor.setId(1);
        instructor.setFirstName("Feti Can");
        instructor.setLastName("Kirazcı");
        Instructor[] instructors = {instructor};
        Course course1 = new Course();
        course1.setId(1);
        course1.setCourseName("Java Camp");
        course1.setPrice(0);
        course1.setInstructorId(1);
        course1.setDescription(" Profesyonel bir programla, sıfırdan yazılım geliştirme öğreniyoruz.");
        Course[] courses = {course1};
        for (Course course : courses){
            System.out.println(course.getId() + " / "  + course.getCourseName() + " / " + course.getInstructorId()  + " / " +  course.getPrice() + " / " +
                    course.getDescription());
        }




    }
}

