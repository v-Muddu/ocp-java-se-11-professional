package assessments.ExamIZ0815;

public class WordTrue {
    public static void main(String[] args) {
        /**
         * 4. How many times is the word true printed?
         *
         * A. Once
         * B. Twice
         * C. Three times
         * D. Four times <-
         * E. Five times
         * F. Six times
         * G. The code does not compile.
         *
         */

        String s1 = "Java";
        String s2 = "Java";
        String s3 = "Ja".concat("va");
        String s4 = s3.intern();
        StringBuilder sb1 = new StringBuilder();
        sb1.append("Ja").append("va");
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1 == s3);
        System.out.println(s1 == s4);
        System.out.println(sb1.toString() == s1);
        System.out.println(sb1.toString().equals(s1));
    }
}
