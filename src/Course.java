public class Course {

    String CourseName;
    String timings;
    int CourseFee;

    public void playCourse(){
        if(CourseName == "Java"){
            System.out.println("Click play button to play courses");
        }
        else {
            System.out.println("Contact support to launch course");
        }

    }

}
