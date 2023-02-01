/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package praktikum1.crudtugas.models.view;

import java.awt.*;
import java.sql.*;


import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import praktikum1.crudtugas.interfc.TugasInterface;
import praktikum1.crudtugas.models.Tugas;


/**
 *
 * @author ASUS
 */
public class iii extends javax.swing.JFrame {
    List<Tugas> record=new ArrayList<Tugas>();
    TugasInterface tgsServis;
    int row;

    /**
     * Creates new form iii
     */
    
    void validasiInput(Tugas o){
            if(fieldID.getText().equals("")){
                IDValidasi.setText("ID harus diisi");
                IDValidasi.setVisible(true);
            }else if(!fieldID.getText().matches("[0-9]*")){
                IDValidasi.setText("ID harus berisi angka");
                IDValidasi.setVisible(true);
            }else{
                o.setID(fieldID.getText());
                IDValidasi.setVisible(false);
            }
            
            if (fieldNama.getText().equals("")){
                namaValidasi.setText("Nama harus diisi");
                namaValidasi.setVisible(true);
            }else{
                o.setNamaTugas(fieldNama.getText());
                namaValidasi.setVisible(false);
            }
        }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        loginButton = new javax.swing.JButton();
        labelUsername = new javax.swing.JLabel();
        labelPassword = new javax.swing.JLabel();
        fieldUsername = new javax.swing.JTextField();
        labelJudulLogin = new javax.swing.JLabel();
        fieldPassword = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        labelJudulDashboard = new javax.swing.JLabel();
        labelTugasBaru = new javax.swing.JLabel();
        labelHariIni = new javax.swing.JLabel();
        labelNanti = new javax.swing.JLabel();
        fieldTugasBaru = new javax.swing.JTextField();
        fieldHariIni = new javax.swing.JTextField();
        fieldNanti = new javax.swing.JTextField();
        addButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        buttonRefresh = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        labelJudul = new javax.swing.JLabel();
        labelID = new javax.swing.JLabel();
        labelNama = new javax.swing.JLabel();
        labelTenggat = new javax.swing.JLabel();
        labelDeskripsi = new javax.swing.JLabel();
        fieldID = new javax.swing.JTextField();
        fieldNama = new javax.swing.JTextField();
        fieldDeskripsi = new javax.swing.JTextField();
        saveBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        namaValidasi = new javax.swing.JLabel();
        IDValidasi = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        fieldNamaTgs = new javax.swing.JTextField();
        labelDL = new javax.swing.JLabel();
        fieldDL = new javax.swing.JTextField();
        labelDesc = new javax.swing.JLabel();
        fieldDesc = new javax.swing.JTextField();

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 396, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 368, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jPanel1.setBackground(new java.awt.Color(0, 204, 255));

        loginButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        loginButton.setText("login");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        labelUsername.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelUsername.setText("Username :");

        labelPassword.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelPassword.setText("Password :");

        fieldUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldUsernameActionPerformed(evt);
            }
        });

        labelJudulLogin.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelJudulLogin.setText("SILAHKAN MASUK TERLEBIH DAHULU");

        fieldPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldPasswordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(218, 218, 218)
                        .addComponent(loginButton))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelUsername)
                            .addComponent(labelPassword))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(fieldUsername, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)
                            .addComponent(fieldPassword)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(labelJudulLogin)))
                .addContainerGap(242, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(labelJudulLogin)
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelUsername)
                    .addComponent(fieldUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPassword)
                    .addComponent(fieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 190, Short.MAX_VALUE)
                .addComponent(loginButton)
                .addGap(115, 115, 115))
        );

        jTabbedPane1.addTab("login", jPanel1);

        jPanel2.setBackground(new java.awt.Color(0, 204, 255));

        labelJudulDashboard.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelJudulDashboard.setForeground(new java.awt.Color(51, 51, 255));
        labelJudulDashboard.setText("TO DO LIST");

        labelTugasBaru.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelTugasBaru.setText("Tugas Baru");

        labelHariIni.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelHariIni.setText("Kerjakan Hari Ini");

        labelNanti.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelNanti.setText("Kerjakan Nanti");

        fieldTugasBaru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldTugasBaruActionPerformed(evt);
            }
        });

        fieldHariIni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldHariIniActionPerformed(evt);
            }
        });

        fieldNanti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldNantiActionPerformed(evt);
            }
        });

        addButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        addButton.setText("Add");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        deleteButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        deleteButton.setText("Delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        buttonRefresh.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        buttonRefresh.setText("Resfresh");
        buttonRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRefreshActionPerformed(evt);
            }
        });

        updateButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        updateButton.setText("Update");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(251, 251, 251)
                .addComponent(labelJudulDashboard)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(labelTugasBaru)
                        .addGap(78, 78, 78))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(fieldTugasBaru, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelHariIni, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fieldHariIni))
                .addGap(98, 98, 98)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelNanti, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fieldNanti))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 150, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(updateButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonRefresh, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(deleteButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(labelJudulDashboard)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(labelHariIni)
                                    .addComponent(labelNanti)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(addButton)
                                .addGap(12, 12, 12)
                                .addComponent(deleteButton)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buttonRefresh))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(labelTugasBaru)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fieldTugasBaru, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fieldHariIni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fieldNanti, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(updateButton)
                .addContainerGap(286, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("dashbord", jPanel2);

        jPanel3.setBackground(new java.awt.Color(0, 204, 255));

        labelJudul.setFont(new java.awt.Font("STFangsong", 1, 48)); // NOI18N
        labelJudul.setForeground(new java.awt.Color(0, 102, 255));
        labelJudul.setText("TO DO LIST");

        labelID.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelID.setText("ID");

        labelNama.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelNama.setText("Nama Tugas");

        labelTenggat.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelTenggat.setText("Tenggat Waktu");

        labelDeskripsi.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelDeskripsi.setText("Deskripsi Tugas");

        fieldID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldIDActionPerformed(evt);
            }
        });

        fieldNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldNamaActionPerformed(evt);
            }
        });

        fieldDeskripsi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldDeskripsiActionPerformed(evt);
            }
        });

        saveBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        saveBtn.setText("Save");
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });

        deleteBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        deleteBtn.setText("Delete");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        namaValidasi.setForeground(new java.awt.Color(255, 0, 0));
        namaValidasi.setText("jLabel1");

        IDValidasi.setForeground(new java.awt.Color(255, 0, 0));
        IDValidasi.setText("jLabel1");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(283, 283, 283)
                        .addComponent(saveBtn)
                        .addGap(30, 30, 30)
                        .addComponent(deleteBtn))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(labelID, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelNama, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelTenggat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelDeskripsi, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE))
                        .addGap(63, 63, 63)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(labelJudul)
                            .addComponent(fieldID)
                            .addComponent(fieldNama, javax.swing.GroupLayout.DEFAULT_SIZE, 385, Short.MAX_VALUE)
                            .addComponent(fieldDeskripsi)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(namaValidasi)
                            .addComponent(IDValidasi))))
                .addContainerGap(166, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(labelJudul)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelID)
                    .addComponent(fieldID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(labelNama))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(IDValidasi)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fieldNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(5, 5, 5)
                .addComponent(namaValidasi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fieldDeskripsi, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelDeskripsi))
                        .addGap(52, 52, 52)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(saveBtn)
                            .addComponent(deleteBtn))
                        .addGap(71, 71, 71))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(labelTenggat)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jTabbedPane1.addTab("input", jPanel3);

        jPanel4.setBackground(new java.awt.Color(0, 204, 255));

        fieldNamaTgs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldNamaTgsActionPerformed(evt);
            }
        });

        labelDL.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelDL.setText("Tenggat Waktu :");

        fieldDL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldDLActionPerformed(evt);
            }
        });

        labelDesc.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelDesc.setText("Deskripsi :");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(fieldNamaTgs, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(labelDL, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fieldDL))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(labelDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fieldDesc)))
                .addContainerGap(444, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(fieldNamaTgs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDL)
                    .addComponent(fieldDL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDesc)
                    .addComponent(fieldDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(262, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("desc", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fieldUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldUsernameActionPerformed
        // TODO add your handling code here:
        String inputUsername = fieldUsername.getText();
        if(inputUsername.isEmpty()){
            JOptionPane.showMessageDialog(null, "Username tidak boleh kosong");
        }
        else if(inputUsername.length() < 6){
            JOptionPane.showMessageDialog(null, "Username minimal 6 karakter");
        }
        else{
            JOptionPane.showMessageDialog(null, "Silahkan masukan password");
        }
    }//GEN-LAST:event_fieldUsernameActionPerformed

    private void fieldPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldPasswordActionPerformed
        // TODO add your handling code here:
        String inputPassword = new String(fieldPassword.getText());
        if(inputPassword.isEmpty()){
            JOptionPane.showMessageDialog(null, "Password tidak boleh kosong");
        }
        else if(inputPassword.length() < 8){
            JOptionPane.showMessageDialog(null, "Password minimal 8 karakter");
        }
        else{
            //validasi password lainnya
            //atau proses selanjutnya
        }
    }//GEN-LAST:event_fieldPasswordActionPerformed

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        // TODO add your handling code here:
        String inputUsername = fieldUsername.getText();
        String inputPassword = new String(fieldPassword.getText());
        if(inputUsername.isEmpty() || inputPassword.isEmpty()){
            JOptionPane.showMessageDialog(null, "Username atau Password tidak boleh kosong");
        }
        else{
            //proses validasi username dan password
            //contoh :
            if(inputUsername.equals("admin") && inputPassword.equals("password")){
                JOptionPane.showMessageDialog(null, "Login berhasil");
                //tampilkan menu utama atau proses selanjutnya
            }else{
                JOptionPane.showMessageDialog(null, "Username atau Password salah");
            }
        }
    }//GEN-LAST:event_loginButtonActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_updateButtonActionPerformed

    private void buttonRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRefreshActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_buttonRefreshActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void fieldNantiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldNantiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldNantiActionPerformed

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_saveBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void fieldDeskripsiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldDeskripsiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldDeskripsiActionPerformed

    private void fieldTugasBaruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldTugasBaruActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldTugasBaruActionPerformed

    private void fieldHariIniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldHariIniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldHariIniActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addButtonActionPerformed

    private void fieldIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldIDActionPerformed
        // TODO add your handling code here:
//        String inputID = fieldID.getText();
//        if(inputID.isEmpty()){
//            JOptionPane.showMessageDialog(null, "ID tidak boleh kosong");
//        }else{
//            JOptionPane.showMessageDialog(null, "ID harus berupa angka");
//        }
    }//GEN-LAST:event_fieldIDActionPerformed

    private void fieldNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldNamaActionPerformed
        // TODO add your handling code here:
//        String inputNamaTugas = fieldNama.getText();
//        if(inputNamaTugas.isEmpty()){
//            JOptionPane.showMessageDialog(null, "Nama tugas tidak boleh kosong");
//        }
    }//GEN-LAST:event_fieldNamaActionPerformed

    private void fieldDLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldDLActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldDLActionPerformed

    private void fieldNamaTgsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldNamaTgsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldNamaTgsActionPerformed

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
            java.util.logging.Logger.getLogger(iii.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(iii.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(iii.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(iii.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new iii().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel IDValidasi;
    private javax.swing.JButton addButton;
    private javax.swing.JButton buttonRefresh;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JButton deleteButton;
    private javax.swing.JTextField fieldDL;
    private javax.swing.JTextField fieldDesc;
    private javax.swing.JTextField fieldDeskripsi;
    private javax.swing.JTextField fieldHariIni;
    private javax.swing.JTextField fieldID;
    private javax.swing.JTextField fieldNama;
    private javax.swing.JTextField fieldNamaTgs;
    private javax.swing.JTextField fieldNanti;
    private javax.swing.JTextField fieldPassword;
    private javax.swing.JTextField fieldTugasBaru;
    private javax.swing.JTextField fieldUsername;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel labelDL;
    private javax.swing.JLabel labelDesc;
    private javax.swing.JLabel labelDeskripsi;
    private javax.swing.JLabel labelHariIni;
    private javax.swing.JLabel labelID;
    private javax.swing.JLabel labelJudul;
    private javax.swing.JLabel labelJudulDashboard;
    private javax.swing.JLabel labelJudulLogin;
    private javax.swing.JLabel labelNama;
    private javax.swing.JLabel labelNanti;
    private javax.swing.JLabel labelPassword;
    private javax.swing.JLabel labelTenggat;
    private javax.swing.JLabel labelTugasBaru;
    private javax.swing.JLabel labelUsername;
    private javax.swing.JButton loginButton;
    private javax.swing.JLabel namaValidasi;
    private javax.swing.JButton saveBtn;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
}
