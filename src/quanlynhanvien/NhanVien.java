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
    private double heSoLuong;
    private double thamNien;
    private double luongCoBan;

    public NhanVien() {
    }

    public NhanVien(String phongBan, double heSoLuong, double thamNien, double luongCoBan) {
        this.phongBan = phongBan;
        this.heSoLuong = heSoLuong;
        this.thamNien = thamNien;
        this.luongCoBan = luongCoBan;
    }

    public NhanVien(String hoTen, String diaChi, Boolean goiTinh, String ngaySinh, String phongBan, double heSoLuong, double thamNien, double luongCoBan) {
        super(hoTen, diaChi, goiTinh, ngaySinh);
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

    public double getHeSoLuong() {
        return heSoLuong;
    }

    public void setHeSoLuong(double heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    public double getThamNien() {
        return thamNien;
    }

    public void setThamNien(double thamNien) {
        this.thamNien = thamNien;
    }

    public double getLuongCoBan() {
        return luongCoBan;
    }

    public void setLuongCoBan(double luongCoBan) {
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
