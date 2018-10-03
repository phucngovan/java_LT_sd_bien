import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        float C,F;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập vào nhiệt độ C");
        C=sc.nextFloat();
        F=32+9/5*C;
        System.out.println("nhiệt độ F là " + F);
    }

}
