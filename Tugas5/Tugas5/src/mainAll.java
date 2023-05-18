public class mainAll {
    public static void main(String[] args) {
        
        manusia manusia1 = new manusia("Budi", "1217890", true, true);
        manusia manusia2 = new manusia("Tiara", "1214567", false, true);
        manusia manusia3 = new manusia("Zayn", "12132312", true, false);
        System.out.println(manusia1);
        System.out.println(manusia2);
        System.out.println(manusia3);

        mahasiswaFILKOM mhs1 = new mahasiswaFILKOM("225150707111074", 2.8, "Sani", "56712093", false, false);
        mahasiswaFILKOM mhs2 = new mahasiswaFILKOM("225150707111072", 3.4, "Yiyi", "56712093", false, false);
        mahasiswaFILKOM mhs3 = new mahasiswaFILKOM("225150707111071", 3.9, "Vian", "56712093", true, false);
        System.out.println(mhs1);
        System.out.println(mhs2);
        System.out.println(mhs3);

        pekerja pekerja1 = new pekerja(3000, 2021, 5, 12, 2, "Nathanie", "92180411", false, true);
        pekerja pekerja2 = new pekerja(3000, 2014, 5, 12, 0, "Jojo", "891209312", true, false);
        pekerja pekerja3 = new pekerja(3000, 2003, 5, 12, 10, "Gigi", "891831021", false, true);
        System.out.println(pekerja1);
        System.out.println(pekerja2);
        System.out.println(pekerja3);

        manager manager1 = new manager("Information and Technology", 7500, 2008, 5, 12, 0, "Susi", "1453241", false, false);
        System.out.println(manager1);
        
    }
}