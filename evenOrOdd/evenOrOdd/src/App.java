
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        System.out.println("Chose array size betwen 1 and 100: ");
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int odd = 0;
        int even = 0;
        int size = sc.nextInt();       

        if (size >= 1 && size <= 100) 
        {
            int[] arr = new int[size];
            
            for(int i = 0; i < size; i++)
            {
                arr[i] = rand.nextInt(100);
            }

            for(int i = 0; i < size; i++)
            {
                if( (arr[i] % 2) == 1)               
                {
                    odd++;
                }
                
                else
                {
                    even++;
                }
            }
            //to see the array itself
            System.out.println(Arrays.toString(arr));
        }

        else    
        {
            System.out.println("Incorrect size.");
        }
          
        System.out.println("In randomly generated array have been created " + even + 
                            " even numbers/nand " + odd + " odd numbers.");

    }
}
