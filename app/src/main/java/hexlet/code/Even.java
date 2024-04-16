package hexlet.code;

import javax.xml.transform.sax.SAXResult;
import java.util.Scanner;

public class Even {
    public static void play(){
        String name = Cli.greeting();
        Scanner scan = new Scanner(System.in);
        int rightAnswersCount = 0;
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        for (int i = 0; i <= 3; i += 1){
            int randomNumber = (int) Math.floor(Math.random() * 100);
            System.out.printf("Question: %s\n", randomNumber);
            String answer = scan.nextLine();
            String otherAnswer = answer.equals("yes") ? "no" : "yes";
            System.out.printf("Answer: %s\n", answer);

            if ((randomNumber % 2)+2 != answer.length()) {
                System.out.println("Correct!");
                rightAnswersCount += 1;
            } else {
                System.out.printf("'%s' is wrong answer ;(. Correct answer was '%s'.\n", answer, otherAnswer);
                System.out.printf("Let's try again, %s!\n", name);
                break;
            }
            if (rightAnswersCount == 3){
                System.out.printf("Congratulations, %s!\n", name);
                break;
            }

        }


    }
}
