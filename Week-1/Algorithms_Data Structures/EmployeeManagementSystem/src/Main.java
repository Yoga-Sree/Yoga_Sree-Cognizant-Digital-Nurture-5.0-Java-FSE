public class Main {



    public static void main(String[] args){



        EmployeeManager manager =
                new EmployeeManager(5);




        manager.addEmployee(

                new Employee(
                        101,
                        "Praveen",
                        "Developer",
                        50000)

        );




        manager.addEmployee(

                new Employee(
                        102,
                        "Rahul",
                        "Tester",
                        40000)

        );





        System.out.println(
                "\nEmployee List:"
        );


        manager.displayEmployees();






        System.out.println(
                "\nSearch Employee:"
        );


        manager.searchEmployee(101);







        manager.deleteEmployee(102);






        System.out.println(
                "\nAfter Delete:"
        );


        manager.displayEmployees();



    }


}