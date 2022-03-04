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
import model.Sach;


/**
 *
 * @author FSC
 */
public class SachDao {
    public List<Sach> getAllSach() throws SQLException {
        List<Sach> tlList = new ArrayList<Sach>();
        String sql = "select * from TaiLieu where Loai = 'Sach'";
        try {
            Connection connection = JDBCConnection.JDBCConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                Sach s = new Sach();
                s.setIdTaiLieu(rs.getString("idTaiLieu"));
                s.setTenNXB(rs.getString("TenNXB"));
                s.setSoBanPhatHanh(rs.getInt("SoBanPhatHanh"));
                s.setTenTacGia(rs.getString("TenTacGia"));
                s.setSoTrang(rs.getInt("SoTrang"));
                tlList.add(s);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return tlList;
    }
    
    public void addSach(Sach s) throws SQLException {

        try {
            Connection connection = JDBCConnection.JDBCConnection();
            String sql = "insert into TaiLieu (TenNXB, SoBanPhatHanh, TacGia, SoTrang) values (?,?,?,?)";
            PreparedStatement preparedStatement = connection.prepareCall(sql);
            preparedStatement.setString(1, s.getTenNXB());
            preparedStatement.setInt(2, s.getSoBanPhatHanh());
            preparedStatement.setString(3, s.getTenTacGia());
            preparedStatement.setInt(3, s.getSoTrang());
            preparedStatement.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void updateSach(Sach s) throws SQLException {
        Connection connection = JDBCConnection.JDBCConnection();
        String sql = "Update TaiLieu set IdTaiLieu = ? , tenNXB = ? , soBanPhatHanh = ?, TenTacGia = ?, SoTrang = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, s.getIdTaiLieu());
            preparedStatement.setString(2, s.getTenNXB());
            preparedStatement.setInt(3, s.getSoBanPhatHanh());
            preparedStatement.setString(4, s.getTenTacGia());
            preparedStatement.setInt(5, s.getSoTrang());
            int rs = preparedStatement.executeUpdate();
            System.out.println(rs);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    
}
