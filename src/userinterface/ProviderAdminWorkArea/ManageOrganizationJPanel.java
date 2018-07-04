/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.ProviderAdminWorkArea;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.Organization.Type;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Administrator
 */
public class ManageOrganizationJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageOrganizationJPanel
     */
    private JPanel container;
    private Enterprise enterprise;
    private Organization organization;
   

    public ManageOrganizationJPanel(JPanel container, Enterprise enterprise,Organization organization) {
    initComponents();
        this.container = container;
        this.enterprise = enterprise;
        this.organization =organization;
     
        populateTable();
           populateCombo();
    }

     private void populateCombo(){
        comboType.removeAllItems();
        for (Organization.Type type : Organization.Type.values()){
            //if (!type.getValue().equals(Organization.Type.Admin.getValue()))
           
            if((!String.valueOf(type).equals("EnvironmentalAssignAdmin" )) && (!String.valueOf(type).equals("EnvironmentalDataCollectingAdmin")) && (!String.valueOf(type).equals("EnvironmentalGettingAdmin")) && (!String.valueOf(type).equals("EnvironmentalSendDataAdmin")) && (!String.valueOf(type).equals("ForestProtectorRequestData"))){
               comboType.addItem(type);  
            }
          
        }
    }    
    
     private void populateTable(){
        DefaultTableModel model = (DefaultTableModel) tblOrganization.getModel();
        
        model.setRowCount(0);
        
        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()){
            Object[] row = new Object[2];
            row[0] = organization.getOrganizationID();
            row[1] = organization.getName();
            
            model.addRow(row);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tblOrganization = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        comboType = new javax.swing.JComboBox();
        btnAddOrganization = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblOrganization.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        tblOrganization.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID", "Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblOrganization);
        if (tblOrganization.getColumnModel().getColumnCount() > 0) {
            tblOrganization.getColumnModel().getColumn(0).setResizable(false);
            tblOrganization.getColumnModel().getColumn(1).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 510, 160));

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel1.setText("Organization Type:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 300, -1, -1));

        comboType.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        add(comboType, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 300, 180, -1));

        btnAddOrganization.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btnAddOrganization.setText("Add Organization");
        btnAddOrganization.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddOrganizationActionPerformed(evt);
            }
        });
        add(btnAddOrganization, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 350, -1, -1));

        btnBack.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btnBack.setText("<<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 630, -1, -1));

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel2.setText("Manage Organization");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 50, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/background2.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 700));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        container.remove(this);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnAddOrganizationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddOrganizationActionPerformed
        // TODO add your handling code here:
        Organization.Type type = (Organization.Type) comboType.getSelectedItem();
        enterprise.getOrganizationDirectory().createOrganization(type);
        populateTable();
    }//GEN-LAST:event_btnAddOrganizationActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddOrganization;
    private javax.swing.JButton btnBack;
    private javax.swing.JComboBox comboType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblOrganization;
    // End of variables declaration//GEN-END:variables
}
