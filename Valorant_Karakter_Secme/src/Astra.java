public class Astra extends KarakterSec{

    @Override
    public String ülke() {
        return "Gana";
    }

    public void özellikleri(){
        System.out.println("Özellikleri");
        System.out.println("        1.Nova Darbesi\n        2.Yıldız Bulutu\n        3.Çekim Alanı\n        4.Astral yolcu");

    }
    @Override
    public void rolü()
    {
        System.out.println("Kontrol Uzmanı");
    }
}