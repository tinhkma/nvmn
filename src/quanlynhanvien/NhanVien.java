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
public class NhanVien extends Person{
    private String phongBan;
    private Double heSoLuong;
    private Double thamNien;
    private Double luongCoBan;

    public NhanVien() {
    }

    public NhanVien(String phongBan, Double heSoLuong, Double thamNien, Double luongCoBan) {
        this.phongBan = phongBan;
        this.heSoLuong = heSoLuong;
        this.thamNien = thamNien;
        this.luongCoBan = luongCoBan;
    }

    public NhanVien(String hoTen, String diaChi, Boolean gioiTinh, String ngaySinh, String phongBan, Double heSoLuong, Double thamNien, Double luongCoBan) {
        super(hoTen, diaChi, gioiTinh, ngaySinh);
        this.phongBan = phongBan;
        this.heSoLuong = heSoLuong;
        this.thamNien = thamNien;
        this.luongCoBan = luongCoBan;
    }

    public String getPhongBan() {
        return phongBan;
    }

    public void setPhongBan(String phongBan) {
        this.phongBan = phongBan;
    }

    public Double getHeSoLuong() {
        return heSoLuong;
    }

    public void setHeSoLuong(Double heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    public Double getThamNien() {
        return thamNien;
    }

    public void setThamNien(Double thamNien) {
        this.thamNien = thamNien;
    }

    public Double getLuongCoBan() {
        return luongCoBan;
    }

    public void setLuongCoBan(Double luongCoBan) {
        this.luongCoBan = luongCoBan;
    }

    @Override
    public String toString() {
        return "NhanVien{" + super.toString() + '\'' +
                "phongBan='" + phongBan + '\'' +
                ", heSoLuong=" + heSoLuong +
                ", thamNien=" + thamNien +
                ", luongCoBan=" + luongCoBan +
                '}';
    }

    public double tinhLuong() {
        return luongCoBan * heSoLuong*(1+thamNien)/100;
    }
}
