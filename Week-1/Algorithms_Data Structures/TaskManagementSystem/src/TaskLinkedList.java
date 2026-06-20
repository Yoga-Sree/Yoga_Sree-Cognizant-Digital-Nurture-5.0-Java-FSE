public class TaskLinkedList {


    private Task head;



    public void addTask(
            Task task){



        if(head == null){


            head = task;


        }


        else{


            Task current = head;



            while(current.next != null){


                current =
                        current.next;


            }



            current.next = task;


        }



        System.out.println(
                "Task Added"
        );


    }







    public void searchTask(
            int id){



        Task current = head;




        while(current != null){



            if(current.taskId == id){



                System.out.println(
                        current
                );


                return;


            }



            current =
                    current.next;


        }




        System.out.println(
                "Task Not Found"
        );


    }







    public void displayTasks(){



        Task current = head;



        while(current != null){



            System.out.println(
                    current
            );



            current =
                    current.next;


        }


    }








    public void deleteTask(
            int id){



        if(head == null){

            return;

        }





        if(head.taskId == id){



            head = head.next;


            System.out.println(
                    "Task Deleted"
            );


            return;


        }







        Task current = head;



        while(current.next != null){



            if(current.next.taskId
                    == id){



                current.next =
                        current.next.next;



                System.out.println(
                        "Task Deleted"
                );


                return;


            }



            current =
                    current.next;


        }


    }



}