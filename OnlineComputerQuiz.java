import java.util.InputMismatchException;

public class OnlineComputerQuiz {
    public static void main(String[] args) {

        String[] input = {"DAV", "RSK", "Treamis", "asd", "Oak", "adad", "BCGS", "BCBS", "Baldwin", "NPS"};
        String[] scores = {"62", "78", "55", "32", "44", "32", "82", "77", "8", "99"};
        String exceptionStatment = null;

        try
        {
            int[] intArray = new int[scores.length];

            for (int i = 0; i < intArray.length; i++)
            {
                intArray[i] = Integer.parseInt(scores[i]);
            }

            averageMarks(scores,intArray);
            highestScorer(scores,input,intArray);
        }
        catch (InputMismatchException object)
        {
            exceptionStatment="Input Mismatch Exception";
            System.out.println(exceptionStatment);
            object.printStackTrace();
        }
        catch (NumberFormatException object)
        {
            exceptionStatment="Number Format Exception";
            System.out.println(exceptionStatment);
            object.printStackTrace();
        }
        catch (ArrayIndexOutOfBoundsException object)
        {
            exceptionStatment="Array Index out of bound Exception";
            System.out.println(exceptionStatment);
            object.printStackTrace();
        }
    }


        // average marks
        public static void averageMarks(String[] scores, int[] intArray)
        {

            int sum = 0;
            for (int i = 0; i < intArray.length; i++)
            {
                sum += intArray[i];
            }
            System.out.println("The average score of 10 schools is : " + sum / intArray.length);
        }


        // highest scorer
        public static void highestScorer (String[] scores, String[] input, int[] intArray)
        {

            int big = 0;
            String highest = null;

            for (int i = 0; i < intArray.length; i++)
            {
                if (big < intArray[i])
                {
                    big = intArray[i];
                    highest = input[i];
                }
            }
            System.out.println("Highest scorer team is "+highest);
        }
}
