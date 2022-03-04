/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import static java.sql.Types.NULL;

/**
 *
 * @author FSC
 */
public class TaiLieu {
    protected String idTaiLieu = null;
    protected String tenNXB = null;
    protected int soBanPhatHanh = NULL;

    public TaiLieu() {
    }
    protected String Loai = null;

    public String getLoai() {
        return Loai;
    }

    public void setLoai(String Loai) {
        this.Loai = Loai;
    }

    public String getIdTaiLieu() {
        return idTaiLieu;
    }

    public void setIdTaiLieu(String idTaiLieu) {
        this.idTaiLieu = idTaiLieu;
    }

    public String getTenNXB() {
        return tenNXB;
    }

    public void setTenNXB(String tenNXB) {
        this.tenNXB = tenNXB;
    }

    public int getSoBanPhatHanh() {
        return soBanPhatHanh;
    }

    public void setSoBanPhatHanh(int soBanPhatHanh) {
        this.soBanPhatHanh = soBanPhatHanh;
    }
}
