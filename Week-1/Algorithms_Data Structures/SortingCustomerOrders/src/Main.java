public class Main {



    public static void main(String[] args){



        Order[] orders = {


                new Order(
                        101,
                        "Praveen",
                        5000),



                new Order(
                        102,
                        "Rahul",
                        2000),



                new Order(
                        103,
                        "Anjali",
                        8000)



        };




        System.out.println(
                "Before Sorting:"
        );


        display(orders);





        SortingAlgorithms.quickSort(
                orders,
                0,
                orders.length-1);



        System.out.println(
                "\nAfter Quick Sort:"
        );



        display(orders);


    }





    public static void display(
            Order[] orders){



        for(Order order:orders){


            System.out.println(order);


        }


    }


}