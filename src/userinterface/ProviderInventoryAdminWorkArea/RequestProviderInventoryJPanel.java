/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.ProviderInventoryAdminWorkArea;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Inventory.Inventory;
import Business.Network.CityNetwork;
import Business.Network.CountryNetwork;
import Business.Network.StateNetwork;
import Business.Organization.InventoryOrganization;
import Business.Organization.Organization;
import Business.Organization.RenderOrganization;
import Business.Organization.RentalOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.InventoryWorkRequest;
import Business.WorkQueue.RenderWorkRequest;
import Business.WorkQueue.RentalWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Administrator
 */
public class RequestProviderInventoryJPanel extends javax.swing.JPanel {

    /**
     * Creates new form RequestInventoryJPanel
     */
    private JPanel container;
    private UserAccount account;
    private InventoryOrganization organization;
    private Enterprise enterprise;
    private EcoSystem business;

    public RequestProviderInventoryJPanel(JPanel container, UserAccount account, InventoryOrganization organization, Enterprise enterprise, EcoSystem business) {
         initComponents();
         this.container = container;
         this.account = account;
         this.organization = organization;
         this.enterprise = enterprise;
         this.business = business;
         System.out.println("OG"+organization);
         populateSupplierCombo();
         populateComboRentalorRender();
         System.out.println("QQQQWWW");
        // pop();
         populateTable();
         
        
    }
   /* 
    private  void pop(){
        String flag = "false";
        WorkRequest request3 = null;
        System.out.println("ENTER");
        System.out.println("!!!"+organization.getWorkQueue().getWorkRequestList());
     for(WorkRequest request2:organization.getWorkQueue().getWorkRequestList()){
         System.out.println("ORDQR"+request2.getStatus());
             if(request2.getStatus().equals("Completed")){
                 request3 = request2;
                 System.out.println("null"+organization.getInventoryDirectory().getInventoryList());
                 System.out.println("QQQ"+organization.getInventoryDirectory().getInventoryList());
                 System.out.println("QQWWWW"+organization.getInventoryDirectory().getInventoryList().isEmpty());
                 if(organization.getInventoryDirectory().getInventoryList().isEmpty()){
                     organization.getInventoryDirectory().createInventory(request2.getProduct(),request2.getPrice(),request2.getQuantity());
                 }
                 for(Inventory inventory:organization.getInventoryDirectory().getInventoryList()){
                    System.out.println("!!!11"+inventory.getProductName());
                     System.out.println("@@@@@"+request2.getProduct());
                    System.out.println("#####"+inventory.getProductName().equals(request2.getProduct()));
                  if(inventory.getProductName().equals(request2.getProduct())){
                      flag = "true";
                    inventory.setProductQuantity(inventory.getProductQuantity()+request2.getQuantity());
                }
                     System.out.println("!!!!22222"+inventory.getProductName().equals(request2.getProduct()));
                   
                  if(organization.getInventoryDirectory().getInventoryList().contains(inventory) == false){
                       organization.getInventoryDirectory().createInventory(request2.getProduct(),request2.getPrice(),request2.getQuantity());
                  }
                      
           //    else{
             //       organization.getInventoryDirectory().createInventory(request2.getProduct(),request2.getPrice(),request2.getQuantity());
             //   }
              //   }
                // account.getWorkqueue().deleteWorkREquest(request2);
               //  System.out.println("DELEEEE"+account.getWorkqueue());
                
             
           //  }
                 if(flag.equals("false")){
                     organization.getInventoryDirectory().createInventory(request2.getProduct(),request2.getPrice(),request2.getQuantity());

            //     }
             
     }
     
        System.out.println("REQUEST3"+request3);
     organization.getWorkQueue().deleteWorkREquest(request3);
       
    } 
*/
    private void populateTable(){
   
        DefaultTableModel dtm = (DefaultTableModel)tblRequestInventory.getModel();
        dtm.setRowCount(0);
     //   System.out.println("HAIER"+account.getWorkqueue().getWorkRequestList());
        for(WorkRequest request:account.getWorkqueue().getWorkRequestList()){
            Object[] row1 = new Object[6];
            row1[0]=request.getId();
            row1[1]=request.getSupplier();
            row1[2]=request.getProduct();
            row1[3]=request;
            row1[4]=request.getQuantity();
            row1[5]=request.getRentalorrender();
            dtm.addRow(row1)  ;
        /*    for(Inventory inventory:organization.getInventoryDirectory().getInventoryList()){
            if(request.getStatus().equals("Completed")){
                System.out.println("VVVVVVVVVV"+request.getProduct());
                System.out.println("AQAQAQQA"+inventory.getProductName().equals(request.getProduct()));
                if(inventory.getProductName().equals(request.getProduct())){
                    inventory.setProductQuantity(inventory.getProductQuantity()+request.getQuantity());
                }
                else{
                    organization.getInventoryDirectory().createInventory(request.getProduct(),request.getPrice(),request.getQuantity());
                }
         
          }
        }*/
        }
        
        //for(WorkRequest request1:account.getWorkqueue().getWorkRequestList()){
         //   if(request1.getStatus().equals("Completed")){
         //       organization.getInventoryDirectory().createInventory(request1.getProduct(),request1.getPrice(),request1.getQuantity());
         //       account.getWorkqueue().getWorkRequestList().remove(request1);
         //   }
     //   }
        
    }
    
    private  void populateSupplierCombo(){
        comboSupplier.removeAllItems();
        for(CountryNetwork countryNetwork:business.getCountryNetworkDirectory().getCountryNetworkList()){
            for(StateNetwork stateNetwork:countryNetwork.getStateNetworkDirectory().getStateNetworkList()){
                for(CityNetwork cityNetwork:stateNetwork.getCityNetworkDirectory().getCityNetworkList()){
                    for(Enterprise enterprise1: cityNetwork.getEnterpriseDirectory().getEnterpriseList()){
                        if(enterprise1.getEnterpriseType().getValue().equals("Supplier")){
                            comboSupplier.addItem(enterprise1);
                        }
                    }
                }
            }
        }
    }
    private void populateProductCombo(Enterprise enterprise){
        comboProduct.removeAllItems();       
        
        for(Organization org:enterprise.getOrganizationDirectory().getOrganizationList()){
            System.out.println("11"+org);
            String name = String.valueOf(org);
            if(name.equals("Inventory Organization")){
            for(Inventory inventory:org.getInventoryDirectory().getInventoryList()){
                comboProduct.addItem(inventory.getProductName());
            }
            }
        }
   
    }
    private void populateComboRentalorRender(){
        comboRent.removeAllItems();
        comboRent.addItem("Rental");
        comboRent.addItem("Render");
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
        jLabel2 = new javax.swing.JLabel();
        comboSupplier = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        comboProduct = new javax.swing.JComboBox();
        comboRent = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtQuantity = new javax.swing.JTextField();
        btnSubmit = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRequestInventory = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(600, 750));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel1.setText("Request Inventory");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 50, -1, -1));

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel2.setText("Supplier:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 110, -1, -1));

        comboSupplier.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        comboSupplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboSupplierActionPerformed(evt);
            }
        });
        add(comboSupplier, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 110, 170, -1));

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel3.setText("Product:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 150, -1, -1));

        comboProduct.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        add(comboProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 150, 170, -1));

        comboRent.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        add(comboRent, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 190, 130, -1));

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel4.setText("Render or Rental:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 190, -1, -1));

        jLabel5.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel5.setText("Quantity:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 230, -1, -1));

        txtQuantity.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        add(txtQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 230, 170, -1));

        btnSubmit.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });
        add(btnSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 270, -1, -1));

        btnBack.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btnBack.setText("<<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 630, -1, -1));

        tblRequestInventory.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        tblRequestInventory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Request ID", "Supplier", "Product", "Status", "Quantity", "RentalorRender"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblRequestInventory);
        if (tblRequestInventory.getColumnModel().getColumnCount() > 0) {
            tblRequestInventory.getColumnModel().getColumn(0).setResizable(false);
            tblRequestInventory.getColumnModel().getColumn(1).setResizable(false);
            tblRequestInventory.getColumnModel().getColumn(2).setResizable(false);
            tblRequestInventory.getColumnModel().getColumn(3).setResizable(false);
            tblRequestInventory.getColumnModel().getColumn(4).setResizable(false);
            tblRequestInventory.getColumnModel().getColumn(5).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, 940, 250));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/background2.png"))); // NOI18N
        jLabel6.setText("jLabel6");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 700));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        container.remove(this);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
    }//GEN-LAST:event_btnBackActionPerformed

    private void comboSupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboSupplierActionPerformed
        // TODO add your handling code here:
        Enterprise enterprise1 = (Enterprise) comboSupplier.getSelectedItem();
        if(enterprise1 != null){
            populateProductCombo(enterprise1);
        }
    }//GEN-LAST:event_comboSupplierActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
        String quantity1 = txtQuantity.getText();
        String answer1 = String.valueOf(comboRent.getSelectedItem());
        if((quantity1 != null)&&!(quantity1.isEmpty()))
        {
            //int quantity = Integer.parseInt(txtQuantity.getText());
            Pattern pattern = Pattern.compile("[^0-9]");
            Matcher m = pattern.matcher(quantity1);
            boolean boo = m.find();
            if(boo == true || quantity1 == null) {
                JOptionPane.showMessageDialog(null,"Please input a number");
            }
            else{  
                int quantity = Integer.parseInt(quantity1);
                
                if(answer1.equals("Rental")){
                    System.out.println(answer1);
                    System.out.println(answer1.equals("Rental"));
                    System.out.println("DONEEE");
                    RentalWorkRequest request = new RentalWorkRequest();
                    request.getId();
                    request.setSupplier((Enterprise)comboSupplier.getSelectedItem());
                    request.setSender(account);
                    request.setStatus("Sent");
                    request.setProduct(String.valueOf(comboProduct.getSelectedItem()));
                    request.setQuantity(quantity);
                    request.setRentalorrender(answer1);
           
                    Organization org = null;
                    for(Organization organization1:enterprise.getOrganizationDirectory().getOrganizationList()){
             //  System.out.println("organization"+organization1);
             //  System.out.println("1234422"+(organization1 instanceof RentalOrganization));
                        if(organization1 instanceof RentalOrganization){
                            System.out.println("DONE1");
                            org =organization1;
                            break;
                        }
                    }
           
                    if(org != null){
                        System.out.println("RENTALLLLL"+org);
                        organization.getWorkQueue().getWorkRequestList().add(request);
                        org.getWorkQueue().getWorkRequestList().add(request);
                        account.getWorkqueue().getWorkRequestList().add(request);
                    }
           
                }
                else {
                    RenderWorkRequest render = new RenderWorkRequest();
                    render.getId();
                    render.setSupplier((Enterprise)comboSupplier.getSelectedItem());
                    render.setSender(account);
                    render.setStatus("Sent");
                    render.setProduct(String.valueOf(comboProduct.getSelectedItem()));
                    render.setQuantity(quantity);
                    render.setRentalorrender(answer1);
            
                    Organization org = null;
                    
                    for(Organization organization1:enterprise.getOrganizationDirectory().getOrganizationList()){
                        if(organization1 instanceof RenderOrganization){
                            org =organization1;
                            System.out.println("Organization"+org);
                            break;
                        }
                    }
                    if(org != null){
                        organization.getWorkQueue().getWorkRequestList().add(render);
                        org.getWorkQueue().getWorkRequestList().add(render); 
                        account.getWorkqueue().getWorkRequestList().add(render);
                        System.out.println("INV"+organization.getWorkQueue().getWorkRequestList());
                        System.out.println("RENDER"+org.getWorkQueue().getWorkRequestList());
                        System.out.println("ACCOUNT"+account.getWorkqueue().getWorkRequestList());
         //      System.out.println("AAA"+org.getWorkQueue().getWorkRequestList());
                    }
                }
                populateTable();
            }
        }
        else {
            JOptionPane.showMessageDialog(null,"Please input a number");
        }
    }//GEN-LAST:event_btnSubmitActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JComboBox comboProduct;
    private javax.swing.JComboBox comboRent;
    private javax.swing.JComboBox comboSupplier;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblRequestInventory;
    private javax.swing.JTextField txtQuantity;
    // End of variables declaration//GEN-END:variables
}
