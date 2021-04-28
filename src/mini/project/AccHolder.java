/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mini.project;

import java.awt.Image;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author devas
 */
public class AccHolder extends javax.swing.JFrame {

    /** Creates new form AccHolder */
    public AccHolder() {
        initComponents();
    }
    
    public AccHolder(String data)
    {
       initComponents();
       acc.setText(data);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        A = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        ac = new javax.swing.JTextField();
        jToggleButton6 = new javax.swing.JToggleButton();
        pic = new javax.swing.JLabel();
        sig = new javax.swing.JLabel();
        jToggleButton2 = new javax.swing.JToggleButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        B = new javax.swing.JLabel();
        C = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        a = new javax.swing.JTextField();
        Dob = new javax.swing.JTextField();
        G = new javax.swing.JTextField();
        acc = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Add = new javax.swing.JTextArea();
        jToggleButton3 = new javax.swing.JToggleButton();
        deposite = new javax.swing.JTextField();
        avail = new javax.swing.JTextField();
        withdraw = new javax.swing.JTextField();
        jToggleButton4 = new javax.swing.JToggleButton();
        jToggleButton5 = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        A.setBackground(new java.awt.Color(204, 255, 230));

        jToggleButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jToggleButton1.setForeground(new java.awt.Color(0, 153, 153));
        jToggleButton1.setText("Show Details");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Account Type : ");

        ac.setBackground(new java.awt.Color(255, 0, 123));

        jToggleButton6.setBackground(new java.awt.Color(198, 236, 198));
        jToggleButton6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jToggleButton6.setText("Log-out");
        jToggleButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jToggleButton1)
                .addGap(91, 91, 91)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(ac, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jToggleButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jLabel4)
                .addGap(29, 29, 29))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 3, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jToggleButton1)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(ac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jToggleButton6)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pic.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));

        sig.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));

        jToggleButton2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jToggleButton2.setText("Ok");
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Name : ");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Account Number : ");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Gender : ");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("Date Of Birth :");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setText("Address : ");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setText("Account Operation :");

        jComboBox1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selcet One", "Available Balance", "Withdraw Bilance", "Deposite Bilance" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        B.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        C.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        a.setBackground(new java.awt.Color(204, 255, 230));
        a.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        Dob.setBackground(new java.awt.Color(204, 255, 230));
        Dob.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        G.setBackground(new java.awt.Color(204, 255, 230));
        G.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        acc.setBackground(new java.awt.Color(204, 255, 230));
        acc.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        acc.setSelectionColor(new java.awt.Color(204, 255, 230));

        Add.setBackground(new java.awt.Color(204, 255, 230));
        Add.setColumns(20);
        Add.setRows(5);
        jScrollPane1.setViewportView(Add);

        jToggleButton3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jToggleButton3.setText("Access Photo and Sign");
        jToggleButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton3ActionPerformed(evt);
            }
        });

        avail.setEditable(false);
        avail.setBackground(new java.awt.Color(204, 255, 230));

        jToggleButton4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jToggleButton4.setText("Ok");
        jToggleButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton4ActionPerformed(evt);
            }
        });

        jToggleButton5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jToggleButton5.setText("Ok");
        jToggleButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton5ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("(3). Withdraw : ");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("(1). Available Bilance :");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("(2). Deposite :");

        javax.swing.GroupLayout ALayout = new javax.swing.GroupLayout(A);
        A.setLayout(ALayout);
        ALayout.setHorizontalGroup(
            ALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ALayout.createSequentialGroup()
                .addGroup(ALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ALayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(Dob, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(ALayout.createSequentialGroup()
                        .addGroup(ALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ALayout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(ALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(ALayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(C, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(ALayout.createSequentialGroup()
                                        .addGap(124, 124, 124)
                                        .addGroup(ALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(a, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(ALayout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(37, 37, 37)
                                .addComponent(jLabel6)
                                .addGap(28, 28, 28)
                                .addComponent(B, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(ALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(sig, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(pic, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jToggleButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(ALayout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(G, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(95, 95, 95))
            .addGroup(ALayout.createSequentialGroup()
                .addGroup(ALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ALayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ALayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(ALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(avail, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(94, 94, 94)
                .addGroup(ALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(ALayout.createSequentialGroup()
                        .addGap(296, 296, 296)
                        .addGroup(ALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(withdraw, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(108, Short.MAX_VALUE))
            .addGroup(ALayout.createSequentialGroup()
                .addGroup(ALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(ALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(ALayout.createSequentialGroup()
                            .addGap(52, 52, 52)
                            .addComponent(jToggleButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(162, 162, 162)
                            .addComponent(jToggleButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(ALayout.createSequentialGroup()
                            .addGap(296, 296, 296)
                            .addComponent(deposite, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jToggleButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(144, 144, 144))
            .addGroup(ALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(ALayout.createSequentialGroup()
                    .addGap(28, 28, 28)
                    .addComponent(acc, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(646, Short.MAX_VALUE)))
        );
        ALayout.setVerticalGroup(
            ALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ALayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(ALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ALayout.createSequentialGroup()
                        .addGroup(ALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ALayout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addGroup(ALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(B, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(ALayout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addGroup(ALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(a, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(23, 23, 23)
                        .addGroup(ALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(ALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(C, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Dob, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(ALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(ALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(ALayout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(ALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(G, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addComponent(pic, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(sig, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jToggleButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)))
                .addGroup(ALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(deposite, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(withdraw, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(avail, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(ALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jToggleButton2)
                    .addComponent(jToggleButton4)
                    .addComponent(jToggleButton5))
                .addGap(61, 61, 61))
            .addGroup(ALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(ALayout.createSequentialGroup()
                    .addGap(103, 103, 103)
                    .addComponent(acc, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(420, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(A, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(A, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        try{
          
            Long num  = Long.parseLong(acc.getText());
            String url = "jdbc:mysql://localhost:3306/demo";
            String user = "root";
            String pass = "";
            Class.forName("com.mysql.jdbc.Driver");
            String query = "select * from info where accountNumber="+num;
            Connection con=java.sql.DriverManager.getConnection(url,user,pass);
            PreparedStatement pss = con.prepareStatement(query);

            //pss.setInt(1,acc);
            //ps1.setString(2, dob.getText());

            ResultSet rs =pss.executeQuery();

            if(rs.next())
            {
                //JOptionPane.showMessageDialog(null,"Log Sucess");
              // int accos = rs.getInt(3);   
                String acco = rs.getString(1);
                String name = rs.getString(4);
                String dob = rs.getString(8);
                String add = "House No :"+rs.getString(18)+",\n Near :"+rs.getString(19)+", \n P.S :"+rs.getString(20)+",\n State :"+rs.getString(21)+",\n Pin :"+rs.getString(22);
                String gen = rs.getString(5);
                //acc.setText(String.valueOf(accos)); 
                ac.setText(acco);
                a.setText(name);
                Dob.setText(dob);
                G.setText(gen);
                Add.setText(add);
                

            }
            else
            {
                JOptionPane.showMessageDialog(null,"Account Numner  or Addhaar is in-corret");
            }
            con.close();
        }
        catch(Exception ex)
        {
            System.out.println("error!");

        }
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jToggleButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton3ActionPerformed
       try{
            byte[] imageBytes;
            Image image;
            String url = "jdbc:mysql://localhost:3306/demo";
            String user = "root";
            String pass = "";
            Class.forName("com.mysql.jdbc.Driver");
            String query = "select * from photo where Account =555 ";
            Connection con=java.sql.DriverManager.getConnection(url,user,pass);
            PreparedStatement Pss = con.prepareStatement(query);

            //pss.setInt(1,acc);
            //ps1.setString(2, dob.getText());

            ResultSet rs =Pss.executeQuery();

            if(rs.next())
            {
                //JOptionPane.showMessageDialog(null,"Login Sucessful ");
                imageBytes = rs.getBytes(3);
                image = getToolkit().createImage(imageBytes);
                ImageIcon icon = new ImageIcon(image);
                pic.setIcon(icon);
                imageBytes = rs.getBytes(4);
                image = getToolkit().createImage(imageBytes);
                ImageIcon icons = new ImageIcon(image);
                sig.setIcon(icons);
               
                

            }
            else
            {
                JOptionPane.showMessageDialog(null,"Account Numner  or DOB is in-corret");
            }
            con.close();
        }
        catch(Exception ex)
        {
            System.out.println("error!");

        } 
    }//GEN-LAST:event_jToggleButton3ActionPerformed

    private void jToggleButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton4ActionPerformed
    try{
            Long uacc  = Long.parseLong(acc.getText());
            String url = "jdbc:mysql://localhost:3306/demo";
            String user = "root";
            String pass = "";
            Class.forName("com.mysql.jdbc.Driver");
            String query = "select * from photo where Account='"+uacc+"' ";
            Connection con=java.sql.DriverManager.getConnection(url,user,pass);
            PreparedStatement pss = con.prepareStatement(query);

            //pss.setInt(1,acc);
            //ps1.setString(2, dob.getText());

            ResultSet rs =pss.executeQuery();

            if(rs.next())
            {
                //JOptionPane.showMessageDialog(null,"Login Sucessful ");
               int accos = rs.getInt(2);   
               avail.setText(String.valueOf(accos));
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Account Numner  or DOB is in-corret");
            }
            con.close();
        }
        catch(Exception ex)
        {
            System.out.println("error!");

        }
    }//GEN-LAST:event_jToggleButton4ActionPerformed

    private void jToggleButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton5ActionPerformed
        try{
            Long uacc  = Long.parseLong(acc.getText());
            int uamo  = Integer.parseInt(withdraw.getText());
            int Avail = Integer.parseInt(avail.getText());
            int cbal = Avail-uamo;
            String url = "jdbc:mysql://localhost:3306/demo";
            String user = "root";
            String pass = "";
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("dev");
            String query1 = "select * from photo where Account="+uacc;
            String query = "update photo set Amount='"+cbal+"' where Account="+uacc;
             //System.out.println("dev");
            Connection con=java.sql.DriverManager.getConnection(url,user,pass);
             //System.out.println("dev");
              PreparedStatement pssx1 = con.prepareStatement(query1);
            PreparedStatement pssx = con.prepareStatement(query);

            //System.out.println("Hello");
            //pssx.setInt(2,uamo);
            ResultSet s = pssx1.executeQuery();
            
            if(s.next())
            {
                JOptionPane.showMessageDialog(null,"Withdraw Sucess");
               int accos = s.getInt(2);  
               System.out.println(accos);
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Account Numner  or DOB is in-corret");
            }
              
                    System.out.println("hello");
            pssx.executeUpdate();
                System.out.println("Update Sucessfully");
            
            con.close();
        }
        catch(Exception ex)
        {
            System.out.println("error!");

        }
    }//GEN-LAST:event_jToggleButton5ActionPerformed

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed
           try{
            Long uacc  = Long.parseLong(acc.getText());
            int uamo  = Integer.parseInt(deposite.getText());
            int Avil = Integer.parseInt(avail.getText());
            int cbal = Avil+uamo;
            String url = "jdbc:mysql://localhost:3306/demo";
            String user = "root";
            String pass = "";
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("dev");
            String query1 = "select * from photo where Account="+uacc;
            String query = "update photo set Amount='"+cbal+"' where Account="+uacc;
             //System.out.println("dev");
            Connection con=java.sql.DriverManager.getConnection(url,user,pass);
             //System.out.println("dev");
              PreparedStatement pssx1 = con.prepareStatement(query1);
            PreparedStatement pssx = con.prepareStatement(query);

            //System.out.println("Hello");
            //pssx.setInt(2,uamo);
            ResultSet s = pssx1.executeQuery();
            
            if(s.next())
            {
                JOptionPane.showMessageDialog(null," Deposite Sucess");
               int accos = s.getInt(2);  
               System.out.println(accos);
               deposite.setText(null);
               
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Account Numner  or DOB is in-corret");
            }
              
                    System.out.println("hello");
            pssx.executeUpdate();
                System.out.println("Update Sucessfully");
            
            con.close();
        }
        catch(Exception ex)
        {
            System.out.println("error!");

        }
    }//GEN-LAST:event_jToggleButton2ActionPerformed

    private void jToggleButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton6ActionPerformed
       this.setVisible(false);
       new loginform().setVisible(true);
    }//GEN-LAST:event_jToggleButton6ActionPerformed

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
            java.util.logging.Logger.getLogger(AccHolder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AccHolder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AccHolder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AccHolder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AccHolder().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel A;
    private javax.swing.JTextArea Add;
    private javax.swing.JLabel B;
    private javax.swing.JLabel C;
    private javax.swing.JTextField Dob;
    private javax.swing.JTextField G;
    private javax.swing.JTextField a;
    private javax.swing.JTextField ac;
    private javax.swing.JTextField acc;
    private javax.swing.JTextField avail;
    private javax.swing.JTextField deposite;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JToggleButton jToggleButton3;
    private javax.swing.JToggleButton jToggleButton4;
    private javax.swing.JToggleButton jToggleButton5;
    private javax.swing.JToggleButton jToggleButton6;
    private javax.swing.JLabel pic;
    private javax.swing.JLabel sig;
    private javax.swing.JTextField withdraw;
    // End of variables declaration//GEN-END:variables

    private String fetch(JTextField a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}