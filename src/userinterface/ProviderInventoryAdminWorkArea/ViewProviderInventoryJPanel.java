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
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Administrator
 */
public class ViewProviderInventoryJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageInventoryJPanel
     */
    private JPanel container;
    private UserAccount account;
    private InventoryOrganization organization;
    private Enterprise enterprise;
    private EcoSystem business;
  //  private static ArrayList 
    private static int count = 0;
    public ViewProviderInventoryJPanel(JPanel container, UserAccount account, InventoryOrganization organization, Enterprise enterprise, EcoSystem business) {
        initComponents();
        this.container = container;
        this.account = account;
        this.enterprise = enterprise;
        this.organization = organization;
        this.business = business;
        pop();
        populateTable();
        /*
        for(Inventory inventory:organization.getInventoryDirectory().getInventoryList()){
                
                System.out.println("PRODUCT"+inventory.getProductName()+"\t"+"ProductQuantity"+inventory.getProductQuantity());
            
            
        }
       
        
        int count2 =0;
        
        for(WorkRequest workquest:organization.getWorkQueue().getWorkRequestList()){
            System.out.println("REQUEST"+count2);
            System.out.println("ELEMENT"+workquest.getProduct());
            System.out.println("QUANTITY"+workquest.getQuantity());
            System.out.println("TYPE"+workquest.getRentalorrender());
            count2++;
        }
        */
        
    }
     private  void pop(){
       String f = "a";
       
        String flag = "false";
        WorkRequest request3 = null;
        System.out.println("ENTER");
        System.out.println("CHECK1"+organization.getWorkQueue().getWorkRequestList());
     for(WorkRequest request2:organization.getWorkQueue().getWorkRequestList()){
         System.out.println("ORDQR"+request2.getStatus());
             if(request2.getStatus().equals("Completed")){
                request3 = request2;
                if(organization.getInventoryDirectory().getInventoryList().isEmpty()){
                    organization.getInventoryDirectory().createInventory(request2.getProduct(),request2.getPrice(),request2.getQuantity());
             
                    f ="b";
                   count++; 
                }
             
              String flag3 = "a";
                 System.out.println("PRODUCT"+request2.getProduct());
             
                 for(Inventory inventory:organization.getInventoryDirectory().getInventoryList()){
                     if(inventory.getProductName().equals(request2.getProduct())){
                         flag3 = "c";
                     }
                 }
                 
                 
                 
                 
                 
              //  if(!(organization.getInventoryDirectory().getInventoryList().contains(request2.getProduct()))){
              if(!flag3.equals("c") &&(!f.equals("b"))){
                    organization.getInventoryDirectory().createInventory(request2.getProduct(),request2.getPrice(),request2.getQuantity());
              }
                else{
                    for(Inventory inv:organization.getInventoryDirectory().getInventoryList()){
                        if(inv.getProductName().equals(request2.getProduct())){
                            inv.setProductQuantity(inv.getProductQuantity()+request2.getQuantity());
                        }
                    }
                }    
            }
             flag = "true";
     }
                System.out.println("BEFORE"+organization.getWorkQueue().getWorkRequestList());
                if(flag.equals("true")){
                organization.getWorkQueue().deleteWorkREquest(request3);    
                }
                 System.out.println("AFTER"+organization.getWorkQueue().getWorkRequestList());    
                    
    }


 public void populateTable(){
      
      DefaultTableModel dtm = (DefaultTableModel)tblInventory.getModel();
       dtm.setRowCount(0);
          
           Object[] row1 = new Object[3];
   //        System.out.println("INV"+organization.getInventoryDirectory().getInventoryList());
    for(Inventory inventory: organization.getInventoryDirectory().getInventoryList()){
        row1[0]= inventory.getInventoryId();
        row1[1]=inventory.getProductName();
        row1[2]=inventory.getProductQuantity();
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tblInventory = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblInventory.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        tblInventory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Product Name", "Quantity"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblInventory);
        if (tblInventory.getColumnModel().getColumnCount() > 0) {
            tblInventory.getColumnModel().getColumn(0).setResizable(false);
            tblInventory.getColumnModel().getColumn(1).setResizable(false);
            tblInventory.getColumnModel().getColumn(2).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, 750, 380));

        btnBack.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btnBack.setText("<<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 610, -1, -1));

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel1.setText("View Inventory");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 50, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/background2.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 700));
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblInventory;
    // End of variables declaration//GEN-END:variables
}
