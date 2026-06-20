public class EmployeeManager {


    private Employee[] employees;

    private int count;




    public EmployeeManager(int size){


        employees =
                new Employee[size];


        count = 0;


    }






    public void addEmployee(
            Employee employee){



        if(count < employees.length){



            employees[count] =
                    employee;


            count++;


            System.out.println(
                    "Employee Added"
            );


        }


    }







    public void searchEmployee(
            int id){



        for(int i=0;i<count;i++){



            if(employees[i]
                    .getEmployeeId()
                    == id){



                System.out.println(
                        employees[i]
                );


                return;


            }


        }



        System.out.println(
                "Employee Not Found"
        );


    }








    public void displayEmployees(){



        for(int i=0;i<count;i++){



            System.out.println(
                    employees[i]
            );


        }


    }








    public void deleteEmployee(
            int id){



        for(int i=0;i<count;i++){



            if(employees[i]
                    .getEmployeeId()
                    == id){



                for(int j=i;
                    j<count-1;
                    j++){



                    employees[j]
                            =
                            employees[j+1];


                }



                count--;



                System.out.println(
                        "Employee Deleted"
                );


                return;


            }


        }



        System.out.println(
                "Employee Not Found"
        );


    }



}