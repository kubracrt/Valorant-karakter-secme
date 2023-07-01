import java.util.Scanner;

public class RolSecme {
    Scanner scanner=new Scanner(System.in);

    public void rolSec(){
        System.out.println("Lütfen Hangi rolde oynamak istediğinizi seciniz");
        System.out.println("1. Düollocu");
        System.out.println("2. Kontrol Uzmanı");
        System.out.println("3. Gözcü");
        int rol = scanner.nextInt();
        KarakterSecme karakterSecme=new KarakterSecme();
        karakterSecme.KarakterSecme(rol);
    }
}
