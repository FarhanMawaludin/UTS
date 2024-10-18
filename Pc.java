public class Pc extends Komputer {
    public int ukuranMonitor;

    public Pc(){

    }

    public Pc(String merk, int kecProsesor, int sizeMemory, String jenisProsesor, int ukuranMonitor) {
        super(merk, kecProsesor, sizeMemory,jenisProsesor);
        this.ukuranMonitor = ukuranMonitor;
    }

    public void tampilPc(){ 
        System.out.println("Data PC");
        super.tampilData();
        System.out.println("Ukuran Monitor : "+ukuranMonitor);
    }
}
