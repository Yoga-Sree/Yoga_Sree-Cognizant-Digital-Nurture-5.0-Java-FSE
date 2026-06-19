public class MVCPatternTest {



    public static void main(String[] args){



        Student student =
                new Student(
                        "Yoga",
                        101,
                        "A"
                );




        StudentView view =
                new StudentView();





        StudentController controller =
                new StudentController(
                        student,
                        view
                );




        System.out.println(
                "Initial Student Details:"
        );



        controller.updateView();





        controller.setStudentName(
                "Sree"
        );


        controller.setStudentGrade(
                "A+"
        );




        System.out.println();


        System.out.println(
                "Updated Student Details:"
        );



        controller.updateView();



    }


}