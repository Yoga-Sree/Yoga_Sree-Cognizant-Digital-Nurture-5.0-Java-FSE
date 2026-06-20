public class Main {


    public static void main(String[] args){



        TaskLinkedList list =
                new TaskLinkedList();




        list.addTask(

                new Task(
                        1,
                        "Design UI",
                        "Pending")

        );




        list.addTask(

                new Task(
                        2,
                        "Develop Backend",
                        "In Progress")

        );





        list.addTask(

                new Task(
                        3,
                        "Testing",
                        "Pending")

        );





        System.out.println(
                "\nAll Tasks:"
        );


        list.displayTasks();





        System.out.println(
                "\nSearch Task:"
        );


        list.searchTask(2);







        list.deleteTask(1);





        System.out.println(
                "\nAfter Delete:"
        );



        list.displayTasks();



    }


}