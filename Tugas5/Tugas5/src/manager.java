public class manager extends pekerja{
    
    private String departement;
    
    public manager(String departement, double gaji, int tahun, int bulan, int tanggal, int jumlahAnak, String nama, String nik, boolean jenisKelamin, boolean menikah){
        super(gaji, tahun, bulan, tanggal, jumlahAnak, nama, nik, jenisKelamin, menikah);
        this.departement = departement;
    }

    public void setDepartement(String departement) {
        this.departement = departement;
    }
   
    public String getDepartement() {
        return departement;
    }

    public double getTunjangan() {
        return super.getTunjangan() + (0.1 * this.getGaji());
    }

    public String toString() {
        return super.toString() + String.format("%-15s: %s\n", "Departemen", departement);
    }
}