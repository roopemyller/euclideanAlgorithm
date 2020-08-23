
import java.util.Scanner;
import java.util.ArrayList;

public class euclideanAlgorithm {

    public static void main (String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.print("Bigger number:");
        int biggerNumber = Integer.valueOf(scan.nextLine());
        System.out.print("Smaller number:");
        int smallerNumber = Integer.valueOf(scan.nextLine());       

        boolean isReaminderZero = false;

        ArrayList<Integer> reminderList = new ArrayList<>();

        while(!isReaminderZero){
            int i = 1;
            while(true){
                int a = smallerNumber * i;
                if(a > biggerNumber){
                    i--;
                    break;
                }
                i++;
            }

            int remainder = biggerNumber - (smallerNumber * i);
            if(!(remainder == 0)){
                reminderList.add(remainder);
            }

            System.out.println(biggerNumber + " = " + smallerNumber + " * " + i + " + " + remainder);
            biggerNumber = smallerNumber;
            smallerNumber = remainder;

            if(remainder == 0){
                isReaminderZero = true;
            }
        }

        System.out.println("The largest common divisor is " + reminderList.get(reminderList.size() - 1));

        scan.close();
    }
}