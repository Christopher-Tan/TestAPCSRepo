public class Demo{
    public static void printLoop(int i) {
        for (int j = 1; j <= i; j++) {
            for (int k = 0; k < i-j+1; k++) {
                System.out.print(j);
            }
            System.out.println("");
        }
    }
    public static String arrToString(int[] arr) {
        String result = "{";
        for (int i = 0; i < arr.length-1; i++) {
            result += (arr[i] + ", ");
        }
        if (arr.length > 0) result += arr[arr.length-1];
        return result + "}";
    }
    public static String arrayDeepToString(int[][] arr) {
        String result = "{";
        for (int i = 0; i < arr.length-1; i++) {
            result += (arrToString(arr[i]) + ", ");
        }
        if (arr.length > 0) result += arrToString(arr[arr.length-1]);
        return result + "}";
    }
    public static int[][] create2DArray(int rows, int cols, int maxValue) {
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = (int) (Math.random() * (maxValue + 1));
            }
        }
        return result;
    }
    public static int[][] create2DArrayRandomized(int rows, int cols, int maxValue) {
        int[][] result = new int[rows][];
        for (int i = 0; i < rows; i++) {
            int length = (int) (Math.random() * (cols + 1));
            result[i] = new int[length];
            for (int j = 0; j < length; j++) {
                result[i][j] = (int) (Math.random() * (maxValue + 1));
            }
        }
        return result;
    }
    public static void main(String[] args) {
        //printLoop
        int input;
        if (args.length > 0) input = Integer.parseInt(args[0]); else input = 5;
        printLoop(input);
        //arrToString
        /*int[] array1 = {1,2,3,4};
        System.out.println(arrToString(array1));*/
        //arrayDeepToString
        /*int[][] array2 = {{1,2,3,4},{5,6},{7,8,9,10}};
        System.out.println(arrayDeepToString(array2));*/
        //create2DArray
        /*System.out.println(arrayDeepToString(create2DArray(4,4,4)));
        System.out.println(arrayDeepToString(create2DArray(6,2,3)));*/
        //create2DArrayRandomized
        /*System.out.println(arrayDeepToString(create2DArrayRandomized(6,4,4)));
        System.out.println(arrayDeepToString(create2DArrayRandomized(4,10,100)));*/
    }
}