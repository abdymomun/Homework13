public class Main {
    public static void main(String[] args) {
        displey myDisplay = new displey(15, "Apple", "a1286");
        SSD myHardDrive = new SSD(512, 1);
        RAM myOperatingMemory = new RAM(16, "mxz");
        VideoCard myVideoCard = new VideoCard("intel hd ");
        USB  myUSBPorts = new USB (3, 1) ;
        Kayboard myKeyboard = new Kayboard(true, false);

         computer mycomp= new computer(myDisplay, "Macbook", "Silver",myHardDrive, myOperatingMemory, myVideoCard,myUSBPorts,myKeyboard);
        System.out.println(mycomp.getBrand()+mycomp.getColor()+mycomp.getDispley()+myKeyboard+myUSBPorts+myOperatingMemory+myVideoCard+myHardDrive);
        System.out.println("t"+mycomp.getDispley());
    }
}