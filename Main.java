public class Main {
    public static void main(String[] args) {
        Mac mac = new Mac("Macbook Air", 4, 16, "AMD", "Lithium", "Face ID");
        mac.tampilMac();
        System.out.println("+++++++++++++++++++++++++++");
        Windows win = new Windows("Asus", 4, 16, "AMD", "Lithium", "Windows 10");
        win.tampilWindows();
        System.out.println("+++++++++++++++++++++++++++");
        Pc pc = new Pc("Asus", 4, 8, "AMD", 15);
        pc.tampilPc();
        
        

    }
    
}
