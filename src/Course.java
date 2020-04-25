
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Course {
    
    
    public void InsertUpdateDeleteCourse(char operation , String id , String label , String teacher )
    {
        Connection con = MyConnection.getConnection();
        PreparedStatement ps ;
        
        // i for insert
        if ( operation == 'i')
        {
            try {
                ps = con.prepareStatement("INSERT INTO course(id,label, teacher) VALUES (?,?,?) ");
                ps.setString(1 , id);
                ps.setString(2 , label);
                ps.setString(3 , teacher);
                
                if(ps.executeUpdate() > 0 )
                {
                    JOptionPane.showMessageDialog(null, "New Course Added.");
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        
        // u for Update
        if ( operation == 'u')
        {
            try {
                ps = con.prepareStatement("UPDATE `course` SET `label`=? ,`teacher`= ? WHERE `ID` = ?");
                ps.setString(1 , label);
                ps.setString(2 , teacher);
                ps.setString(3 , id);
                if(ps.executeUpdate() > 0 )
                {
                    JOptionPane.showMessageDialog(null, "Course Data Updated.");
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        
        //d for delete
        if ( operation == 'd')
        {
            int YesorNo = JOptionPane.showConfirmDialog(null, "The scores will Be Also Deleted" , "Delete Student", JOptionPane.OK_CANCEL_OPTION);
            if ( YesorNo == JOptionPane.OK_OPTION ) 
            {try {
                ps = con.prepareStatement("DELETE FROM `course` WHERE `ID` = ?");
                ps.setString(1 , id);
                
                if(ps.executeUpdate() > 0 )
                {
                    JOptionPane.showMessageDialog(null, "Course Data Deleted.");
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
            }
            }

        }
    }
    
    public boolean isCourseExist(String courseid)
    {
        boolean isExist = false ;
        Connection con = MyConnection.getConnection();
        PreparedStatement ps ;
        try {
            ps = con.prepareStatement("SELECT * FROM `course` WHERE `ID` = ?");
            ps.setString(1,courseid);
            ResultSet rs = ps.executeQuery();
            
            if( rs.next())
            {
                isExist = true ;
            }
            
            
        } catch (Exception ex) {
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return isExist ;
    }
    
    public void fillCourseJtable(JTable table)
    {
        Connection con = MyConnection.getConnection();
        PreparedStatement ps ;
        try {
            ps = con.prepareStatement("SELECT * FROM `course` ");
            ResultSet rs = ps.executeQuery();
            DefaultTableModel model = (DefaultTableModel)table.getModel();
            
            Object[] row ;
            
            while ( rs.next())
            {
                row = new Object[3];
                row[0] = rs.getString(1);
                row[1] = rs.getString(2);
                row[2] = rs.getString(3);

                model.addRow(row);
            }
            
        } catch (Exception ex) {
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public String getCourseName(String courselabel)
    {
        String courseName = "";
        
        Connection con = MyConnection.getConnection();
        PreparedStatement ps ;
        try {
            ps = con.prepareStatement("SELECT * FROM `course` WHERE `label` = ?");
            ps.setString(1 , courselabel);
            ResultSet rs = ps.executeQuery();
            
            if( rs.next())
            {
                courseName = rs.getString("label");
            }
            
            
        } catch (Exception ex) {
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return courseName ;
    }
    
    public void fillCourseCombo(JComboBox combo)
    {
        Connection con = MyConnection.getConnection();
        PreparedStatement ps ;
        try {
            ps = con.prepareStatement("SELECT * FROM `course` ");
            ResultSet rs = ps.executeQuery();
            
            while ( rs.next())
            {
                combo.addItem(rs.getString(2));
            }
            
        } catch (Exception ex) {
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
