/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlynhanvien;

/**
 *
 * @author xuant
 */
public class Person {
    private String hoTen;
    private String diaChi;
    private Boolean goiTinh;
    private String ngaySinh;

    public Person() {
    }

    public Person(String hoTen, String diaChi, Boolean goiTinh, String ngaySinh) {
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.goiTinh = goiTinh;
        this.ngaySinh = ngaySinh;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public Boolean getGoiTinh() {
        return goiTinh;
    }

    public void setGoiTinh(Boolean goiTinh) {
        this.goiTinh = goiTinh;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    @Override
    public String toString() {
        return "hoTen='" + hoTen + '\'' +
                ", diaChi='" + diaChi + '\'' +
                ", goiTinh=" + (goiTinh==true?"Nam":"Nu") +
                ", ngaySinh='" + ngaySinh + '\'';
    }
}
