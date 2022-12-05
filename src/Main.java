import java.util.*;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[10];
        for (int i = 0; i <array.length ; i++) {
            array[i]=random.nextInt(0,2);
        }
        ArrayList <Integer> ArrayNumbers = new ArrayList<>();
        for (int i = 0; i < 10; i++)
            ArrayNumbers.add(random.nextInt(0, 2));
        LinkedList<Integer> LinkedNumbers = new LinkedList<>();;
        for (int i = 0; i < 10 ; i++)
            LinkedNumbers.add(random.nextInt(0,2));
        sortArrays(array);
        sortArrays(ArrayNumbers);
        sortArrays(LinkedNumbers);
    }
    public static void sortArrays(int[]numbers){
        Arrays.sort(numbers);
        System.out.println("Array: "+Arrays.toString(numbers));
    }
    public static void sortArrays(ArrayList <Integer> numbers){
        Collections.sort(numbers);
        System.out.println("ArrayList: "+numbers);
    }
    public static void sortArrays(LinkedList<Integer>numbers){
        Collections.sort(numbers);
        System.out.println("LinkedList:   "+numbers);
    }
}

