public class RAM {
   private int volume;
    private String manufacturer;

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public RAM(int volume , String  manufacturer){
        this.volume = volume;
        this.manufacturer = manufacturer;

    }

    @Override
    public String toString() {
        return "RAM{" +
                "volume=" + volume +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }
}
