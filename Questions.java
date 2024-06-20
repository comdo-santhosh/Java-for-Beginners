
// Making   a quiz application initially creating a question's and options along with correct option instance variable
class Questions{
    private String Questions;
    private String[] options;
    private int CorrectAnswers;

    // Creating a constructor
    public Questions(String  questions   , String[] options , int correctAnswers){
        this.Questions = questions;
        this.options = options;
        this.CorrectAnswers = correctAnswers;
    }


    // Get Questions
    public String getQuestions() {
        return Questions;
    }


    public int getCorrectAnswers() {
        return CorrectAnswers;
    }

    // Get options
    public String[] getOptions() {
        return options;
    }

    public static void main(String[] args) {

    }

}
