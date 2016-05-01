package laporan6;

public class PegawaiTetap extends Employee {
    private double tunjangan, bonus;
    private double tistri, tanak;
    
    public void lamaKerja(){
        int lama = 2016 - masuk;
        if (lama <= 5){
            System.out.println("Tidak Mendapatkan Bonus");
            System.out.println("Tidak Mendapatkan Tunjangan");
            total = gaji;
            System.out.println("Gaji Total  : Rp. "+total);
        }else if (lama >= 6 && lama <= 10){
            bonus = gaji * lama * 0.05;
            total = gaji + bonus;
            System.out.println("Mendapatkan Bonus Sebesar  : Rp. "+Math.ceil(bonus));
            System.out.println("Gaji Total                 : Rp. "+total);
        }else if (lama > 10){
            bonus = gaji * lama * 0.1;
            tunjangan = gaji * lama * 0.1;
            total = gaji + bonus + tunjangan;
            System.out.println("Mendapatkan Tunjangan Sebesar  : Rp. "+Math.ceil(tunjangan));
            System.out.println("Mendapatkan Bonus Sebesar      : Rp. "+Math.ceil(bonus));
            System.out.println("Gaji Total                     : Rp. "+(total));
        }
    }
    public void istri(){
        tistri = 0.1 * total;
        System.out.println("Mendapatkan Tunjangan Istri Sebesar  : Rp. "+Math.ceil(tistri));
    }
    public void anak(){
        if (anak <= 3 && anak >= 0){
            tanak = 0.15 * anak * total;
            System.out.println("Mendapatan Tunjangan Anak Sebesar  : Rp. "+Math.ceil(tanak));
        }else if (anak > 3){
            tanak = 0.15 * 3 * total;
            System.out.println("Mendapatan Tunjangan Anak Sebesar  : Rp. "+Math.ceil(tanak));
        }
    }  
}

    
        
