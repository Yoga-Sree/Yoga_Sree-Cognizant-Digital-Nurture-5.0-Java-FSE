public class Main {


    public static void main(String[] args){



        Product[] products = {


                new Product(
                        101,
                        "Laptop",
                        "Electronics"),



                new Product(
                        102,
                        "Mouse",
                        "Accessories"),



                new Product(
                        103,
                        "Keyboard",
                        "Accessories"),



                new Product(
                        104,
                        "Monitor",
                        "Electronics"),



                new Product(
                        105,
                        "Printer",
                        "Office")


        };





        Product result1 =
                SearchAlgorithms.linearSearch(
                        products,
                        104
                );



        System.out.println(
                "Linear Search Result:"
        );


        System.out.println(result1);





        Product result2 =
                SearchAlgorithms.binarySearch(
                        products,
                        104
                );



        System.out.println(
                "\nBinary Search Result:"
        );


        System.out.println(result2);



    }


}