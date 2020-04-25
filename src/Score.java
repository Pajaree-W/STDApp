
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Score {
    
    public void InsertUpdateDeleteScore(char operation , String std_id , String cr_id ,Double score , String des )
    {
        Connection con = MyConnection.getConnection();
        PreparedStatement ps ;
        
        // i for insert
        if ( operation == 'i')
        {
            try {
                ps = con.prepareStatement("INSERT INTO `score`(`Student_ID`, `Course_ID`, `Student_Score`, `Description`) VALUES (?,?,?,?)");
                ps.setString(1 , std_id);
                ps.setString(2 , cr_id);
                ps.setDouble(3 , score);
                ps.setString(4 , des);
                
                if(ps.executeUpdate() > 0 )
                {
                    JOptionPane.showMessageDialog(null, "Score Added.");
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        
        // u for Update
        if ( operation == 'u')
        {
            try {
                ps = con.prepareStatement("UPDATE `score` SET `Student_Score`=?,`Description`=? WHERE `Student_ID` = ? AND `Course_ID` = ?");
                ps.setDouble(1 , score);
                ps.setString(2 , des);
                ps.setString(3 , std_id);
                ps.setString(4 , cr_id);
                
                if(ps.executeUpdate() > 0 )
                {
                    JOptionPane.showMessageDialog(null, "Score Updated.");
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        
        //d for delete
        if ( operation == 'd')
        {
            try {
                ps = con.prepareStatement("DELETE FROM `score` WHERE `Student_ID` = ? AND `Course_ID` = ? ");
                ps.setString(1 , std_id);
                ps.setString(2 , cr_id);
                
                if(ps.executeUpdate() > 0 )
                {
                    JOptionPane.showMessageDialog(null, "Score Deleted.");
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }
    
    
    public void fillScoreJtable(JTable table)
    {
        Connection con = MyConnection.getConnection();
        PreparedStatement ps ;
        try {
            ps = con.prepareStatement("SELECT * FROM `score` ");
            ResultSet rs = ps.executeQuery();
            DefaultTableModel model = (DefaultTableModel)table.getModel();
            
            Object[] row ;
            
            while ( rs.next())
            {
                row = new Object[4];
                row[0] = rs.getString(1);
                row[1] = rs.getString(2);
                row[2] = rs.getDouble(3);
                row[3] = rs.getString(4);

                model.addRow(row);
            }
            
        } catch (Exception ex) {
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    }

