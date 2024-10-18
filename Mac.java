public class Mac extends Laptop {
    public String security;

    public Mac(){

    }

    public Mac(String merk, int kecProsesor, int sizeMemory, String jenisProsesor, String jnsBatrei, String security) {
        super(merk, kecProsesor, sizeMemory,jenisProsesor, jnsBatrei);
        this.security = security;
    }

    public void tampilMac(){
        System.out.println("Data Mac");
        super.tampilLaptop();
        System.out.println("Security : "+security);
    }

}
