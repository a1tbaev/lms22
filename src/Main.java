import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random =new Random();
        ArrayList <Integer> numbers = new ArrayList <> ();
        for (int i = 0; i < 50; i++)
            numbers.add(random.nextInt(1,100));

        oddAndEvenNumbers(numbers);

    }
    public static void oddAndEvenNumbers(ArrayList<Integer> numbers){
        ArrayList<Integer> odd = new ArrayList<>();
        ArrayList<Integer> even = new ArrayList<>();
        for (Integer number : numbers) {
            if(number%2!=0)
                odd.add(number);
            else
                even.add(number);
        }
        System.out.println("Odd numbers: "+odd);
        System.out.println("Even numbers: "+even);

    }

}