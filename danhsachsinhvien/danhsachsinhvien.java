package danhsachsinhvien;

import java.util.ArrayList;
import java.util.Stack;

/**
 * danhsachsinhvien
 */
public class danhsachsinhvien {

    private ArrayList<SinhVien> danhsach;
    private Stack<String> stack = new Stack<>();

    public danhsachsinhvien() {

    }

    public danhsachsinhvien(ArrayList<SinhVien> danhsach) {
        this.danhsach = danhsach;
    }

    /**
     * @return ArrayList<SinhVien> return the danhsach
     */
    public ArrayList<SinhVien> getDanhsach() {
        return danhsach;
    }

    /**
     * @param danhsach the danhsach to set
     */
    public void setDanhsach(ArrayList<SinhVien> danhsach) {
        this.danhsach = danhsach;
    }

}