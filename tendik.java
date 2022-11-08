public class tendik extends main{
    String nip, nama, alamat, jenisKelamin;
    int tanggalLahir, tahunMasuk, lembur;
    int bonuslembur, gajistaff;

    public void setNip(String nip) {
        this.nip = nip;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }
    public void setTanggalLahir(int tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }
    public void setTahunMasuk(int tahunMasuk) {
        this.tahunMasuk = tahunMasuk;
    }
    public void setLembur(int lembur) {
        bonuslembur = lembur*50000;
        this.lembur = lembur;
    }
    public void setBonuslembur(int bonuslembur) {
        this.bonuslembur = bonuslembur;
    }
    public void setGajistaff(int gajistaff) {
        gajistaff = 2000000+bonuslembur;
        this.gajistaff = gajistaff;
    }

    public String getNip() {
        return nip;
    }
    public String getNama() {
        return nama;
    }
    public String getAlamat() {
        return alamat;
    }
    public String getJenisKelamin() {
        return jenisKelamin;
    }
    public int getTanggalLahir() {
        return tanggalLahir;
    }
    public int getTahunMasuk() {
        return tahunMasuk;
    }
    public int getGajistaff() {
        return gajistaff;
    }
    // public void settendik() {
    //     Scanner staff1 = new Scanner(System.in);
    //     System.out.print("NIP = ");
    //     String nip = staff1.nextLine();
    //     System.out.print("Nama = ");
    //     String nama = staff1.nextLine();
    //     System.out.print("Alamat = ");
    //     String alamat = staff1.nextLine();
    //     System.out.print("Jenis Kelamin = ");
    //     String jenisKelamin = staff1.nextLine();
    //     System.out.print("Tanggal Lahir = ");
    //     int tanggalLahir = staff1.nextInt();
    //     System.out.print("Tahun Masuk = ");
    //     int tahunMasuk = staff1.nextInt();
    //     System.out.print("Waktu Lembur = ");
    //     int lembur = staff1.nextInt();

    //     int bonuslembur = lembur*50000;
    //     int gajistaff = 2000000+bonuslembur;
        
    //     System.out.println("\n=================================");
    //     System.out.println("NIP : "+nip);
    //     System.out.println("Nama : "+nama);
    //     System.out.println("alamat : "+alamat);
    //     System.out.println("Jenis Kelamin : "+jenisKelamin);
    //     System.out.println("Tanggal Lahir : "+tanggalLahir);
    //     System.out.println("Tahun Masuk : "+tahunMasuk);
    //     System.out.println("Gaji : "+gajistaff);
    //     System.out.println("\n=================================");

    // }
}
