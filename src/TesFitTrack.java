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
