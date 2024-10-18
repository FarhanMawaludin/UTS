public class Komputer {
    public String merk;
    public int kecProsesor;
    public int sizeMemory;
    public String jenisProsesor;

    public Komputer(){

    }

    public Komputer(String merk, int kecProsesor, int sizeMemory, String jenisProsesor) {
        this.merk = merk;
        this.kecProsesor = kecProsesor;
        this.sizeMemory = sizeMemory;
        this.jenisProsesor = jenisProsesor;
    }

    public void tampilData(){
        System.out.println("Merk : "+merk);
        System.out.println("Kec. Prosesor : "+kecProsesor);
        System.out.println("Size Memory : "+sizeMemory);
        System.out.println("Jenis Prosesor : "+jenisProsesor);
    }

}
