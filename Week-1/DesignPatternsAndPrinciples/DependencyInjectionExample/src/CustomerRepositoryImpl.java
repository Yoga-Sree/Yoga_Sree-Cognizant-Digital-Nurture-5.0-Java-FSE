public class CustomerRepositoryImpl
        implements CustomerRepository {


    @Override

    public String findCustomerById(int id){



        if(id == 101){


            return "Yeon";


        }


        else if(id == 102){


            return "Jay";


        }


        else{


            return "Customer Not Found";


        }


    }


}