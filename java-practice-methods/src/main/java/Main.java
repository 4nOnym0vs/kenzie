public class Main {
    public static void main(String[] args) {
        // declare variables
        int[] numbers = {12, -4, 50, 2, 15, -5};
        int sum = 0;
        double average = 0;


        // find the sum
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }


        // find the average
        if (numbers.length == 0) {
            average = 0;
        } else {
            average = (double) sum / numbers.length;
        }
        //print outs
        System.out.println(sum);
        System.out.println(average);

    }

    public static double  avgOfArray(int[] numArray) {

        double average = 0;
        int sum = 0;

        //calculate the sum
        for(int i = 0; i < numArray.length; i++) {
            sum += numArray[i];
        }

    }
}

