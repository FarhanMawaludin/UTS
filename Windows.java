public class Windows extends Laptop {
    public String fitur;

    public Windows() {

    }

    public Windows(String merk, int kecProsesor, int sizeMemory, String jenisProsesor, String jnsBatrei, String fitur) {
        super(merk, kecProsesor, sizeMemory, jenisProsesor, jnsBatrei);
        this.fitur = fitur;
    }

    public void tampilWindows(){
        System.out.println("Data Windows");
        super.tampilLaptop();
        System.out.println("Fitur : "+fitur);
    }

}
