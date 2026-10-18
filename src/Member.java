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
