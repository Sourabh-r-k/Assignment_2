public class largest {
    public static void main(String[] args) {
        int firstNumber = 10;
        int secondNumber = 20;
        int thirdNumber = 15;

        int largestNumber = findLargest(firstNumber, secondNumber, thirdNumber);

        System.out.println("The largest number is: " + largestNumber);
    }

    private static int findLargest(int num1, int num2, int num3) {
        int largest = num1;
        if (num2 > largest) {
            largest = num2;
        }
        if (num3 > largest) {
            largest = num3;
        }
        return largest;
    }
}