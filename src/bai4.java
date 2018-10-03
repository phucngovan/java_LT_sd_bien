import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        int x,y;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập vào năm sinh của bạn");
        x=sc.nextInt();
        y=2018-x;
        System.out.println("năm nay bạn " + y + "tuổi");


    }
}
