import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2, select, sonuc = 0;
        System.out.print("1 numaralı sayıyı giriniz : ");
        n1 = sc.nextInt();
        System.out.print("2 numaralı sayıyı giriniz : ");
        n2 = sc.nextInt();

        System.out.println("Lütfen yapmak istediğiniz işlemin numarasını yazınız ;" +
                "\nToplama:1\nÇıkarma:2\nÇarpma:3\nBölme:4");
        select = sc.nextInt();
        switch (select) {
            case (1):
                sonuc = n1 + n2;
                break;
            case (2):
                sonuc = n1 - n2;
                break;
            case (3):
                sonuc = n1 * n2;
                break;
            case (4):
                sonuc = n1 / n2;
                break;
            default:
                System.out.printf("Hatalı işlem seçtiniz!!");
                break;
            }
        System.out.print("İşleminizin sonucu : " + sonuc );

    }
}