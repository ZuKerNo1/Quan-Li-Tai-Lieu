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
import model.TaiLieu;

/**
 *
 * @author FSC
 */
public class BaoDao {
    public List<Bao> getAllBao() throws SQLException {
        List<Bao> tlList = new ArrayList<Bao>();
        String sql = "select * from TaiLieu where Loai = 'Bao'";
        try {
            Connection connection = JDBCConnection.JDBCConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                Bao b = new Bao();
                b.setIdTaiLieu(rs.getString("idTaiLieu"));
                b.setTenNXB(rs.getString("TenNXB"));
                b.setSoBanPhatHanh(rs.getInt("SoBanPhatHanh"));
                b.setNgayPhatHanh(rs.getInt("NgayPhatHanh"));
                tlList.add(b);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return tlList;
    }
    
    public void addBao(Bao b) throws SQLException {

        try {
            Connection connection = JDBCConnection.JDBCConnection();
            String sql = "insert into TaiLieu(TenNXB, SoBanPhatHanh, NgayPhatHanh) values (?,?,?)";
            PreparedStatement preparedStatement = connection.prepareCall(sql);
            preparedStatement.setString(1, b.getTenNXB());
            preparedStatement.setInt(2, b.getSoBanPhatHanh());
            preparedStatement.setInt(3, b.getNgayPhatHanh());
            preparedStatement.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void updateBao(Bao b) throws SQLException {
        Connection connection = JDBCConnection.JDBCConnection();
        String sql = "Update TaiLieu set IdTaiLieu = ? , tenNXB = ? , soBanPhatHanh = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, b.getIdTaiLieu());
            preparedStatement.setString(2, b.getTenNXB());
            preparedStatement.setInt(3, b.getSoBanPhatHanh());
            preparedStatement.setInt(4, b.getNgayPhatHanh());
            int rs = preparedStatement.executeUpdate();
            System.out.println(rs);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    
}
