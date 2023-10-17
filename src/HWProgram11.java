import java.util.Arrays;
import java.util.Random;


public class HWProgram11{

    public static void main(String[] args){

        Random random = new Random();
        int [] arrayTeam1 = new int[25];
        int [] arrayTeam2 = new int[25];

        for (int index1 = 0; index1 < arrayTeam1.length ; index1++) {
            arrayTeam1[index1] = random.nextInt(22)+18;

        }
        System.out.println(Arrays.toString(arrayTeam1));

        for (int index2 = 0; index2 < arrayTeam2.length;  index2++) {
            arrayTeam2[index2] = random.nextInt(22)+18;
        }
        System.out.println(Arrays.toString(arrayTeam2));




        int sum1 = 0;
        for (int arrElement1: arrayTeam1){
            sum1 += arrElement1;
            System.out.println(arrElement1);
        }
            double avgTeam1 = (double) sum1 / arrayTeam1.length;
            System.out.println(avgTeam1 + ": " + sum1);

            int sum2 = 0;
        for (int arrElement2: arrayTeam2){
            sum2 += arrElement2;
            System.out.println(arrElement2);
        }
            double avgTeam2 = (double) sum2 / arrayTeam2.length;
            System.out.println(avgTeam2 + ": " + sum2);

        }



    }




















