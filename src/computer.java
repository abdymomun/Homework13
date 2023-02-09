public class computer {

   private displey displey;
   private String brand;
   private String color;
   private SSD ssd;
   private RAM ram;
   private VideoCard videoCard;
   private USB usb;
   private Kayboard kayboard;

   public displey getDispley() {
      return displey;
   }

   public void setDispley(displey displey) {
      this.displey = displey;
   }

   public String getBrand() {
      return brand;
   }

   public void setBrand(String brand) {
      this.brand = brand;
   }

   public String getColor() {
      return color;
   }

   public void setColor(String color) {
      this.color = color;
   }

   public SSD getSsd() {
      return ssd;
   }

   public void setSsd(SSD ssd) {
      this.ssd = ssd;
   }

   public RAM getRam() {
      return ram;
   }

   public void setRam(RAM ram) {
      this.ram = ram;
   }

   public VideoCard getVideoCard() {
      return videoCard;
   }

   public void setVideoCard(VideoCard videoCard) {
      this.videoCard = videoCard;
   }

   public USB getUsb() {
      return usb;
   }

   public void setUsb(USB usb) {
      this.usb = usb;
   }

   public Kayboard getKayboard() {
      return kayboard;
   }

   public void setKayboard(Kayboard kayboard) {
      this.kayboard = kayboard;
   }

   public computer(displey display, String brand, String color, SSD ssd, RAM ram, VideoCard videoCard, USB usb, Kayboard keyboard) {
      this.displey = display;
      this.brand = brand;
      this.color = color;
      this.ssd = ssd;
      this.ram = ram;
      this.videoCard = videoCard;
      this.usb = usb;
      this.kayboard = keyboard;

   }

   @Override
   public String toString() {
      return "computer{" +
              "displey=" + displey +
              ", brand='" + brand + '\'' +
              ", color='" + color + '\'' +
              ", ssd=" + ssd +
              ", ram=" + ram +
              ", videoCard=" + videoCard +
              ", usb=" + usb +
              ", kayboard=" + kayboard +
              '}';
   }
}
