public class SingletonTest {


    public static void main(String args[]){


        Logger l1=Logger.getInstance();

        Logger l2=Logger.getInstance();



        l1.log("Application Started");

        l2.log("User Login");



        if(l1==l2){

            System.out.println("Only one object exists");

        }

        else{

            System.out.println("Multiple objects");

        }


        System.out.println(l1.hashCode());

        System.out.println(l2.hashCode());


    }


}
