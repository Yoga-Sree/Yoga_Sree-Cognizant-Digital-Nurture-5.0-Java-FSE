public class DecoratorPatternTest {


    public static void main(String[] args){



        System.out.println("Email Notification:");



        Notifier email =
                new EmailNotifier();



        email.send("Meeting at 10 AM");




        System.out.println();


        System.out.println(
                "Email + SMS Notification:"
        );



        Notifier sms =
                new SMSNotifierDecorator(
                        new EmailNotifier()
                );


        sms.send("Meeting at 10 AM");




        System.out.println();


        System.out.println(
                "Email + SMS + Slack Notification:"
        );



        Notifier multiple =
                new SlackNotifierDecorator(

                        new SMSNotifierDecorator(

                                new EmailNotifier()

                        )

                );



        multiple.send("Meeting at 10 AM");



    }


}