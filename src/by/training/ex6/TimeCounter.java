package by.training.ex6;

public class TimeCounter {

    private static int countHours(int totalSeconds) {
        return totalSeconds / 3600;
    }

    private static int countMinutes(int totalSeconds) {
        totalSeconds -= countHours(totalSeconds) * 3600;
        return totalSeconds / 60;
    }

    private static int countSeconds(int totalSeconds) {
        totalSeconds -= countHours(totalSeconds) * 3600;
        totalSeconds -= countMinutes(totalSeconds) * 60;
        return totalSeconds;
    }


    /*
    * Returns an array, the first element is the amount of hours
    * the second element is the amount of minutes
    * the third element is the amount of seconds
    */
    public static int[] countTime(int totalSeconds) {
        int [] result = new int[3];

        result[0] = countHours(totalSeconds);
        result[1] = countMinutes(totalSeconds);
        result[2] = countSeconds(totalSeconds);

        return result;
    }
}
