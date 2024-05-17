public class TrainingMain {
    public static void main(String[] args) {
            Student stu1 = new Student();
            stu1.phoneNumber = 1234567890;
            stu1.studentname="Mirunaa";
            stu1.age=25;
            stu1.rollNo=2345;
            stu1.email="xyz@gmail.com";

            Student stu2 = new Student();
            stu2.studentname = "Mahi";
            stu2.email= "xys@hotmail.com";
            stu2.rollNo=345;
            stu2.age=12;

            Student stu3 = new Student();
            stu3.studentname = "subash";
            stu3.age=15;
            stu3.email = "wre@giu.com";
            stu3.phoneNumber=989822842;
            stu3.rollNo=9762;

            Course crs1 = new Course();
            crs1.CourseName = "Java";
            crs1.CourseFee = 23000;

        Course crs2 = new Course();
        crs2.CourseName = "Python";
        crs2.CourseFee = 30000;

        Payment py1 = new Payment();
        py1.paymentStatus = "successful";
        py1.paymentMode = "UPI";
        py1.paidAmount= 20000;

        Payment py2 = new Payment();
        py2.paymentStatus = "Pending";
        py2.paymentMode = "CASH";
        py2.paidAmount= 2000;

            stu1.StudentDetails();
        stu2.StudentDetails();
        stu3.StudentDetails();

        crs1.playCourse();
        crs2.playCourse();

        py1.paymentDetails();
        py2.paymentDetails();
    }
}
