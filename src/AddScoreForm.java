
import java.awt.Color;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Z'Zince
 */
public class AddScoreForm extends javax.swing.JFrame {

    /**
     * Creates new form AddScoreForm
     */
    Course c = new Course();
    Student std = new Student();
    Score s = new Score();
    DefaultTableModel model ;
    public AddScoreForm() {
        initComponents();
        c.fillCourseCombo(jComboBox1);
        std.fillStudentJtable(jTable1, "");
        
        HideColumn(5);
        HideColumn(4);
        HideColumn(3);
        
        model = (DefaultTableModel)jTable1.getModel();
        jTable1.setRowHeight(40);   //size field in table 
        jTable1.setShowGrid(true);
        jTable1.setGridColor(Color.gray);  //set line table color 
        jTable1.setSelectionBackground(Color.RED);  //set color background select field
        
        
    }
    
    //cut column
    private void HideColumn(int colIndex)
    {
        TableColumn col = jTable1.getColumnModel().getColumn(colIndex);
        col.setMaxWidth(0);
        col.setMinWidth(0);
        col.setPreferredWidth(0);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jButton_CancleScore = new javax.swing.JButton();
        jButton_AddScore = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jTextField_Course_ID = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField_Score = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jTextField_Des = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("AddScore");

        jPanel1.setBackground(new java.awt.Color(204, 51, 0));

        jLabel1.setFont(new java.awt.Font("Tw Cen MT", 1, 36)); // NOI18N
        jLabel1.setText("ADD SCORE");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(335, 335, 335)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));

        jLabel2.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        jLabel2.setText("COURSE ID :");

        jButton_CancleScore.setText("CENCLE");
        jButton_CancleScore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_CancleScoreActionPerformed(evt);
            }
        });

        jButton_AddScore.setText("ADD");
        jButton_AddScore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_AddScoreActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        jLabel4.setText("STUDENT  ID :");

        jTextField_Course_ID.setEditable(false);

        jLabel5.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        jLabel5.setText("SCORE :");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "First Name", "Last Name", "Sex", "Phone Number", "Address"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jTable1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTable1KeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        jLabel6.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        jLabel6.setText("DESCRIPTION :");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField_Des)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jButton_CancleScore, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addComponent(jButton_AddScore, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTextField_Score)
                    .addComponent(jTextField_Course_ID)
                    .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jTextField_Course_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jTextField_Score, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jTextField_Des, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton_AddScore, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_CancleScore, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_CancleScoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_CancleScoreActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton_CancleScoreActionPerformed

    private void jButton_AddScoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_AddScoreActionPerformed
        
        String std_id = jTextField_Course_ID.getText();
        String cr_id = c.getCourseName(jComboBox1.getSelectedItem().toString());
        double score = Double.valueOf(jTextField_Score.getText());
        String des = jTextField_Des.getText();  
        s.InsertUpdateDeleteScore('i', std_id, cr_id, score,des);
        s.fillScoreJtable(EditDeleteScore.jTable1);
    }//GEN-LAST:event_jButton_AddScoreActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

        int rowIndex = jTable1.getSelectedRow();
        jTextField_Course_ID.setText(jTable1.getValueAt(rowIndex, 0).toString());
        


//        rowIndex = jTable1.getSelectedRow();
//
//        if (model.getValueAt(rowIndex, 3).toString().equals("Male"))
//        {
//            jRadioButtonMale.setSelected(true) ;
//            jRadioButtonFemale.setSelected(false) ;
//        }
//        else
//        {
//            jRadioButtonFemale.setSelected(true) ;
//            jRadioButtonMale.setSelected(false) ;
//        }
//        jTextField_STD_ID1.setText(model.getValueAt(rowIndex, 0).toString());
//        jTextField_FName.setText(model.getValueAt(rowIndex, 1).toString());
//        jTextField_LName.setText(model.getValueAt(rowIndex, 2).toString());
//        jTextField_Phone.setText(model.getValueAt(rowIndex, 4).toString());
//        jTextArea_Address.setText(model.getValueAt(rowIndex, 5).toString());

    }//GEN-LAST:event_jTable1MouseClicked

    private void jTable1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable1KeyReleased

//        //slide key up down in keybored to data
//        if (evt.getKeyCode() == KeyEvent.VK_UP || evt.getKeyCode() == KeyEvent.VK_DOWN )
//        {
//            rowIndex = jTable1.getSelectedRow();
//            jTextField_STD_ID1.setText(model.getValueAt(rowIndex, 0).toString());
//            jTextField_FName.setText(model.getValueAt(rowIndex, 1).toString());
//            jTextField_LName.setText(model.getValueAt(rowIndex, 2).toString());
//            jTextField_Phone.setText(model.getValueAt(rowIndex, 4).toString());
//            jTextArea_Address.setText(model.getValueAt(rowIndex, 5).toString());
//
//            if (model.getValueAt(rowIndex, 3).toString().equals("Male"))
//            {
//                jRadioButtonMale.setSelected(true) ;
//                jRadioButtonFemale.setSelected(false) ;
//            }
//            else
//            {
//                jRadioButtonFemale.setSelected(true) ;
//                jRadioButtonMale.setSelected(false) ;
//            }
//        }

    }//GEN-LAST:event_jTable1KeyReleased

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AddScoreForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddScoreForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddScoreForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddScoreForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddScoreForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_AddScore;
    private javax.swing.JButton jButton_CancleScore;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    public static javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField_Course_ID;
    private javax.swing.JTextField jTextField_Des;
    private javax.swing.JTextField jTextField_Score;
    // End of variables declaration//GEN-END:variables
}
