package Main;

import Admins.AdminActivity;
import Doctors.doctorActivity;
import Receptionists.ReceptionistActivity;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Muhammad Ali
 */
public class Hospital extends javax.swing.JFrame {

    PreparedStatement prp = null;
    ResultSet result = null;
    Connection connection = null;
    String username;

    public Hospital() {
        initComponents();
        ImageIcon ic = new ImageIcon(getClass().getResource("/Images/hospital.png"));
        AdminLoginjPanel.setVisible(false);
        DoctorLoginjPanel.setVisible(false);
        ReceptionistLoginjPanel1.setVisible(false);
        this.setIconImage(ic.getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainF = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        adminIcon = new javax.swing.JLabel();
        adminLabel = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        doctorIcon = new javax.swing.JLabel();
        doctorLabel = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        receptionIcon = new javax.swing.JLabel();
        receptionLabel = new javax.swing.JLabel();
        DoctorLoginjPanel = new javax.swing.JPanel();
        docUserIdLabel = new javax.swing.JLabel();
        docUserIdField = new javax.swing.JTextField();
        dPassField = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        dLoginBtn = new javax.swing.JButton();
        AdminLoginjPanel = new javax.swing.JPanel();
        aLoginBtn = new javax.swing.JButton();
        aPassField = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        aUserLabel = new javax.swing.JLabel();
        aUserField = new javax.swing.JTextField();
        ReceptionistLoginjPanel1 = new javax.swing.JPanel();
        rUserField = new javax.swing.JTextField();
        dUser = new javax.swing.JLabel();
        plbl = new javax.swing.JLabel();
        rPassField = new javax.swing.JPasswordField();
        rLoginBtn = new javax.swing.JButton();
        BackgroundImagejLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Welcome To Hospital Management System");
        setResizable(false);
        setSize(new java.awt.Dimension(800, 480));

        MainF.setName("Welcome To Hospital Management System"); // NOI18N
        MainF.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(0, 102, 102));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel5.setOpaque(false);

        jLabel5.setFont(new java.awt.Font("Sylfaen", 1, 22)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Choose Account Type");

        jPanel1.setBackground(java.awt.Color.lightGray);
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.setOpaque(false);

        adminIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/admin.png"))); // NOI18N
        adminIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adminIconMouseClicked(evt);
            }
        });

        adminLabel.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        adminLabel.setForeground(new java.awt.Color(0, 0, 0));
        adminLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        adminLabel.setText("Admin");
        adminLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adminLabelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(adminLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                .addGap(16, 16, 16)
                .addComponent(adminIcon)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(adminIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(adminLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel3.setBackground(java.awt.Color.lightGray);
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel3.setOpaque(false);

        doctorIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/doctor.png"))); // NOI18N
        doctorIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                doctorIconMouseClicked(evt);
            }
        });

        doctorLabel.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        doctorLabel.setForeground(new java.awt.Color(0, 0, 0));
        doctorLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        doctorLabel.setText("Doctor");
        doctorLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                doctorLabelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(doctorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(doctorIcon)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(doctorIcon)
                    .addComponent(doctorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel2.setBackground(java.awt.Color.lightGray);
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        receptionIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/reception.png"))); // NOI18N
        receptionIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                receptionIconMouseClicked(evt);
            }
        });

        receptionLabel.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        receptionLabel.setForeground(new java.awt.Color(0, 0, 0));
        receptionLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        receptionLabel.setText("Receptionist");
        receptionLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                receptionLabelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(receptionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(receptionIcon)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(receptionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(receptionIcon))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(68, Short.MAX_VALUE))
        );

        MainF.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 540));

        DoctorLoginjPanel.setMinimumSize(new java.awt.Dimension(760, 520));
        DoctorLoginjPanel.setOpaque(false);
        DoctorLoginjPanel.setPreferredSize(new java.awt.Dimension(760, 520));
        DoctorLoginjPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        docUserIdLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        docUserIdLabel.setForeground(new java.awt.Color(0, 0, 0));
        docUserIdLabel.setText("UserID:");
        DoctorLoginjPanel.add(docUserIdLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 124, 109, -1));

        docUserIdField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                docUserIdFieldActionPerformed(evt);
            }
        });
        DoctorLoginjPanel.add(docUserIdField, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 124, 279, 29));
        DoctorLoginjPanel.add(dPassField, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 258, 279, 29));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Password:");
        DoctorLoginjPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 258, -1, -1));

        dLoginBtn.setBackground(new java.awt.Color(0, 153, 153));
        dLoginBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        dLoginBtn.setForeground(new java.awt.Color(255, 255, 255));
        dLoginBtn.setText("Login");
        dLoginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dLoginBtnActionPerformed(evt);
            }
        });
        DoctorLoginjPanel.add(dLoginBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(494, 360, 91, 35));

        MainF.add(DoctorLoginjPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, 800, 540));

        AdminLoginjPanel.setMinimumSize(new java.awt.Dimension(760, 520));
        AdminLoginjPanel.setOpaque(false);
        AdminLoginjPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        aLoginBtn.setBackground(new java.awt.Color(0, 153, 153));
        aLoginBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        aLoginBtn.setForeground(new java.awt.Color(255, 255, 255));
        aLoginBtn.setText("Login");
        aLoginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aLoginBtnActionPerformed(evt);
            }
        });
        AdminLoginjPanel.add(aLoginBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(497, 360, 91, 35));
        AdminLoginjPanel.add(aPassField, new org.netbeans.lib.awtextra.AbsoluteConstraints(309, 258, 279, 29));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("Password:");
        AdminLoginjPanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(182, 258, -1, -1));

        aUserLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        aUserLabel.setForeground(new java.awt.Color(0, 0, 0));
        aUserLabel.setText("Username:");
        AdminLoginjPanel.add(aUserLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(183, 124, -1, -1));

        aUserField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aUserFieldActionPerformed(evt);
            }
        });
        AdminLoginjPanel.add(aUserField, new org.netbeans.lib.awtextra.AbsoluteConstraints(309, 124, 279, 29));

        MainF.add(AdminLoginjPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, 800, 540));

        ReceptionistLoginjPanel1.setMinimumSize(new java.awt.Dimension(760, 520));
        ReceptionistLoginjPanel1.setOpaque(false);

        rUserField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rUserFieldActionPerformed(evt);
            }
        });

        dUser.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        dUser.setForeground(new java.awt.Color(0, 0, 0));
        dUser.setText("UserId");

        plbl.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        plbl.setForeground(new java.awt.Color(0, 0, 0));
        plbl.setText("Password:");

        rPassField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rPassFieldActionPerformed(evt);
            }
        });

        rLoginBtn.setBackground(new java.awt.Color(0, 153, 153));
        rLoginBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        rLoginBtn.setForeground(new java.awt.Color(255, 255, 255));
        rLoginBtn.setText("Login");
        rLoginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rLoginBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ReceptionistLoginjPanel1Layout = new javax.swing.GroupLayout(ReceptionistLoginjPanel1);
        ReceptionistLoginjPanel1.setLayout(ReceptionistLoginjPanel1Layout);
        ReceptionistLoginjPanel1Layout.setHorizontalGroup(
            ReceptionistLoginjPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
            .addGroup(ReceptionistLoginjPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(ReceptionistLoginjPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(ReceptionistLoginjPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(ReceptionistLoginjPanel1Layout.createSequentialGroup()
                            .addGap(1, 1, 1)
                            .addComponent(dUser)
                            .addGap(55, 55, 55)
                            .addComponent(rUserField, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(ReceptionistLoginjPanel1Layout.createSequentialGroup()
                            .addComponent(plbl)
                            .addGap(18, 18, 18)
                            .addComponent(rPassField, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(ReceptionistLoginjPanel1Layout.createSequentialGroup()
                            .addGap(315, 315, 315)
                            .addComponent(rLoginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        ReceptionistLoginjPanel1Layout.setVerticalGroup(
            ReceptionistLoginjPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 540, Short.MAX_VALUE)
            .addGroup(ReceptionistLoginjPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(ReceptionistLoginjPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(ReceptionistLoginjPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(dUser)
                        .addComponent(rUserField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(105, 105, 105)
                    .addGroup(ReceptionistLoginjPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(plbl)
                        .addComponent(rPassField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(73, 73, 73)
                    .addComponent(rLoginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        MainF.add(ReceptionistLoginjPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, 800, 540));

        BackgroundImagejLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Hospital_Image_1366x768.jpg"))); // NOI18N
        BackgroundImagejLabel.setPreferredSize(new java.awt.Dimension(1281, 710));
        MainF.add(BackgroundImagejLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 540));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainF, javax.swing.GroupLayout.DEFAULT_SIZE, 1052, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
   
    private void adminLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminLabelMouseClicked
        DoctorLoginjPanel.setVisible(false);
        ReceptionistLoginjPanel1.setVisible(false);
        AdminLoginjPanel.setVisible(true);
    }//GEN-LAST:event_adminLabelMouseClicked

    private void doctorLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_doctorLabelMouseClicked
        AdminLoginjPanel.setVisible(false);
        ReceptionistLoginjPanel1.setVisible(false);
        DoctorLoginjPanel.setVisible(true);
    }//GEN-LAST:event_doctorLabelMouseClicked

    private void receptionLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_receptionLabelMouseClicked
        ReceptionistLoginjPanel1.setVisible(true);
        AdminLoginjPanel.setVisible(false);
        DoctorLoginjPanel.setVisible(false);

    }//GEN-LAST:event_receptionLabelMouseClicked

    private void adminIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminIconMouseClicked

        DoctorLoginjPanel.setVisible(false);
        ReceptionistLoginjPanel1.setVisible(false);

        AdminLoginjPanel.setVisible(true);
    }//GEN-LAST:event_adminIconMouseClicked

    private void doctorIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_doctorIconMouseClicked

        AdminLoginjPanel.setVisible(false);
        ReceptionistLoginjPanel1.setVisible(false);
        DoctorLoginjPanel.setVisible(true);
    }//GEN-LAST:event_doctorIconMouseClicked

    private void receptionIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_receptionIconMouseClicked

        ReceptionistLoginjPanel1.setVisible(true);
        AdminLoginjPanel.setVisible(false);
        DoctorLoginjPanel.setVisible(false);
    }//GEN-LAST:event_receptionIconMouseClicked

    private void docUserIdFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_docUserIdFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_docUserIdFieldActionPerformed

    private void dLoginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dLoginBtnActionPerformed
        connection = Connector.ConnectDb();
        String doctorId = docUserIdField.getText();
        String pass = String.valueOf(dPassField.getPassword());

        try {

            String sql = "select id, password from doctor where id=? and password=?";
            prp = connection.prepareStatement(sql);
            prp.setString(1, doctorId);
            prp.setString(2, pass);
            ResultSet result = prp.executeQuery();
            result.next();

            if (pass.equals(result.getString(2))) {
                doctorActivity dActivity = new doctorActivity(doctorId);
                dActivity.setVisible(true);
                JOptionPane.showMessageDialog(null, "Login Succesful", "Welcome " + doctorId, JOptionPane.INFORMATION_MESSAGE);
                dispose();
                connection.close();
            } else {
                JOptionPane.showMessageDialog(null, "Login Failed", "Error", JOptionPane.WARNING_MESSAGE);
            }

        } catch (HeadlessException | SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "User or Password wrong.");
        }
    }//GEN-LAST:event_dLoginBtnActionPerformed

    private void aLoginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aLoginBtnActionPerformed
        connection = Connector.ConnectDb();
        String user = aUserField.getText();
        String pass = String.valueOf(aPassField.getPassword());

        try {
            String sql = "select username, password from admin where username=? and password=?";
            prp = connection.prepareStatement(sql);
            prp.setString(1, user);
            prp.setString(2, pass);
            ResultSet result = prp.executeQuery();
            result.next();
            if (pass.equals(result.getString(2))) {
                AdminActivity adminActivity = new AdminActivity();
                adminActivity.setVisible(true);
                JOptionPane.showMessageDialog(null, "Login Succesful", "Welcome " + user, JOptionPane.INFORMATION_MESSAGE);
                dispose();
                username = user;
                adminActivity.User(username);
                connection.close();
            } else {
                JOptionPane.showMessageDialog(null, "Login Failed", "Error", JOptionPane.WARNING_MESSAGE);
            }

        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "User or Password wrong.");
        }
    }//GEN-LAST:event_aLoginBtnActionPerformed

    private void aUserFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aUserFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aUserFieldActionPerformed

    private void rUserFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rUserFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rUserFieldActionPerformed

    private void rPassFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rPassFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rPassFieldActionPerformed

    private void rLoginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rLoginBtnActionPerformed
        connection = Connector.ConnectDb();
        String userId = rUserField.getText();
        String pass = String.valueOf(rPassField.getPassword());
        System.out.println("Id = " + userId);
        System.out.println("Password = " + pass);
        try {

            String sql = "select id, password from receptionist where id=? and password=?";
            prp = connection.prepareStatement(sql);
            prp.setString(1, userId);
            prp.setString(2, pass);
            ResultSet result = prp.executeQuery();
            if (result.next()) {
                if (pass.equals(result.getString(2))) {
                    ReceptionistActivity rActivity = new ReceptionistActivity();
                    rActivity.setVisible(true);
                    JOptionPane.showMessageDialog(null, "Login Succesful");
                    dispose();
                    connection.close();
                } else {
                    JOptionPane.showMessageDialog(null, "Login Failed", "Error", JOptionPane.WARNING_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "This user does not exists");
            }

        } catch (HeadlessException | SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "User or Password wrong.");
        }
    }//GEN-LAST:event_rLoginBtnActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new Hospital().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AdminLoginjPanel;
    private javax.swing.JLabel BackgroundImagejLabel;
    private javax.swing.JPanel DoctorLoginjPanel;
    private javax.swing.JPanel MainF;
    private javax.swing.JPanel ReceptionistLoginjPanel1;
    private javax.swing.JButton aLoginBtn;
    private javax.swing.JPasswordField aPassField;
    private javax.swing.JTextField aUserField;
    private javax.swing.JLabel aUserLabel;
    private javax.swing.JLabel adminIcon;
    private javax.swing.JLabel adminLabel;
    private javax.swing.JButton dLoginBtn;
    private javax.swing.JPasswordField dPassField;
    private javax.swing.JLabel dUser;
    private javax.swing.JTextField docUserIdField;
    private javax.swing.JLabel docUserIdLabel;
    private javax.swing.JLabel doctorIcon;
    private javax.swing.JLabel doctorLabel;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel plbl;
    private javax.swing.JButton rLoginBtn;
    private javax.swing.JPasswordField rPassField;
    private javax.swing.JTextField rUserField;
    private javax.swing.JLabel receptionIcon;
    private javax.swing.JLabel receptionLabel;
    // End of variables declaration//GEN-END:variables
}
