import java.util.Scanner;

public class main {
    String nip, nama, alamat, jenisKelamin;
    int tanggalLahir, tahunMasuk, lembur, sks;
    int bonuslembur, bonussks, gajiDosen, gajistaff;
    public static void main(String[] args) {
        System.out.println("\n=================================");
        System.out.println("              DOSEN              ");
        System.out.println("=================================");
        Scanner dosen1 = new Scanner(System.in);
        System.out.print("NIP = ");
        String nip = dosen1.nextLine();
        System.out.print("Nama = ");
        String nama = dosen1.nextLine();
        System.out.print("Alamat = ");
        String alamat = dosen1.nextLine();
        System.out.print("Jurusan = ");
        String jurusan = dosen1.nextLine();
        System.out.print("Jenis Kelamin = ");
        String jenisKelamin = dosen1.nextLine();
        System.out.print("NIDN = ");
        int nidn = dosen1.nextInt();
        System.out.print("Tanggal Lahir = ");
        int tanggalLahir = dosen1.nextInt();
        System.out.print("Tahun Masuk = ");
        int tahunMasuk = dosen1.nextInt();
        System.out.print("Kelebihan SKS = ");
        int sks = dosen1.nextInt();
    
        int bonussks = sks*100000;
        int gajiDosen = 2000000+bonussks;  

        dosen data1 = new dosen();
        data1.setJurusan(jurusan);
        data1.setNidn(nidn);
        System.out.println("\n=================================");

        System.out.println("\n=================================");
        System.out.println("NIP : "+nip);
        System.out.println("Nama : "+nama);
        System.out.println("alamat : "+alamat);
        System.out.println("Jenis Kelamin : "+jenisKelamin);
        System.out.println("Tanggal Lahir : "+tanggalLahir);
        System.out.println("Tahun Masuk : "+tahunMasuk);
        System.out.println("Jurusan : "+data1.getJurusan());
        System.out.println("NIDN : "+data1.getNidn());
        System.out.println("Gaji : "+gajiDosen);
        System.out.println("\n=================================");

        System.out.println("\n=================================");
        System.out.println("             TENDIK              ");
        System.out.println("=================================");

        tendik data2 = new tendik();
        data2.setNip("123");
        data2.setNama("Dino");
        data2.setAlamat("Omogiri Barat");
        data2.setJenisKelamin("Pria");
        data2.setTanggalLahir(25);
        data2.setTahunMasuk(2018);
        data2.setLembur(20);
        data2.setGajistaff(2000000);

        System.out.println("\n=================================");
        System.out.println("NIP : "+data2.getNip());
        System.out.println("Nama : "+data2.getNama());
        System.out.println("alamat : "+data2.getAlamat());
        System.out.println("Jenis Kelamin : "+data2.getJenisKelamin());
        System.out.println("Tanggal Lahir : "+data2.getTanggalLahir());
        System.out.println("Tahun Masuk : "+data2.getTahunMasuk());
        System.out.println("Gaji : "+data2.getGajistaff());
        System.out.println("\n=================================");
    }
}
