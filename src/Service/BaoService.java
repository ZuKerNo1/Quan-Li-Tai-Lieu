/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import dao.BaoDao;
import dao.JDBCConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import model.Bao;

/**
 *
 * @author FSC
 */
public class BaoService {
    private BaoDao sachDao;

    public BaoService() {
        sachDao = new BaoDao();
    }

    public  List<Bao> getAllBao() throws SQLException{
        return sachDao.getAllBao();
    }
    
    public void addBao(Bao sach) throws SQLException{
        sachDao.addBao(sach);
    }
    
    public void deleteBao(int id) throws SQLException {
        Connection connection = JDBCConnection.JDBCConnection();
        String sql = "delete from TaiLieu where idTaiLieu = ?";
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
