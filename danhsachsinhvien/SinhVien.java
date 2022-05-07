package danhsachsinhvien;

public class SinhVien {
    private String name;
    private String MSSV;

    SinhVien(String name, String MSSV) {
        this.name = name;
        this.MSSV = MSSV;
    }

    /**
     * @return String return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return String return the MSSV
     */
    public String getMSSV() {
        return MSSV;
    }

    /**
     * @param MSSV the MSSV to set
     */
    public void setMSSV(String MSSV) {
        this.MSSV = MSSV;
    }

}
