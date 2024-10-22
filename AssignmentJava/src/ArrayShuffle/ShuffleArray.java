package ArrayShuffle;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ShuffleArray {

    // Method to shuffle the array
    public static void shuffleArray(Integer[] array) {
        // Print Array (Before Shuffle)
        System.out.println("Before Shuffled : " + Arrays.toString(array));

        // Convert array to list for shuffling
        List<Integer> list = Arrays.asList(array);

        // Shuffle the list
        Collections.shuffle(list);

        // Convert list back to array
        list.toArray(array);

        // Print shuffled array
        System.out.println("Shuffled Array: " + Arrays.toString(array));
    }

    public static void main(String[] args) {
        // Create an array with the values 1 to 7
        Integer[] array = {1, 2, 3, 4, 5, 6, 7};

        // Call the shuffleArray method to shuffle the array
        shuffleArray(array);
    }
}
