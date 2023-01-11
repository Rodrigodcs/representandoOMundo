public class Exercise {
    private int number;
    private Question question;
    private Answer answer;

    public void setNumber(int number){
        this.number = number;
    }

    public void setExerciseQuestion(Question question){
        this.question = question;
    }

    public void setExerciseAnswer(Answer answer){
        this.answer = answer;
    }

    public int getExerciseNumber(){
        return this.number;
    }

    public Question getExerciseQuestion(){
        return this.question;
    }

    public Answer getExerciseAnswer(){
        return this.answer;
    }    
}
