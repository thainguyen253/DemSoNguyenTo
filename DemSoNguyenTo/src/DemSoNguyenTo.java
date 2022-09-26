import java.util.Scanner;

public class DemSoNguyenTo {
    static boolean method(int a) {
        boolean laSoNguyenTo = true;
        if (a % 2 == 0) {
            laSoNguyenTo = false;
        }
        return (laSoNguyenTo);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Moi ban nhap mot so");
        int num = sc.nextInt();
        int dem = 0;
        for (int i = 2; i < num; i++) {
            if (method(i) == true) {
                dem++;
            }
        }
        System.out.println("So cac so nguyen to nho hon " +num+ " la "+dem);
    }
}

// if i = so nguyen to ==> x++