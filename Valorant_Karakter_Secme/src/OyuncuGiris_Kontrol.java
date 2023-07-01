public class OyuncuGiris_Kontrol {
    private  static String nickname;
    private static int sifre;
    public static void setNickname(String nickname){
        if(nickname.equals("kubracorut")){
            OyuncuGiris_Kontrol.nickname=nickname;
        }
        else{
            OyuncuGiris_Kontrol.nickname="yanlis";
        }
    }
    public String getNickname(){
        return nickname;
    }
    public static void setSifre(int sifre){
        if(sifre==12345){
            OyuncuGiris_Kontrol.sifre=sifre;
        }
        else{
            OyuncuGiris_Kontrol.sifre=0;
        }
    }
    public int getSifre(){
        return sifre;

    }
    public static boolean kullaniciAdiKontrol(){
        if(nickname.equals("yanlis")){
            System.out.println("Yanlis nickname girdiniz, lütfen tekrar giriniz");
            return false;
        }
        return true;
    }
    public static boolean sifreKontrol(){
        if(sifre==0){
            System.out.println("Yanlis sifre girdiniz, lütfen tekrar giriniz");
            return false;
        }
        else{
            System.out.println("Sisteme başarıyla giriş yapıldı");
            return true;
        }
    }

}
