import java.util.Scanner;

public class KarakterSecme extends RolSecme {

    Scanner scanner=new Scanner(System.in);
    Raze raze=new Raze();
    Astra astra=new Astra();
    Chamber chamber=new Chamber();
    Kılljoy killjoy=new Kılljoy();
    Neon neon=new Neon();
    Omen omen=new Omen();
    Reyna reyna=new Reyna();
    Yoru yoru=new Yoru();

    public void KarakterSecme(int rol){


        switch (rol) {
            case 1:
                System.out.println("Secebiliceginiz Karakterler");
                System.out.print("Raze Ülkesi :");
                System.out.println(raze.ülke());
                raze.özellikleri();
                System.out.print("Reyna Ülkesi :");
                System.out.println(reyna.ülke());
                reyna.özellikleri();
                System.out.print("Yoru Ülkesi : ");
                System.out.println(yoru.ülke());
                yoru.özellikleri();
                System.out.print("Neon Ülkesi : ");
                System.out.println(neon.ülke());
                neon.özellikleri();
                System.out.println("Raze için 1 e tiklayiniz");
                System.out.println("Reyna için 2 e tiklayiniz");
                System.out.println("Yoru için 3 e tiklayiniz");
                System.out.println("Neon için 4 e tiklayiniz");
                int secme = scanner.nextInt();
                switch (secme) {
                    case 1:
                        System.out.println("Raze karakteriniz seçtiniz");
                        System.out.println("Oyun başlıyor");
                        return;
                    case 2:
                        System.out.println("Reyna karakteriniz seçtiniz");
                        System.out.println("Oyun başlıyor");
                        return;
                    case 3:
                        System.out.println("Yoru karakteriniz seçtiniz");
                        System.out.println("Oyun başlıyor");
                        return;
                    case 4:
                        System.out.println("Neon karakteriniz seçtiniz");
                        System.out.println("Oyun başlıyor");
                        return;
                    default:
                        System.out.println("Yanlis tusa bastiniz");
                        return;
                }
            case 2:
                System.out.println("Secebiliceginiz Karakterler");
                System.out.print("Astra Ülkesi : ");
                System.out.println(astra.ülke());
                astra.özellikleri();
                System.out.print("Omen Ülkesi : ");
                System.out.println(omen.ülke());
                omen.özellikleri();
                System.out.println("Astra için 1 e tiklayiniz");
                System.out.println("Omen için 2 e tiklayiniz");
                int secme2 = scanner.nextInt();
                switch (secme2) {
                    case 1:
                        System.out.println("Astra karakteriniz seçtiniz");
                        System.out.println("Oyun başlıyor");
                        return;
                    case 2:
                        System.out.println("Omen karakteriniz seçtiniz");
                        System.out.println("Oyun başlıyor");
                        return;
                    default:
                        System.out.println("Yanlis tusa bastiniz");
                        return;
                }
            case 3:
                System.out.println("Secebilceginiz Karakterler");
                System.out.print("Chamber Ülkesi : ");
                System.out.println(chamber.ülke());
                chamber.özellikleri();
                System.out.print("Kılljoy Ülkesi : ");
                System.out.println(killjoy.ülke());
                killjoy.özellikleri();
                System.out.println("Chamber için 1 e tiklayiniz");
                System.out.println("Kılljoy için 2 e tiklayiniz");
                int secme3 = scanner.nextInt();
                switch (secme3) {
                    case 1:
                        System.out.println("Chamber karakteriniz seçtiniz");
                        System.out.println("Oyun başlıyor");
                        return;
                    case 2:
                        System.out.println("Kılljoy  karakteriniz seçtiniz");
                        System.out.println("Oyun başlıyor");
                        return;
                    default:
                        System.out.println("Yanlis tusa bastiniz");
                        return;
                }
            default:
                System.out.println("Yanlis bir tusa bastiniz");
        }
    }
}
