/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import dao.JDBCConnection;
import dao.TapChiDao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import model.TapChi;

/**
 *
 * @author FSC
 */
public class TapChiService {
    private TapChiDao tapChiDao;

    public TapChiService() {
        tapChiDao = new TapChiDao();
    }

    public  List<TapChi> getAllTapChi() throws SQLException{
        return tapChiDao.getAllTapChi();
    }
    
    public void addTapChi(TapChi tapchi) throws SQLException{
        tapChiDao.addTapChi(tapchi);
    }
    
    public void deleteTapChi(int id) throws SQLException {
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
