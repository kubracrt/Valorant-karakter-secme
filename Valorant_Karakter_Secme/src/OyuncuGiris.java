import java.util.Scanner;

public class OyuncuGiris extends OyuncuGiris_Kontrol {
    private String mesaj="Valoranta Hoşgeldiniz";
    Scanner scanner = new Scanner(System.in);
    RolSecme rolSecme=new RolSecme();


    public String HosgeldinMesajı(){
        return mesaj;
    }
    public void Kontrol() {
        System.out.println("Nicknamenizi giriniz: ");
        String nickname = scanner.nextLine();
        OyuncuGiris_Kontrol.setNickname(nickname);

        if (!OyuncuGiris_Kontrol.kullaniciAdiKontrol()) {
            return;
        }

        System.out.println("Şifrenizi giriniz: ");
        int sifre = scanner.nextInt();
        OyuncuGiris_Kontrol.setSifre(sifre);

        if (!OyuncuGiris_Kontrol.sifreKontrol()) {
            return;
        }

        System.out.println(HosgeldinMesajı());

        rolSecme.rolSec();
    }

}
