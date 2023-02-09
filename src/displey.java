public class displey {
    private int diagonal;
    private String manufacuter;
    private String typeMatrix;
    public displey (int diagonal , String manufacuter , String typeMatrix){
        this.diagonal = diagonal;
        this.manufacuter = manufacuter;
        this.typeMatrix = typeMatrix;

    }

    public int getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(int diagonal) {
        this.diagonal = diagonal;
    }

    public String getManufacuter() {
        return manufacuter;
    }

    public void setManufacuter(String manufacuter) {
        this.manufacuter = manufacuter;
    }

    public String getTypeMatrix() {
        return typeMatrix;
    }

    public void setTypeMatrix(String typeMatrix) {
        this.typeMatrix = typeMatrix;

    }

    @Override
    public String toString() {
        return "displey{" +
                "diagonal=" + diagonal +
                ", manufacuter='" + manufacuter + '\'' +
                ", typeMatrix='" + typeMatrix + '\'' +
                '}';
    }
}
