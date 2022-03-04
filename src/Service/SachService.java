/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import dao.JDBCConnection;
import dao.SachDao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import model.Sach;

/**
 *
 * @author FSC
 */
public class SachService {
    private SachDao sachDao;

    public SachService() {
        sachDao = new SachDao();
    }

    public  List<Sach> getAllSach() throws SQLException{
        return sachDao.getAllSach();
    }
    
    public void addSach(Sach sach) throws SQLException{
        sachDao.addSach(sach);
    }
    
    public void deleteSach(int id) throws SQLException {
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
