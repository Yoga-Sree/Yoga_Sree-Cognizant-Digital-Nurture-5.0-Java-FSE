public class Main {


    public static void main(String[] args){



        Book[] books = {


                new Book(
                        101,
                        "Data Structures",
                        "Mark"),



                new Book(
                        102,
                        "Java Programming",
                        "James"),




                new Book(
                        103,
                        "Python Basics",
                        "John")


        };






        Book result1 =
                BookSearch.linearSearch(
                        books,
                        "Java Programming"
                );



        System.out.println(
                "Linear Search:"
        );


        System.out.println(result1);







        Book result2 =
                BookSearch.binarySearch(
                        books,
                        "Java Programming"
                );




        System.out.println(
                "\nBinary Search:"
        );


        System.out.println(result2);



    }


}