public class Demo{
    public static void printloop(int i) {
        for (int j = 1; j <= i; j++) {
            for (int k = 0; k < i-j+1; k++) {
                System.out.print(j);
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        int input;
        if (args.length > 0) input = Integer.parseInt(args[0]); else input = 5;
        printloop(input); 
    }
}