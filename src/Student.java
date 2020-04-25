
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class Student {
    public void InsertUpdateDeleteStudent(char operation , String id , String fname , String lname , 
                                        String sex , String Phone , String Address )
    {
        Connection con = MyConnection.getConnection();
        PreparedStatement ps ;
        
        // i for insert
        if ( operation == 'i')
        {
            try {
                ps = con.prepareStatement("INSERT INTO student(ID,First_Name, Last_Name, Sex, Phone_Number, Address) VALUES (?,?,?,?,?,?)");
                ps.setString(1 , id);
                ps.setString(2 , fname);
                ps.setString(3 , lname);
                ps.setString(4 , sex);
                ps.setString(5 , Phone);
                ps.setString(6 , Address);
                
                if(ps.executeUpdate() > 0 )
                {
                    JOptionPane.showMessageDialog(null, "New Student Added.");
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        
        // u for Update
        if ( operation == 'u')
        {
            try {
                ps = con.prepareStatement("UPDATE `student` SET `First_Name`= ? ,`Last_Name`= ? ,`Sex`= ? ,`Phone_Number`= ? ,`Address`= ?  WHERE `ID` = ? ");
                ps.setString(1 , fname);
                ps.setString(2 , lname);
                ps.setString(3 , sex);
                ps.setString(4 , Phone);
                ps.setString(5 , Address);
                ps.setString(6 , id);
                
                if(ps.executeUpdate() > 0 )
                {
                    JOptionPane.showMessageDialog(null, "Student Data Updated.");
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
            {
                try {
                ps = con.prepareStatement("DELETE FROM `student` WHERE `ID` = ?");
                ps.setString(1 , id);
                
                if(ps.executeUpdate() > 0 )
                {
                    JOptionPane.showMessageDialog(null, "Student Data Deleted.");
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
            }
            }
            
            
            
        }
    }
    
    public void fillStudentJtable(JTable table , String valueToSearch)
    {
        Connection con = MyConnection.getConnection();
        PreparedStatement ps ;
        try {
            ps = con.prepareStatement("SELECT * FROM `student` WHERE CONCAT(`ID`,`First_Name` , `Last_Name` ,`Phone_Number`, `Address` )LIKE ?");
            ps.setString(1, "%" + valueToSearch + "%");
            
            ResultSet rs = ps.executeQuery();
            DefaultTableModel model = (DefaultTableModel)table.getModel();
            
            Object[] row ;
            
            while ( rs.next())
            {
                row = new Object[6];
                row[0] = rs.getString(1);
                row[1] = rs.getString(2);
                row[2] = rs.getString(3);
                row[3] = rs.getString(4);
                row[4] = rs.getString(5);
                row[5] = rs.getString(6);
                
                model.addRow(row);
            }
            
        } catch (Exception ex) {
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
