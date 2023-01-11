public class Module {
    private int number;
    private Exercise[] exercises = new Exercise[10];

    public void setNumber(int number){
        this.number = number;
    }

    public int getNumber(){
        return this.number;
    }

    public void addExercise(Exercise exercise){
        for(int i=0; i<this.exercises.length;i++){
            if(this.exercises[i] == null){
                this.exercises[i] = exercise;
                return;
            }
        }
    }

    public Exercise[] getModuleExercises(){
        return this.exercises;
    }

    public Exercise getSingleExercise(int number){
        return exercises[number];
    }
}
