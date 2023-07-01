public class Neon extends KarakterSec {

    @Override
    public String ülke() {
        return "Filipin";
    }

    public void özellikleri(){
        System.out.println("Özellikleri");
        System.out.println("        1.Elektro Ok\n        2.Yüksek Devir\n        3.Hız Şeridi\n        4.Enerji Patlaması");

    }
    @Override
    public void rolü() {
        System.out.println("Düollocu");
    }
}