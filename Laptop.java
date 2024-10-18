public  class Laptop extends Komputer {
    public String jnsBatrei;

    public Laptop(){

    }

    public Laptop(String merk, int kecProsesor, int sizeMemory, String jenisProsesor, String jnsBatrei) {
        super(merk, kecProsesor, sizeMemory, jenisProsesor);
        this.jnsBatrei = jnsBatrei;
    }

    public void tampilLaptop(){
        super.tampilData();
        System.out.println("Jenis Batrei : "+jnsBatrei);
    }

    
}
