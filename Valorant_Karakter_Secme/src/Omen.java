public class Omen extends KarakterSec{

    @Override
    public String ülke() {
        return "Bilinmiyor";
    }

    @Override
    public void özellikleri(){
        System.out.println("Özellikleri");
        System.out.println("        1.Paranoya\n        2.Karanlık Örtü\n        3.Gizli Adım\n        4.Gölgelerin İçinden");

    }
    public void rolü() {
        System.out.println("Kontrol Uzmanı");
    }
}