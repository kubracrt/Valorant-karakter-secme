public class Chamber extends KarakterSec{

    @Override
    public String ülke() {
        return "Fas";
    }

    public void özellikleri(){
        System.out.println("Özellikleri");
        System.out.println("        1.Siber Kafes\n        2.Gizli Kamera\n        3.Bubi Tuzağı\n        4.Nöron Hırsızı");

    }
    @Override
    public void rolü() {
        System.out.println("Gözcü");
    }
}