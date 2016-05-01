package laporan6;

public class Employee {
    protected String nama;
    protected String id;
    protected String jabatan;
    protected String istri;
    protected int anak;
    protected int masuk;
    protected final int gaji = 1000000;
    
    protected double total;
    
    public void setNama(String nama){
        this.nama = nama;
    }
    public String getNama(){
        return nama;
    }
    public void setID(String id){
        this.id = id;
    }
    public String getID(){
        return id;
    }
    public void setJabatan(String jabatan){
        this.jabatan = jabatan;
    }
    public String getJabatan(){
        return jabatan;
    }
    public void setIstri(String istri){
        this.istri = istri;
    }
    public String getIstri(){
        return istri;
    }
    public void setAnak(int anak){
        this.anak = anak;
    }
    public int getAnak(){
        return anak;
    }
    public void setMasuk (int masuk){
        this.masuk = masuk;
    }
    public int getMasuk(){
        return masuk;
    }
}
