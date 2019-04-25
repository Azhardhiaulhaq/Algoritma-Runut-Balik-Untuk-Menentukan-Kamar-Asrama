import java.util.*;

public class Main {
    public static void main (String[] Args){
        KamarAsrama []KamarNomor = new KamarAsrama[100];
        for (int i = 0; i<100; i++){
            KamarNomor[i] = new KamarAsrama();
        }
        PenghuniAsrama PA1 = new PenghuniAsrama("Hartonon W","Jawa Timur");
        PenghuniAsrama PA2 = new PenghuniAsrama("Amirta D","Jawa Timur");
        PenghuniAsrama PA3 = new PenghuniAsrama("Christoporuss L","Sulawesi Selatan");
        PenghuniAsrama PA4 = new PenghuniAsrama("Maichel T.","Papua");
        PenghuniAsrama PA5 = new PenghuniAsrama("Adhika D.","Kalimantan Barat");
        PenghuniAsrama PA6 = new PenghuniAsrama("Faisar M.","Jawa Tengah");
        PenghuniAsrama PA7 = new PenghuniAsrama("Laurensqy T.","Sumatra tara");
        PenghuniAsrama PA8 = new PenghuniAsrama("Ihzan R","Jawa Timur");
        PenghuniAsrama PA9 = new PenghuniAsrama("Andri S.","Sumatra Utara");
        PenghuniAsrama PA10 = new PenghuniAsrama("Saputro","Jawa Timur");
        PenghuniAsrama PA11 = new PenghuniAsrama("Yulio O","Jawa Timur");
        PenghuniAsrama PA12 = new PenghuniAsrama("Aleksander W.","Papua");
        PenghuniAsrama PA13 = new PenghuniAsrama("Hyan W.","NTT");
        PenghuniAsrama PA14 = new PenghuniAsrama("Bakti F.","NTB");
        PenghuniAsrama PA15 = new PenghuniAsrama("Febyan A.","Jawa Tengah");
        PenghuniAsrama PA16 = new PenghuniAsrama("I Gede P.","Bali");
        PenghuniAsrama PA17 = new PenghuniAsrama("Falih","Sulawesi Tengah");
        PenghuniAsrama PA18 = new PenghuniAsrama("Yusrin S.","Sumatra Barat");
        PenghuniAsrama PA19 = new PenghuniAsrama("Ahmad D.","Kalimantan Tengah");
        PenghuniAsrama PA20 = new PenghuniAsrama("Pablo Putra","Papua");
        PenghuniAsrama PA21 = new PenghuniAsrama("Iqbal L.","Kalimantan Tengah");
        ListPenghuniAsrama List1 = new ListPenghuniAsrama();
        List1.addPenghuniAsrama(PA1);
        List1.addPenghuniAsrama(PA3);
        List1.addPenghuniAsrama(PA2);
        List1.addPenghuniAsrama(PA4);
        List1.addPenghuniAsrama(PA5);
        List1.addPenghuniAsrama(PA6);
        List1.addPenghuniAsrama(PA7);
        List1.addPenghuniAsrama(PA8);
        List1.addPenghuniAsrama(PA9);
        List1.addPenghuniAsrama(PA10);
        List1.addPenghuniAsrama(PA11);
        List1.addPenghuniAsrama(PA12);
        List1.addPenghuniAsrama(PA13);
        List1.addPenghuniAsrama(PA14);
        List1.addPenghuniAsrama(PA15);
        List1.addPenghuniAsrama(PA16);
        List1.addPenghuniAsrama(PA17);
        List1.addPenghuniAsrama(PA18);
        List1.addPenghuniAsrama(PA19);
        List1.addPenghuniAsrama(PA20);
        List1.addPenghuniAsrama(PA21);

   
    
        IsiKamar(KamarNomor,List1);
      
    }

    
    public static void AllDistinct (KamarAsrama[] KamarNomor,ListPenghuniAsrama LPA, int i){
        if(KamarNomor[i].isFull() || LPA.isempty()){
            int j = i + 1;
            System.out.println("Kamar " + j +" Telah Terisi");
        } else {
            if (KamarNomor[i].HitungBedaDaerah(LPA.getPenghuniAsrama(0)) == 3){
                KamarNomor[i].addPenghuniKamar(LPA.getPenghuniAsrama(0));
            } else {
                LPA.addLastPenghuniAsrama(LPA.getPenghuniAsrama(0));
            }
            LPA.removePenghuniAsrama();
            AllDistinct(KamarNomor,LPA,i);
        }
    }

    public static void HalfDistinct (KamarAsrama[] KamarNomor,ListPenghuniAsrama LPA, int i){
        if(KamarNomor[i].isFull() || LPA.isempty()){
            int j = i  + 1;
            System.out.println("Kamar " + j +" Telah Terisi");
        } else {
            if (KamarNomor[i].HitungBedaDaerah(LPA.getPenghuniAsrama(0)) >= 2){
                KamarNomor[i].addPenghuniKamar(LPA.getPenghuniAsrama(0));
            } else {
                LPA.addLastPenghuniAsrama(LPA.getPenghuniAsrama(0));
            }
            LPA.removePenghuniAsrama();
            HalfDistinct(KamarNomor,LPA,i);
        }
    }

    public static void NoDistinct (KamarAsrama[] KamarNomor, ListPenghuniAsrama LPA, int i){
        if(KamarNomor[i].isFull() || LPA.isempty()){
            int j = i + 1;
            System.out.println("Kamar " + j +" Telah Terisi");
        } else {   
            KamarNomor[i].addPenghuniKamar(LPA.getPenghuniAsrama(0));         
            LPA.removePenghuniAsrama();
            NoDistinct(KamarNomor,LPA,i);
        }
    }

    public static void IsiKamar (KamarAsrama[] KamarNomor, ListPenghuniAsrama LPA){
        int i = 0;
        while (!LPA.isempty()){
             if (LPA.getHomopobic() >= 3){
                AllDistinct(KamarNomor,LPA,i);
            } else if (LPA.getHomopobic() == 2){
                HalfDistinct(KamarNomor,LPA,i);
            } else {
                NoDistinct(KamarNomor,LPA,i);
            }
            KamarNomor[i].Print(i+1);
            System.out.println();
            i++;
        }
    }
}