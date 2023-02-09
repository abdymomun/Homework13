public class SSD {
    private int volumMemory;
    private int numberOfDisks;
    public SSD(int volumMemory , int numberOfDisks){
        this.volumMemory = volumMemory;
        this.numberOfDisks = numberOfDisks;

    }

    public int getVolumMemory() {
        return volumMemory;
    }

    public void setVolumMemory(int volumMemory) {
        this.volumMemory = volumMemory;
    }

    public int getNumberOfDisks() {
        return numberOfDisks;
    }

    public void setNumberOfDisks(int numberOfDisks) {
        this.numberOfDisks = numberOfDisks;
    }

    @Override
    public String toString() {
        return "SSD{" +
                "volumMemory=" + volumMemory +
                ", numberOfDisks=" + numberOfDisks +
                '}';
    }
}
