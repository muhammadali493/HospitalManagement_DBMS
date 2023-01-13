package Receptionists;

import Admins.ReceptionistManagement;
import Main.Connector;
import Main.Hospital;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Muhammad Ali
 */
public class updateReceptionist extends javax.swing.JFrame {

    Connection connection = null;
    PreparedStatement ps = null;
    PreparedStatement ps2 = null;
    ResultSet rs = null;
    DefaultTableModel defaultTableModel = new DefaultTableModel();

    int count;
    String date;
    String id,prevId;
    String name;
    int age;
    String gender;
    String blood;
    String email;
    String phone;
    String Status;
    String address;
    String status;
    String username;
    String password;
    int salary;
    public updateReceptionist() {
        initComponents();
        ImageIcon ic = new ImageIcon(getClass().getResource("/Images/hospital.png"));
        this.setIconImage(ic.getImage());
        Object columns[] = {"Id", "Name", "Age", "Gender", "Email", "Phone No.","Status", "Joining Date","Address", "Salary","Password"};
        defaultTableModel.setColumnIdentifiers(columns);
        rUTable.setModel(defaultTableModel);
        loadData();
    }

    public void loadData() {
        connection = Connector.ConnectDb();
        String sql = "select r.id, r.name,i.age,i.gender,i.email,i.phone,i.status,i.date,i.address, r.salary,r.password\n" +
        "from receptionist r\n" +
        "join info i\n" +
        "on r.id = i.ReceptionistId";
        try {
            ps = connection.prepareStatement(sql);
            rs = ps.executeQuery();
            Object columnData[] = new Object[13];
            while (rs.next()) {
                columnData[0] = rs.getString("id");
                columnData[1] = rs.getString("name");
                columnData[2] = rs.getInt("age");
                columnData[3] = rs.getString("gender");
                columnData[4] = rs.getString("email");
                columnData[5] = rs.getString("phone");
                columnData[6] = rs.getString("status");
                columnData[7] = rs.getString("date");
                columnData[8] = rs.getString("address");
                columnData[9] = rs.getString("salary");
                columnData[10] = rs.getString("password");
                defaultTableModel.addRow(columnData);
                
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        UpdateReceptionistjPanel7 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        rUTable = new javax.swing.JTable();
        jLabel14 = new javax.swing.JLabel();
        BackGroundImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Update Receptionist !");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        UpdateReceptionistjPanel7.setBackground(new java.awt.Color(0, 153, 153));
        UpdateReceptionistjPanel7.setOpaque(false);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Update");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
        );

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/shutdown.png"))); // NOI18N
        jLabel20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel20MouseClicked(evt);
            }
        });

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/back-arrow-48.png"))); // NOI18N
        jLabel21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel21MouseClicked(evt);
            }
        });

        rUTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"", "", "", null},
                {"", "", "", ""},
                {"", "", null, ""},
                {"", null, "", ""}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        rUTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rUTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(rUTable);

        jLabel14.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 26)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Update Receptionist");

        javax.swing.GroupLayout UpdateReceptionistjPanel7Layout = new javax.swing.GroupLayout(UpdateReceptionistjPanel7);
        UpdateReceptionistjPanel7.setLayout(UpdateReceptionistjPanel7Layout);
        UpdateReceptionistjPanel7Layout.setHorizontalGroup(
            UpdateReceptionistjPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UpdateReceptionistjPanel7Layout.createSequentialGroup()
                .addContainerGap(59, Short.MAX_VALUE)
                .addGroup(UpdateReceptionistjPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, UpdateReceptionistjPanel7Layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(503, 503, 503))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, UpdateReceptionistjPanel7Layout.createSequentialGroup()
                        .addGroup(UpdateReceptionistjPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1049, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(UpdateReceptionistjPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addGap(330, 330, 330)
                                .addComponent(jLabel20)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel21)))
                        .addGap(53, 53, 53))))
        );
        UpdateReceptionistjPanel7Layout.setVerticalGroup(
            UpdateReceptionistjPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UpdateReceptionistjPanel7Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(UpdateReceptionistjPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(UpdateReceptionistjPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.TRAILING)))
                .addGap(37, 37, 37)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        getContentPane().add(UpdateReceptionistjPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        BackGroundImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Hospital_Image_1366x768.jpg"))); // NOI18N
        BackGroundImage.setText("jLabel2");
        getContentPane().add(BackGroundImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(-1, 2, 1160, 600));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseClicked
        Hospital hospital = new Hospital();
        hospital.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel20MouseClicked

    private void jLabel21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MouseClicked
        ReceptionistManagement rm = new ReceptionistManagement();
        rm.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel21MouseClicked

    private void rUTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rUTableMouseClicked
        int row = rUTable.getSelectedRow();
        String rid = (rUTable.getValueAt(row, 0).toString());
        String rname = (rUTable.getValueAt(row, 1).toString());
        int rage = Integer.parseInt((rUTable.getValueAt(row, 2).toString()));
        String rgender = (rUTable.getValueAt(row, 3).toString());
        String remail = (rUTable.getValueAt(row, 4).toString());
        String rphone = (rUTable.getValueAt(row, 5).toString());
        String rstatus = (rUTable.getValueAt(row, 6).toString());
        String rdate = (rUTable.getValueAt(row, 7).toString());
        String raddress = (rUTable.getValueAt(row, 8).toString());
        int pay = Integer.parseInt((rUTable.getValueAt(row, 9).toString()));
        String rpassword = (rUTable.getValueAt(row, 10).toString());
        
        date = rdate;
        id = rid;
        name = rname;
        age = rage;
        gender = rgender;
        email = remail;
        phone = rphone;
        address = raddress;
        Status = rstatus;
        password = rpassword;
        salary = pay;
    }//GEN-LAST:event_rUTableMouseClicked


    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        connection = Connector.ConnectDb();
        String sql = "Update receptionist set id = '" + id + "', name = '" + name + "', salary = '" + salary + "', password = '" + password + "' where id = '" + id + "'";
        try {
            ps = connection.prepareStatement(sql);
            ps.execute();
            defaultTableModel.getDataVector().removeAllElements();
            defaultTableModel.fireTableDataChanged();
            System.out.println("Updating info table for "+name);
            String sql2 = "Update info set ReceptionistId = '" + id + "', date = '" + date + "', age = '" + age + "', gender = '" + gender  + "', email = '" + email + "', phone = '" + phone + "', status = '" + Status + "', address = '" + address + "' where ReceptionistId = '" + id + "'";
            try{
                ps2 = connection.prepareStatement(sql2);
                ps2.execute();
                loadData();
                JOptionPane.showMessageDialog(null, "Data Updated");
            }catch(SQLException e){
                e.printStackTrace();
            }
        } catch (HeadlessException | SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jLabel1MouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new updateReceptionist().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BackGroundImage;
    private javax.swing.JPanel UpdateReceptionistjPanel7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable rUTable;
    // End of variables declaration//GEN-END:variables
}
