/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import dao.ThuVienDao;
import java.sql.SQLException;
import java.util.List;
import model.Bao;
import model.Sach;
import model.TaiLieu;
import model.TapChi;

/**
 *
 * @author FSC
 */
public class TaiLieuService {
    private ThuVienDao thuVienDao;

    public TaiLieuService() {
        thuVienDao = new ThuVienDao();
    }

    public  List<TaiLieu> getAllTaiLieu() throws SQLException{
        return thuVienDao.getAllTaiLieu();
    }
    
    public static void addSach(Sach s) throws SQLException{
        ThuVienDao.addSach(s);
    }
    
    public static void addTapChi(TapChi tc) throws SQLException{
        ThuVienDao.addTapChi(tc);
    }
    
    public static void addBao(Bao b) throws SQLException{
        ThuVienDao.addBao(b);
    }
}
