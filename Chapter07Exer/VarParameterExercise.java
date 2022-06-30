package Chapter07Exer;

public class VarParameterExercise {
    public static void main(String[] args) {
        VarParameterExerciseMethods me = new VarParameterExerciseMethods();
        System.out.println(me.showScore("sun", 15.3,78.9));
    }
}

class VarParameterExerciseMethods {
    public String showScore (String name, double... score ){
        double totalScore = 0;
        for (int i = 0; i < score.length; i++) {
            totalScore += score[i];
        }
        return name + "有" + score.length + "门课的成绩，总分为" + totalScore;
    }
}
