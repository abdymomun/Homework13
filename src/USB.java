public class USB {
    private int portType;
    private int portId;

    public USB(int portType, int portId) {
        this.portType = portType;
        this.portId = portId;
    }

    public int getPortType() {
        return portType;
    }

    public void setPortType(int portType) {
        this.portType = portType;
    }

    public int getPortId() {
        return portId;
    }

    public void setPortId(int portId) {
        this.portId = portId;
    }

    @Override
    public String toString() {
        return "USB{" +
                "portType=" + portType +
                ", portId=" + portId +
                '}';
    }
}
