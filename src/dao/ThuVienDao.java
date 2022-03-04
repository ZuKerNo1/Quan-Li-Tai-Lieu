/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Bao;
import model.Sach;
import model.TaiLieu;
import model.TapChi;

/**
 *
 * @author FSC
 */
public class ThuVienDao {
    public List<TaiLieu> getAllTaiLieu() throws SQLException {
        List<TaiLieu> tlList = new ArrayList<TaiLieu>();
        String sql = "select * from TaiLieu";
        try {
            Connection connection = JDBCConnection.JDBCConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                TaiLieu tl = new TaiLieu();
                tl.setIdTaiLieu(rs.getString("idTaiLieu"));
                tl.setTenNXB(rs.getString("TenNXB"));
                tl.setSoBanPhatHanh(rs.getInt("SoBanPhatHanh"));
                
                tlList.add(tl);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return tlList;
    }
    
    public static void addSach(Sach s) throws SQLException {

        try {
            Connection connection = JDBCConnection.JDBCConnection();
            String sql = "insert into TaiLieu(TenNXB, SoBanPhatHanh, Loai, TenTacGia, SoTrang) "
                    + "values (?,?,?,?,?)";
            PreparedStatement preparedStatement = connection.prepareCall(sql);
            preparedStatement.setString(1, s.getTenNXB());
            preparedStatement.setInt(2, s.getSoBanPhatHanh());
            preparedStatement.setString(3, s.getLoai());
            preparedStatement.setString(4, s.getTenTacGia());
            preparedStatement.setInt(5, s.getSoTrang());
            preparedStatement.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void addTapChi(TapChi tc) throws SQLException {

        try {
            Connection connection = JDBCConnection.JDBCConnection();
            String sql = "insert into TaiLieu(TenNXB, SoBanPhatHanh, Loai, SoPhatHanh, ThangPhatHanh) "
                    + "values (?,?,?,?,?)";
            PreparedStatement preparedStatement = connection.prepareCall(sql);
            preparedStatement.setString(1, tc.getTenNXB());
            preparedStatement.setInt(2, tc.getSoBanPhatHanh());
            preparedStatement.setString(3, tc.getLoai());
            preparedStatement.setString(4, tc.getSoPhatHanh());
            preparedStatement.setInt(5, tc.getThangPhatHanh());
            preparedStatement.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static void addBao(Bao b) throws SQLException {

        try {
            Connection connection = JDBCConnection.JDBCConnection();
            String sql = "insert into TaiLieu(TenNXB, SoBanPhatHanh, Loai, NgayPhatHanh) "
                    + "values (?,?,?,?)";
            PreparedStatement preparedStatement = connection.prepareCall(sql);
            preparedStatement.setString(1, b.getTenNXB());
            preparedStatement.setInt(2, b.getSoBanPhatHanh());
            preparedStatement.setString(3, b.getLoai());
            preparedStatement.setInt(4, b.getNgayPhatHanh());
            preparedStatement.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void updateUser(TaiLieu tl) throws SQLException {
        Connection connection = JDBCConnection.JDBCConnection();
        String sql = "Update TaiLieu set IdTaiLieu = ? , tenNXB = ? , soBanPhatHanh = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, tl.getIdTaiLieu());
            preparedStatement.setString(2, tl.getTenNXB());
            preparedStatement.setInt(3, tl.getSoBanPhatHanh());
            int rs = preparedStatement.executeUpdate();
            System.out.println(rs);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deleteUser(int id) throws SQLException {
        Connection connection = JDBCConnection.JDBCConnection();
        String sql = "delete from TaiLieu where id = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            int rs = preparedStatement.executeUpdate();
            System.out.println(rs);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
