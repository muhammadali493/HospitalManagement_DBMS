package Doctors;

import Main.Connector;
import Main.Hospital;
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
public final class AppointmentDetails extends javax.swing.JFrame {

    Connection connection = null;
    ResultSet rs = null;
    PreparedStatement ps = null;
    PreparedStatement ps2 = null;

    DefaultTableModel defaultTableModel = new DefaultTableModel();
    //String data;
    String appDetails[];

    public AppointmentDetails(String appDetails[]) {
        this.appDetails = appDetails;
        System.out.println("Doctor Id = "+appDetails[0]);
        initComponents();
        ImageIcon ic = new ImageIcon(getClass().getResource("/Images/hospital.png"));
        this.setIconImage(ic.getImage());
        //data = name;
        Object columns[] = {"Appointment_Id","Patient_ID","patientName", "Age", "Gender", "Blood Group", "Date", "Start Time", "End Time"};
        defaultTableModel.setColumnIdentifiers(columns);
        patientDetailsTable.setModel(defaultTableModel);
        loadData();
    }

    public AppointmentDetails() {
        initComponents();
    }

    public void loadData() {
        connection = Connector.ConnectDb();
        defaultTableModel.getDataVector().removeAllElements();
        defaultTableModel.fireTableDataChanged();
        String sql = "select app.count,p.pid, p.name, i.age, i.gender, p.bloodGrp, app.StartAt, app.EndsAt\n" +
        "from info i\n" +
        "inner join patient p\n" +
        "on p.pid = i.pateintId\n" +
        "inner join appointment app\n" +
        "on app.pId = p.pid\n" +
        "where app.dId = '" + appDetails[0] +"'";
        try {
            ps = connection.prepareStatement(sql);
            rs = ps.executeQuery();

            Object columnData[] = new Object[9];
            while (rs.next()) {
                columnData[0] = rs.getInt("count");
                columnData[1] = rs.getString("pid");
                columnData[2] = rs.getString("name");
                columnData[3] = rs.getString("age");
                columnData[4] = rs.getString("gender");
                columnData[5] = rs.getString("bloodGrp");
                String start = rs.getString("StartAt");
                String end = rs.getString("EndsAt");
                String Date = start.substring(0, 10);
                String startTime = start.substring(10);
                System.out.println("Appointment Starts at: "+start);
                System.out.println("Appointment Ends at: "+end);
                columnData[6] = Date;
                columnData[7] = startTime; 
                columnData[8] = end.substring(10);
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

        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        BackToAppointmentjLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        patientDetailsTable = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        AppointmentCompletedjLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Patient Details !");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(0, 153, 153));
        jPanel3.setOpaque(false);

        jLabel10.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Appointment Details");

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/shutdown.png"))); // NOI18N
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
        });

        BackToAppointmentjLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/back-arrow-48.png"))); // NOI18N
        BackToAppointmentjLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackToAppointmentjLabelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(545, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(421, 421, 421)
                .addComponent(BackToAppointmentjLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel16)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(BackToAppointmentjLabel)
                        .addComponent(jLabel16))
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 35, 1290, -1));

        patientDetailsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(patientDetailsTable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 101, 1270, 380));

        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));

        AppointmentCompletedjLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/check-mark-3-48.png"))); // NOI18N
        AppointmentCompletedjLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AppointmentCompletedjLabelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(AppointmentCompletedjLabel)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(AppointmentCompletedjLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 44, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 519, 90, 50));

        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 125, 610, 170));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Hospital_Image_1366x768.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1310, 590));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
        Hospital hospital = new Hospital();
        hospital.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel16MouseClicked

    private void BackToAppointmentjLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackToAppointmentjLabelMouseClicked

        doctorActivity dActivity = new doctorActivity(appDetails[0]);
        dActivity.setVisible(true);
        dispose();
    }//GEN-LAST:event_BackToAppointmentjLabelMouseClicked

    private void AppointmentCompletedjLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AppointmentCompletedjLabelMouseClicked

        connection = Connector.ConnectDb();
        int row = patientDetailsTable.getSelectedRow();
        if (row >= 0) {
            int appID = Integer.parseInt(patientDetailsTable.getModel().getValueAt(row, 0).toString());
            String docId = appDetails[0];
            String patientId = patientDetailsTable.getModel().getValueAt(row, 1).toString();
            
            String patientName = patientDetailsTable.getModel().getValueAt(row, 2).toString();
            String appDate = (patientDetailsTable.getModel().getValueAt(row, 6).toString());
            //String StartTime = 
            String docName = patientDetailsTable.getModel().getValueAt(row, 2).toString();
            String startTime =  patientDetailsTable.getModel().getValueAt(row, 6).toString();
            String endTime =  patientDetailsTable.getModel().getValueAt(row, 7).toString();
            int fees;
            String sql = "select fees from doctor where id ='" + docId + "'";
            
            try {
                ps2 = connection.prepareStatement(sql);
                rs = ps2.executeQuery();
                rs.next();

                fees = rs.getInt("fees");
                System.out.println("Fees = "+fees);
                System.out.println("Inserting billing info into bill table....");
                String sql2 = "insert into bill(appointmentId,dId,pid,patientName,appointmentDate, amount) values (?,?,?,?,?,?)";
                try {
                    ps = connection.prepareStatement(sql2);
                    System.out.println("Inserting data doctor data into info table");
                    ps.setInt(1, appID);
                    ps.setString(2, docId);
                    ps.setString(3, patientId);
                    ps.setString(4, patientName);
                    ps.setString(5, appDate);
                    ps.setInt(6, fees);
                    ps.execute();
                    System.out.println("Bill can be generated Now");
                    System.out.println("Now removing the appointment");
                    String sql3 = "Delete from appointment where count = '" + appID + "'";
                    try {
                        ps = connection.prepareStatement(sql3);
                        ps.execute();
                        JOptionPane.showMessageDialog(null, "Appointment Completed.");
                        defaultTableModel.getDataVector().removeAllElements();
                        defaultTableModel.fireTableDataChanged();
//            loadData();
                        connection.close();
                    } catch (SQLException e) {
                        e.printStackTrace();
                        JOptionPane.showMessageDialog(null, "Doctor named " + docName + " not found");
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Something went wrong.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please select an appointment.");
        }
    }//GEN-LAST:event_AppointmentCompletedjLabelMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            new AppointmentDetails().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AppointmentCompletedjLabel;
    private javax.swing.JLabel BackToAppointmentjLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable patientDetailsTable;
    // End of variables declaration//GEN-END:variables
}
