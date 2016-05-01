package laporan6;

public class PegTidakTetap extends Employee {
    private int jam;
    private double lembur;
    
    public void setJam(int jam){
        this.jam = jam;
    }
    public void lembur(){
        if (jam >= 10){
            lembur = 10000 * jam;
            total = gaji + lembur;
            System.out.println("Mendapatkan Gaji Lembur : Rp. "+lembur);
            System.out.println("Gaji Total : Rp. "+total);
        }else{
            System.out.println("Tidak Mendapatkan Gaji Lembur ");
            total = gaji;
            System.out.println("Gaji Total : Rp. "+total);   
        }
    }
}
