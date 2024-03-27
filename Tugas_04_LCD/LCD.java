package Tugas_04_LCD;

public class LCD {

    // buat variabel untuk menyimpan status, volume, kecerahan, dan jenis kabel LCD
    // nya
    private String status;
    private int volume;
    private int brightness;
    private String cable;
    private String[] cables = { "Kabel VGA", "Kabel DVI", "Kabel HDMI", "Kabel Display Port" };

    // Konstruktor untuk inisialisasi nilai awal
    public LCD() {
        status = "Mati"; // mulai dalam keadaan mati
        volume = 0; // volume awal 0
        brightness = 0; // kecerahan awal 0
    }

    // Method untuk keadaan LCD menyala
    public void turnOn() {
        status = "Menyala";
    }

    // Method untuk keadaan LCD mati
    public void turnOff() {
        status = "Mati";
    }

    // Method untuk keadaan LCD freeze
    public void Freeze() {
        status = "Freeze";
    }

    // Method untuk mengatur volume LCD
    public void setVolume(int newVolume) {
        if (newVolume >= 0 && newVolume <= 100) {
            volume = newVolume;
        } else {
            System.out.println("Volume harus berada dalam rentang 0 hingga 100");
        }
    }

    // Method untuk menambahkan volume
    public void volumeUp() {
        volume++;
    }

    // Method untuk mengurangi volume
    public void volumeDown() {
        volume--;
    }

    // Method untuk mengatur kecerahan layar LCD
    public void setBrightness(int brightness) {
        this.brightness = brightness;
    }

    // Method untuk menambah kecerahan layar
    public void brightnessUp() {
        brightness++;
    }

    // Method untuk mengurangi kecerahan layar
    public void brightnessDown() {
        if (brightness > 0)
            brightness--;
    }

    // Method yang mengatur jenis kabel yang digunakan LCD
    public void setCable(int option) {
        if (option >= 0 && option < cables.length) {
            cable = cables[option];
        } else {
            System.out.println("Pilihan kabel tidak valid");
        }
    }

    // Method untuk menampilak pesan yang akan ditampilkan ketika program dijalankan
    public void displayMessage() {
        System.out.println("LCD Status: " + status);
        System.out.println("Volume: " + volume);
        System.out.println("Brightness: " + brightness);
        System.out.println("Cable: " + cable);
    }
}