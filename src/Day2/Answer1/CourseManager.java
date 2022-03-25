package Day2.Answer1;

public class CourseManager {

        public void add(Course course) {
            System.out.println(course.getCourseName() + " Added.");
        }

        public Course[] getAll() {
            Course course1 = new Course();
            return new Course[]{course1};
        }
}
