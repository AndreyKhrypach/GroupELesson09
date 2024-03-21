import java.util.Arrays;
import java.util.Random;

public class Lesson09Program {

    public static final int ARRAY_LENGTH = 5;

    public static void main(String[] args) {
        int[] array = initializeArray();
        System.out.println(Arrays.toString(array));

        int countLeft = countMatches(array);
        reverseArray(array);
        int countRight = countMatches(array);

        System.out.println("Left side matches = " + countLeft);
        System.out.println("Right side matches = " + countRight);

//        Random random = new Random();
//        int[] queuePersons = new int[53];
//        int time = 0;
//        for (int i = 0; i < 53; i++) {
//            time += 180 + random.nextInt(47) - 23;
//            queuePersons[i] = time;
////            System.out.println(time);
//        }
//        System.out.println(Arrays.toString(queuePersons));


//        Random random = new Random();
//        int[] numbers = new int[100];
//        int countPositive = 0;
//        int countNegative = 0;
//        int countZero = 0;
//
//        for (int i = 0; i < numbers.length; i++) {
//            numbers[i] = random.nextInt(100) - 30;
//        }
//
//        for (int i = 0; i < numbers.length; i++) {
//            if (numbers[i] < 0){
//                countNegative++;
//            } else if (numbers[i] > 0) {
//                countPositive++;
//            }else {
//                countZero++;
//            }
//        }
//
//        System.out.println("Positive numbers in array = " + countPositive);
//        System.out.println("Negative numbers in array = " + countNegative);
//        System.out.println("Zero numbers in array = " + countZero);

//        InterestingNumber interestingNumber = new InterestingNumber();
//        interestingNumber.interestingDivide();
//
//        System.out.println(interestingNumber.defaultNumber
//                / interestingNumber.defaultNumber ==
//                interestingNumber.defaultNumber
//                        / interestingNumber.defaultNumber
//        );


//        int sum = 0;
//        for (int i = 0; i <= 7; i++) {
//            sum += i;
//        }
//        System.out.println(sum);

        /// factorial = 1*2*3*4*5....*20
//        long factorial = 1;
//        for (int i = 1; i <=20; i++) {
//            factorial *=i;
//            System.out.print(factorial
//                    + " : " + i + "; ");
//            if(i % 4 == 0){
//                System.out.println();
//            }
//        }
//
//        System.out.println(factorial);
    }

    public static int[] initializeArray() {
        Random random = new Random();
        int[] arr = new int[ARRAY_LENGTH];
        for (int i = 0; i < ARRAY_LENGTH; i++) {
            arr[i] = random.nextInt(9) + 1;
        }
        return arr;
    }

    public static int countMatches(int[] array) {
        int count = 1;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == array[i + 1]){
                count++;
            }else{
                break;
            }
        }
        return count;
    }

    public static void reverseArray(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
    }

    public static void showNumbers(byte a, int b) {
        System.out.println(a + " : " + b);
    }

    public static void showNumbers(int a, int b) {
        System.out.println(a + " : " + b);
    }

    public static void showNumbers(short a, byte b) {
        System.out.println(a + " : " + b);
    }

    public static void showNumbers(long a, long b) {
        System.out.println(a + " : " + b);
    }

    public static void showNumbers(float a, float b) {
        System.out.println(a + " : " + b);
    }

    public static void showNumbers(double a, double b) {
        System.out.println(a + " : " + b);
    }
}
