public class Kılljoy extends KarakterSec{

    @Override
    public String ülke() {
        return "Almanya";
    }

    public void özellikleri(){
        System.out.println("Özellikleri");
        System.out.println("        1.Alarm Botu\n        2.Taret\n        3.Nanosürü\n      4.Tecrit");

    }
    @Override
    public void rolü() {
        System.out.println("Gözcü");
    }
}