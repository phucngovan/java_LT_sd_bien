import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        double d,c, s;
        double pi = 3.14;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập vào đường kính hình tròn ");
        d = Double.parseDouble(sc.nextLine());
        s = pi * d*d / 4;
        c = pi * d;
        System.out.println("chu vi hình tròn là " + c);
        System.out.println("diện tích hình tròn là " + s);

    }
}
