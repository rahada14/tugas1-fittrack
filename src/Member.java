/**
 * Class Member merepresentasikan data keanggotaan gym FitTrack.
 * Class ini menyimpan maklumat ahli seperti nama, nomor telepon, tanggal daftar,
 * dan jenis paket keanggotaan dengan aturan validasi pada setiap setter.
 *
 * @author Rahadatul Qudsi
 * @version 1.0
 */
public class Member {

    // Konstanta untuk nilai default dan validasi
    private static final String DEFAULT_NAMA = "Belum Diisi";
    private static final String DEFAULT_NO_TELEPON = "0000000000";
    private static final String DEFAULT_TANGGAL_DAFTAR = "01-01-2026";
    private static final String DEFAULT_JENIS_PAKET = "Basic";
    private static final int MIN_PANJANG_TELEPON = 10;

   // Atribut privat
    private String nama;
    private String noTelepon;
    private String tanggalDaftar;
    private String jenisPaket;

    /**
     * Constructor lengkap untuk membuat objek Member dengan empat parameter.
     * Pengisian nilai dilakukan melalui setter untuk menerapkan validasi (DRY).
     *
     * @param nama nama lengkap member
     * @param noTelepon nomor telepon member
     * @param tanggalDaftar tanggal pendaftaran member
     * @param jenisPaket jenis paket keanggotaan (Basic, Premium, VIP)
     */

    public Member(String nama, String noTelepon, String tanggalDaftar, String jenisPaket) {
        // Tetapkan nilai awal default aman sebelum diproses oleh setter
        this.nama = DEFAULT_NAMA;
        this.noTelepon = DEFAULT_NO_TELEPON;
        this.tanggalDaftar = DEFAULT_TANGGAL_DAFTAR;
        this.jenisPaket = DEFAULT_JENIS_PAKET;

         // Memanggil setter untuk validasi (Prinsip DRY)
        setNama(nama);
        setNoTelepon(noTelepon);
        setTanggalDaftar(tanggalDaftar);
        setJenisPaket(jenisPaket);
    }

    /**
     * Constructor overloading tanpa jenis paket.
     * Jenis paket otomatis diisi dengan nilai default "Basic" melalui constructor chaining.
     *
     * @param nama nama lengkap member
     * @param noTelepon nomor telepon member
     * @param tanggalDaftar tanggal pendaftaran member
     */
    public Member(String nama, String noTelepon, String tanggalDaftar) {
        this(nama, noTelepon, tanggalDaftar, DEFAULT_JENIS_PAKET);
    }

    /**
     * Mengembalikan nama member.
     *
     * @return nama member
     */
    public String getNama() {
        return nama;
    }

    /**
     * Mengubah nama member setelah melalui validasi.
     * Nama tidak boleh kosong atau hanya berisi spasi.
     *
     * @param nama nama baru member
     */
    public void setNama(String nama) {
        if (nama != null && !nama.trim().isEmpty()) {
            this.nama = nama;
        } else {
            System.out.println("Error Validasi: Nama tidak boleh kosong atau hanya berisi spasi!");
        }
    }

    /**
     * Mengembalikan nomor telepon member.
     *
     * @return nomor telepon member
     */
    public String getNoTelepon() {
        return noTelepon;
    }

    /**
     * Mengubah nomor telepon member setelah melalui validasi.
     * Wajib diawali angka 0 dan minimal 10 digit.
     *
     * @param noTelepon nomor telepon baru member
     */
    public void setNoTelepon(String noTelepon) {
        if (noTelepon != null && noTelepon.startsWith("0") && noTelepon.length() >= MIN_PANJANG_TELEPON) {
            this.noTelepon = noTelepon;
        } else {
            System.out.println("Error Validasi: Nomor telepon harus diawali angka 0 dan minimal 10 digit!");
        }
    }

    /**
     * Mengembalikan tanggal daftar member.
     *
     * @return tanggal daftar member
     */
    public String getTanggalDaftar() {
        return tanggalDaftar;
    }

    /**
     * Mengubah tanggal pendaftaran member.
     * Tanggal tidak boleh kosong.
     *
     * @param tanggalDaftar tanggal pendaftaran baru
     */
    public void setTanggalDaftar(String tanggalDaftar) {
        if (tanggalDaftar != null && !tanggalDaftar.trim().isEmpty()) {
            this.tanggalDaftar = tanggalDaftar;
        } else {
            System.out.println("Error Validasi: Tanggal daftar tidak boleh kosong!");
        }
    }


    
