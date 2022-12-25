import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int [] numbers = {1,5,10,80,35,-20};
        Arrays.sort(numbers);
        System.out.println("Sorted arrays: " + Arrays.toString(numbers));

        int[] numbersCopy = Arrays.copyOfRange(numbers,1,4);
        System.out.println("Copy of array: " + Arrays.toString(numbersCopy));

        System.out.println(Arrays.equals(numbers,numbersCopy));

    }
}
