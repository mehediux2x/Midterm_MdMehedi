package math.problems;

public class FindLowestDifference {

    public static void main(String[] args) {
        /*
         Implement in java.
         Read this below two array. Find the lowest difference between the two array cell.
         The lowest difference between cells is 1
        */
        int[] array1 = {30, 12, 5, 9, 2, 20, 33, 1};
        int[] array2 = {18, 25, 41, 47, 17, 36, 14, 19};
        int num001 = 100;
        for (int a = 0; a < 8; a++) {

            for (int j = 0; j < 8; j++) {

                int num2 = Math.abs(array1[a] - array2[j]);
                if (num2 < num001){
                    num001=num2;
                }
            }
        } System.out.println("The lowest difference between cell is: " + num001);

    }

}
