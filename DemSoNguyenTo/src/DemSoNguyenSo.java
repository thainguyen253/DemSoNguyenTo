import java.sql.SQLOutput;
import java.util.Scanner;

public class DemSoNguyenSo {
    private static boolean method1(int a) {
     boolean laSoNguyenTo=true;
     for (int i=2;i<a;i++)
     if (a%i ==0) {
         laSoNguyenTo =false;
     }
     return (laSoNguyenTo);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi ban nhap 1 so");
        int num = sc.nextInt();
        int dem =0;
        for (int i=2;i<num;i++)
            if (method1(i) ==true) {
                dem++;
            }
        System.out.println("So cac so nguyen nho hon "+num+" la "+dem);
        }
    }
