/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.ProviderInventoryAdminWorkArea;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Inventory.Inventory;
import Business.Organization.InventoryOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.InventoryWorkRequest;
import Business.WorkQueue.RenderWorkRequest;
import Business.WorkQueue.RentalWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Administrator
 */
public class ProviderRequestReceivedProcessInventoryJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ProcessSupplierInventoryJPanel
     */
    private JPanel container;
    private UserAccount account;
    private InventoryOrganization organization;
    private Enterprise enterprise;
    private EcoSystem business;
    private InventoryWorkRequest request1;
  

    public ProviderRequestReceivedProcessInventoryJPanel(JPanel container, UserAccount account, InventoryOrganization organization, Enterprise enterprise, EcoSystem business, InventoryWorkRequest request) {
        initComponents();
        this.container = container;
        this.account = account;
        this.organization = organization;
        this.enterprise = enterprise;
        this.business = business;
        this.request1 = request;
        txtProductName.setText(request1.getProduct());
        txtProvider.setText(String.valueOf(request1.getSender()));
        System.out.println("Organizarion"+organization);
        for(Inventory inventory:organization.getInventoryDirectory().getInventoryList()){
            if(inventory.getProductName().equals(request1.getProduct())){
                txtPrice.setText(String.valueOf(inventory.getProductPrice()));
                txtQuantity.setText(String.valueOf(inventory.getProductQuantity()));
            }
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

        jLabel1 = new javax.swing.JLabel();
        txtProductName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        txtQuantity = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnSubmit = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtProvider = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel1.setText("Process Inventory");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 70, -1, -1));

        txtProductName.setEditable(false);
        txtProductName.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txtProductName.setEnabled(false);
        add(txtProductName, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 190, 150, -1));

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel3.setText("Product:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 190, -1, -1));

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel2.setText("Price:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 240, -1, -1));

        txtPrice.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        add(txtPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 240, 150, -1));

        txtQuantity.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        add(txtQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 290, 150, -1));

        jLabel5.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel5.setText("Quantity:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 290, -1, -1));

        btnSubmit.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });
        add(btnSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 340, -1, -1));

        btnBack.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btnBack.setText("<<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 620, -1, -1));

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel4.setText("Provider:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, -1, -1));

        txtProvider.setEditable(false);
        txtProvider.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txtProvider.setEnabled(false);
        add(txtProvider, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 140, 150, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/background2.png"))); // NOI18N
        jLabel6.setText("jLabel6");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 700));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        
        container.remove(this);
        Component[] componentArray = container.getComponents();
        Component component = componentArray[componentArray.length - 1];
        RequestReceivedInventoryJPanel111111 rrsij = (RequestReceivedInventoryJPanel111111) component;
        rrsij.populateTable();
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
        String price1 = txtPrice.getText();
        String quantity1 = txtQuantity.getText();
        if((price1!= null)&&!(price1.isEmpty()) && (quantity1!= null)&&!(quantity1.isEmpty()))
        {
            Pattern pattern = Pattern.compile("[^0-9]");
            Matcher m = pattern.matcher(price1+quantity1);
            boolean boo = m.find();
            if(boo == true || price1 == null || quantity1 == null) {
                JOptionPane.showMessageDialog(null,"Enter Valid Details");
            }
            else{  
                request1.setStatus("Completed");
                request1.setQuantity(Integer.parseInt(txtQuantity.getText()));
                for(Inventory inventory:organization.getInventoryDirectory().getInventoryList()){
                    if(inventory.getProductName().equals(request1.getProduct())){
               // txtPrice.setText(String.valueOf(inventory.getProductPrice()));
                        request1.setPrice(Integer.parseInt(txtPrice.getText()));
                        inventory.setProductQuantity((inventory.getProductQuantity()-Integer.parseInt(txtQuantity.getText())));
                        System.out.println("PRODUCT"+inventory.getProductQuantity());
                        organization.getWorkQueue().deleteWorkREquest(request1);
                    }
                }
                for(Inventory inventory:organization.getInventoryDirectory().getInventoryList()){ 
                    System.out.println("PRODUCT"+inventory.getProductName()+"\t"+"ProductQuantity"+inventory.getProductQuantity());
                }
            }
        }
        else {
            JOptionPane.showMessageDialog(null,"Enter Valid Details");
        }
    }//GEN-LAST:event_btnSubmitActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtProductName;
    private javax.swing.JTextField txtProvider;
    private javax.swing.JTextField txtQuantity;
    // End of variables declaration//GEN-END:variables
}
