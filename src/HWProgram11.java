import java.util.Arrays;
import java.util.Random;
import java.lang.String;

public class HWProgram11 {

    public static void main(String[] args) {

        Random random = new Random();
        int[] arrayTeam1 = new int[25];
        for (int index1 = 0; index1 < arrayTeam1.length; index1++) {
            arrayTeam1[index1] = random.nextInt(22) + 18;

        }
        System.out.println(Arrays.toString(arrayTeam1) + " вік 1 команди");
        int[] arrayTeam2 = new int[25];
        for (int index2 = 0; index2 < arrayTeam2.length; index2++) {
            arrayTeam2[index2] = random.nextInt(22) + 18;
        }
        System.out.println(Arrays.toString(arrayTeam1) + " вік 2 команди");

        int sum1 = 0;
        for (int i = 0; i < arrayTeam1.length; i++) {
            sum1 += arrayTeam1[i];
        }
        double avgTeam1 = (double) sum1 / arrayTeam1.length;
        System.out.println("Середній вік 1 команди" + ": " + avgTeam1);

        int sum2 = 0;
        for (int i = 0; i < arrayTeam2.length; i++) {
            sum2 += arrayTeam2[i];
        }
        double avgTeam2 = (double) sum2 / arrayTeam2.length;
        System.out.println("Середній вік 2 команди" + ": " + avgTeam2);

    }


}




















