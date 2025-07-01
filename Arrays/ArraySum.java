import java.util.*;
import java.util.Arrays;
public class ArraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int [] my_array = new int[size];

        for(int i =0 ; i < size; i++){
            my_array[i] = sc.nextInt();
        }
        int sum = 0;
        for(int i : my_array){
            sum += i;
        }
        System.out.println(sum);

    }
}
