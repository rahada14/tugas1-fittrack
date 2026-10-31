/**
 * Class TesFitTrack berisi method main untuk menguji fungsionalitas class Member
 * sesuai dengan skenario uji yang diminta.
 *
 * @author Rahadatul Qudsi
 * @version 1.0
 */
public class TesFitTrack {
  
 /**
     * Method utama untuk menjalankan simulasi dan pengujian program.
     *
     * @param args argumen baris perintah (tidak digunakan)
     */
    public static void main(String[] args) {
        System.out.println("=== 1. SKENARIO PEMBUATAN OBJEK & VALIDASI CONSTRUCTOR ===");

        // Menyiapkan array bertipe Member dengan kapasitas 4 objek
        Member[] daftarMember = new Member[4];

        // Objek 1: Valid (Paket Premium)
        daftarMember[0] = new Member("Andi Wijaya", "081234567890", "10-10-2026", "Premium");

        // Objek 2: Valid (Paket VIP)
        daftarMember[1] = new Member("Budi Santoso", "085678901234", "12-10-2026", "VIP");

        // Objek 3: Constructor tanpa paket (Otomatis menjadi Basic)
        daftarMember[2] = new Member("Citra Dewi", "089012345678", "14-10-2026");

        // Objek 4: Sengaja melanggar validasi pada constructor (No Telp salah format, paket salah)
        System.out.print("[Uji Coba Input Salah] ");
        daftarMember[3] = new Member("Eko Prasetyo", "12345", "15-10-2026", "SuperVIP");
