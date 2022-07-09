public class Soru2 {

    public static void main(String[] args) {
        System.out.println("***Sebze Ozellikleri***");
        Yiyecek nesne1 = new Sebze("kirmizilahana", "kirmizi");
        String sebzetur= nesne1.YiyecekTuru();
        System.out.println("tur: "+sebzetur);

        System.out.println("");//çıktıda boşluk bırakmak için

        System.out.println("***Meyve Ozellikleri***");
        Yiyecek nesne2= new Meyve("yesil elma","yesil");
        String meyvetur= nesne2.YiyecekTuru();
        System.out.println("tur: "+meyvetur);

        System.out.println("");//çıktıda boşluk bırakmak için

        Yiyecek.meyveMiSebzeMi(nesne1);
        Yiyecek.meyveMiSebzeMi(nesne2);
    }
}

abstract class Yiyecek {
    private String isim;
    private String renk;
    private String YetisenYer;

    public Yiyecek(String isim, String renk, String YetisenYer) {
        set1(isim, renk, YetisenYer);
        getIsim();
        getRenk();
        getYetisenYer();
    }

    public String getIsim() {
        System.out.println("isim: "+this.isim);
        return isim;
    }

    public String getRenk() {
        System.out.println("renk: "+this.renk);
        return renk;
    }

    public String getYetisenYer() {
        System.out.println("Yetisen yer: "+this.YetisenYer);
        return YetisenYer;
    }

    public void set1(String isim, String renk, String YetisenYer) {
        this.YetisenYer = YetisenYer;
        this.renk = renk;
        this.isim = isim;
    }

    public void set2(String isim, String renk) {
        this.renk = renk;
        this.isim = isim;
    }

    public String YiyecekTuru() {
        return "belirsiz";
    }
    public static void meyveMiSebzeMi(Yiyecek yiyecek){
        if(yiyecek instanceof Sebze){
            System.out.println(yiyecek.isim +" bir sebzedir");
        }else if(yiyecek instanceof Meyve){
            System.out.println(yiyecek.isim+ " bir meyvedir");
        }else {
            System.out.println(yiyecek.isim+ " turu belirsizdir.");
        }
    }

}

class Sebze extends Yiyecek {

    public Sebze(String isim, String renk) {
        super(isim, renk, "toprak");

    }

    public String YiyecekTuru() {
        return "sebze";
    }
}

class Meyve extends Yiyecek {

    public Meyve(String isim, String renk) {
        super(isim, renk, "agac");

    }

    public String YiyecekTuru() {
        return "meyve";
    }
}


