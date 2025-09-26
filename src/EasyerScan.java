import java.util.Scanner;

public class EasyerScan {
    static Scanner sc = new Scanner(System.in);
    public static int nextInt(String prompt){
        System.out.print(prompt);
        return sc.nextInt();
    }

    public static int nextInt(){
        return sc.nextInt();
    }
    public static double nextDouble(String prompt){
        System.out.print(prompt);
        return sc.nextDouble();
    }
    public static double nextDouble(){
        return sc.nextDouble();
    }
    public static String nextLine(){
        return sc.nextLine();
    }

}
