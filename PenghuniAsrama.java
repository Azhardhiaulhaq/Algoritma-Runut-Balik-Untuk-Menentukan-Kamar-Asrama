public class PenghuniAsrama {
    private String Nama;
    private String AsalDaerah;

    public PenghuniAsrama(){
        this.Nama = "Fulan";
        this.AsalDaerah = "xxx";
    }

    public PenghuniAsrama(String _nama, String _Asal){
        this.Nama = _nama;
        this.AsalDaerah = _Asal;
    }

    public String getNama(){
        return this.Nama;
    }

    public String getAsalDaerah(){
        return this.AsalDaerah;
    }

    public String toString(){
        return this.Nama + "-" + this.AsalDaerah; 
    }
}