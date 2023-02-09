public class VideoCard {
    private String manufacturer;

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public VideoCard(String manufacturer){
        this.manufacturer = manufacturer;

    }

    @Override
    public String toString() {
        return "VideoCard{" +
                "manufacturer='" + manufacturer + '\'' +
                '}';
    }
}
