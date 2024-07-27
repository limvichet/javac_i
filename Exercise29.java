
public class Exercise29 {

	public static void main(String[] args) {

        int[][] test = {
                {2, -5},
                {4, 0},
                {9, 1}
        };

        // use of nested for loop
        // access rows of the array
        for (int i = 0; i < test.length; ++i) {
            // access columns of the array
            for (int j = 0; j < test[i].length; ++j) {
                System.out.println("test[" + i + "][" + j + "] = " + test[i][j]);
            }
        }
    }

}
