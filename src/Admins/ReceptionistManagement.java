package Admins;

import Main.Connector;
import Main.Hospital;
import Receptionists.addReceptionist;
import Receptionists.searchReceptionist;
import Receptionists.updateReceptionist;
import Receptionists.viewReceptionist;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Muhammad Ali
 */
public class ReceptionistManagement extends javax.swing.JFrame {

    Connection connection = null;
    PreparedStatement ps = null;
    PreparedStatement prp = null;
    PreparedStatement prp2 = null;
    //New
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
    //NewEnded
    public ReceptionistManagement() {
        initComponents();
        ImageIcon ic = new ImageIcon(getClass().getResource("/Images/hospital.png"));
        this.setIconImage(ic.getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DashboardPanel = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        viewReceptionbtn = new javax.swing.JLabel();
        viewReceptionbtn2 = new javax.swing.JLabel();
        AddNewPanel = new javax.swing.JPanel();
        addReceptionbtn = new javax.swing.JLabel();
        addReceptionbtn2 = new javax.swing.JLabel();
        SearchPanel = new javax.swing.JPanel();
        searchReceptionbtn = new javax.swing.JLabel();
        searchReceptionbtn2 = new javax.swing.JLabel();
        UpdateUpdatePanel = new javax.swing.JPanel();
        updateReceptionbtn = new javax.swing.JLabel();
        updateReceptionbtn2 = new javax.swing.JLabel();
        LogoutPanel = new javax.swing.JPanel();
        Logoutbtn = new javax.swing.JLabel();
        Logoutbtn2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        BackgroundImageLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Receptionist Management !");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        DashboardPanel.setBackground(new java.awt.Color(0, 153, 153));
        DashboardPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        DashboardPanel.setOpaque(false);

        jPanel8.setBackground(java.awt.Color.lightGray);
        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel8.setOpaque(false);
        jPanel8.setPreferredSize(new java.awt.Dimension(150, 100));

        viewReceptionbtn.setFont(new java.awt.Font("Rockwell", 1, 25)); // NOI18N
        viewReceptionbtn.setForeground(new java.awt.Color(255, 255, 255));
        viewReceptionbtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        viewReceptionbtn.setText("View ");
        viewReceptionbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewReceptionbtnMouseClicked(evt);
            }
        });

        viewReceptionbtn2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/viewpatient.png"))); // NOI18N
        viewReceptionbtn2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewReceptionbtn2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(viewReceptionbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(viewReceptionbtn2)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(viewReceptionbtn2)
                    .addComponent(viewReceptionbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        AddNewPanel.setBackground(java.awt.Color.lightGray);
        AddNewPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        AddNewPanel.setOpaque(false);
        AddNewPanel.setPreferredSize(new java.awt.Dimension(150, 100));

        addReceptionbtn.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        addReceptionbtn.setForeground(new java.awt.Color(0, 0, 0));
        addReceptionbtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addReceptionbtn.setText("Add Recepionist");
        addReceptionbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addReceptionbtnMouseClicked(evt);
            }
        });

        addReceptionbtn2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/addpatient.png"))); // NOI18N
        addReceptionbtn2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addReceptionbtn2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout AddNewPanelLayout = new javax.swing.GroupLayout(AddNewPanel);
        AddNewPanel.setLayout(AddNewPanelLayout);
        AddNewPanelLayout.setHorizontalGroup(
            AddNewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddNewPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(addReceptionbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addReceptionbtn2)
                .addContainerGap())
        );
        AddNewPanelLayout.setVerticalGroup(
            AddNewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddNewPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(AddNewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addReceptionbtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addReceptionbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        SearchPanel.setBackground(java.awt.Color.lightGray);
        SearchPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        SearchPanel.setOpaque(false);
        SearchPanel.setPreferredSize(new java.awt.Dimension(150, 100));

        searchReceptionbtn.setFont(new java.awt.Font("Rockwell", 1, 25)); // NOI18N
        searchReceptionbtn.setForeground(new java.awt.Color(0, 0, 0));
        searchReceptionbtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        searchReceptionbtn.setText("Search ");
        searchReceptionbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchReceptionbtnMouseClicked(evt);
            }
        });

        searchReceptionbtn2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/searchpatient.png"))); // NOI18N
        searchReceptionbtn2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchReceptionbtn2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout SearchPanelLayout = new javax.swing.GroupLayout(SearchPanel);
        SearchPanel.setLayout(SearchPanelLayout);
        SearchPanelLayout.setHorizontalGroup(
            SearchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SearchPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(searchReceptionbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(searchReceptionbtn2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        SearchPanelLayout.setVerticalGroup(
            SearchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SearchPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(SearchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(searchReceptionbtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchReceptionbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(14, 14, 14))
        );

        UpdateUpdatePanel.setBackground(java.awt.Color.lightGray);
        UpdateUpdatePanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        UpdateUpdatePanel.setOpaque(false);
        UpdateUpdatePanel.setPreferredSize(new java.awt.Dimension(150, 100));

        updateReceptionbtn.setFont(new java.awt.Font("Rockwell", 1, 25)); // NOI18N
        updateReceptionbtn.setForeground(new java.awt.Color(0, 0, 0));
        updateReceptionbtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        updateReceptionbtn.setText("Update");
        updateReceptionbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateReceptionbtnMouseClicked(evt);
            }
        });

        updateReceptionbtn2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/updatepatient.png"))); // NOI18N
        updateReceptionbtn2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateReceptionbtn2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout UpdateUpdatePanelLayout = new javax.swing.GroupLayout(UpdateUpdatePanel);
        UpdateUpdatePanel.setLayout(UpdateUpdatePanelLayout);
        UpdateUpdatePanelLayout.setHorizontalGroup(
            UpdateUpdatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UpdateUpdatePanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(updateReceptionbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(updateReceptionbtn2)
                .addGap(12, 12, 12))
        );
        UpdateUpdatePanelLayout.setVerticalGroup(
            UpdateUpdatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, UpdateUpdatePanelLayout.createSequentialGroup()
                .addGap(0, 6, Short.MAX_VALUE)
                .addGroup(UpdateUpdatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(updateReceptionbtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(updateReceptionbtn, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE))
                .addContainerGap())
        );

        LogoutPanel.setBackground(java.awt.Color.lightGray);
        LogoutPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        LogoutPanel.setOpaque(false);
        LogoutPanel.setPreferredSize(new java.awt.Dimension(150, 100));

        Logoutbtn.setFont(new java.awt.Font("Rockwell", 1, 25)); // NOI18N
        Logoutbtn.setForeground(new java.awt.Color(255, 255, 255));
        Logoutbtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Logoutbtn.setText("Logout");
        Logoutbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogoutbtnMouseClicked(evt);
            }
        });

        Logoutbtn2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/shutdown.png"))); // NOI18N
        Logoutbtn2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Logoutbtn2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout LogoutPanelLayout = new javax.swing.GroupLayout(LogoutPanel);
        LogoutPanel.setLayout(LogoutPanelLayout);
        LogoutPanelLayout.setHorizontalGroup(
            LogoutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LogoutPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Logoutbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Logoutbtn2)
                .addGap(14, 14, 14))
        );
        LogoutPanelLayout.setVerticalGroup(
            LogoutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LogoutPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(LogoutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Logoutbtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Logoutbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.setOpaque(false);

        jLabel1.setFont(new java.awt.Font("Matura MT Script Capitals", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Admin Portal");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout DashboardPanelLayout = new javax.swing.GroupLayout(DashboardPanel);
        DashboardPanel.setLayout(DashboardPanelLayout);
        DashboardPanelLayout.setHorizontalGroup(
            DashboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DashboardPanelLayout.createSequentialGroup()
                .addGap(0, 9, Short.MAX_VALUE)
                .addGroup(DashboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(SearchPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
                    .addComponent(LogoutPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
                    .addComponent(UpdateUpdatePanel, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
                    .addComponent(AddNewPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        DashboardPanelLayout.setVerticalGroup(
            DashboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DashboardPanelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(AddNewPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(UpdateUpdatePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(SearchPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(LogoutPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        getContentPane().add(DashboardPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 270, 590));

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));
        jPanel2.setOpaque(false);

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/back-arrow-64.png"))); // NOI18N
        jLabel19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel19MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel19)
                .addGap(19, 19, 19))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel19)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 30, 80, 70));

        BackgroundImageLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Hospital_Image.jpg"))); // NOI18N
        BackgroundImageLabel.setText("jLabel4");
        getContentPane().add(BackgroundImageLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1260, 586));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseClicked
        AdminActivity aActivity = new AdminActivity();
        aActivity.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel19MouseClicked

    private void addReceptionbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addReceptionbtnMouseClicked
        addReceptionist adr = new addReceptionist();
        adr.setVisible(true);
        dispose();
    }//GEN-LAST:event_addReceptionbtnMouseClicked

    private void addReceptionbtn2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addReceptionbtn2MouseClicked
        addReceptionist adr = new addReceptionist();
        adr.setVisible(true);
        dispose();
    }//GEN-LAST:event_addReceptionbtn2MouseClicked

    private void updateReceptionbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateReceptionbtnMouseClicked
        updateReceptionist uReceptionist = new updateReceptionist();
        uReceptionist.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_updateReceptionbtnMouseClicked

    private void updateReceptionbtn2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateReceptionbtn2MouseClicked
        updateReceptionist uReceptionist = new updateReceptionist();
        uReceptionist.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_updateReceptionbtn2MouseClicked

    private void LogoutbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutbtnMouseClicked
        Hospital hospital = new Hospital();
        hospital.setVisible(true);
        dispose();
    }//GEN-LAST:event_LogoutbtnMouseClicked

    private void Logoutbtn2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Logoutbtn2MouseClicked
        Hospital hospital = new Hospital();
        hospital.setVisible(true);
        dispose();
    }//GEN-LAST:event_Logoutbtn2MouseClicked

    private void viewReceptionbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewReceptionbtnMouseClicked
        viewReceptionist vReceptionist = new viewReceptionist();
        vReceptionist.setVisible(true);
        dispose();
    }//GEN-LAST:event_viewReceptionbtnMouseClicked

    private void viewReceptionbtn2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewReceptionbtn2MouseClicked
        viewReceptionist vReceptionist = new viewReceptionist();
        vReceptionist.setVisible(true);
        dispose();
    }//GEN-LAST:event_viewReceptionbtn2MouseClicked

    private void searchReceptionbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchReceptionbtnMouseClicked
        searchReceptionist sReceptionist = new searchReceptionist();
        sReceptionist.setVisible(true);
        dispose();
    }//GEN-LAST:event_searchReceptionbtnMouseClicked

    private void searchReceptionbtn2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchReceptionbtn2MouseClicked
        searchReceptionist sReceptionist = new searchReceptionist();
        sReceptionist.setVisible(true);
        dispose();
    }//GEN-LAST:event_searchReceptionbtn2MouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new ReceptionistManagement().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AddNewPanel;
    private javax.swing.JLabel BackgroundImageLabel;
    private javax.swing.JPanel DashboardPanel;
    private javax.swing.JPanel LogoutPanel;
    private javax.swing.JLabel Logoutbtn;
    private javax.swing.JLabel Logoutbtn2;
    private javax.swing.JPanel SearchPanel;
    private javax.swing.JPanel UpdateUpdatePanel;
    private javax.swing.JLabel addReceptionbtn;
    private javax.swing.JLabel addReceptionbtn2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JLabel searchReceptionbtn;
    private javax.swing.JLabel searchReceptionbtn2;
    private javax.swing.JLabel updateReceptionbtn;
    private javax.swing.JLabel updateReceptionbtn2;
    private javax.swing.JLabel viewReceptionbtn;
    private javax.swing.JLabel viewReceptionbtn2;
    // End of variables declaration//GEN-END:variables

}
