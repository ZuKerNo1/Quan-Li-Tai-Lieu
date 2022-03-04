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
import model.TapChi;


/**
 *
 * @author FSC
 */
public class TapChiDao {
    public List<TapChi> getAllTapChi() throws SQLException {
        List<TapChi> tlList = new ArrayList<TapChi>();
        String sql = "select * from TaiLieu where Loai = 'TapChi'";
        try {
            Connection connection = JDBCConnection.JDBCConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                TapChi tc = new TapChi();
                tc.setIdTaiLieu(rs.getString("idTaiLieu"));
                tc.setTenNXB(rs.getString("TenNXB"));
                tc.setSoBanPhatHanh(rs.getInt("SoBanPhatHanh"));
                tc.setSoPhatHanh(rs.getString("SoPhatHanh"));
                tc.setThangPhatHanh(rs.getInt("ThangPhatHanh"));
                tlList.add(tc);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return tlList;
    }
    
    public void addTapChi(TapChi s) throws SQLException {

        try {
            Connection connection = JDBCConnection.JDBCConnection();
            String sql = "insert into TaiLieu (TenNXB, SoBanPhatHanh, SoPhatHanh, ThangPhatHanh) values (?,?,?,?)";
            PreparedStatement preparedStatement = connection.prepareCall(sql);
            preparedStatement.setString(1, s.getTenNXB());
            preparedStatement.setInt(2, s.getSoBanPhatHanh());
            preparedStatement.setString(3, s.getSoPhatHanh());
            preparedStatement.setInt(4, s.getThangPhatHanh());
            preparedStatement.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void updateTapChi(TapChi s) throws SQLException {
        Connection connection = JDBCConnection.JDBCConnection();
        String sql = "Update TaiLieu set IdTaiLieu = ? , tenNXB = ? , soBanPhatHanh = ?, TenTacGia = ?, SoTrang = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, s.getIdTaiLieu());
            preparedStatement.setString(2, s.getTenNXB());
            preparedStatement.setInt(3, s.getSoBanPhatHanh());
            preparedStatement.setString(4, s.getSoPhatHanh());
            preparedStatement.setInt(5, s.getThangPhatHanh());
            int rs = preparedStatement.executeUpdate();
            System.out.println(rs);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    
}
