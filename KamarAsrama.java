import java.util.*;

public class KamarAsrama{
    private List<PenghuniAsrama> Kamar;
    private int kapasitas;

    public KamarAsrama(){
        Kamar = new ArrayList();
        kapasitas = 3;
        PenghuniAsrama PA1 = new PenghuniAsrama("XXX","XXX");
        PenghuniAsrama PA2 = new PenghuniAsrama("XXX","XXX");
        PenghuniAsrama PA3 = new PenghuniAsrama("XXX","XXX");
        Kamar.add(0,PA1);
        Kamar.add(1,PA2);
        Kamar.add(2,PA3);
    }

    public void addPenghuniKamar(PenghuniAsrama PA){
        if (!this.isFull()){
            if(Kamar.get(0).getNama().equals("XXX")){
                Kamar.add(0,PA);
            } else if (Kamar.get(1).getNama().equals("XXX")){
                Kamar.add(1,PA);
            } else if (Kamar.get(2).getNama().equals("XXX")){
                Kamar.add(2,PA);
            } 
            kapasitas--;
        }
    }

    public boolean isFull(){
        return kapasitas == 0 ;
    }

    public PenghuniAsrama getPenghuniKamar(int i){
        return Kamar.get(i);
    }

    public int HitungBedaDaerah(PenghuniAsrama PA){
        String AsalPA = PA.getAsalDaerah();
        int beda = 0;
        if (!Kamar.get(0).getAsalDaerah().equals(AsalPA)){
            beda++;
        }
        if (!Kamar.get(1).getAsalDaerah().equals(AsalPA)){
            beda++;
        }
        if (!Kamar.get(2).getAsalDaerah().equals(AsalPA)){
            beda++;
        }
        return beda;
    }

    public void Print(int i){
        System.out.println("Kamar Nomor [" + i + "]" );
        System.out.println("1. " + this.getPenghuniKamar(0));
        System.out.println( "2. " + this.getPenghuniKamar(1));
        System.out.println( "3. " + this.getPenghuniKamar(2));

    }

}