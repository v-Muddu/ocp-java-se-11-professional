package assessments.ExamIZ0815;

public class MathFunctions {
    /**
     * What is the result of the following program?
     * @param args
     */
    public static void main(String[] args) {
        int a = 15, b = 10;
        MathFunctions.addToInt(a, b);
        System.out.println(a);
    }

    private static void addToInt(int x, int amountToAdd) {
        x += amountToAdd;
    }

    /**
     * A. 10
     * B. 15 <-
     * C. 25
     * D. Compiler error on line 3
     * E. Compiler error on line 8
     * F. None of the above
     */
}
