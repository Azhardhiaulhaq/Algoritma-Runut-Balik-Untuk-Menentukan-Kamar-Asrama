import java.util.*;

public class ListPenghuniAsrama {
    private List<PenghuniAsrama> ListPA;
    private int num_PA;

    public ListPenghuniAsrama(){
        ListPA = new ArrayList();
        num_PA = 0;
    }

    public void addPenghuniAsrama (PenghuniAsrama PA){
        ListPA.add(PA);
        num_PA++;
    }

    public void addLastPenghuniAsrama(PenghuniAsrama PA){
        ListPA.add(num_PA,PA);
        num_PA++;
    }

    public void removePenghuniAsrama(){
        ListPA.remove(0);
        num_PA--;
    }

    public int getHomopobic(){
        if (!this.isempty()){
            String pembanding = ListPA.get(0).getAsalDaerah();
            int jumlahdaerah = 0;
            for (int i =0; i < ListPA.size() ; i++){
                if (!pembanding.equals(ListPA.get(i).getAsalDaerah())){
                    jumlahdaerah++;
                }
            }
            
            return jumlahdaerah;
        } else {
            return -999;
        }
    }

    public PenghuniAsrama getPenghuniAsrama(int i){
        return ListPA.get(i);
    }

    public int getSize(){
        return num_PA;
    }

    public boolean isempty(){
        return num_PA == 0;
    }

}