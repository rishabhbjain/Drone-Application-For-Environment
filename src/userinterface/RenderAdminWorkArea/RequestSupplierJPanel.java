/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.RenderAdminWorkArea;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Inventory.Inventory;
import Business.Organization.Organization;
import Business.Organization.RenderOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Administrator
 */
public class RequestSupplierJPanel extends javax.swing.JPanel {

    /**
     * Creates new form RequestSupplierJPanel
     */
    private JPanel container;
    private UserAccount account;
    private RenderOrganization organization;
    private Enterprise enterprise;
    private EcoSystem business;

    public RequestSupplierJPanel(JPanel container, UserAccount account, RenderOrganization organization, Enterprise enterprise, EcoSystem business) {
        initComponents();
        this.container = container;
        this.account = account;
        this.organization = organization;
        this.enterprise = enterprise;
        this.business = business;
        populateTable();

    }
     public void populateTable(){
        DefaultTableModel dtm = (DefaultTableModel)tblSupplierRequest.getModel();
        dtm.setRowCount(0);
        for(WorkRequest request :account.getWorkqueue().getWorkRequestList()){
          //  if(request.getRentalorrender().equals("Render")){
                Object[] row1 = new Object[6];
                row1[0]=request.getSender().getEmployee().getName();
                row1[1]=request.getReceiver() == null ? null : request.getReceiver().getEmployee().getName();;
                row1[2]=request.getSupplier();
                row1[3]=request.getProduct();
                row1[4]=request.getQuantity();
                row1[5]=request;
                dtm.addRow(row1);
               
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

        btnBack = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSupplierRequest = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBack.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btnBack.setText("<<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 630, -1, -1));

        tblSupplierRequest.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        tblSupplierRequest.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Sender", "Receiver", "Supplier", "Product", "Quantity", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblSupplierRequest);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 1000, 510));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/background2.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 700));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        container.remove(this);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblSupplierRequest;
    // End of variables declaration//GEN-END:variables
}
