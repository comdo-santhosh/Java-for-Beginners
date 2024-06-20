import java.util.ArrayList;
import java.util.List;

class Quiz
{
    private List<Questions>questions;

    Quiz(){
        questions = new ArrayList<>();
    }

    public void addQuestion(Questions question ){
        questions.add(question);
    }

    public Questions getQuestion(int index){
        return  questions.get(index);
    }
}