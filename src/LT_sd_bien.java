import java.util.Scanner;

public class LT_sd_bien {
    public static void main(String[] args) {
        float vl,hh,sh;
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhập điểm vật lí");
        vl = sc.nextFloat();
        System.out.println("Nhập điểm hóa học");
        hh= sc.nextFloat();
        System.out.println("Nhập điểm sinh học");
        sh= sc.nextFloat();
        float sum=vl+hh+sh;
        float tb=sum/3;
        System.out.println("tổng điểm là "+ sum +" và điểm trung bình là"+ tb);

    }
}
