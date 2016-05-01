package laporan6;

import java.util.Scanner;

public class MainEmployee {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        Scanner s = new Scanner (System.in);
        Employee e = new Employee();
        PegawaiTetap a = new PegawaiTetap();
        Manager m = new Manager();
        PegTidakTetap p = new PegTidakTetap();
        String pilih; 
        do{
            System.out.println("**********EMPLOYEE*********");
            System.out.print("Nama      : ");
            e.setNama(in.nextLine());
            System.out.print("ID Kerja  : ");
            e.setID(in.nextLine());
            System.out.print("Jabatan   : ");
            e.setJabatan(in.nextLine());
            System.out.println("Gaji Pokok : Rp. "+e.gaji);
            if (e.getJabatan().equalsIgnoreCase("Pegawai Tetap")){
                System.out.print("Tahun Masuk : ");
                a.setMasuk(s.nextInt());
                a.lamaKerja();
                System.out.print("Apakah Anda Mempunyai Istri : (Y/T) ");
                a.setIstri(s.next());
                if (a.getIstri().equalsIgnoreCase("Y")){
                    a.istri();
                    System.out.print("Jumlah Anak : ");
                    a.setAnak(s.nextInt());
                    a.anak();
                }else{
                    System.out.println("Tidak Mendapatkan Tunjangan Istri");
                }
            }else if(e.getJabatan().equalsIgnoreCase("Manager")){
                System.out.print("Tahun Masuk : ");
                m.setMasuk(s.nextInt());
                m.lamaKerja();
                m.jabatan();
                System.out.print("Apakah Anda Mempunyai Istri : (Y/T) ");
                m.setIstri(s.next());
                if (m.getIstri().equalsIgnoreCase("Y")){
                    m.istri();
                    System.out.print("Jumlah Anak : ");
                    m.setAnak(s.nextInt());
                    m.anak();
                }else{
                    System.out.println("Tidak Mendapatkan Tunjangan Istri");
                }
            }else if (e.getJabatan().equalsIgnoreCase("Pegawai Tidak Tetap")){
                System.out.print("Tahun Masuk : ");
                p.setMasuk(s.nextInt());
                System.out.print("Masukkan Jumlah Jam Kerja : ");
                p.setJam(s.nextInt());
                p.lembur();
            }
            System.out.println("************************************************");
            System.out.println("");
            System.out.print("Masukkan Data Lagi ? (Y/T) : ");
            pilih = s.next();
        }while(!pilih.equalsIgnoreCase("t"));
    }
}
