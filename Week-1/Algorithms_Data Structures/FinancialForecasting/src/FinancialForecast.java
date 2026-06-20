public class FinancialForecast {


    public static double predictFutureValue(
            double currentValue,
            double growthRate,
            int years){



        // Base Condition

        if(years == 0){


            return currentValue;


        }





        // Recursive Call

        return predictFutureValue(

                currentValue,
                growthRate,
                years - 1

        ) * (1 + growthRate);



    }


}