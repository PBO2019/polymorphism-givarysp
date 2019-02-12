public class Pegawai {
    protected int Tarif;

    public static void main(String[] args) {
        Supervisor supervisor = new Supervisor();
        Staff staff = new Staff();
        Gaji gaji = new Gaji();

        gaji.hitungGaji(supervisor.Tarif);
        gaji.hitungGaji(staff.Tarif);
    }
}
