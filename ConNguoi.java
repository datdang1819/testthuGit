/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package package1;

/**
 *
 * @author xuanhung
 */
public class ConNguoi {

    private String ten;
    private int tuoi;
    private int gioitinh;
    private String dienthoai;                

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public int getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(int gioitinh) {
        this.gioitinh = gioitinh;
    }

    public String getDienthoai() {
        return dienthoai;
    }

    public void setDienthoai(String dienthoai) {
        this.dienthoai = dienthoai;
    }

    @Override
    public String toString() {
        return "Tôi tên là " + ten + ", " + tuoi + " tuôi, giới tính: "
                + (gioitinh == 1 ? "Nam" : (gioitinh == 0 ? "Nữ" : "Khác"))
                + ", điện thoại: " + dienthoai + ".";
    }
    
    public ConNguoi(String ten){
        this.ten = ten;
    }
    
    public ConNguoi(String ten, int tuoi){
        this.ten = ten;
        this.tuoi = tuoi;
    }
    
    public ConNguoi(String ten, int tuoi, int gioitinh){
        this.ten = ten;
        this.tuoi = tuoi;
        this.gioitinh = gioitinh;
    }
    
    public ConNguoi(String ten, int tuoi, int gioitinh, String dienthoai){
        this.ten = ten;
        this.tuoi = tuoi;
        this.gioitinh = gioitinh;
        this.dienthoai = dienthoai;
    }
    
    public ConNguoi(){
    
    }        

    public static void main(String[] args) {
        ConNguoi connguoi1 = new ConNguoi("Hung", 12, 1, "012");
//        connguoi1.setTen("Hung");
//        connguoi1.setTuoi(18);
//        connguoi1.setGioitinh(1);
//        connguoi1.setDienthoai("0123231");
        System.out.println(connguoi1.toString());
    }
}
