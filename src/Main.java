import java.util.Scanner;

/*
Eğer şifre yanlış ise kullanıcıya şifresini sıfırlayıp sıfırlamayacağını sorun,
eğer kullanıcı sıfırlamak isterse yeni girdiği şifrenin hatalı girdiği ve unuttuğu şifre
ile aynı olmaması gerektiğini kontrol edip , şifreler aynı ise ekrana "Şifre oluşturulamadı,
lütfen başka şifre giriniz." sorun yoksa "Şifre oluşturuldu" yazan programı yazınız.
 */
public class Main {
    public static void main(String[] args) {

        Scanner yazici = new Scanner(System.in);

        String userName, password, newPassword, answer;

        System.out.println("Lutfen kullanici adinizi girin: ");
        userName = yazici.nextLine();

        System.out.println("Lutfen sifrenizi girin: ");
        password = yazici.nextLine();

        if (userName.equals("patika") && password.equals("java")) {
            System.out.println("Tebrikler, basariyla giris yaptiniz!");
        } else {
            System.out.println("Sifreniz yanlis, tekrar olusturmak ister misiniz?(e/h) ");
            answer = yazici.nextLine();
            if (answer.equals("e")) {
                System.out.println("Lutfen yeni sifrenizi giriniz: ");
                newPassword = yazici.nextLine();
                if (!(newPassword.equals("java") && newPassword.equals(password)))
                    System.out.println("Sifre olusturulamadi, lutfen baska sifre giriniz.");
                else
                    System.out.println("Sifre basariyla olusturuldu.");

            } else
                System.out.println("Sistemden basariyla cikildi.");
        }


    }
}
