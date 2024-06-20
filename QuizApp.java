import java.util.Scanner;

public class QuizApp {
    public static void main(String[] args) {

        Quiz quiz = new Quiz();

        String[]option1  = {"8","2","4","16"};
        Questions q1 = new Questions("what is the size of int(bytes)?",option1,3);
        quiz.addQuestion(q1);


        String[]option2  = {"8","2","4","16"};
        Questions q2 = new Questions("what is the size of char(bytes)?",option2,2);
        quiz.addQuestion(q2);

        String[]option3  = {"8","2","4","16"};
        Questions q3 = new Questions("what is the size of long(bytes)?",option3,1);
        quiz.addQuestion(q3);

        int scre = 0;
        Scanner sc = new Scanner(System.in);
        for(int i =0 ; i< 3 ;i++){
            Questions question = quiz.getQuestion(i);
            System.out.println(question.getQuestions());

            String[] options = question.getOptions();
            for(int j =0 ; j < options.length ; j++){
                System.out.println(j+1+". "+options[j]);
            }
            System.out.println("Enter the answer ");
            int answer = sc.nextInt();

            if(answer == question.getCorrectAnswers()){
                scre++;
            }
        }
        System.out.println("ttal score : "+scre);
    }
}
